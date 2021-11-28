import java.util.Scanner;
public class forloopfromUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting point:- ");
        int a = sc.nextInt();
        System.out.print("Enter ending point:- ");
        int b = sc.nextInt();
        for (int i = a;i<=b;i++){
            System.out.println(i);
        }
    }
}