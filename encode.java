import java.util.Scanner;

public class encode {/*import java.util.*;
class encode1{
	public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter text:");
String text = sc.nextLine();
System.out.println("enter shift value:");
int shift = sc.nextInt();

String encoded = "";
for (int i=0;i<text.length();i++){
	char ch = text.charAt(i);
	if(ch <= 'a' && ch>= 'z'){
		ch =(char)((ch - 'a' + shift)%26 +'a');
	}
	else if(ch <= 'A' && ch>= 'Z'){
		ch =(char)((ch - 'A' + shift)%26 +'A');
	}text += ch;
	
}
System.out.println("encoded: "+ );
}
}
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the plaintext
        System.out.print("Enter the plaintext: ");
        String plaintext = sc.nextLine();

        // Input the shift value
        System.out.print("Enter the shift value (0-25): ");
        int shift = sc.nextInt();


        // Encrypt the plaintext
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Encrypt lowercase letters
                ch = (char) ((ch - 'a'  + shift) % 26 + 'a');
				
            } else if (ch >= 'A' && ch <= 'Z') {
                // Encrypt uppercase letters
                ch = (char) ((ch - 'A' + shift) % 26 + 'A');
            }
            // Append the character to the ciphertext
            ciphertext += ch;
        }
        // Display the ciphertext
        System.out.println("Ciphertext: " + ciphertext); 
    }
}