package ROBOTDEMOS;

public class Robot {
    String name ;
    public Robot() {
        this.name = "bobka1";
    }

    public void sayHello() {
        System.out.println("Hello!" + this.name );
    }

    public static void main(String[] args) {
        // Создаем объект робота
        Robot myRobot = new Robot();

        // Вызываем метод sayHello() у робота
        myRobot.sayHello();
    }

    public void sayYourName() {
        System.out.println(this.name);

        }
    }


