public class Chapter4 {
    public static void main(String[] args) {
        ifyuju();
        switchyuju();
        forxunhuan();
        whilexunhuan();
        xunhuankongzhi();
        //deadloop();
        qiantaoxunhuan();
    }
    public static void ifyuju() {
    /*
    选择结构：
        1. if (满足执行，不满足跳过）
        2. if...else...（满足执行，不满足执行else）
            格式：
            if (关系表达式){
                语句体1；
            }else{
                语句体2；
            }
        3.if...else if...else（满足执行剩下全部跳过，不满足继续判断直至满足，若全不满足直接执行else）
            格式：
            if(判断1){
                执行语句1；
            }else if(判断2){
                执行语句2；
            }
            ...
            }else if(执行n){
                执行语句n；
            }else{
                执行语句n+1；
            }


*/
        int num1 = 17;

        if (num1 % 2 == 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
        //成绩划分
        short num2 = 122;
        if (num2>100){
            System.out.println("A+");
        } else if (90 < num2 && num2 <= 100) {
            System.out.println("A");
        } else if (80 < num2 && num2 <= 90) {
            System.out.println("B");
        } else if (70 < num2 && num2 <= 80){
            System.out.println("C");
        }else if (60<=num2 && num2<=70){
            System.out.println("D");
        }else if(0<=num2&&num2<60){
            System.out.println("F");
        }else System.out.println("wrong");
        /*
        使用if else语句和 三元运算符 寻找最大值

         */
        short a=49;
        short b=17;
        //三元运算符
        int max = a > b ? a:b;
        System.out.println(max);
        //if...else语句
        if (a>b){
            System.out.println(a);
        }else
            System.out.println(b);







    }

    public static void switchyuju(){
        /*
        格式：
            switch（检测值）{
              case 常量值1：
                语句体1；
                break；
              case 常量值2：
                语句体2：
                break；
              ...
              default：
                语句体n+1；
                break；
            }
         */
        //星期几的判断
        short num3=7;
        switch (num3){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wen");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("WRONG");
                break;
        /*
        注意事项：
        1. case后面不能相同
        2. switch可判断数据类型：
            基本：byte/short/char/int
            引用：String/enum
        3.格式灵活（前后顺序可以颠倒，而且break可以删除）
            穿透：匹配到哪个case就从哪个位置开始执行，直到break或者没有程序才结束
         */

        }
    }

    public static void forxunhuan(){
    /*
    循环结构：初始化语句（只在开始时做一次）、条件判断、循环体、步进语句（每次循环后都进行）

    1.for
        for（初始化表达式①；布尔表达式②；步进表达式④）{
            循环体③
        }
     */
        for (int i=1;i<=100;i++){
            System.out.println("我错了"+i );
        }
    }

    public static void whilexunhuan(){
        /*
        1. while（先判断再循环）
            格式：

            初始化表达式①
            while（布尔表达式②）{
                循环体③
                步进表达式④
            }
        2. do-while（至少执行一次循环体，先执行一次再判断）
            格式：

            do{
                循环体
            }while（条件判断）；


         */
        //应用100以内的偶数和

        //for语句实现
        int sum=0;
        for (int i = 0;i<=100;i+=1){
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        //do-while循环实现
        int i=0;
        int sum1=0;
        if (i%2==0){
            do {
                sum1=sum1+i;
                i+=2;
            } while (i<=100);
        }
        System.out.println(sum1);
        //while循环
        int n=1;
        int sum2=0;
        while (n<=100){
            if (n%2==0){
                sum2+=n;
            }
            n++;
        }
        System.out.println(sum2);

    }
    /*
    三种循环区别：
    1.条件从未满足，if/while不执行，do-while执行一次
    2.for循环的变量在小括号当中定义，只有循环内部才可使用。while/do-while的初始化语句本身就在外面，所以出循环后可继续使用。

    循环选择小建议：
    次数确定-for；否则用while。
     */
    public  static void xunhuankongzhi(){
        /*
        break常见用法：
        1.switch中，一旦执行，整个switch立即停止。
        2.循环语句中，一旦执行，整个循环语句立刻结束，打断循环

        continue用法：
        一旦执行，立即跳过当前循环剩余内容，马上开始下一次循环。
         */
        for(int n =1;n<=10;n++){
            if (n==4){
                continue;//4不见了
            }
            if(n==8){
                break;//8.9.10不见了
            }
            System.out.println(n+"层到了");
        }

    }

    public static void deadloop(){
        /*
        永远停不下来-死循环（后面语句无效）
        标准格式：
        while（ture）{
            循环体
        }
         */
        for (int n=1;n<=10;   ){
            System.out.println("I love java!");
        }
    }

    public static void qiantaoxunhuan(){
        for (int h=0;h<24;h++){//外层控制小时
            for (int m=0;m<60;m++){//内层控制分钟
                System.out.println(h+"H"+m+"M");
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 5; i1++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

