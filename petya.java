import java.util.Scanner;

public class petya {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int size=sc.nextInt();
    int[] array=new int[size+1];
    System.out.println("enter array elements");
    for(int i=1;i<=size;i++){
        int k=sc.nextInt();
        array[k]=i;
    }
    
    for(int i=1;i<=size;i++){
        System.out.print(array[i]+" ");
    }
   } 
}
