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
public class PracticeCode3 {
    static void SolutionTest() {
        int testCases = 1;
        
        String S = "ABBBCCDDCCC";
        
        for (int i = 0; i < testCases; i++) {
            int resultVal = Solution1(S, 3);
        
            System.out.print(resultVal + "\n");
        }
    }
    
    static int Solution1(String S, int K) {
        int stringLength = S.length();
        int newStringLength = stringLength - K + 1;
        int compressedStringLength = 0;
        int smallestCompressedtString = stringLength;
        
        for (int i = 0; i < newStringLength; i++) {
            String stringPart1 = "";
           
            if (i > 0)
                stringPart1 = S.substring(0, i);
            
            String stringPart2 = S.substring(i + K);

            String newString = stringPart1 + stringPart2;
            
            System.out.print("String: " + newString + "\n");  
            
            compressedStringLength = CompressString(newString);
            
            if (compressedStringLength < smallestCompressedtString)
                smallestCompressedtString = compressedStringLength;
        }
        
        return smallestCompressedtString;
    }    
    
    static int CompressString(String S) {
        char previousChar = 'a';
        int charCount = 0;
        String compressedString = "";
        
        for (char c : S.toCharArray()) {
            if (c == previousChar) {
                charCount++;
            }
            else {
                if (previousChar != 'a') {
                    if (charCount > 1)
                        compressedString = compressedString + charCount + previousChar;
                    else
                        compressedString = compressedString + previousChar;
                }
                
                previousChar = c;
                charCount = 1;
            }
        }

        // Pick up the final set of characters.
        if (previousChar != 'a') {
            if (charCount > 1)
                compressedString = compressedString + charCount + previousChar;
            else
                compressedString = compressedString + previousChar;
        }

        System.out.print("Compressed String: " + compressedString + "\n");            
        System.out.print("Compressed String Length: " + compressedString.length() + "\n");
        
        return compressedString.length();
    }
}
