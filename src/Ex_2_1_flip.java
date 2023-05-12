import java.lang.Math;
public class Ex_2_1_flip {
    public static void main(String[] args) {
        int res;
        res = flipBit(16, 4);
        System.out.println("Result:");
        System.out.println(res);

    }

    public static int flipBit(int value, int bitIndex) {
        int[] source_array = new int[32];
        int[] new_array = new int[32];
        int new_value = 0;
        int id = 0;

        while (value > 0) {
            source_array[id++] = value % 2;
            value = value / 2;
        }

        if(source_array[bitIndex-1] == 0){
            source_array[bitIndex-1] = 1;
        }
        else source_array[bitIndex-1] = 0;

        int power2 = 0;
        for (int i = 0;  i <32; i++){
            power2 = (int)Math.pow(2,i);
            new_value = new_value + power2*source_array[i];

        }

        return new_value;
    }
}
