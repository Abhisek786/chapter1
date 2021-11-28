import java.util. Scanner;
public class reserveNum {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number to reserve ");
        int sum=sc.nextInt();
        int reverse=0;
        while(sum>0){
            int rem=sum%10;
            reverse=reverse*10+rem;
            sum/=10;
        }
        System.out.print("reverse:'"+reverse);
    }

}
