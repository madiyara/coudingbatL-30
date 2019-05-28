package com.trilogy;
public class CoudingBatL30 {
    /**
     *
     Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same
     number of digits as a. If the sum has more digits than a, just return a without b.
     (Note: one way to compute the number of digits of a non-negative int n is to convert it
     to a string with String.valueOf(n) and then check the length of the string.)


     sumLimit(2, 3) → 5
     sumLimit(8, 3) → 8
     sumLimit(8, 1) → 9

     */



        public static void main(String[] args) {
            CoudingBatL30 myCoudingBatL30Object = new CoudingBatL30();

            checkResult(myCoudingBatL30Object,4, 5, 9);
            checkResult(myCoudingBatL30Object, 4, 6, 4);
            checkResult(myCoudingBatL30Object, 0, 22, 0);
            checkResult(myCoudingBatL30Object, 2,9,2);
            checkResult(myCoudingBatL30Object, 145, 899, 145);
            checkResult(myCoudingBatL30Object, 3535, 4242, 7777);
            checkResult(myCoudingBatL30Object, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            checkResult(myCoudingBatL30Object, Integer.MAX_VALUE, 100, Integer.MAX_VALUE + 100);
        }

        public static void checkResult(CoudingBatL30 theObject, int a, int b, int c) {
            int result = theObject.sumLimit(a,b);
            if (result == c) {
                System.out.println("sumLimit worked for " + a + " and " + b);
            } else {
                System.out.println("sumLimit did not work for " + a + " and " + b + ". It returned " + result);
            }

        }

        public int sumLimit(int a, int b) {
// (Note: one way to compute the number of digits of a non-negative int n is to convert it
// to a string with String.valueOf(n) and then check the length of the string.)

            if (String.valueOf(a).length() == String.valueOf(a+b).length()) {
                return a + b;
            } else {
                return a;
            }
        }
    }


