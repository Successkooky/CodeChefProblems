import java.util.*;
public class CodeChef32 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int A=input.nextInt();
            int B=input.nextInt();
            int C=input.nextInt();
            for (int j = 2; j < 100; j++) {
                if(A%j!=0 && B%j!=0 && C%j!=0){
                    System.out.println(j);
                    break;
                }
               
                
            }
            
        }
    }
}
