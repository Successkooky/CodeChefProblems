import java.util.*;
public class CodeChef29 {
    //Chef and Battery
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N=input.nextInt();
            int count=0;
            while (N>50 || N<50 ) {
                if (N>50) {
                    N-=3;
                    count++;
                    
                }
                if (N<50) {
                    N+=2;
                    count++;
                    
                }
                
            }
           System.out.println(count);
            
        }
    }
    
}
