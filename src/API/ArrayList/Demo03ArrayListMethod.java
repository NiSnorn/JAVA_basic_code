package API.ArrayList;

import java.util.ArrayList;

/**ArrayList当中的常用方法有：
 * 1.添加 public boolean add(E e):向集合中添加元素，参数的类型和泛型一致。
 *      对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
 *        但对于其它集合（今后学习）来说，add添加动作不一定成功。
 *
 * 2.读取 public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
 * 3.删除 public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
 * 4.长度 public int size():获取集合尺寸长度，返回值是集合中包含的元素个数。
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合中添加元素：add
        boolean success = list.add("NiSn");
        System.out.println(list);
        System.out.println("添加的动作是否成功："+success);

        list.add("仔仔");
        list.add("笨笨");
        System.out.println(list);

        //从集合中获取元素：get.索引值从0开始
        String name = list.get(2);
        System.out.println("第二个索引位置是："+name);

        //从集合中删除元素：remove.索引值从0开始。
        String whoRemoved=list.remove(0);
        System.out.println("被删除的人是："+whoRemoved);
        System.out.println(list);

        int size = list.size();
        System.out.println("集合长度是："+size);
    }
}
