import java.util.Scanner;
public class SecondSmallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int a=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<a) a=num[i];
        }
        int b=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]!=a && num[i]<b) b=num[i];
        }
        System.out.println(b);
    }
}