package Chapter7.PrivatePractise;

public class PersonUse {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name="NiSn";
        //person.age=-1;直接访问private
        person.setAge(-19);
        person.show();

    }
}
