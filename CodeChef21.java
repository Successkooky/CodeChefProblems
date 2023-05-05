import java.util.*;
public class CodeChef21 {

    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int a1=0,b1=0,lead=0,win=-1;
            int N=input.nextInt();
            for (int i = 0; i < N; i++) {
                int a=input.nextInt();
                int b=input.nextInt();
                a1+=a;
                b1+=b;
                if(a1-b1>lead){
                    win=1;
                    lead=a1-b1;
                }
                if(b1-a1>lead){
                    win=2;
                    lead=b1-a1;
                }
                
            }
        
        System.out.println(win+" "+lead);
    }
    
}
}
