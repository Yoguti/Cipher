/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cipher_model;
import java.util.Arrays;
/**
 *
 * @author klaus
 */
public class CeasarCipherBase {
    
   public static String ceasarCipher(String userInput) {
        String input = userInput;
        char[] charArray = input.toCharArray();


        for(int i = 0; i < charArray.length; i++){
            char check = charArray[i];

            if(!Character.isLetter(check)){
                continue;
            }

            int ceasar = charArray[i] + 3;
            Character atual = (char) ceasar;
            charArray[i] = atual;

            if (Character.isUpperCase(check)) {
                if (ceasar > 'Z') {
                    ceasar = ceasar - 26;
                    Character upperAtual = (char) ceasar;
                    charArray[i] = upperAtual;
                }
            }

            if (Character.isLowerCase(check)) {
                if (ceasar > 'z') {
                    ceasar = ceasar - 26;
                    Character lowerAtual = (char) ceasar;
                    charArray[i] = lowerAtual;
                }
            }

        }
         return new String(charArray);
    }
    
}
