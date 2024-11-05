import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
