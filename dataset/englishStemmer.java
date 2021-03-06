/*
 * This code was generated by ojc.
 */
// This file was generated automatically by the Snowball to Java compiler

import org.tartarus.snowball.Among;
import GeneticAlgorithm.InstrumentCode.*;


public class englishStemmer extends SnowballStemmer
{

    private static final long serialVersionUID = 1L;

    private static final englishStemmer methodObject = new englishStemmer();

    private static final org.tartarus.snowball.Among[] a_0 = { new org.tartarus.snowball.Among( "arsen", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "commun", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "gener", -1, -1, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_1 = { new org.tartarus.snowball.Among( "'", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "'s'", 0, 1, "", methodObject ), new org.tartarus.snowball.Among( "'s", -1, 1, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_2 = { new org.tartarus.snowball.Among( "ied", -1, 2, "", methodObject ), new org.tartarus.snowball.Among( "s", -1, 3, "", methodObject ), new org.tartarus.snowball.Among( "ies", 1, 2, "", methodObject ), new org.tartarus.snowball.Among( "sses", 1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ss", 1, -1, "", methodObject ), new org.tartarus.snowball.Among( "us", 1, -1, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_3 = { new org.tartarus.snowball.Among( "", -1, 3, "", methodObject ), new org.tartarus.snowball.Among( "bb", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "dd", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "ff", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "gg", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "bl", 0, 1, "", methodObject ), new org.tartarus.snowball.Among( "mm", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "nn", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "pp", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "rr", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "at", 0, 1, "", methodObject ), new org.tartarus.snowball.Among( "tt", 0, 2, "", methodObject ), new org.tartarus.snowball.Among( "iz", 0, 1, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_4 = { new org.tartarus.snowball.Among( "ed", -1, 2, "", methodObject ), new org.tartarus.snowball.Among( "eed", 0, 1, "", methodObject ), new org.tartarus.snowball.Among( "ing", -1, 2, "", methodObject ), new org.tartarus.snowball.Among( "edly", -1, 2, "", methodObject ), new org.tartarus.snowball.Among( "eedly", 3, 1, "", methodObject ), new org.tartarus.snowball.Among( "ingly", -1, 2, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_5 = { new org.tartarus.snowball.Among( "anci", -1, 3, "", methodObject ), new org.tartarus.snowball.Among( "enci", -1, 2, "", methodObject ), new org.tartarus.snowball.Among( "ogi", -1, 13, "", methodObject ), new org.tartarus.snowball.Among( "li", -1, 16, "", methodObject ), new org.tartarus.snowball.Among( "bli", 3, 12, "", methodObject ), new org.tartarus.snowball.Among( "abli", 4, 4, "", methodObject ), new org.tartarus.snowball.Among( "alli", 3, 8, "", methodObject ), new org.tartarus.snowball.Among( "fulli", 3, 14, "", methodObject ), new org.tartarus.snowball.Among( "lessli", 3, 15, "", methodObject ), new org.tartarus.snowball.Among( "ousli", 3, 10, "", methodObject ), new org.tartarus.snowball.Among( "entli", 3, 5, "", methodObject ), new org.tartarus.snowball.Among( "aliti", -1, 8, "", methodObject ), new org.tartarus.snowball.Among( "biliti", -1, 12, "", methodObject ), new org.tartarus.snowball.Among( "iviti", -1, 11, "", methodObject ), new org.tartarus.snowball.Among( "tional", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ational", 14, 7, "", methodObject ), new org.tartarus.snowball.Among( "alism", -1, 8, "", methodObject ), new org.tartarus.snowball.Among( "ation", -1, 7, "", methodObject ), new org.tartarus.snowball.Among( "ization", 17, 6, "", methodObject ), new org.tartarus.snowball.Among( "izer", -1, 6, "", methodObject ), new org.tartarus.snowball.Among( "ator", -1, 7, "", methodObject ), new org.tartarus.snowball.Among( "iveness", -1, 11, "", methodObject ), new org.tartarus.snowball.Among( "fulness", -1, 9, "", methodObject ), new org.tartarus.snowball.Among( "ousness", -1, 10, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_6 = { new org.tartarus.snowball.Among( "icate", -1, 4, "", methodObject ), new org.tartarus.snowball.Among( "ative", -1, 6, "", methodObject ), new org.tartarus.snowball.Among( "alize", -1, 3, "", methodObject ), new org.tartarus.snowball.Among( "iciti", -1, 4, "", methodObject ), new org.tartarus.snowball.Among( "ical", -1, 4, "", methodObject ), new org.tartarus.snowball.Among( "tional", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ational", 5, 2, "", methodObject ), new org.tartarus.snowball.Among( "ful", -1, 5, "", methodObject ), new org.tartarus.snowball.Among( "ness", -1, 5, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_7 = { new org.tartarus.snowball.Among( "ic", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ance", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ence", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "able", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ible", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ate", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ive", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ize", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "iti", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "al", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ism", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ion", -1, 2, "", methodObject ), new org.tartarus.snowball.Among( "er", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ous", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ant", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ent", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ment", 15, 1, "", methodObject ), new org.tartarus.snowball.Among( "ement", 16, 1, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_8 = { new org.tartarus.snowball.Among( "e", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "l", -1, 2, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_9 = { new org.tartarus.snowball.Among( "succeed", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "proceed", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "exceed", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "canning", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "inning", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "earring", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "herring", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "outing", -1, -1, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_10 = { new org.tartarus.snowball.Among( "andes", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "atlas", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "bias", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "cosmos", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "dying", -1, 3, "", methodObject ), new org.tartarus.snowball.Among( "early", -1, 9, "", methodObject ), new org.tartarus.snowball.Among( "gently", -1, 7, "", methodObject ), new org.tartarus.snowball.Among( "howe", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "idly", -1, 6, "", methodObject ), new org.tartarus.snowball.Among( "lying", -1, 4, "", methodObject ), new org.tartarus.snowball.Among( "news", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "only", -1, 10, "", methodObject ), new org.tartarus.snowball.Among( "singly", -1, 11, "", methodObject ), new org.tartarus.snowball.Among( "skies", -1, 2, "", methodObject ), new org.tartarus.snowball.Among( "skis", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "sky", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "tying", -1, 5, "", methodObject ), new org.tartarus.snowball.Among( "ugly", -1, 8, "", methodObject ) };

    private static final char[] g_v = { 17, 65, 16, 1 };

    private static final char[] g_v_WXY = { 1, 17, 65, 208, 1 };

    private static final char[] g_valid_LI = { 55, 141, 2 };

    private boolean B_Y_found;

    private int I_p2;

    private int I_p1;

    private void copy_from( englishStemmer other )
    {
        trace.add( new java.lang.Integer( 1 ) );
        B_Y_found = other.B_Y_found;
        I_p2 = other.I_p2;
        I_p1 = other.I_p1;
        super.copy_from( other );
    }

    private boolean r_prelude()
    {
        trace.add( new java.lang.Integer( 2 ) );
        int v_1;
        int v_2;
        int v_3;
        int v_4;
        int v_5;
        B_Y_found = false;
        v_1 = cursor;
        lab0 : 
        do {
            bra = cursor;
            if (!eq_s( 1, "'" )) {
                break lab0;
            }
            ket = cursor;
            slice_del();
        } while (false);
        cursor = v_1;
        v_2 = cursor;
        lab1 : 
        do {
            bra = cursor;
            if (!eq_s( 1, "y" )) {
                break lab1;
            }
            ket = cursor;
            slice_from( "Y" );
            B_Y_found = true;
        } while (false);
        cursor = v_2;
        v_3 = cursor;
        lab2 : 
        do {
            replab3 : 
            while (true) {
                v_4 = cursor;
                lab4 : 
                do {
                    golab5 : 
                    while (true) {
                        v_5 = cursor;
                        lab6 : 
                        do {
                            if (!in_grouping( g_v, 97, 121 )) {
                                break lab6;
                            }
                            bra = cursor;
                            if (!eq_s( 1, "y" )) {
                                break lab6;
                            }
                            ket = cursor;
                            cursor = v_5;
                            break golab5;
                        } while (false);
                        cursor = v_5;
                        if (cursor >= limit) {
                            break lab4;
                        }
                        cursor++;
                    }
                    slice_from( "Y" );
                    B_Y_found = true;
                    continue replab3;
                } while (false);
                cursor = v_4;
                break replab3;
            }
        } while (false);
        cursor = v_3;
        return true;
    }

    private boolean r_mark_regions()
    {
        trace.add( new java.lang.Integer( 3 ) );
        int v_1;
        int v_2;
        I_p1 = limit;
        I_p2 = limit;
        v_1 = cursor;
        lab0 : 
        do {
            lab1 : 
            do {
                v_2 = cursor;
                lab2 : 
                do {
                    if (find_among( a_0, 3 ) == 0) {
                        break lab2;
                    }
                    break lab1;
                } while (false);
                cursor = v_2;
                golab3 : 
                while (true) {
                    lab4 : 
                    do {
                        if (!in_grouping( g_v, 97, 121 )) {
                            break lab4;
                        }
                        break golab3;
                    } while (false);
                    if (cursor >= limit) {
                        break lab0;
                    }
                    cursor++;
                }
                golab5 : 
                while (true) {
                    lab6 : 
                    do {
                        if (!out_grouping( g_v, 97, 121 )) {
                            break lab6;
                        }
                        break golab5;
                    } while (false);
                    if (cursor >= limit) {
                        break lab0;
                    }
                    cursor++;
                }
            } while (false);
            I_p1 = cursor;
            golab7 : 
            while (true) {
                lab8 : 
                do {
                    if (!in_grouping( g_v, 97, 121 )) {
                        break lab8;
                    }
                    break golab7;
                } while (false);
                if (cursor >= limit) {
                    break lab0;
                }
                cursor++;
            }
            golab9 : 
            while (true) {
                lab10 : 
                do {
                    if (!out_grouping( g_v, 97, 121 )) {
                        break lab10;
                    }
                    break golab9;
                } while (false);
                if (cursor >= limit) {
                    break lab0;
                }
                cursor++;
            }
            I_p2 = cursor;
        } while (false);
        cursor = v_1;
        return true;
    }

    private boolean r_shortv()
    {
        trace.add( new java.lang.Integer( 4 ) );
        int v_1;
        lab0 : 
        do {
            v_1 = limit - cursor;
            lab1 : 
            do {
                if (!out_grouping_b( g_v_WXY, 89, 121 )) {
                    break lab1;
                }
                if (!in_grouping_b( g_v, 97, 121 )) {
                    break lab1;
                }
                if (!out_grouping_b( g_v, 97, 121 )) {
                    break lab1;
                }
                break lab0;
            } while (false);
            cursor = limit - v_1;
            if (!out_grouping_b( g_v, 97, 121 )) {
                return false;
            }
            if (!in_grouping_b( g_v, 97, 121 )) {
                return false;
            }
            if (cursor > limit_backward) {
                return false;
            }
        } while (false);
        return true;
    }

    private boolean r_R1()
    {
        trace.add( new java.lang.Integer( 5 ) );
        if (!(I_p1 <= cursor)) {
            trace.add( new java.lang.Integer( 6 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 7 ) );
        }
        return true;
    }

    private boolean r_R2()
    {
        trace.add( new java.lang.Integer( 8 ) );
        if (!(I_p2 <= cursor)) {
            trace.add( new java.lang.Integer( 9 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 10 ) );
        }
        return true;
    }

    private boolean r_Step_1a()
    {
        trace.add( new java.lang.Integer( 11 ) );
        int among_var;
        int v_1;
        int v_2;
        v_1 = limit - cursor;
        lab0 : 
        do {
            ket = cursor;
            among_var = find_among_b( a_1, 3 );
            if (among_var == 0) {
                cursor = limit - v_1;
                break lab0;
            }
            bra = cursor;
            switch (among_var) {
            case 0 :
                cursor = limit - v_1;
                break lab0;

            case 1 :
                slice_del();
                break;

            }
        } while (false);
        ket = cursor;
        among_var = find_among_b( a_2, 6 );
        if (among_var == 0) {
            trace.add( new java.lang.Integer( 12 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 13 ) );
        }
        bra = cursor;
        switch (among_var) {
        case 0 :
            trace.add( new java.lang.Integer( 14 ) );
            return false;

        case 1 :
            trace.add( new java.lang.Integer( 15 ) );
            slice_from( "ss" );
            break;

        case 2 :
            trace.add( new java.lang.Integer( 16 ) );
            lab1 : 
            do {
                v_2 = limit - cursor;
                lab2 : 
                do {
                    {
                        int c = cursor - 2;
                        if (limit_backward > c || c > limit) {
                            break lab2;
                        }
                        cursor = c;
                    }
                    slice_from( "i" );
                    break lab1;
                } while (false);
                cursor = limit - v_2;
                slice_from( "ie" );
            } while (false);
            break;

        case 3 :
            trace.add( new java.lang.Integer( 17 ) );
            if (cursor <= limit_backward) {
                trace.add( new java.lang.Integer( 18 ) );
                return false;
            } else {
                trace.add( new java.lang.Integer( 19 ) );
            }
            cursor--;
            golab3 : 
            while (true) {
                lab4 : 
                do {
                    if (!in_grouping_b( g_v, 97, 121 )) {
                        break lab4;
                    }
                    break golab3;
                } while (false);
                if (cursor <= limit_backward) {
                    return false;
                }
                cursor--;
            }
            slice_del();
            break;

        }
        return true;
    }

    private boolean r_Step_1b()
    {
        trace.add( new java.lang.Integer( 20 ) );
        int among_var;
        int v_1;
        int v_3;
        int v_4;
        ket = cursor;
        among_var = find_among_b( a_4, 6 );
        if (among_var == 0) {
            trace.add( new java.lang.Integer( 21 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 22 ) );
        }
        bra = cursor;
        switch (among_var) {
        case 0 :
            trace.add( new java.lang.Integer( 23 ) );
            return false;

        case 1 :
            trace.add( new java.lang.Integer( 24 ) );
            if (!r_R1()) {
                trace.add( new java.lang.Integer( 25 ) );
                return false;
            } else {
                trace.add( new java.lang.Integer( 26 ) );
            }
            slice_from( "ee" );
            break;

        case 2 :
            trace.add( new java.lang.Integer( 27 ) );
            v_1 = limit - cursor;
            golab0 : 
            while (true) {
                lab1 : 
                do {
                    if (!in_grouping_b( g_v, 97, 121 )) {
                        break lab1;
                    }
                    break golab0;
                } while (false);
                if (cursor <= limit_backward) {
                    return false;
                }
                cursor--;
            }
            cursor = limit - v_1;
            slice_del();
            v_3 = limit - cursor;
            among_var = find_among_b( a_3, 13 );
            if (among_var == 0) {
                trace.add( new java.lang.Integer( 28 ) );
                return false;
            } else {
                trace.add( new java.lang.Integer( 29 ) );
            }
            cursor = limit - v_3;
            switch (among_var) {
            case 0 :
                trace.add( new java.lang.Integer( 30 ) );
                return false;

            case 1 :
                trace.add( new java.lang.Integer( 31 ) );
                {
                    trace.add( new java.lang.Integer( 32 ) );
                    int c = cursor;
                    insert( cursor, cursor, "e" );
                    cursor = c;
                }
                break;

            case 2 :
                trace.add( new java.lang.Integer( 33 ) );
                ket = cursor;
                if (cursor <= limit_backward) {
                    trace.add( new java.lang.Integer( 34 ) );
                    return false;
                } else {
                    trace.add( new java.lang.Integer( 35 ) );
                }
                cursor--;
                bra = cursor;
                slice_del();
                break;

            case 3 :
                trace.add( new java.lang.Integer( 36 ) );
                if (cursor != I_p1) {
                    trace.add( new java.lang.Integer( 37 ) );
                    return false;
                } else {
                    trace.add( new java.lang.Integer( 38 ) );
                }
                v_4 = limit - cursor;
                if (!r_shortv()) {
                    trace.add( new java.lang.Integer( 39 ) );
                    return false;
                } else {
                    trace.add( new java.lang.Integer( 40 ) );
                }
                cursor = limit - v_4;
                {
                    trace.add( new java.lang.Integer( 41 ) );
                    int c = cursor;
                    insert( cursor, cursor, "e" );
                    cursor = c;
                }
                break;

            }
            break;

        }
        return true;
    }

    private boolean r_Step_1c()
    {
        trace.add( new java.lang.Integer( 42 ) );
        int v_1;
        int v_2;
        ket = cursor;
        lab0 : 
        do {
            v_1 = limit - cursor;
            lab1 : 
            do {
                if (!eq_s_b( 1, "y" )) {
                    break lab1;
                }
                break lab0;
            } while (false);
            cursor = limit - v_1;
            if (!eq_s_b( 1, "Y" )) {
                return false;
            }
        } while (false);
        bra = cursor;
        if (!out_grouping_b( g_v, 97, 121 )) {
            trace.add( new java.lang.Integer( 43 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 44 ) );
        }
        {
            trace.add( new java.lang.Integer( 45 ) );
            v_2 = limit - cursor;
            lab2 : 
            do {
                if (cursor > limit_backward) {
                    break lab2;
                }
                return false;
            } while (false);
            cursor = limit - v_2;
        }
        slice_from( "i" );
        return true;
    }

    private boolean r_Step_2()
    {
        trace.add( new java.lang.Integer( 46 ) );
        int among_var;
        ket = cursor;
        among_var = find_among_b( a_5, 24 );
        if (among_var == 0) {
            trace.add( new java.lang.Integer( 47 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 48 ) );
        }
        bra = cursor;
        if (!r_R1()) {
            trace.add( new java.lang.Integer( 49 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 50 ) );
        }
        switch (among_var) {
        case 0 :
            trace.add( new java.lang.Integer( 51 ) );
            return false;

        case 1 :
            trace.add( new java.lang.Integer( 52 ) );
            slice_from( "tion" );
            break;

        case 2 :
            trace.add( new java.lang.Integer( 53 ) );
            slice_from( "ence" );
            break;

        case 3 :
            trace.add( new java.lang.Integer( 54 ) );
            slice_from( "ance" );
            break;

        case 4 :
            trace.add( new java.lang.Integer( 55 ) );
            slice_from( "able" );
            break;

        case 5 :
            trace.add( new java.lang.Integer( 56 ) );
            slice_from( "ent" );
            break;

        case 6 :
            trace.add( new java.lang.Integer( 57 ) );
            slice_from( "ize" );
            break;

        case 7 :
            trace.add( new java.lang.Integer( 58 ) );
            slice_from( "ate" );
            break;

        case 8 :
            trace.add( new java.lang.Integer( 59 ) );
            slice_from( "al" );
            break;

        case 9 :
            trace.add( new java.lang.Integer( 60 ) );
            slice_from( "ful" );
            break;

        case 10 :
            trace.add( new java.lang.Integer( 61 ) );
            slice_from( "ous" );
            break;

        case 11 :
            trace.add( new java.lang.Integer( 62 ) );
            slice_from( "ive" );
            break;

        case 12 :
            trace.add( new java.lang.Integer( 63 ) );
            slice_from( "ble" );
            break;

        case 13 :
            trace.add( new java.lang.Integer( 64 ) );
            if (!eq_s_b( 1, "l" )) {
                trace.add( new java.lang.Integer( 65 ) );
                return false;
            } else {
                trace.add( new java.lang.Integer( 66 ) );
            }
            slice_from( "og" );
            break;

        case 14 :
            trace.add( new java.lang.Integer( 67 ) );
            slice_from( "ful" );
            break;

        case 15 :
            trace.add( new java.lang.Integer( 68 ) );
            slice_from( "less" );
            break;

        case 16 :
            trace.add( new java.lang.Integer( 69 ) );
            if (!in_grouping_b( g_valid_LI, 99, 116 )) {
                trace.add( new java.lang.Integer( 70 ) );
                return false;
            } else {
                trace.add( new java.lang.Integer( 71 ) );
            }
            slice_del();
            break;

        }
        return true;
    }

    private boolean r_Step_3()
    {
        trace.add( new java.lang.Integer( 72 ) );
        int among_var;
        ket = cursor;
        among_var = find_among_b( a_6, 9 );
        if (among_var == 0) {
            trace.add( new java.lang.Integer( 73 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 74 ) );
        }
        bra = cursor;
        if (!r_R1()) {
            trace.add( new java.lang.Integer( 75 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 76 ) );
        }
        switch (among_var) {
        case 0 :
            trace.add( new java.lang.Integer( 77 ) );
            return false;

        case 1 :
            trace.add( new java.lang.Integer( 78 ) );
            slice_from( "tion" );
            break;

        case 2 :
            trace.add( new java.lang.Integer( 79 ) );
            slice_from( "ate" );
            break;

        case 3 :
            trace.add( new java.lang.Integer( 80 ) );
            slice_from( "al" );
            break;

        case 4 :
            trace.add( new java.lang.Integer( 81 ) );
            slice_from( "ic" );
            break;

        case 5 :
            trace.add( new java.lang.Integer( 82 ) );
            slice_del();
            break;

        case 6 :
            trace.add( new java.lang.Integer( 83 ) );
            if (!r_R2()) {
                trace.add( new java.lang.Integer( 84 ) );
                return false;
            } else {
                trace.add( new java.lang.Integer( 85 ) );
            }
            slice_del();
            break;

        }
        return true;
    }

    private boolean r_Step_4()
    {
        trace.add( new java.lang.Integer( 86 ) );
        int among_var;
        int v_1;
        ket = cursor;
        among_var = find_among_b( a_7, 18 );
        if (among_var == 0) {
            trace.add( new java.lang.Integer( 87 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 88 ) );
        }
        bra = cursor;
        if (!r_R2()) {
            trace.add( new java.lang.Integer( 89 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 90 ) );
        }
        switch (among_var) {
        case 0 :
            trace.add( new java.lang.Integer( 91 ) );
            return false;

        case 1 :
            trace.add( new java.lang.Integer( 92 ) );
            slice_del();
            break;

        case 2 :
            trace.add( new java.lang.Integer( 93 ) );
            lab0 : 
            do {
                v_1 = limit - cursor;
                lab1 : 
                do {
                    if (!eq_s_b( 1, "s" )) {
                        break lab1;
                    }
                    break lab0;
                } while (false);
                cursor = limit - v_1;
                if (!eq_s_b( 1, "t" )) {
                    return false;
                }
            } while (false);
            slice_del();
            break;

        }
        return true;
    }

    private boolean r_Step_5()
    {
        trace.add( new java.lang.Integer( 94 ) );
        int among_var;
        int v_1;
        int v_2;
        ket = cursor;
        among_var = find_among_b( a_8, 2 );
        if (among_var == 0) {
            trace.add( new java.lang.Integer( 95 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 96 ) );
        }
        bra = cursor;
        switch (among_var) {
        case 0 :
            trace.add( new java.lang.Integer( 97 ) );
            return false;

        case 1 :
            trace.add( new java.lang.Integer( 98 ) );
            lab0 : 
            do {
                v_1 = limit - cursor;
                lab1 : 
                do {
                    if (!r_R2()) {
                        break lab1;
                    }
                    break lab0;
                } while (false);
                cursor = limit - v_1;
                if (!r_R1()) {
                    return false;
                }
                {
                    v_2 = limit - cursor;
                    lab2 : 
                    do {
                        if (!r_shortv()) {
                            break lab2;
                        }
                        return false;
                    } while (false);
                    cursor = limit - v_2;
                }
            } while (false);
            slice_del();
            break;

        case 2 :
            trace.add( new java.lang.Integer( 99 ) );
            if (!r_R2()) {
                trace.add( new java.lang.Integer( 100 ) );
                return false;
            } else {
                trace.add( new java.lang.Integer( 101 ) );
            }
            if (!eq_s_b( 1, "l" )) {
                trace.add( new java.lang.Integer( 102 ) );
                return false;
            } else {
                trace.add( new java.lang.Integer( 103 ) );
            }
            slice_del();
            break;

        }
        return true;
    }

    private boolean r_exception2()
    {
        trace.add( new java.lang.Integer( 104 ) );
        ket = cursor;
        if (find_among_b( a_9, 8 ) == 0) {
            trace.add( new java.lang.Integer( 105 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 106 ) );
        }
        bra = cursor;
        if (cursor > limit_backward) {
            trace.add( new java.lang.Integer( 107 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 108 ) );
        }
        return true;
    }

    private boolean r_exception1()
    {
        trace.add( new java.lang.Integer( 109 ) );
        int among_var;
        bra = cursor;
        among_var = find_among( a_10, 18 );
        if (among_var == 0) {
            trace.add( new java.lang.Integer( 110 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 111 ) );
        }
        ket = cursor;
        if (cursor < limit) {
            trace.add( new java.lang.Integer( 112 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 113 ) );
        }
        switch (among_var) {
        case 0 :
            trace.add( new java.lang.Integer( 114 ) );
            return false;

        case 1 :
            trace.add( new java.lang.Integer( 115 ) );
            slice_from( "ski" );
            break;

        case 2 :
            trace.add( new java.lang.Integer( 116 ) );
            slice_from( "sky" );
            break;

        case 3 :
            trace.add( new java.lang.Integer( 117 ) );
            slice_from( "die" );
            break;

        case 4 :
            trace.add( new java.lang.Integer( 118 ) );
            slice_from( "lie" );
            break;

        case 5 :
            trace.add( new java.lang.Integer( 119 ) );
            slice_from( "tie" );
            break;

        case 6 :
            trace.add( new java.lang.Integer( 120 ) );
            slice_from( "idl" );
            break;

        case 7 :
            trace.add( new java.lang.Integer( 121 ) );
            slice_from( "gentl" );
            break;

        case 8 :
            trace.add( new java.lang.Integer( 122 ) );
            slice_from( "ugli" );
            break;

        case 9 :
            trace.add( new java.lang.Integer( 123 ) );
            slice_from( "earli" );
            break;

        case 10 :
            trace.add( new java.lang.Integer( 124 ) );
            slice_from( "onli" );
            break;

        case 11 :
            trace.add( new java.lang.Integer( 125 ) );
            slice_from( "singl" );
            break;

        }
        return true;
    }

    private boolean r_postlude()
    {
        trace.add( new java.lang.Integer( 126 ) );
        int v_1;
        int v_2;
        if (!B_Y_found) {
            trace.add( new java.lang.Integer( 127 ) );
            return false;
        } else {
            trace.add( new java.lang.Integer( 128 ) );
        }
        replab0 : 
        while (true) {
            v_1 = cursor;
            lab1 : 
            do {
                golab2 : 
                while (true) {
                    v_2 = cursor;
                    lab3 : 
                    do {
                        bra = cursor;
                        if (!eq_s( 1, "Y" )) {
                            break lab3;
                        }
                        ket = cursor;
                        cursor = v_2;
                        break golab2;
                    } while (false);
                    cursor = v_2;
                    if (cursor >= limit) {
                        break lab1;
                    }
                    cursor++;
                }
                slice_from( "y" );
                continue replab0;
            } while (false);
            cursor = v_1;
            break replab0;
        }
        return true;
    }

    public boolean stem()
    {
        trace.add( new java.lang.Integer( 129 ) );
        int v_1;
        int v_2;
        int v_3;
        int v_4;
        int v_5;
        int v_6;
        int v_7;
        int v_8;
        int v_9;
        int v_10;
        int v_11;
        int v_12;
        int v_13;
        lab0 : 
        do {
            v_1 = cursor;
            lab1 : 
            do {
                if (!r_exception1()) {
                    break lab1;
                }
                break lab0;
            } while (false);
            cursor = v_1;
            lab2 : 
            do {
                {
                    v_2 = cursor;
                    lab3 : 
                    do {
                        {
                            int c = cursor + 3;
                            if (0 > c || c > limit) {
                                break lab3;
                            }
                            cursor = c;
                        }
                        break lab2;
                    } while (false);
                    cursor = v_2;
                }
                break lab0;
            } while (false);
            cursor = v_1;
            v_3 = cursor;
            lab4 : 
            do {
                if (!r_prelude()) {
                    break lab4;
                }
            } while (false);
            cursor = v_3;
            v_4 = cursor;
            lab5 : 
            do {
                if (!r_mark_regions()) {
                    break lab5;
                }
            } while (false);
            cursor = v_4;
            limit_backward = cursor;
            cursor = limit;
            v_5 = limit - cursor;
            lab6 : 
            do {
                if (!r_Step_1a()) {
                    break lab6;
                }
            } while (false);
            cursor = limit - v_5;
            lab7 : 
            do {
                v_6 = limit - cursor;
                lab8 : 
                do {
                    if (!r_exception2()) {
                        break lab8;
                    }
                    break lab7;
                } while (false);
                cursor = limit - v_6;
                v_7 = limit - cursor;
                lab9 : 
                do {
                    if (!r_Step_1b()) {
                        break lab9;
                    }
                } while (false);
                cursor = limit - v_7;
                v_8 = limit - cursor;
                lab10 : 
                do {
                    if (!r_Step_1c()) {
                        break lab10;
                    }
                } while (false);
                cursor = limit - v_8;
                v_9 = limit - cursor;
                lab11 : 
                do {
                    if (!r_Step_2()) {
                        break lab11;
                    }
                } while (false);
                cursor = limit - v_9;
                v_10 = limit - cursor;
                lab12 : 
                do {
                    if (!r_Step_3()) {
                        break lab12;
                    }
                } while (false);
                cursor = limit - v_10;
                v_11 = limit - cursor;
                lab13 : 
                do {
                    if (!r_Step_4()) {
                        break lab13;
                    }
                } while (false);
                cursor = limit - v_11;
                v_12 = limit - cursor;
                lab14 : 
                do {
                    if (!r_Step_5()) {
                        break lab14;
                    }
                } while (false);
                cursor = limit - v_12;
            } while (false);
            cursor = limit_backward;
            v_13 = cursor;
            lab15 : 
            do {
                if (!r_postlude()) {
                    break lab15;
                }
            } while (false);
            cursor = v_13;
        } while (false);
        return true;
    }

    public boolean equals( java.lang.Object o )
    {
        trace.add( new java.lang.Integer( 130 ) );
        return o instanceof englishStemmer;
    }

    public int hashCode()
    {
        trace.add( new java.lang.Integer( 131 ) );
        return (englishStemmer.class).getName().hashCode();
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
