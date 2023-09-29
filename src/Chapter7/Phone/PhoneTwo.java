package Chapter7.Phone;

public class PhoneTwo {
    public static void main(String[] args) {
                //创建
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        //赋值
        one.brand="iPhone";
        one.color="grey";
        one.price=13999.99;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        //方法
        one.call("NiSn");
        one.sendMessage();

        System.out.println("=============================");

        //创建
        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        //赋值
        two.brand = "华为";
        two.color = "blue";
        two.price = 3999.99;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        //方法
        two.call("me");
        two.sendMessage();
    }
}

