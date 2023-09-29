package Chapter7.Phone;

public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

    //成员方法
    public void call(String who){
        System.out.println("call "+who);
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
