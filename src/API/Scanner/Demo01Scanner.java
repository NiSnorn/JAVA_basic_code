package API.Scanner;
import java.util.Scanner;
/**scanner类的功能：可以实现键盘输入数据，到程序当中
 *引用类型一般步骤
 *1.导包
 *   import 包路径.类名称；
 *     如果需要使用的目标类，和当前类处于同一个包下，则导包语句可以忽略
 *     只有java.lang包下内容无需导包，其他都要import
 *2.创建
 *  类名称 对象名 = new 类名称（）；
 *3.使用
 * 对象名。成员方法名（）；
 *
 *获取键盘输入的int数字：int num = sc.nextInt（）；
 *获取键盘输入的字符串： String str = sc.next();
 *
 * */

public class Demo01Scanner {
    public static void main(String[] args) {
        //system.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);
        //获取int数字
        int num = sc.nextInt();
        System.out.println("输入的数字为："+num);
        String str = sc.next();
        System.out.println("输入的字符串是："+str);
    }
}
