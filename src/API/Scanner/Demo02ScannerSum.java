package API.Scanner;
/**键盘输入两个int数字，并且读出和值
 * 思路：
 * 1.scanner：导包创建使用
 * 2.两个数字两个nextInt
 * 3.求和打印输出*/
import java.util.Scanner;
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("和为:"+sum);
    }
}
