import java.util.*;

public class Continue{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

      do{
        System.out.print("Enter your num :");
        int n = sc.nextInt();
         if(n%10==0){
            continue;
         }
         System.out.println(n);
      }
      while(true);
      
    }
    }