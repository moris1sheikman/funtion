import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to our countrolr please send to us your coins");
        Scanner scanner = new Scanner(System.in);
        double USD = 3.5260;
        double EUR = 3.6850;
        options();
        double change = scanner.nextDouble();
        while (change != 0) {
            if (change == 1) {
                rolls();
                change = scanner.nextDouble();
                System.out.println(" ILS  to Dollar:" + change / USD );

            } else if (change == 2) {
                rolls();
                change = scanner.nextDouble();
                System.out.println("Dollar to ILS:" + change * USD );


            } else if (change == 3) {
                rolls();
                change = scanner.nextDouble();
                System.out.println("Euro to ILS : " + change * EUR);


            } else if (change == 4) {
                rolls();
                change = scanner.nextDouble();
                System.out.println("ILS to EUR:" + change / EUR );


            }

            options();
            change = scanner.nextDouble();

    }
}
    public static void options() {
        System.out.println("Press  1 to convert  ILS to dollars");
        System.out.println("Press  2 to convert  Dollars to ILS");
        System.out.println("Press  3 to convert  EUR to ILS ");
        System.out.println("Press  4 to convert  ILS to EUR");
        System.out.println("press 0 to exit");
    }
public  static  void  rolls() {
    System.out.println("please enter your change money");
}

    }