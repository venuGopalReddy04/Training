import java.util.Scanner;

public class program10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int count1=0,count2=0;
        for(int i=0;i<size;i++){
            if(num[i]==0) count1++;
            if(num[i]==1) count2++;
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}

