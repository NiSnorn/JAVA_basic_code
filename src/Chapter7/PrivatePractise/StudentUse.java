package Chapter7.PrivatePractise;

public class StudentUse {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("NiSn");
        stu.setAge(19);
        stu.setMale(false);
        System.out.println("姓名:"+stu.getName());
        System.out.println("年龄："+stu.getAge());
        System.out.println("是不是爷们儿："+stu.isMale());


    }
}
