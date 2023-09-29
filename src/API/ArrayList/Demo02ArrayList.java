package API.ArrayList;

import java.util.ArrayList;

/*
数组的长度不可以改变。
但是对于ArrayList集合长度是可以任意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：也就是装在集合当中的所有元素，全部都是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于Arraylist集合来说，直接打印得到的不是地址值，而是内容。
如果内容是空，得到的是空中括号：【】
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面全是String字符串类型的数据
        ArrayList<String>list=new ArrayList<>();
        System.out.println(list);

        //向集合当中添加一些数据，需要使用add方法
        list.add("NiSn");
        System.out.println(list);

        list.add("张博雅");
        list.add("施明宇");
        list.add("祁钰涵");
        System.out.println(list);


    }
}
