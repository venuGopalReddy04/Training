import java.util.Scanner;

public class reverseArray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int a;
        for(int i=0,j=size-1;i<size/2;i++,j--){
            a=array[i];
            array[i]=array[j];
            array[j]=a;
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}

