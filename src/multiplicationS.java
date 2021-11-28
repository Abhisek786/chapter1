import java .util.Scanner;
public class multiplicationS {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number");
        int mul=sc.nextInt();
        for(int i=1;i<=10;i++){
            int p=mul*1;
            System.out.println(mul+" * "+i+" = "+mul*i);
        }
    }
}
