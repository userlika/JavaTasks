import java.util.Scanner;
public class Ex_2_1 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        boolean[] user_bool = new boolean[4];

        for(int i = 0; i < user_bool.length; i++){
            user_bool[i] = user_input.nextBoolean();
        }

        System.out.println(is_Two_bool(user_bool));

    }

    public static boolean is_Two_bool(boolean[] mas_bool){
        int false_count = 0;

        for (int i = 0; i < mas_bool.length; i++){
            if (mas_bool[i] == false){
                false_count++;
            }
        }
        if (false_count == 2) {
            return true;
        }
        else return false;
    }
}
