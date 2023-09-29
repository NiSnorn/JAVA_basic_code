package Chapter7.PrivatePractise;

public class Person {
    /*
    问题描述：年龄可能出现不合理现象。
    解决办法：用private将成员变量进行修饰。

    private 只能在本类中随意访问

    间接访问:private成员变量，就是定义一对Getter/Setter方法
     */
        String name;
        private int age;

        public void show() {
            System.out.println("我叫" + name + "，今年" + age);
        }

        /**
         * setXxx  一般表示向Xxx设置数据
         * 有参数，无返回
         */
        public void setAge(int num) {
            if (num<0 && num>130){
                System.out.println("数据错误");
            }else{
                age = num;
            }
        }

        /**
         * getXxx    一般表示获取Xxx数据
         * 无参数，有返回
         */
        public int getAge() {
            return age;
        }
    }



