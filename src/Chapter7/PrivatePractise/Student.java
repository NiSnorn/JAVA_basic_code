package Chapter7.PrivatePractise;

/** 对于 Boolean 的 getter方法 应改为 isXxx */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }

    public void setName(String noun){
        name=noun;
    }

    public String getName(){
        return name;
    }

    public void setMale(boolean b){
        male=b;

    }
    public Boolean isMale(){
        return male;

    }
}
