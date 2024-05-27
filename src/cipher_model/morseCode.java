/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cipher_model;

/**
 *
 * @author klaus
 */
public class morseCode { 
    
static String[] morseLetters = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",  // A-J
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",    // K-T
            "..-", "...-", ".--", "-..-", "-.--", "--.."                            // U-Z
};    
        
static String[] morseNumbers = {
            "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."  // 0-9
};    
    
    public static String morseResult(String userInput){

    String treated = userInput.toUpperCase();
    String[] pass = new String[treated.length()];
    
        for(int i = 0; i < treated.length(); i ++){
            char ping = treated.charAt(i);
            
            if(Character.isLetter(ping)){
                int index = ping - 'A';
                String result = morseLetters[index];
                pass[i] = result;
            }
            else if(Character.isDigit(ping)){
               int convert = (int)ping;
               int index = convert - '0';
               String result = morseNumbers[index];
                pass[i] = result;
            }
            else{
                String result = Character.toString(ping);
                pass[i] = result;
            }

        
        }
      
        String result = "";
            for (String s : pass) {
                result += s;
            }
         
        return result;    
    }
    
    
}
