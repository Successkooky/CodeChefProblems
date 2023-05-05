import java.util.*;
public class CodeChef26 {

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int A=input.nextInt();
            int B=input.nextInt();
            int X=input.nextInt();
            int Y=input.nextInt();
            int Power=X*Y;
            int Time=A*B;
            if (Power>=Time) {
                System.out.println("YES");
                
            } else {
                System.out.println("NO");
                
            }


            
        }
    }
}
