import java.util.*;
public class CodeChef35 {

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 0; i < T; i++) {
            int N=input.nextInt();
            int X=input.nextInt();
            int Y=input.nextInt();
            int A=input.nextInt();
            int B=input.nextInt();
            int Petrol=(N/A)*X;
            int Diesel=(N/B)*Y;
            if (Petrol>Diesel) {
                System.out.println("DIESEL");
                
            }
            else if(Diesel>Petrol){
                System.out.println("PETROL");
            }
            else{
                System.out.println("ANY");
            }
        }
    }
}
