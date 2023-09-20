
package edu.monmouth.CaesarCipher;

public class Cipher {
    private String message;
    private int offset;

    public Cipher(String message, int offset) {
        this.message = message;
        this.offset = offset;
    }

    public String encode() {
        StringBuilder encodedMessage = new StringBuilder();

        for (char letter : message.toCharArray()) {
            if (Character.isLowerCase(letter)) {
                // Shift the letter by the specified offset
                char encodedLetter = (char) ('a' + (letter - 'a' + offset) % 26);
                encodedMessage.append(encodedLetter);
            } else {
                // If the character is not a lowercase letter, leave it unchanged
                encodedMessage.append(letter);
            }
        }

        return encodedMessage.toString();
    }

    public static void main(String[] args) {
       
        Cipher cipher = new Cipher("welcome to data structures", 4);
        String encodedMessage = cipher.encode();
        System.out.println("Encoded Message: " + encodedMessage);
    }
}