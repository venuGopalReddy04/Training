import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        int index=-1;
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int start=0,end=size-1;
        int mid=0;
        System.out.println("enter key element to search: ");
        int x=sc.nextInt();
        while(start<=end){
            mid=(start+end)/2;
            if(num[mid]==x){
                index=mid;
                break;
            }
            if(num[mid]>x) end=mid-1;
            if(num[mid]<x) start=mid+1;

        }
        if(index>=0) System.out.println("element found at index: "+index);
        else System.out.println("element not found");
    }
}

