import java.util.Scanner;
public class checkpalidromWhileloop {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check palidrom:-");

                int start = sc.nextInt();
                int b;
                 b= start;
                int rev = 0;
                while (start > 0)
                {
                    int rem = start % 10;
                    rev = rev * 10 + rem;
                    start = start / 10;
                }
                System.out.println("Reverse is " + rev);
                if (rev == b)
                    System.out.println("It's a palindrome");
                else
                    System.out.println("It's not a palindrome");
            }
        }


