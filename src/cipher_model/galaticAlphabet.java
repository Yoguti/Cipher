/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cipher_model;

/**
 *
 * @author klaus
 */
public class galaticAlphabet {
    
    private static String galacticAlphabet = "ᔑ, ʖ, ᓵ, ↸, ᒷ, ⎓, ⊣, ⍑, ╎, ⋮, ꖌ, ꖎ, ᒲ, リ, 𝙹, !, ᑑ, ∷, ᓭ, ℸ, ⚍, ⍊, ∴, /, ||, ⨅";
    private static String cleanedAlphabet = galacticAlphabet.replace(",", "").replace(" ", "");
    private static char[] galacticCharArray = cleanedAlphabet.toCharArray();
    
    
    public  static String userResult (String userInput){
    String cleanInput = userInput.toUpperCase();
    char[] userArray = cleanInput.toCharArray();
    
        for(int i = 0; i < cleanInput.length(); i++){
           char atualLetter = cleanInput.charAt(i);
           if(cleanInput.charAt(i) < 'A' || cleanInput.charAt(i) > 'Z'){
               continue;
           }
           
           int equivalentIndexGalatic = cleanInput.charAt(i) - 'A';
           userArray[i] = galacticCharArray[equivalentIndexGalatic];   
        }
        
        String result  = new String(userArray);
        
        return result;
    }

    
}
