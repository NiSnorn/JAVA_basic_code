package Chapter7;
/*
面向对象三大特点：封装、继承、多态

封装：1.方法   2.private   (将细节信息隐藏）
 */
public class Method {
    public static void main(String[] args) {
        int[]array={6,7,10,17,22,47};
        int max=getMax(array);
        System.out.println("最大值"+max);
    }

    //方法
    public static int getMax(int[]array) {
        int max = array[0];
        for (int i = 1; i < 6; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    //private

}
