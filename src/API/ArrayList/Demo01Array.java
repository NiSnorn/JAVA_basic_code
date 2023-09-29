package API.ArrayList;
/*
题目：
定义一个数组，来存储3个person对象

数组缺点：一旦创建，在程序运行中长度不可改变。
 */
public class Demo01Array {
    public static void main(String[] args) {
        Person[]array=new Person[3];
        Person one = new Person(18,"张博雅");
        Person two = new Person(19,"施明宇");
        Person tree = new Person(20,"祁钰涵");

        array[0]=one;
        array[1]=two;
        array[2]=tree;

        System.out.println(array[1].getName());

    }

}
