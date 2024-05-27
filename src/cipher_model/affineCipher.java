package cipher_model;

public class affineCipher {
    private Integer firstKey;
    private Integer secondKey;
    private boolean conditionsMet = false;
    private String finalString;

    private void setFirstKey(Integer firstKey){
        this.firstKey = firstKey;
    }
    
    private void setSecondKey(Integer secondKey){
        this.secondKey = secondKey;
    }

    private Integer getFirstKey(){
        return firstKey;
    }

    private Integer getSecondKey(){
        return secondKey;
    }

    public String affineResult(String Key, String userText) {
        boolean containsChar = Key.contains(",");
        if (containsChar) {
            createKeys(Key);
            if (conditionsMet) {
                finalString = calculateResult(userText);
            } else {
                finalString = "Invalid keys.";
            }
        }
        return finalString;
    }

    private String calculateResult(String userText) { 
        String reUserText = userText.toUpperCase();
        char[] myArray = reUserText.toCharArray();

        for (int i = 0; i < myArray.length; i++) {
            char letter = myArray[i];
            if (Character.isLetter(letter)) {
                int myLetterINT = letter - 'A';
                int complete = (firstKey * myLetterINT + secondKey) % 26;
                char finalLetter = (char) (complete + 'A');
                myArray[i] = finalLetter;
            }
        }

        return new String(myArray);
    }

    private void createKeys(String userInput) {
        int comma = userInput.indexOf(',');
        String firstPart = userInput.substring(0, comma);
        String secondPart = userInput.substring(comma + 1);

        Integer firstInt = Integer.valueOf(firstPart.trim());
        Integer secondInt = Integer.valueOf(secondPart.trim());

        rulesKey(firstInt, secondInt);
    }

    private void rulesKey(Integer firstKey, Integer secondKey) {
        int common = gcd(firstKey, 26);
        boolean first = valfirstKey(firstKey);
        boolean second = valsecondKey(secondKey);
        if (common == 1 && first && second) {
            conditionsMet = true;
            setFirstKey(firstKey);
            setSecondKey(secondKey);
        }
    }

    private int gcd(Integer a, Integer b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private boolean valfirstKey(Integer firstKey) {
        return firstKey >= 1 && firstKey <= 25;
    }

    private boolean valsecondKey(Integer secondKey) {
        return secondKey >= 0 && secondKey <= 25;
    }
}
