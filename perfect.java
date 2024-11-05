import java.lang.Math;
import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=sc.nextInt();
        double b=Math.sqrt(a);
        if(a==(b*b)){
            System.out.println(a+" is perfect square");
        }
        else{
            System.out.println(a+" is not perfect square");
        }
    }    
}
