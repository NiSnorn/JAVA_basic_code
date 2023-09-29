package Chapter7.StandardClass;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(19);
        stu1.setName("NiSn");
        System.out.println("姓名："+stu1.getName()+"年龄："+stu1.getAge());
        System.out.println("============");
        Student stu2 = new Student("Nash",19);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
    }
}
