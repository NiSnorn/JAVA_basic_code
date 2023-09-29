package Chapter7.Phone;

public class PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.price=100.0;
        one.color="black";
        one.brand="pear";
        method(one);//传递地址值
    }
    public static void method (Phone param){
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param.brand);
    }
}

