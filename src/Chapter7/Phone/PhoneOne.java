package Chapter7.Phone;

public class PhoneOne {
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

    }
}
