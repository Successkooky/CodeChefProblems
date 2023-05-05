import java.util.*;
public class CodeChef27 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
            int Pa=input.nextInt();
            int Pb=input.nextInt();
            int Qa=input.nextInt();
            int Qb=input.nextInt();
            int MaxA,MaxB;
            if (Pa>Pb) {
                MaxA=Pa;
                
            }
            else{
                MaxA=Pb;
            }
            if (Qa>Qb) {
                MaxB=Qa;
                
            } else {
                MaxB=Qb;
                
            }
            if (MaxA>MaxB) {
                System.out.println("Q");
                
            } else if(MaxB>MaxA){
                System.out.println("P");
                
            }
            else{
                System.out.println("TIE");
            }
            
        }
    }
}
