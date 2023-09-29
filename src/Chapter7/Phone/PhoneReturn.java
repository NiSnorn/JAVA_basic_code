package Chapter7.Phone;
//当使用一个对象类型作为方法返回值时，返回值其实就是对象的地址值
public class PhoneReturn {
    public static void main(String[] args) {
        Phone two=getPhone();//赋值调用getPhone
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("======================================");
        System.out.println(getPhone());
        System.out.println(two);
    }

    public static Phone getPhone(){
        Phone one=new Phone();
        one.brand="iPhone";
        one.price=8388.0;
        one.color="gold";
        return one;
    }
}
