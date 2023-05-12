import java.util.Scanner;
public class Ex_2_1_grig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        System.out.println(isLeapYearWithBool(year));


    }

    public static int isLeapYearWithBool(int year){
        int count_leap = 0;
        if (((year % 4 == 0) & (year % 100 != 0)) || (year % 400 == 0)){
            count_leap++;
        }
        System.out.println(count_leap);
        if (count_leap != 0) {
            return year/count_leap;
        }
        else return 0;
    }
}
