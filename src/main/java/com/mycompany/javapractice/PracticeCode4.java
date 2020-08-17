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
public class PracticeCode4 {
    static void SolutionTest() {
        int testCases = 1;
        
        String S1 = "babaa";
        String S2 = "ababa";
        String S3 = "aba";
        
        for (int i = 0; i < testCases; i++) {
            int resultVal = Solution1(S2);
        
            System.out.print(resultVal + "\n");
        }
    }
    
    static int Solution1(String S) {
        int a_Count = 0;
        int b_Count = 0;

        if (S.length() < 3)
            return 0;

        for (char c : S.toCharArray()) {
            // Assume all characters are either a or b;
            if (c == 'a')
                a_Count++;
            else
                b_Count++;
        }

        if (a_Count == 0) {
            // All splits contain 0 a's.
            if (b_Count == 3)
                return 1;

            return (b_Count - 3) * 2;
        }
        else {
            // Not enough a's for 3 groups.
            if (a_Count < 3)
                return 0;

            // a's not evenly divisible into 3 groups.
            if (a_Count % 3 != 0)
                return 0;

            // Need to account for different distributions of characters???
            // There's probably a mathematical function to use here, but I'm
            // not familiar with it off hand and I'm running out of time.
            if (a_Count == 3)
                return 1 * b_Count;

            return (a_Count - 3) * 2 * b_Count;
        }
    }
}
