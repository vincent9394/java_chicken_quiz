package com.agileexlab;

import com.agileexlab.chicken.Chicken;
import com.agileexlab.chicken.Cock;

public class Main {
    public static void main(String[] arg) {
        Chicken cock = new Cock();
        float a = cock.getPrice();
        System.out.println(a);

        int i, j, k;
        System.out.printf(" All possible solutions to the chicken problem are as follows: \n");
        for( i=0; i <= 100; i++ )
            for( j=0; j <= 100; j++ )
                for( k=0; k <= 100; k++ )
                {
                    if( 5*i+3*j+k/3==100 && k%3==0 && i+j+k==100 )
                    {
                        System.out.printf(" The cock  %2d  The hen  %2d  Only, the chicken  %2d  only \n", i, j, k);
                    }
                }



    }
}

