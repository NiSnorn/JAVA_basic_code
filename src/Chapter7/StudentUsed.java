package Chapter7;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1.导包：也就是指出需要使用的类，在什么位置。
    格式：import包名称，类名称；
      import basic-code.Chapter7.Student;
  对于和当前类属于同一个包的情况，可以省略不写。

2.创建对象：
    格式：类名称 对象名 = new 类名称（）；
      Student stu = new student();

3.使用：
  成员变量：对象名.成员变量名
  成员方法：对象名.成员方法名（参数）
    （想用谁，直接对象名.成员）

    注意事项：
    如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */
public class StudentUsed {
    public static void main(String[] args) {
        //导包

        //创建
        Student stu = new Student();

        //使用变量
        System.out.println(stu.age);//0
        System.out.println(stu.name);//null

        //对其赋值
        stu.name="NiSn";
        stu.age=19;
        System.out.println(stu.age);
        System.out.println(stu.name);

        //使用方法
        stu.eat();
        stu.study();
    }
}
