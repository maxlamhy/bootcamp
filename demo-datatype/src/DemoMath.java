public class DemoMath {
  public static void main(String[] args) {
    // + - * / %
    // % -> the remainder of division
    int remainder = 10 % 3;
    System.out.println(remainder); //1

    remainder = 99 % 7;
    System.out.println(remainder); //1

    //int
    int a = 7;
    System.out.println(a + 9);
    System.out.println(a - 3);
    System.out.println(a * 7);
    System.out.println(a / 7);

    //Step 1: a + 10 -> 17 (int + int -> int value)
    //Step 2: Assign int value (17) into int box
    a = a + 10;
    System.out.println(a); // 17

    //Step 1: int + double
    //Step 2: Assign double value into double box
    int b = 8;
    System.out.println(b + 3.5d); // 11.5
    double r = b + 3.5d;

    //Operation between higher level type and lower level type -> Result: higher level type
    long k = 3 * 100L;
    // int t = 3 * 100L; //int * long -> long, cannot assign to int box

    //byte -> short -> int -> long -> float -> double
    float f1 = 10L; //special case
    byte b10 = 9;
    short s10 =9;
    //! Special Case: byte + short -> int
    // short s20 = b10 + s10;
    int s20 = b10 + s10; // ok

    //char -> int






  }
}
