package API.Scanner;

import java.util.Scanner;
/**键盘输入三个数字，求最大值
 *
 * 思路：
 * Scanner 导包创建使用3次
 * 比较大小
 */


public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();
        int max;
        if(a>b){
            max = a;
        }else if (b>c){
            max = b;
        }else {
            max = c;
        }
        System.out.println("最大值为："+max);
    }

}
