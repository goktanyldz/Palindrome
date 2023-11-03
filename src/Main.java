import java.util.Scanner;

public class Main {
    public String setText(){ // This method prompts the user to enter a text .
        System.out.println("Please enter the text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        return text;
    }
    public void findPalindrome(String text){ //I check text with this method
        int duzMetinSayı = 0;
        String reverseText ="";
        for (int i = text.length()-1; i>=0 ; i--){ // I reverse reading the text
             reverseText = reverseText+text.charAt(i); // I set reverseText;
        }
        if (text.toLowerCase().equals(reverseText.toLowerCase())){ //  I am checking texts , if original text and reverse text are equal, ıt prints the text is palindrome, otherwise ıt prints The text isn't palindrome.
            System.out.println("The text is palindrome");
        }
        else {
            System.out.println("The text isn't palindrome");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        String text = main.setText();
        main.findPalindrome(text);
    }
}