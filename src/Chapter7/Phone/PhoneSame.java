package Chapter7.Phone;

public class PhoneSame{
        public static void main(String[] args) {
            //创建
            Phone one = new Phone();
            System.out.println(one.brand);//null
            System.out.println(one.color);//null
            System.out.println(one.price);//0.0
            System.out.println("---------------------------");
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

            //将one中的对象地址值赋值给two
            Phone two = one;
            System.out.println(two.brand);//iPhone
            System.out.println(two.color);//grey
            System.out.println(two.price);//13999.99
            System.out.println("------------------------");
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


