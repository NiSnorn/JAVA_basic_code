public class Chapter6 {
    public static void main(String[] args) {
        ArrayMade();
        ArrayUse();
        ArraySpace();
        ArrayWrong();
        ArrayLength();
        ArrayPrint();
        FindMax();
        ArrayReverse();
        //数组作为方法参数
        int[]array={10,20,30,40,50};
        ArrayParam(array);
        //数组作为返回值类型
        int[]result = ArrayReturn(7,17,22);
        System.out.println("总和"+result[0]+"平均数"+result[1]);
    }
    public static void ArrayMade(){
             /*
    数组
    概念： 是一种容器，可以同时存放多个数据
    特点：
        1.引用数据类型
        2.数组中数据类型必须统一
        3.数组长度在程序运行期间不可改变
    数组初始化：在内存中创建一个数组，并向其中赋予一些默认值。
      常见方式：
        1.动态（指定长度）
          格式：
            数据类型【】数组名称=new 数据类型【数组长度】;
          含义解析：
          左侧数据类型：也就是数组当中保存的数据全部统一的类型
          左侧中括号：代表是数组
          new：创建数组的动作
          右侧数据类型：必须和左边保持一致
          右侧中括号的长度：数组当中可以保存多少个数据，是一个int数字。
        2.静态(指定内容)
          格式：
            数据类型【】数组名称 = new 数据类型【】{元素1，元素2，....}

            数据类型【】数组名称 = {元素1，元素2，....}（省略格式）

        注意事项：
          1.虽然静态未直接告诉长度，但可根据元素推断长度。
          2.标准格式可以拆为两个步骤 int【】 array4；
                                 array4={a，b，...}
          3.静态省略格式不能拆。

        使用建议：
          不确定数组具体内容，用动态。否则用静态
    */
        //创建一个数组double10
        double[] array1 = new double[10];
        //创建一个数组String5
        String[] array2 = new String[5];

        //创建一个数组，字符串”Hello“，”Java“，”World“
        String[] array3 = new String[]{"Hello","Java","World"};
    }
    public static void ArrayUse(){
                /*
        数组的使用：
            直接打印数组名称，得到的是数组对应的内存地址哈希值。【I（类型）@十六进制的地址】
        16进制：0123456789abcdef

        访问数组元素格式：数组名称【索引值】
        索引值：int数字，是元素编号
        【注意】索引值从@后面开始，一直到”数组长度-1“为止。
        */
        //静态初始化一个数组
        int[]array4={7,17,22};
        //直接打印元素
        System.out.println(array4[2]);//22
        System.out.println(array4[0]);//7
        //也可以单个元素赋值给变量
        int num = array4[1];
        /*
        系统默认值：
        整数类型：0
        浮点类型：0.0
        布尔类型：false
        引用类型：null

        注意事项：
        静态初始化其实也有默认值，只不过系统立刻替换为大括号里的数值。
         */
        //动态初始化一个数组
        int[]arry5=new int[3];
        System.out.println(arry5[2]);//0
        System.out.println("----------------------------------");
        arry5[1]=17;
        System.out.println(arry5[1]);//17

    }
    public static void ArraySpace(){
        /*
        Java的内存：
        1. 栈（Stack）：存放方法的局部变量。方法运行一定在栈当中。
            局部变量：方法的参数，或者是方法{}内部变量
            作用域：一旦超出作用域，立刻从栈当中消失。
        2.堆（Heap）：凡是new出来的东西都在堆当中。
            堆内存里面的东西都有一个地址值：16进制。
            堆内内存里面的数据，都有默认值。
        3.方法区（Method Area）：储存.class相关信息，包含方法信息。
        4.其他本地方法栈（Native Method Stack）：与操作系统相关。
        5.寄存器（pc Register）：与CPU相关。
        */

        int[]arrayA=new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0
        System.out.println("--------------------------------------");
        arrayA[1]=7;
        arrayA[2]=17;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//7
        System.out.println(arrayA[2]);//17
        System.out.println("--------------------------------------");

        //将arrayA数组的地址值，赋值给arrayB数组（同地址，此时arrayA=arrayB）
        int[]arrayB=arrayA;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//7
        System.out.println(arrayB[2]);//17
        System.out.println("--------------------------------------");
        arrayB[1]=17;
        arrayB[2]=22;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//17
        System.out.println(arrayB[2]);//22
        System.out.println("--------------------------------------");
    }
    public static void ArrayWrong(){
        //索引越界异常
        int[]array1={7,17,22};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        //索引越界异常（ArrayIndexOutOfBoundsException）:索引编号写错了
        //System.out.println(array1[3]);

        //空指针异常（NullPointerException）:数组赋值Null并且未初始化
        //所有引用类型都可以null赋值，代表啥也没有
        //int[]array = null;
        //array=new int[3];
        //System.out.println(array[0]);
    }
    public static void ArrayLength(){
    /*
    获取数组长度 格式：
      数组名称.length

    会得到一个int值，即为数组长度

    数组一旦创建，程序运行期间，长度不可改变。
    */
        int[] arrayA=new int[3];

        int[] arrayB={7,17,22,47,11,10};
        int len = arrayB.length;
        System.out.println("arrayB的长度是"+len);
        System.out.println("---------------------------------------");

        int[] arrayC=new int[3];
        System.out.println(arrayC.length);
        arrayC =new int[5];//arrayC仅是数组名称，不能用于存储.int[n]才可以存储n个元素
        System.out.println(arrayC.length);
    }
    public static void ArrayPrint(){
        /*遍历数组
        对数组中每一个元素进行逐一、挨个处理。默认处理方式就是打印。


         */
        int[]array={6,7,10,11,17,22,47};

        //原始方法
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println("---------------------------------------------------");

        //使用for循环
        for (int n=0 ;n<array.length;n++){
            System.out.println(array[n]);
        }
        System.out.println("---------------------------------------------------");


    }
    public static void FindMax(){
        int[]array={10,7,6,47,17,22,11};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {//i!=0,因为无法与自己比较
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
    public static void ArrayReverse(){
    /*
    数组元素反转（只用一个数组）
        1.其实就是对称位置元素交换。
        2.两个索引
          int min =0;
          int max = array.length-1;
        3.如何交换：第三个变量倒手(min<max时交换)
        4.何时停止交换
          （1）min==max
          （2）min>max
     */
        int[]array ={10,20,30,40,50};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("------------------------------");
        //反转
        for (int min=0,max = array.length-1;min>=max;min++,max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
    public static void ArrayParam(int[]array){
    /*
    数组可以当作方法参数。
    当调用方法的时候，向方法的小括号传参，传递进去的是数组地址
     */
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] ArrayReturn(int a,int b,int c){
        /*
        一个方法不能同时有多个返回值，但可以用数组作为返回值类型。
        返回的也是地址
         */
        int sum=a+b+c;
        int avg=sum/3;
        int[]array={sum,avg};
        return array;
    }

}
