public class Method {
    public static void main(String[] args) {
        MethodDefine();
        //单独调用
        sum(7, 17);
        System.out.println("--------------------------------");
        //打印调用
        System.out.println(sum(7, 17));
        System.out.println("--------------------------------");
        //赋值调用
        int number = sum(10, 8);
        System.out.println("变量的值" + number);

        System.out.println(compare(7, 17));

        System.out.println(Sum());

        Print(7);

        System.out.println(min(7,17,22));

        System.out.println(Compare((short) 20,(short) 20));
        System.out.println(Compare((byte) 7,(byte) 10));
        System.out.println(Compare((long)755,(long)1000));
        System.out.print(Compare(7,17));

    }
    public static void MethodDefine() {
        /*
        方法其实就是若干语句的功能集合。

        参数（原料）：进入方法的数据
        返回值（产物）：输出值

    定义方法的完整格式：
        修饰符  返回值类型 方法名称（参数类型 参数名称...）{
            方法体
            return 返回值；
        }

        修饰符：（目前）public static
        返回值类型：输出数据的类型
        方法名称：小驼峰
        参数类型：输入数据的类型
        参数名称：进入方法的数据对应的变量名称
            ps：参数如果多个，使用逗号进行分隔
        方法体：若干行代码
        return：①停止当前方法 ②将后面的返回值还给调用处
        返回值：方法执行后最终产生的数据结果
            ps：return后面的返回值必须与方法名称前面的返回值类型保持一致。



        方法调用格式：
        1.单独调用：方法名称（参数）；
        2.打印调用：System.out.println(方法名称（参数）)；
        3.赋值调用: 数据类型变量名称 = 方法名称（参数）；

    注意：void 只能单独调用，其他都不行。



    有无参数区别：
        有参数：
            小括号有内容。方法需要数字才能执行。
        无参数：
            小括号留白。方法无需数据即可执行。


    有无返回值区别：
        有返回值：你帮我做，完成后把结果告诉我，我来提交。
        无返回值：你帮我做，完成后不要告诉我，你直接提交。
      注意事项：
        有返回值的方法三种调用都可以。
        无返回值的方法仅用单独调用。



        构造方法是专门用来创建对象的方法，当通过关键字new来创建对象时，其实就是在调用构造方法
        格式：
        public 类名称（参数类型 参数名称）{
            方法体
        }

        注意事项：
        1.构造方法的名称必须和所在类名称完全一样。
        2.构造方法不要写返回值类型，连void都不写。
        3.构造方法不能return一个具体返回值。
        4.如果没有编写任何构造方法，编译器自动构造一个方法，没有参数和方法体
        5.一旦编写了至少一个构造方法，那么编译器不会自动构造
        6.方法也可以重载（名称相同，参数列表不同）
         */





    }
    public static int sum(int a, int b) {
        int result = a + b;
        System.out.println("已执行");
        return result;
    }

    /*
    定义一个方法，用来判断两个数字是否相同
    */
    public static boolean compare(int a, int b) {
            /*if (a==b){
                result = true;
            }else{
                result = false;
            }*/

        //result = a==b? true:false;
        //boolean result=a==b;
        return a == b;//return result;
    }

    /*
    定义一个方法，求1-100的和
     */
    public static int Sum() {
        int S = 0;
        for (int i = 1; i <= 100; i++) {
            S = S + i;
        }
        return S;
    }

    /*
    定义一个方法，打印指定次数的文字
     */
    public static void Print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("I LOVE JAVA !   " + i);
        }
    }

    /*
        注意事项：
        1.方法定义在类当中，不能嵌套。
        2.方法定义的前后顺序无所谓。
        3.欲使方法执行，需调用（单独/打印/赋值）。
        4.如有返回值，”return 返回值“
        5.return后面返回值数据，必须和方法的返回值类型对应起来。
        6.void无返回值，不能写return后的返回值。对于方法当中最后一行的return可以省略不写。
        7.一个方法中可以有多个return，但必须保证仅一个被执行
         */
    public static int Max(int a, int b){
        int max;
        /*if (a>=b){
            max = a;
        }else{
            max = b;
        }
        return max;*/
        if (a>=b){
            return a;
        }else {
            return b;
        }

    }


    /*
    方法重载：
    多个方法名称一样，但参数列表不同。
    好处：只需要记住一个方法名称，就能实现类似的功能。

    方法重载与下列因素有关：
    1.参数个数不同
    2.参数类型不同
    3.参数的多类型顺序不同

    与下列无关：
    1.与参数名称无关
    2.与返回值类型无关

     */
    public static int min(int a,int b){
        System.out.println("2");
        if (a<b){
            return a;
        }else{
            return b;
        }
    }
    public static int min(int a, int b,int c){
        System.out.println("3");
        if (a-b<0&&a-c<0){
            return a;
        }else if (b-c<0){
            return b;
        }else{
            return c;
        }
    }
    public static int sum1(int a,int b){
        return a+b;
    }
    public static int sum1(int a, int b,int c){
        return a+b+c;
    }
    public static int sum1(double a,double b){
        return (int)(a+b);
    }
    public static int sum1(int a,double b){
        return (int) (a+b);
    }
    public static int sum1(double a,int b){
        return (int) (a+b);
    }

    /*
    定义一个方法，比较两个数据是否相等。
    数据类型分别为byte/shor/int
     */
    public static boolean Compare(byte a,byte b){
        System.out.print("byte  ");
        return a==b;
    }
    public static boolean Compare(short a,short b){
        System.out.print("short  ");
        boolean C = a==b?true:false;
        return C;
    }
    public static boolean Compare(int a,int b){
        System.out.print("int  ");
        if (a==b){
            return true;
        }else {
            return false;
        }
    }

    public static boolean Compare(long a,long b){
        System.out.print("long  ");
        boolean R;
        if (a==b){
            R=true;
        }else {
            R=false;
        }
        return R;
    }


}
