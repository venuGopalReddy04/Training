
import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] num=new int[size];
        int a=num[0];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        for(int i=1;i<num.length;i++){
            if(num[i]>a) a=num[i];
        }
        int b=0;
        for(int i=0;i<size;i++){
            if(num[i]>b && num[i]!=a) b=num[i];
        }
        System.out.println(b);
    }
}


