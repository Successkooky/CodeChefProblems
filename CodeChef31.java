import java.util.*;
public class CodeChef31 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
       int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            
        
        int H=input.nextInt();
        int X=input.nextInt();
        int Y=input.nextInt();
        int u=1;
        if (Y<H) {
            H=H-Y;
            while (H>0) {
                H=H-X;
                u++;
                
            }
            System.out.println(u);
            
        } else {
            System.out.println("1");
            
        }
    }
    
}
}
