package Chapter7;
/*
局部变量和成员变量

1.定义的位置不同【重点】
  局部变量：在方法的内部
  成员变量：在方法外部，直接写在类当中。
2.作用范围不同【重点】
  局部变量：只在方法中可以使用
  成员变量：整个类都可以使用
3.默认值不同【重点】
  局部变量：无默认值，使用需手动赋值
  成员变量：若不赋值，会有默认值，与数组一样
4.内存位置不同
  局部变量：栈
  成员变量：堆
5.生命周期不同
  局部变量：方法进栈产生，出栈消失
  成员变量：对象创建产生，对象被垃圾回收消失
 */
public class VariableDifference {
    String name;//成员变量
    public void methodA(){
        int num;//局部
        //未赋值不能访问System.out.println(num);
        num = 7;
        System.out.println(num);//已赋值,7
        System.out.println(name);//null
    }

    public String getName() {
        name ="NiSn";
        return name;
    }

    public void methodB(){
        //错误写法num是局部变量 System.out.println(num);
        System.out.println(name);//NiSn
    }

}
