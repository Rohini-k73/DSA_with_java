public class JavaBasics {
   public static void main(String[] args) {
        System.out.print("hello");

    }
}
sum of a and b (input from user)

import java.util.*;

public class JavaBasics {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int sum = a + b ;
     System.out.println(sum);

   }
}

import java.util.*;
public class JavaBasics{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
   float r = sc.nextFloat();
   float area = 3.14f*r*r;
    System.out.print(area);
  }
}

import java.util.*;
public class JavaBasics{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int product= a*b;
    System.out.print(product);

  }
}