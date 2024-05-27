/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cipher_model;

/**
 *
 * @author klaus
 */
public enum referenceCipher {
    CAESAR_CIPHER(1, "Caesar Cipher"),
    ROT_13(2, "ROT13 Cipher"),
    VIGENERE_CIPHER(3, "Vigenère Cipher"),
    TRANSPOSITION_CIPHER(4, "Transposition Cipher"),
    MORSE_CODE(5, "Morse Code"),
    Galactic_CIPHER(6, "Standard Galactic Alphabet"),
    AFFINE_CIPHER(7, "Affine Cipher"),
    ATBASH_CIPHER(8, "Atbash Cipher");
    


    
    referenceCipher(int num, String name) {
        this.num = num;
        this.name = name;
    }

    private final int num;
    private final String name;



    public int getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
}