import java.util.Scanner;
public class MinNumInArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int a=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<a) a=num[i];
        }
        System.out.println(a);
    }
}