import java.util.*;
public class CodeChef30 {
 public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int T=input.nextInt();
    for (int i = 0; i < T; i++) {
        int P=input.nextInt();
        int res=P%100+P/100;
        
        if (res>10) {
            System.out.println(-1);
            
        }
        else{
            System.out.println(res);
        }
        
    }
 }   
}
