package API.Random;

import java.util.Random;

/**
 * Random类用来生成随机数字
 * 1.导包
 *   import java.util.Random;
 * 2.创建
 *   Random r = new Random();
 *3.使用
 *  获取一个随机int数字（int范围内所有数字，正负两种）：nextInt（）
 *  获取一个随机int数字（参数代表范围，左闭右开区间）;nextInt(3);【实际范围[0,3)】
 * */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是："+num);


    }
}
