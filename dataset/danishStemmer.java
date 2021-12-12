/*
 * This code was generated by ojc.
 */
// This file was generated automatically by the Snowball to Java compiler

import GeneticAlgorithm.InstrumentCode.*;
import org.tartarus.snowball.Among;


/**
  * This class was automatically generated by a Snowball to Java compiler 
  * It implements the stemming algorithm defined by a snowball script.
  */
public class danishStemmer extends org.tartarus.snowball.SnowballStemmer
{

    private static final long serialVersionUID = 1L;

    private static final danishStemmer methodObject = new danishStemmer();

    private static final org.tartarus.snowball.Among[] a_0 = { new org.tartarus.snowball.Among( "hed", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "ethed", 0, 1, "", methodObject ), new org.tartarus.snowball.Among( "ered", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "e", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "erede", 3, 1, "", methodObject ), new org.tartarus.snowball.Among( "ende", 3, 1, "", methodObject ), new org.tartarus.snowball.Among( "erende", 5, 1, "", methodObject ), new org.tartarus.snowball.Among( "ene", 3, 1, "", methodObject ), new org.tartarus.snowball.Among( "erne", 3, 1, "", methodObject ), new org.tartarus.snowball.Among( "ere", 3, 1, "", methodObject ), new org.tartarus.snowball.Among( "en", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "heden", 10, 1, "", methodObject ), new org.tartarus.snowball.Among( "eren", 10, 1, "", methodObject ), new org.tartarus.snowball.Among( "er", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "heder", 13, 1, "", methodObject ), new org.tartarus.snowball.Among( "erer", 13, 1, "", methodObject ), new org.tartarus.snowball.Among( "s", -1, 2, "", methodObject ), new org.tartarus.snowball.Among( "heds", 16, 1, "", methodObject ), new org.tartarus.snowball.Among( "es", 16, 1, "", methodObject ), new org.tartarus.snowball.Among( "endes", 18, 1, "", methodObject ), new org.tartarus.snowball.Among( "erendes", 19, 1, "", methodObject ), new org.tartarus.snowball.Among( "enes", 18, 1, "", methodObject ), new org.tartarus.snowball.Among( "ernes", 18, 1, "", methodObject ), new org.tartarus.snowball.Among( "eres", 18, 1, "", methodObject ), new org.tartarus.snowball.Among( "ens", 16, 1, "", methodObject ), new org.tartarus.snowball.Among( "hedens", 24, 1, "", methodObject ), new org.tartarus.snowball.Among( "erens", 24, 1, "", methodObject ), new org.tartarus.snowball.Among( "ers", 16, 1, "", methodObject ), new org.tartarus.snowball.Among( "ets", 16, 1, "", methodObject ), new org.tartarus.snowball.Among( "erets", 28, 1, "", methodObject ), new org.tartarus.snowball.Among( "et", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "eret", 30, 1, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_1 = { new org.tartarus.snowball.Among( "gd", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "dt", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "gt", -1, -1, "", methodObject ), new org.tartarus.snowball.Among( "kt", -1, -1, "", methodObject ) };

    private static final org.tartarus.snowball.Among[] a_2 = { new org.tartarus.snowball.Among( "ig", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "lig", 0, 1, "", methodObject ), new org.tartarus.snowball.Among( "elig", 1, 1, "", methodObject ), new org.tartarus.snowball.Among( "els", -1, 1, "", methodObject ), new org.tartarus.snowball.Among( "l�st", -1, 2, "", methodObject ) };

    private static final char[] g_v = { 17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 48, 0, 128 };

    private static final char[] g_s_ending = { 239, 254, 42, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16 };

    private int I_x;

    private int I_p1;

    private java.lang.StringBuilder S_ch = new java.lang.StringBuilder();

    private void copy_from( danishStemmer other )
    {
        I_x = other.I_x;
        I_p1 = other.I_p1;
        S_ch = other.S_ch;
        super.copy_from( other );
    }

    private boolean r_mark_regions()
    {
        int v_1;
        int v_2;
        I_p1 = limit;
        v_1 = cursor;
        {
            int c = cursor + 3;
            if (0 > c || c > limit) {
                return false;
            }
            cursor = c;
        }
        I_x = cursor;
        cursor = v_1;
        golab0 : 
        while (true) {
            v_2 = cursor;
            lab1 : 
            do {
                if (!in_grouping( g_v, 97, 248 )) {
                    break lab1;
                }
                cursor = v_2;
                break golab0;
            } while (false);
            cursor = v_2;
            if (cursor >= limit) {
                return false;
            }
            cursor++;
        }
        golab2 : 
        while (true) {
            lab3 : 
            do {
                if (!out_grouping( g_v, 97, 248 )) {
                    break lab3;
                }
                break golab2;
            } while (false);
            if (cursor >= limit) {
                return false;
            }
            cursor++;
        }
        I_p1 = cursor;
        lab4 : 
        do {
            if (!(I_p1 < I_x)) {
                break lab4;
            }
            I_p1 = I_x;
        } while (false);
        return true;
    }

    private boolean r_main_suffix()
    {
        int among_var;
        int v_1;
        int v_2;
        v_1 = limit - cursor;
        if (cursor < I_p1) {
            return false;
        }
        cursor = I_p1;
        v_2 = limit_backward;
        limit_backward = cursor;
        cursor = limit - v_1;
        ket = cursor;
        among_var = find_among_b( a_0, 32 );
        if (among_var == 0) {
            limit_backward = v_2;
            return false;
        }
        bra = cursor;
        limit_backward = v_2;
        switch (among_var) {
        case 0 :
            return false;

        case 1 :
            slice_del();
            break;

        case 2 :
            if (!in_grouping_b( g_s_ending, 97, 229 )) {
                return false;
            }
            slice_del();
            break;

        }
        return true;
    }

    private boolean r_consonant_pair()
    {
        int v_1;
        int v_2;
        int v_3;
        v_1 = limit - cursor;
        v_2 = limit - cursor;
        if (cursor < I_p1) {
            return false;
        }
        cursor = I_p1;
        v_3 = limit_backward;
        limit_backward = cursor;
        cursor = limit - v_2;
        ket = cursor;
        if (find_among_b( a_1, 4 ) == 0) {
            limit_backward = v_3;
            return false;
        }
        bra = cursor;
        limit_backward = v_3;
        cursor = limit - v_1;
        if (cursor <= limit_backward) {
            return false;
        }
        cursor--;
        bra = cursor;
        slice_del();
        return true;
    }

    private boolean r_other_suffix()
    {
        int among_var;
        int v_1;
        int v_2;
        int v_3;
        int v_4;
        v_1 = limit - cursor;
        lab0 : 
        do {
            ket = cursor;
            if (!eq_s_b( 2, "st" )) {
                break lab0;
            }
            bra = cursor;
            if (!eq_s_b( 2, "ig" )) {
                break lab0;
            }
            slice_del();
        } while (false);
        cursor = limit - v_1;
        v_2 = limit - cursor;
        if (cursor < I_p1) {
            return false;
        }
        cursor = I_p1;
        v_3 = limit_backward;
        limit_backward = cursor;
        cursor = limit - v_2;
        ket = cursor;
        among_var = find_among_b( a_2, 5 );
        if (among_var == 0) {
            limit_backward = v_3;
            return false;
        }
        bra = cursor;
        limit_backward = v_3;
        switch (among_var) {
        case 0 :
            return false;

        case 1 :
            slice_del();
            v_4 = limit - cursor;
            lab1 : 
            do {
                if (!r_consonant_pair()) {
                    break lab1;
                }
            } while (false);
            cursor = limit - v_4;
            break;

        case 2 :
            slice_from( "l�s" );
            break;

        }
        return true;
    }

    private boolean r_undouble()
    {
        int v_1;
        int v_2;
        v_1 = limit - cursor;
        if (cursor < I_p1) {
            return false;
        }
        cursor = I_p1;
        v_2 = limit_backward;
        limit_backward = cursor;
        cursor = limit - v_1;
        ket = cursor;
        if (!out_grouping_b( g_v, 97, 248 )) {
            limit_backward = v_2;
            return false;
        }
        bra = cursor;
        S_ch = slice_to( S_ch );
        limit_backward = v_2;
        if (!eq_v_b( S_ch )) {
            return false;
        }
        slice_del();
        return true;
    }

    public boolean stem()
    {
        int v_1;
        int v_2;
        int v_3;
        int v_4;
        int v_5;
        v_1 = cursor;
        lab0 : 
        do {
            if (!r_mark_regions()) {
                break lab0;
            }
        } while (false);
        cursor = v_1;
        limit_backward = cursor;
        cursor = limit;
        v_2 = limit - cursor;
        lab1 : 
        do {
            if (!r_main_suffix()) {
                break lab1;
            }
        } while (false);
        cursor = limit - v_2;
        v_3 = limit - cursor;
        lab2 : 
        do {
            if (!r_consonant_pair()) {
                break lab2;
            }
        } while (false);
        cursor = limit - v_3;
        v_4 = limit - cursor;
        lab3 : 
        do {
            if (!r_other_suffix()) {
                break lab3;
            }
        } while (false);
        cursor = limit - v_4;
        v_5 = limit - cursor;
        lab4 : 
        do {
            if (!r_undouble()) {
                break lab4;
            }
        } while (false);
        cursor = limit - v_5;
        cursor = limit_backward;
        return true;
    }

    public boolean equals( java.lang.Object o )
    {
        return o instanceof danishStemmer;
    }

    public int hashCode()
    {
        return (danishStemmer.class).getName().hashCode();
    }

}