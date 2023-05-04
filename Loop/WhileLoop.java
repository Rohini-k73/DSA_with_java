import java.util.*;

public class WhileLoop{
    public static void main(String [] args){ 
        // print num 1 to 10

        int count = 1;

        while(count<=10){
            System.out.println(count);
            count++;
        }

    }
}


import java.util.*;

public class WhileLoop{
    public static void main(String [] args){ 
        // print num 1 to n

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your num :");
        int Range = sc.nextInt();

        int count = 1;

        while(count<= Range){
            System.out.println(count);
            count++;
        }
        // System.out.println();

    }
}



import java.util.*;

public class WhileLoop{
    public static void main(String [] args){ 
        // print sum of first natural num

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your num :");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(i<= n){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);

    }
}