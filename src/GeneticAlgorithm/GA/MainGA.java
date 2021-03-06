package GeneticAlgorithm.GA;

//import sun.security.util.ArrayUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainGA {
	static Random randomGenerator = new Random();
//    static String[] inputs = {"Scale"};

	/**
	 * Main chÃ­nh
	 *
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException, IOException {

		// call GA to generate testcase for the class under test as parameter
		generateTestcaseWithGA("englishStemmer");
	}

	/**
	 * táº¡o cÃ¡c testcase báº±ng cÃ¡ch Ã¡p dá»¥ng GA
	 *
	 * @param classUnderTest class Ä‘ang táº¡o unit test
	 * @throws IOException
	 */
	public static void generateTestcaseWithGA(String classUnderTest) throws IOException {
		TestGenerator.printParameters();

		long totalGenTime = 0;

		TestGenerator testGenerator = new TestGenerator();
		testGenerator.setClassUnderTest(classUnderTest);
		testGenerator.setTargetFile(CommonParameter.relativePath + classUnderTest + ".tgt");
		testGenerator.setPathsFile(CommonParameter.relativePath + classUnderTest + ".path");
		testGenerator.readTarget();
		testGenerator.readPaths();

		String signFile = CommonParameter.relativePath + classUnderTest + ".sign";
		ChromosomeFormer chromosomeFormer = Population.setChromosomeFormer(signFile);

		System.out.println("ChromosomeFormer: \n" + chromosomeFormer);
		// Only test public methods in sign file of the class under test
		List<MethodSignature> methodsOfCUT = chromosomeFormer.getMethods().get(classUnderTest);

		// for each method in class under test, use GA to generate test data
		for (MethodSignature methodUnderTest : methodsOfCUT) {
			long startTime = System.currentTimeMillis();
			String methodUnderTestName = methodUnderTest.toString();
			chromosomeFormer.setMethodUnderTest(methodUnderTestName);
			List<Path> targetPathsOfMUT = testGenerator.getTargetPathsForMethod(methodUnderTestName);
			// for each target path of MUT, GA look for test data to cover this path
			System.out.println("Method under test: " + methodUnderTestName);
			System.out.println("Number of targets to cover: " + targetPathsOfMUT.size());
			long time = 0;
			int attempts = 0;
			Iterator<Path> pathIterator = targetPathsOfMUT.iterator();
			Population curPopulation = Population.generateRandomPopulation();
			while (pathIterator.hasNext() && (time < CommonParameter.maxExecutionTime)) {
				Path targetPath = pathIterator.next();
				Population.currentTargetPath = targetPath;
				System.out.println("Current Target Path: " + targetPath);
				// calculate fitness of all individuals
				boolean targetIsCovered = false;
				testGenerator.evaluatePopulation(curPopulation);
				if (curPopulation.checkTargetPathIsCovered()) {
					System.out.println(
							"Target: " + targetPath + " is covered by: " + curPopulation.getIndCoversCurrentTarget());
					testGenerator.updateCoveredTargets(curPopulation);
					targetIsCovered = true;
				}
				// begin GA
				attempts = 0;
				while (!targetIsCovered && attempts < CommonParameter.maxAttemptsPerTarget) {
					// evolve the current population
					curPopulation = curPopulation.generateNewPopulation();
					testGenerator.evaluatePopulation(curPopulation);
					if (curPopulation.checkTargetPathIsCovered()) {
						System.out.println("Target: " + targetPath + " is covered by: "
								+ curPopulation.getIndCoversCurrentTarget());
						testGenerator.updateCoveredTargets(curPopulation);
						targetIsCovered = true;
						break;
					}
					attempts++;
				}
				if (!targetIsCovered) {
					testGenerator.addNotCoveredTarget(targetPath);
				}
				time = (System.currentTimeMillis() - startTime) / 1000;
			}
			totalGenTime += time;
			System.out.println("Generation time of method " + methodUnderTestName + ": " + time + "(ms)");
		}
		String jUnitFile = classUnderTest + "test.java";
		testGenerator.setJUnitFile(jUnitFile);
		testGenerator.printJunitFile();
		testGenerator.printTestCases();
		testGenerator.printEvaluation(totalGenTime);
	}

	/**
	 * láº¥y ra cÃ¡c id branch á»©ng vá»›i tá»«ng method
	 *
	 * @param listTarget       list cÃ¡c target cá»§a cÃ¡c method
	 * @param listBranchTarget list cÃ¡c branch
	 * @return String[] ptá»­ thá»© i trong máº£ng chá»©a cÃ¡c branch á»©ng vá»›i
	 *         method thá»© i
	 */
//    public static String[] getBranchForMethod(List listTarget, List<Set> listBranchTarget) {
//        String[] branchWithMethod = new String[listTarget.size()];
//
//        for (int i = 0; i < listTarget.size(); i++) {
//            branchWithMethod[i] = "";
//            for (int j = 0; j < listBranchTarget.size(); j++) {
//                Pattern pattern = Pattern.compile("[0-9]+");
//                String temp = "";
//                for (int k = 0; k < listBranchTarget.get(j).toString().length(); k++) {
//                    Matcher matcher = pattern.matcher(listBranchTarget.get(j).toString().charAt(k) + "");
//                    if (matcher.matches()) {
//                        temp += listBranchTarget.get(j).toString().charAt(k) + "";
//                    } else {
//                        if (temp.equals("") == true) {
//                            continue;
//                        } else
//                            break;
//                    }
//                }
//                if (!temp.equals("")) {
//                    if (listTarget.get(i).toString().equals("[" + temp + "]")) {
//                        branchWithMethod[i] += Integer.toString(j) + ",";
//                        break;
//                    } else if (listTarget.get(i).toString().contains("[" + temp + ",")) {
//                        branchWithMethod[i] += Integer.toString(j) + ",";
//                    }
//                }
//
//            }
//        }
//        return branchWithMethod;
//    }

	/**
	 * Láº¥y ra cÃ¡c branch target khi intergration test
	 *
	 * @param subClassUnderTest class integrate
	 * @param subTrace          Ä‘Æ°á»�ng dáº«n extends
	 * @return
	 * @throws IOException
	 */
	public static List<String> generateExtendTarget(String subClassUnderTest, Collection subTrace) throws IOException {
		List<String> target = new LinkedList();

		// Láº¥y ra cÃ¡c branchTarget
		TestGenerator testGenerator = new TestGenerator();
		testGenerator.setPathsFile(CommonParameter.relativePath + subClassUnderTest + ".path");
		testGenerator.setTargetFile(CommonParameter.relativePath + subClassUnderTest + ".tgt");

		List<Set> listBranchTarget = testGenerator.getBranchSetFromPaths();
		List listTarget = testGenerator.getBranchWithMethod();

		String subTraceString = subTrace.toString();
		target = getTargetFromCoverPath(listTarget, subTraceString);
		List<String> extendTarget = new LinkedList();
		for (int i = 0; i < target.size(); i++) {
			String[] temp = getBranchForTarget(target.get(i), listBranchTarget);
			for (String s : temp) {
				extendTarget.add(s);
			}
		}
		return extendTarget;

	}

	/**
	 * Láº¥y cÃ¡c cÃ¡c target method cÃ³ intergrate
	 *
	 * @param listTarget
	 * @param subTraceString
	 * @return
	 */
	public static List<String> getTargetFromCoverPath(List listTarget, String subTraceString) {
		List<String> target = new LinkedList();
		for (int i = 1; i < listTarget.size(); i++) {
			Pattern pattern = Pattern.compile("[0-9]+");
			String temp = "";
			String subTarget = "";
			for (int k = 0; k < subTraceString.length(); k++) {
				Matcher matcher = pattern.matcher(subTraceString.charAt(k) + "");
				if (matcher.matches()) {
					temp += subTraceString.charAt(k) + "";
				} else {
					if (!temp.equals("")) {
						if (listTarget.get(i).toString().equals("[" + temp + "]")
								|| listTarget.get(i).toString().contains("[" + temp + ",")
								|| listTarget.get(i).toString().contains(", " + temp + ",")
								|| listTarget.get(i).toString().contains(", " + temp + "]")) {
							subTarget = listTarget.get(i).toString();
							target.add(subTarget);
						}
						temp = "";
						if (!subTarget.equals(""))
							break;
						else
							continue;
					} else
						continue;
				}
			}
		}
		return target;
	}

	/**
	 * Láº¥y cÃ¡c branch target
	 *
	 * @param target
	 * @param listBranchTarget
	 * @return
	 */
	public static String[] getBranchForTarget(String target, List<Set> listBranchTarget) {
		String[] branchWithTarget = new String[target.split(",").length];
		int i = 0;
		for (int j = 0; j < listBranchTarget.size(); j++) {
			Pattern pattern = Pattern.compile("[0-9]+");
			String temp = "";
			for (int k = 0; k < listBranchTarget.get(j).toString().length(); k++) {
				Matcher matcher = pattern.matcher(listBranchTarget.get(j).toString().charAt(k) + "");
				if (matcher.matches()) {
					temp += listBranchTarget.get(j).toString().charAt(k) + "";
				} else {
					if (temp.equals("") == true) {
						continue;
					} else
						break;
				}
			}
			if (!temp.equals("")) {
				if (target.equals("[" + temp + "]") || target.contains("[" + temp + ",")
						|| target.contains(" " + temp + ",") || target.contains(" " + temp + "]")) {
					branchWithTarget[i] = listBranchTarget.get(j).toString();
					i++;
				}
			}
		}
		return branchWithTarget;
	}
}
