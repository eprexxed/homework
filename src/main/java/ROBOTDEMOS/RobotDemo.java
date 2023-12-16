package ROBOTDEMOS;

public class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.sayHello();
        myRobot.sayYourName();
        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.name = "bobka 2";
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.name = "bobka 3";
        robot2.sayYourName();

    }

}


