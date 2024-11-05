public class palindrome {
    public static void main(String[] args){
        int n=5;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
               
                System.out.print(k);
               

            }
            for(int q=2;q<=i;q++){
                System.out.print(q);
            } 
        System.out.println();
        }
    }
}
