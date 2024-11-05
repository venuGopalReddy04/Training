import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=sc.nextInt();
        int temp=a;
        int arm=0;;
        while(temp>0){
            int rem=temp%10;
            arm=arm+(rem*rem*rem);
            temp/=10;
        }
        if(arm==a){
            System.out.println(a+" is armstrong");
        }
        else{
            System.out.println(a+" is not armstrong");
        }
    }
}
