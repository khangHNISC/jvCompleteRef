package org.example;


/**
 * Created by khangld5 on May 26, 2022
 */
class FinalTest {

    static class ABC {
        final int abc = 1; //final field

        //final params
        void xyz(final int a) {
            final int ab = 6; //final local var
            System.out.println(ab);
        }

        final void wyz() {
            //final method
        }
    }

    static class DEF {
        static int a = 3; //static field
        static int b;

        static {
            //static blocks
            b = a * 4;
        }

        static void abc() {
            //static methods
            System.out.println();
        }

    }

}
