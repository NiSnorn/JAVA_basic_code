package API.Random;
/*
题目：
用代码模拟二分法猜数字;数字扫雷

思路：
1.random
2.scanner
3.if判断（三种情况，不对就重来）
4.重试就是再来一次，循环次数不确定，用while（true）


 */

import java.util.Random;
import java.util.Scanner;

public class Demo04GameToGuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int aim = random.nextInt(0,201);
        System.out.println("游戏开始！（0~200选一个数吧）");
//        do {
//            int g = sc.nextInt();
//            if (sc.nextInt() < 0 || sc.nextInt() > 100) {
//                System.out.println("所选数字不在指定范围内");
//            }
//            switch (g) {
//                case 1:
//                    if (g < aim)
//                        System.out.println("猜小了");
//                    break;
//                case 2:
//                    if (g > aim)
//                        System.out.println("猜大了");
//                    break;
//            }
//            if (sc.nextInt()<aim){
//                System.out.println("猜小了");
//            }else{
//                System.out.println("猜大了");
//            }
//            sc.nextInt();
//        }while (sc.nextInt() != aim);
//            System.out.println("恭喜你，猜对了");
//        System.out.println("生成的数字为："+aim);
        int g = sc.nextInt();
        int num= 0;
        if (g < 0 || g > 200) {
            System.out.println("所选数字不在指定范围内");
        }

        while (g!=aim) {
            if (g < aim) {
                num++;
                System.out.println(g+"小了");
            } else {
                num++;
                System.out.println(g+"大了");
            }
            g = sc.nextInt();
        }
        if (num<=6){
            System.out.println("不愧是你,猜了"+(num+1)+"次居然就猜对了！！！");
        }else {
            System.out.println("你个小笨蛋，猜了"+(num+1)+"次才猜出来！！！");
        }

        System.out.println("随机数为："+aim);
    }
}
