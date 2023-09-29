package API.Random;

import java.util.Random;
import java.util.Scanner;

/*根据一个int变量n的值，来获取随机数字，范围是【1，n】

思路：
定义一个int
random
如果10，那么就是0~9，可以发现，整体加1
打印输出

 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入一个数字");
        int n = sc.nextInt()+1;
        for (int i = 0; i < n; i++) {
            int a = r.nextInt(n);
            System.out.println("生成的第"+(i+1)+"个数字是："+a);
        }
    }
}
