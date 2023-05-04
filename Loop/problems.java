// import java.util.*;

// public class problems{
//     public static void main(String [] args){ 
//         for (int i = 0; i<=5; i++){
//         System.out.println("hello");
//         }
//     }
// }


// import java.util.*;

// public class problems {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int evensum = 0;
//         int oddsum = 0;
//         int choice;

//         do {
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();

//             if (num % 2 == 0) {
//                 evensum += num;
//             } else {
//                 oddsum += num;
//             }

//             System.out.print("Do you want to continue? (1 for Yes, 0 for No): ");
//             choice = sc.nextInt();
//         } while (choice == 1);

//         System.out.println("Sum of even numbers is " + evensum);
//         System.out.println("Sum of odd numbers is " + oddsum);
//     }
// }



// import java.util.*;

// public class problems {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;
//         int fact = 1;
//         System.out.print("enter a num");
//          num = sc.nextInt();
//         for(int i = 1; i<=num; i++){
//         fact*=i;
//         }
//         System.out.println("factorial ; " + fact);
//     }}


import java.util.*;

public class problems {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        printMultiplicationTable(4);
    }

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

