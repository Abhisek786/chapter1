import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Enter starting value:- ");
        int s = sc.nextInt();
        System.out.print("Enter starting value:- ");
        int e = sc.nextInt();
        for (int i = s;i<=e;i++){
            if (i%2 == 0)
                a+=1;
                System.out.println(i);
        }
        System.out.print("There are "+a+" even numbers");
    }
}