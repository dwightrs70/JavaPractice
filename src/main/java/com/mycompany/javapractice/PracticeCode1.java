/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javapractice;

import java.util.*;

/**
 *
 * @author dwightsage
 */
public class PracticeCode1 {
    static void SolutionTest() {
        int testCases = 6;
        
        int[][] testCase = new int[testCases][];
        int[] expectedResult = new int[testCases];
        
        testCase[0] = new int[] {2, 2, 2, 2, 2, 3, 4, 4, 4, 6};
        testCase[1] = new int[] {1, 1, 1, 1, 50};
        testCase[2] = new int[] {0, 2, 2};
        testCase[3] = new int[] {3, 4, 5, 2, 2};
        testCase[4] = new int[] {1, 1, 1, 1, 2, 2, 2, 2};
        testCase[5] = new int[] {1, 1, 1, 1, 1, 2, 2, 2, 2};
   
        expectedResult[0] = -1;
        expectedResult[1] = 1;
        expectedResult[2] = 2;
        expectedResult[3] = -1;
        expectedResult[4] = -1;
        expectedResult[5] = 1;
        
        for (int i = 0; i < testCases; i++) {
            int resultVal = Solution(testCase[i]);
        
            System.out.print(resultVal);
            
            if (resultVal == expectedResult[i])
                System.out.print(" SUCCESS!\n");
            else
                System.out.print(" ERROR!\n");
        }        
    }
    
    static int Solution(int[] A) {
        int n = A.length;
        
        int[] L = new int[n + 1];
        
        L[0] = -1;
        
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }

        int count = 0;
        
        int pos = (n + 1) / 2;
        
        int candidate = L[pos];
        
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
        
        //if (count < pos)
        //if (count > pos)
        if (count * 2 > n)
            return candidate;
        
        return (-1);
    }
}
