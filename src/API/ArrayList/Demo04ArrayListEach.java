package API.ArrayList;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("施明宇");
        list.add("祁钰涵");
        list.add("张博雅");

        //遍历集合
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));

        }
    }
}
