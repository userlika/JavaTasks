public class Ex_2_2_PowerTwo {
    public static boolean isPowerOfTwo(int value) {
        int[] valueInByte = new int[32];
        int id=0;
        if (value < 0)
            value = value * (-1); //if value is negative - make it positive

        while (value > 0){ //creating massive of value in bytecode
            valueInByte[id++] = value % 2;
            value = value / 2;
        }

        int countOfOnes = 0; // if the value is power of two - the bytecode of this value should consist of only one '1'
        for (int i = 0; i < valueInByte.length; i++){
            if (valueInByte[i] == 1)
                countOfOnes++;
        }

        if (countOfOnes == 1)
            return true;
        else return false;
    }
}
