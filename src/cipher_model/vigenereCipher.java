package cipher_model;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author klaus
 */

public class vigenereCipher {
    private static char[][] vigenereTableUpperCase;

    // Static block to initialize the Vigenère table
    static {
        vigenereTableUpperCase = vigenereCipherUpperTable();
    }

    public static char[][] vigenereCipherUpperTable() {
        char[][] vigenereTableUpperCase = new char[26][26];
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int value = 26;
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                char letter = alphabet.charAt((i + j) % 26);
                vigenereTableUpperCase[i][j] = letter;
            }
        }
        return vigenereTableUpperCase;
    }

    public static String inputPass(String input, String key) {
    input = input.toUpperCase();
    key = key.toUpperCase();

    StringBuilder cifrado = new StringBuilder();

    // Apply Vigenère cipher
    for (int i = 0; i < input.length(); i++) {
        char letraUsuario = input.charAt(i);

        // Skip non-letter characters
        if (!Character.isLetter(letraUsuario)) {
            cifrado.append(letraUsuario);
            continue;
        }

        char letraChave = key.charAt(i % key.length());
        char encryptedChar = vigenereResult(letraUsuario, letraChave);
        cifrado.append(encryptedChar);
    }

    return cifrado.toString();
}

    public static char vigenereResult(char charInputUnicode, char charUnicodeKey) {
        int row = charInputUnicode - 'A'; // Convert input character to index in the alphabet
        int column = charUnicodeKey - 'A'; // Convert key character to index in the alphabet
        return vigenereTableUpperCase[row][column];
    }
}