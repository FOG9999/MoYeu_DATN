
/*
 * This code was generated by ojc.
 */
import GeneticAlgorithm.InstrumentCode.*;


public class InsuranceProgram
{

    int age;

    int accidents;

    public InsuranceProgram( int age, int accidents )
    {
        super();
        trace.add( new java.lang.Integer( 1 ) );
        this.age = age;
        this.accidents = accidents;
    }

    public int getInsurance()
    {
        trace.add( new java.lang.Integer( 2 ) );
        int pay = 0;
        int basicInsurance = 500;
        int surcharge = 100;
        if (this.age < 25) {
            trace.add( new java.lang.Integer( 3 ) );
            basicInsurance += surcharge;
            System.out.println( "Additional surcharge " + surcharge );
            switch (this.accidents) {
            case 0 :
                trace.add( new java.lang.Integer( 4 ) );
                System.out.println( "No surcharge" );
                System.out.println( "Total amount to pay: " + basicInsurance );
                pay = basicInsurance;
                break;

            case 1 :
                trace.add( new java.lang.Integer( 5 ) );
                System.out.println( "Additional surcharge for accident: " + 50 + " \ntotal amount to pay: " + (basicInsurance + 50) );
                pay = basicInsurance + 50;
                break;

            case 2 :
                trace.add( new java.lang.Integer( 6 ) );
                System.out.println( "Additional surcharge for accident: " + 125 + " \ntotal amount to pay: " + (basicInsurance + 125) );
                pay = basicInsurance + 125;
                break;

            case 3 :
                trace.add( new java.lang.Integer( 7 ) );
                System.out.println( "Additional surcharge for accident: " + 225 + " \ntotal amount to pay: " + (basicInsurance + 225) );
                pay = basicInsurance + 225;
                break;

            case 4 :
                trace.add( new java.lang.Integer( 8 ) );
                System.out.println( "Additional surcharge for accident: " + 375 + " \ntotal amount to pay: " + (basicInsurance + 375) );
                pay = basicInsurance + 375;
                break;

            case 5 :
                trace.add( new java.lang.Integer( 9 ) );
                System.out.println( "Additional surcharge for accident: " + 575 + " \ntotal amount to pay: " + (basicInsurance + 575) );
                pay = basicInsurance + 575;
                break;

            default  :
                trace.add( new java.lang.Integer( 10 ) );
                System.out.println( "No insurance" );
                pay = basicInsurance;
                break;

            }
        } else {
            trace.add( new java.lang.Integer( 11 ) );
            System.out.println( "No additional surcharge" );
            switch (this.accidents) {
            case 0 :
                trace.add( new java.lang.Integer( 12 ) );
                System.out.println( "No surcharge" );
                System.out.println( "Total amount to pay: " + basicInsurance );
                pay = basicInsurance;
                break;

            case 1 :
                trace.add( new java.lang.Integer( 13 ) );
                System.out.println( "Additional surcharge for accident: " + 50 + " \ntotal amount to pay: " + (basicInsurance + 50) );
                pay = basicInsurance + 50;
                break;

            case 2 :
                trace.add( new java.lang.Integer( 14 ) );
                System.out.println( "Additional surcharge for accident: " + 125 + " \ntotal amount to pay: " + (basicInsurance + 125) );
                pay = basicInsurance + 125;
                break;

            case 3 :
                trace.add( new java.lang.Integer( 15 ) );
                System.out.println( "Additional surcharge for accident: " + 225 + " \ntotal amount to pay: " + (basicInsurance + 225) );
                pay = basicInsurance + 225;
                break;

            case 4 :
                trace.add( new java.lang.Integer( 16 ) );
                System.out.println( "Additional surcharge for accident: " + 375 + " \ntotal amount to pay: " + (basicInsurance + 375) );
                pay = basicInsurance + 375;
                break;

            case 5 :
                trace.add( new java.lang.Integer( 17 ) );
                System.out.println( "Additional surcharge for accident: " + 575 + " \ntotal amount to pay: " + (basicInsurance + 575) );
                pay = basicInsurance + 575;
                break;

            default  :
                trace.add( new java.lang.Integer( 18 ) );
                System.out.println( "No insurance" );
                pay = basicInsurance;
                break;

            }
        }
        return pay;
    }

    public void checkResult()
    {
        trace.add( new java.lang.Integer( 19 ) );
        if (age > 100) {
            trace.add( new java.lang.Integer( 20 ) );
            accidents = 0;
        } else {
            trace.add( new java.lang.Integer( 21 ) );
            accidents = 100;
        }
    }

    
    static java.util.Set trace = new java.util.HashSet();

    
    public static void newTrace()
    {
        trace = new java.util.HashSet();
    }

    
    public static java.util.Set getTrace()
    {
        return trace;
    }

}
