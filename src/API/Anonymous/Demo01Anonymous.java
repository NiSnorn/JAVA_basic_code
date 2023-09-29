package API.Anonymous;
/**创建对象
 *类名称 对象名 = new类名称（）；
 *
 * 匿名对象就只有右边对象，没有左边的名字和赋值运算符
 * new 类名称（）；
 *
 * 注意事项：匿名对象只能使用唯一一次，下次再用得重新创建
 * 使用建议：确有一个只用唯一一次的对象*/
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name="NiSn";
        one.showName();
        System.out.println("=================");

        //匿名对象
        new Person().name= "Nash";
        new Person().showName();//
    }

}
