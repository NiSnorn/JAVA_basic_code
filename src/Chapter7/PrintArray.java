package Chapter7;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        //面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i== array.length-1){
                System.out.println(array[i]+"]");
            }else System.out.print(array[i]+", ");
        }
        System.out.println("==========================");
        //面向对象
        System.out.println(Arrays.toString(array));
    }
}
