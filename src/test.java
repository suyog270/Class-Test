import java.util.Scanner;
import java.util.Random;
public class test {
    public static void main(String[] args) {
        char run;
        String username = "Deerwalk";
        String password = "Sifal";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String name = input.nextLine();
        System.out.println("Enter password");
        String pass = input.nextLine();
do {
    if (name.equals(username) && pass.equals(password)) {
        System.out.println("Login Successful");

        System.out.println("1) calculator \n2) Guessing game \n3) SI Calculator \n4) Check if given char is vowel or consonant");
        System.out.println("Choose a option");
        int opt = input.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Enter first no:");
                int a = input.nextInt();
                System.out.println("Enter Second no:");
                int b = input.nextInt();
                System.out.println("Enter an operator (+,-,*,/)");
                char oper = input.next().charAt(0);
                if (oper == '+') {
                    int result = a + b;
                    System.out.println(a + " + " + b + " = " + result);
                } else if (oper == '-') {
                    int result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                } else if (oper == '*') {
                    int result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                } else if (oper == '/') {
                    int result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                } else {
                    System.out.println("Operator not found");
                }
                break;
            case 2:
                Random x = new Random();
                int number = x.nextInt(10);
                System.out.println("Enter a no from 0 to 10");
                int user_no = input.nextInt();
                if (user_no == number) {
                    System.out.println("You won");
                } else {
                    System.out.println("Try again");
                }
                break;
            case 3:
                System.out.println("Enter Principle");
                int p = input.nextInt();
                System.out.println("Enter Rate");
                double r = input.nextDouble();
                System.out.println("Enter Time");
                int t = input.nextInt();
                double SI = (p * t * r) / 100;
                System.out.println("Simple Interest = " + SI);
                break;

            case 4:
                System.out.println("Enter a char in lowercase");
                char alpha = input.next().charAt(0);
                if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
                    System.out.println(alpha + " is vowel");
                } else {
                    System.out.println(alpha + " is consonant");
                }
                break;
            default:
                System.out.println("404 not found");
                break;
        }

    } else {
        System.out.println("Login Failed");
    }
    System.out.println("Do you want to run again: (Y/N)");
    run = input.next().charAt(0);
}while( run =='Y');
    }
}
