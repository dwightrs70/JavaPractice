/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javapractice;

/**
 *
 * @author dwightsage
 */
public class PracticeCode2 {
    static void SolutionTest() {
        int testCases = 3;
        
        int[][] testCase = new int[testCases][];

        testCase[0] = new int[] {-1, 3, -4, 5, 1, -6, 2, 1};   
        testCase[1] = new int[] {-7, 1, 5, 2, -4, 3, 0};
        testCase[2] = new int[] {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < testCases; i++) {
            String resultVal = Solution2(testCase[i]);
        
            System.out.print(resultVal + "\n");
        }
    }
    
    static String Solution1(int[] A) {
        int arrayLength = A.length;
        
        int[] bottomTotal = new int[arrayLength];
        int[] topTotal = new int[arrayLength];
        
        String result = new String();
        
        //bottomTotal[0] = 0;
        bottomTotal[1] = A[0];
        
        //topTotal[arrayLength - 1] = 0;
        topTotal[arrayLength - 2] = A[arrayLength - 1];
        
        for (int i = 2; i < arrayLength; i++) {
            bottomTotal[i] = bottomTotal[i - 1] + A[i - 1];
        }
        
        for (int i = arrayLength - 2; i > -1; i--) {
            topTotal[i] = topTotal[i + 1] + A[i + 1];
        }
        
       for (int i = 0; i < arrayLength; i++) {
           if (bottomTotal[i] == topTotal[i]) {
               if (result.length() > 0)
                   result = result + " ";
               
               result = result + i;
            }
        }
       
        return result;
    }
    
    static String Solution2(int[] A) {
        int arrayLength = A.length;
        
        int arrayBottomTotal = 0;
        int arrayTopTotal = 0;
        
        String result = new String();
        
        for (int i = 0; i < arrayLength; i++)
            arrayTopTotal += A[i];
        
        for (int i = 0; i < arrayLength; i++) {
            arrayTopTotal -= A[i];
            
            if (arrayBottomTotal == arrayTopTotal) {
               if (result.length() > 0)
                   result += " ";
               
               result += i;
            }
            
            arrayBottomTotal += A[i];
        }
       
        if (result.length() == 0)
            result = "No equilibrium index.";
       
        return result;
    }
}
