import java.util.*;
public class CodeChef24 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int N=input.nextInt();
            int M=input.nextInt();
            float Online=(int)N-(N*0.1f);
            if (M>Online) {
                System.out.println("ONLINE");
                
            }
            else if(Online>M){
                System.out.println("DINING");
            }
            else{
                System.out.println("EITHER");
            }
            
        }
    }
    
}
