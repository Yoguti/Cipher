/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cipher_model;


/**
 *
 * @author klaus
 */
public class attbashCipher {
    private static int attbashConstantUp = 155;
    private static int attbashConstantLow = 219;
    public static String attbashResult(String userInput) {
        String input = userInput;
        char[] charArray = input.toCharArray();


        for(int i = 0; i < charArray.length; i++){
            Character check = charArray[i];

            if(!Character.isLetter(check)){
                continue;
            }
            
            if(Character.isUpperCase(check)){
            int primary = attbashConstantUp - check;
            char result = (char)primary;
            charArray[i] = result;
            }
            else{
            int primary = attbashConstantLow - check;
            char result = (char)primary;
            charArray[i] = result;
            }

        }

         return new String(charArray);

    }
}

    
    

