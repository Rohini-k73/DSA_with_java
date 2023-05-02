// negative or positive no.

// import java.util.*;
// public class practice{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//          if (a>0){
//             System.out.println("positive");
//          }else{
//             System.out.println("negative");
//          }
//     }
// }

// import java.util.*;
// public class practice{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int temp = sc.nextInt();

//         if(temp > 100){
//             System.out.println("you have a fever");
//         }
//         else{
//             System.out.println("you are normal");
//         }

//     }}

// import java.util.*;
// public class practice{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("enter week num(1-7)");
//         int week = sc.nextInt();

//         switch (week){
//             case 1 : System.out.println("mon");
//             break;
//             case 2 : System.out.println("tue");
//             break;
//             case 3 : System.out.println("wed");
//             break;
//             case 4 : System.out.println("thu");
//             break;
//             case 5 : System.out.println("fri");
//             break;
//             case 6 : System.out.println("sat");
//             break;
//             case 7 : System.out.println("sun");
//             break;

//             default : System.out.println("invalid");
//         }


//     }}

    // year is leap or not 

import java.util.*;
public class practice{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter year");
        int year = sc.nextInt();

        boolean X = (year % 4 == 0);
        boolean Y = (year % 100 )!= 0;
        boolean Z = (year % 100 == 0)&& (year % 400==0);

        if(X &&  (Y || Z)) {
            System.out.println(year + "is leap");
        }else{
            System.out.println(year + "is not leap");
        }

    }}