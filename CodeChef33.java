import java.util.*;
public class CodeChef33 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int m=input.nextInt();
            int x=input.nextInt();
            int d=input.nextInt();
            System.out.println(Math.min(m*x,m+d));
            
        }
    }
    
}
