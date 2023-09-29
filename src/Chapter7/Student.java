package Chapter7;
/*
成员变量（属性）：
    String name；
    int age；
成员方法（行为）：
    public void study (){}


注意事项：
1.成员变量是直接定义在类当中，在方法外面。
2.成员方法无static
*/
public class Student {
    //成员变量
    String name;
    int age;
    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void study(){
        System.out.println("学习");
    }
}
