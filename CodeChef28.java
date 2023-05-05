import java.util.*;

public class CodeChef28 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int A=input.nextInt();
            int B=input.nextInt();
            int C=input.nextInt();
            int D=input.nextInt();
            int MaxAB;
            int MaxCD;
           
            if (A>B) {
                MaxAB=A;
                
            } else {
                MaxAB=B;
                
            }
            if (C>D) {
                MaxCD=C;
                
            } else {
                MaxCD=D;
                
            }
            int dish=MaxAB+MaxCD;
            System.out.println(dish);

            
        }
    }
    
}
