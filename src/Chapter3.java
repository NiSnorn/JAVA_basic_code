public class Chapter3 {
    public static void main(String[] args){
        changliang();
        yunsuanfu();
        fangfa();
    }
    public static void changliang(){
        //字符串常量
        System.out.println("Abc");
        //整数常量
        System.out.println("777");
        //浮点数常量
        System.out.println("12.4");
        //字符
        System.out.println('A');//A
        System.out.println('6');//6
        //System.out.println(''); 不可留白
        //System.out.println('AB'); 不可多
        //布尔
        System.out.println(true);//true
        System.out.println(false);//false
        //空
        //System.out.println(null); 不能打印

        System.out.println("-------------------------------------");
    }
    public static void yunsuanfu(){
         /*
        +的用法
        1.数值
        2.char，先提升int再运算
        3.String，连接作用
         */
        short a=1;
        short b=66;
        System.out.println(a+b);//67
        String str1="Java";
        System.out.println(str1+20+23);//Java2023
        System.out.println(str1+(20+30));//Java50
        System.out.println("-------------------------------------");
        /*
        自增：++
        自减：--

        格式number++，++number
        使用方法：
            单独：单独作为一个步骤；前++与后++无区别
            混合：++num：先相加，拿结果去运算 【现加后用】
                 num++：先用num运算，再加1【先用后加】
    注意：变量才可自增自减，常量不行。
         */
        int num1=6;
        ++num1;
        System.out.println(num1);//7
        num1++;
        System.out.println(num1);//8
        System.out.println(num1++);//8
        System.out.println(++num1);//10
        short num3=20;
        short num4=50;
        int result1 =num3+++--num4;
        System.out.println(num3);//21
        System.out.println(num4);//49
        System.out.println(result1);//69
        System.out.println("-------------------------------------");
        /*
        赋值运算符分类：
            基本：=
            复合：
                +=  a+=1 --> a=a+1
                -=  a-=3 --> a=a-3
                *=  a*=2 --> a=a*2
                /=  a/=9 --> a=a/9
                %=  a%=7 --> a=a%7
    注意：变量能用，常量不行
         复合时，隐藏一个强制类型转换
         */
        short num5=7;
        num5+=10;
        System.out.println(num5);//17
        num5%=7;
        System.out.println(num5);//3
    /*
    比较运算符：
    结果必定是Boolean值
    多次判断，不能连这写，如1<2<3
    */
    /*
    逻辑运算符：
    与（并且）&&
    或（或者）||
    非（取反）！
    注意：
    只用于布尔值
    与 或两边都有布尔值，非 一个就可以
    && ||有短路的效果：如果根据左边一项的结果可以判断最终结果，则右边不再执行
     */
        short num2=20;
        System.out.println(3<4 || ++num2<100);
        System.out.println(num2);
        System.out.println("-------------------------------------");
    /*
    运算符：
    一元 ！
    二元 = + - / *

    三元 格式：
    数据类型 变量名称 = 条件判断 ？ 表达式A ： 表达式B；
    流程：
    首先判断条件是否成立：
        如果true，将A赋值于变量
        如果false，将B赋值于变量
    注意:AB必须同时满足左边数据类型
        三元运算符必须使用
         */
        short num6=7 , num7=17;
        short max = num6 < num7?num7:num6;
        System.out.println(max);//17
        System.out.println("-------------------------------------");
    }
    public static void fangfa(){
        /*
        方法格式：
        public static void 方法名称（）{
        方法体
        }

        方法命名：小驼峰式
        方法体：任意语句
        注意事项：
        1.方法定义的先后顺序无所谓
        2.方法之间不能嵌套
        3.定义好之后，必须【调用方法】才能运行
        【调用方法】
        方法名称（）；

                 */
    }
}

