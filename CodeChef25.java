import java.util.*;
public class CodeChef25 {
    public static void main(String args[]){
        try{
            Scanner input = new Scanner(System.in);
            int T=input.nextInt();
            for (int i = 0; i < T; i++) {
                int N=input.nextInt();
                int A[]=new int[N];
                for (int j = 0; j < N; j++) {
                    A[j]=input.nextInt();
                   
                    
                }
                
                Arrays.sort(A);
                if (A[A.length-1]!=A[A.length-2]) {
                    int Sum=A[A.length-1]+A[A.length-2];
                    System.out.println(Sum);
                    
                }
                else{
                    int Sum=A[A.length-1]+A[A.length-3];
               
                 
                 
                 System.out.println(Sum);
                }
                    
                
                
                
            }

        }catch(Exception e){}
       
        }
    }
    

