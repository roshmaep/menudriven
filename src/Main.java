import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int c, a, b, x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Main menu\n1.Largest of three numbers\n2.Smallest of the numbers\n3.Prime or not\n4.Even or odd\n5.Reverse of number\n6.Exit");
            System.out.println("Enter your choice");
            c = sc.nextInt();
        } while (c != 6);
    }
}
