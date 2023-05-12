import java.util.Scanner;
import java.lang.StringBuilder;
public class Ex_2_3_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome(String text) {
        boolean is_true = false;
        StringBuilder new_text = new StringBuilder();
        StringBuilder source_text = new StringBuilder();
        StringBuilder new_source_text = new StringBuilder();

        source_text.append(text.toLowerCase());
        System.out.println("source to lower:"+source_text);

        String temp;
        for(int i = 0; i < source_text.length(); i++){
            temp = String.valueOf(source_text.charAt(i));
            if (temp.matches("^[a-z0-9]")){
                new_text.append(source_text.charAt(i));
                new_source_text.append(source_text.charAt(i));
            }

        }
        System.out.println("new_source to lower:"+new_source_text);


        if (new_source_text.toString().equals(new_text.reverse().toString()))
            is_true = true;

        System.out.println("new_text to lower:"+new_text);

        return is_true;
    }
}
