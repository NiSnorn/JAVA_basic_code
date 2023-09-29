package API.Anonymous;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通方法
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //匿名对象
//        int a = new Scanner(System.in).nextInt();

        //一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //匿名对象传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("output"+num);
    }
    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是："+i);
    }
    public static Scanner methodReturn() {
//        Scanner sc =new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);

    }
}
