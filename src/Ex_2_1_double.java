import java.lang.Math;
public class Ex_2_1_double {
    public static void main(String[] args) {
        doubleExpression(0.1,0.2,0.3);

    }
    public static boolean doubleExpression(double a, double b, double c) {
        double res = a + b - c;

        System.out.println(Math.abs(res));
        return ((Math.abs(res )> -0.0001) || Math.abs(res) < 0.0001);
    }
}
