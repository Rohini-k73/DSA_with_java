import java.util.*;

public class problems{
    public static void main(String [] args){ 
        for (int i = 0; i<=5; i++){
        System.out.println("hello");
        }
    }
}


import java.util.*;

public class problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
        int choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }

            System.out.print("Do you want to continue? (1 for Yes, 0 for No): ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even numbers is " + evensum);
        System.out.println("Sum of odd numbers is " + oddsum);
    }
}
