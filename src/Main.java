import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int c, x, y,z,temp,largest,smallest;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Main menu\n1.Largest of three numbers\n2.Smallest of the numbers\n3.Prime or not\n4.Even or odd\n5.Reverse of number\n6.Exit");
            System.out.println("Enter your choice");
            c = sc.nextInt();
            switch(c) {
                case 1:
                    System.out.println("Enter 3 numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    z = sc.nextInt();
                    temp = x > y ? x : y;
                    largest = z > temp ? z : temp;
                    System.out.println("largest=" + largest);
                    break;
                case 2:
                    System.out.println("Enter 3 numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    z = sc.nextInt();
                    temp = x < y ? x : y;
                    smallest = z < temp ? z : temp;
                    System.out.println("largest=" + smallest);
                    break;
                case 3:
                    System.out.println("Enter a number");
                    x = sc.nextInt();
                    boolean flag = false;
                    for (int i = 2; i <= x / 2; ++i) {
                        // condition for nonprime number
                        if (x % i == 0) {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag)
                        System.out.println(x + " is a prime number.");
                    else
                        System.out.println(x + " is not a prime number.");

                    break;
                case 4:
                    System.out.print("Enter a number: ");
                     x = sc.nextInt();

                    if(x % 2 == 0)
                        System.out.println(x + " is even");
                    else
                        System.out.println(x+ " is odd");
                case 5:
                    System.out.print("Enter a number: ");
                    x = sc.nextInt();
                    int rev=0;
                    while(x!=0)
                    {
                        int rem=x%10;
                        rev=rev*10+rem;
                        x/=10;
                    }
                    System.out.print("Reverse of number: "+rev);
                case 6:System.out.println("Exiting....");
                    break;
                default:System.out.println("invalid choice...Please enter your choice... ");
                    break;



            }
        } while(c!=6);
    }
}
