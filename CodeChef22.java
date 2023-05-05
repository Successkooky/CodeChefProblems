import java.util.*;
public class CodeChef22 {
    //Matches
    public static void main(String args[]){
        
        try (Scanner input = new Scanner(System.in)) {
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
            int numbers[]={6,2,5,5,4,5,6,3,7,6};   
            
            int A=input.nextInt();
            int B=input.nextInt();
            int sum=A+B;
            int matches=0;
            while(sum>0){
                int lastDigit=sum%10;
                matches+=numbers[lastDigit];
                sum/=10;
            }
            System.out.println(matches);

      
            System.out.println(numbers[A]);
   }
        }
    
}
}
