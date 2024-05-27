/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cipher_model;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author klaus
 */
import java.util.ArrayList;
import java.util.Arrays;

public class transpositionCipher {
    private ArrayList<ArrayList<Character>> table = new ArrayList<>();

    public String transpoCipher(String password, String key) {
        // Create the transposition table
        ArrayList<ArrayList<Character>> table = makeTable(password, key);

        // Sort the key and get the column order
        int[] order = keySort(key);

        // Create the encrypted message by reading the columns in the sorted order
        StringBuilder encryptedMessage = new StringBuilder();
        for (int col : order) {
            for (ArrayList<Character> row : table) {
                encryptedMessage.append(row.get(col - 1)); // Adjust for 1-based index
            }
        }

         return new String(encryptedMessage);        
    }

    private int[] keySort(String key) {
        // Convert the key to a character array
        char[] originalKey = key.toCharArray();
        // Create a copy of the key array and sort it
        char[] sortedKey = key.toCharArray();
        Arrays.sort(sortedKey);

        // Create an array to store the resulting positions
        int[] finalIntArray = new int[originalKey.length];
        // Create an array to keep track of the used positions in the original key
        boolean[] usedPositions = new boolean[originalKey.length];

        // Iterate over the sorted key and find the corresponding positions in the original key
        for (int i = 0; i < sortedKey.length; i++) {
            char currentChar = sortedKey[i];
            for (int j = 0; j < originalKey.length; j++) {
                if (originalKey[j] == currentChar && !usedPositions[j]) {
                    finalIntArray[i] = j + 1; // 1-based index
                    usedPositions[j] = true; // Mark this position as used
                    break; // Move to the next character in the sorted key
                }
            }
        }
        return finalIntArray;
    }

    private ArrayList<ArrayList<Character>> makeTable(String password, String key) {
        int columns = key.length();
        int rows = (password.length() + columns - 1) / columns;

        ArrayList<ArrayList<Character>> table = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            table.add(new ArrayList<>());
        }

        // Populate the table with characters from the password
        int passwordIndex = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (passwordIndex < password.length()) {
                    table.get(i).add(password.charAt(passwordIndex));
                    passwordIndex++;
                } else {
                    table.get(i).add('X');
                }
            }
        }

        return table;
    }
}