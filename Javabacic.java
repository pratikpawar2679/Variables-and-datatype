// import java.util.Scanner;

// import javax.sql.rowset.spi.SyncResolver;

// import java.util.Scanner;

// public class Javabacic {
//     public static void main(String[] args) {
//         System.out.println("hello world");
//         System.out.println("1,2,3,4,5,6,7,8,9,10");
//         System.out.println("hello world");
//         System.out.print("Hello World\n");
//     }
// }
// boilerplate code

//print pattern 
// public class Javabacic {
//     public static void main(String[] args) {
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }

// public class Javabacic {
//     public static void main(String[] args) {

//         int a = 2;
//         int b = 6;
//         String name = "Pratik Pawar";

//         System.out.println("a=" + a);
//         System.out.println("b=" + b);
//         System.out.println("Name=" + name);
//     }
// }

// public class Javabacic {

//     public static void main(String[] args) {
//         int a = 20;
//         System.out.println(a);
//         float pen = 20.1f;
//         System.out.println(pen);

//         byte b = 20;
//         System.out.println(b);
//         char a2 = 'a';
//         System.out.println(a2);
//         double g = 1;
//         System.out.println(g);

//     }
// }

//Addition of two number of a and b ;
// import java.util.*;

// public class Javabacic {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         int a = 10;
//         int b = 5;
//         int sum;
//         sum = a + b;
//         System.out.println("Sum=" + sum);
//     }
// }

/**
 * Javabacic
 */

//Print your name for user
// import java.util.*;

// public class Javabacic {

//     public static void main(String[] args) {

//         System.out.print("Enter your name =");
//         Scanner Sc = new Scanner(System.in);
//         String name = Sc.next();
//         System.out.println(name);
//     }
// }

//Sum of two number for a user 

/**
 * Javabacic
 */
// import java.util.*;

// public class Javabacic {

//     public static void main(String[] args) {
//         System.out.println("Enter the value of a=");
//         Scanner Sc = new Scanner(System.in);
//         int a = Sc.nextInt();
//         System.out.println("Enter the value of b=");
//         Scanner ab = new Scanner(System.in);
//         int b = ab.nextInt();
//         int sum = a + b;
//         System.out.println(sum);

//     }
// }

//Product of a and b 
/**
 * Javabacic
 */
// public class Javabacic {

//     public static void main(String[] args) {
//         int a = 10;
//         int b = 2;
//         int product = a * b;

//         System.out.println(product);
//     }
// }

// //Product of a and b in user 
// /**
//  * Javabacic
//  */
// import java.util.*;

// public class Javabacic {

//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         System.out.print("Enter the value of a =");
//         int a = Sc.nextInt();
//         System.out.print("Enter the value of b =");
//         int b = Sc.nextInt();
//         int product = a * b;
//         System.out.println("a*b=" + product);

//     }

// }

//Area of circle 
/**
 * Javabacic
 */
// import java.util.*;

// public class Javabacic {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the value of radius=");
//         float rad = sc.nextFloat();
//         float area = 31.4f * rad * rad;
//         System.out.println(area);
//     }
// }

//Type promoation experssion
// import java.util.*;

// public class Javabacic {

//     public static void main(String[] args) {

// Rule 1
// System.out.println("Enter the value of a");
// Scanner sc = new Scanner(System.in);
// float a = sc.nextInt();
// System.out.println(a);

// float a = 20.20f;
// int b = (int) a;
// System.out.println(b);

// char ch = 'a';
// int number = ch;
// System.out.println(number);

// char a = 'a';
// char b = 'b';
// System.out.println((int) a);
// System.out.println((int) b);
// System.out.println(a - b);

// short a = 5;
// char b = 'c';
// byte c = 25;
// byte bt = (byte) (a + b + c);
// System.out.println(bt);

// Rule 2;
// int a = 20;
// float b = 20.6f;
// char c = 'c';
// short d = 20;
// long e = 20;
// double f = a + b + c + d + e;
// System.out.println(f);
//         byte b = 2;
//         byte a = (byte) (b + 2);
//         System.out.println(a);

//     }
//

/**
 * Javabacic
 */
public class Javabacic {

  public static void main(String[] args) {
    int a = 2;
    float b = (float) a;
    System.out.println(b);
  }
}