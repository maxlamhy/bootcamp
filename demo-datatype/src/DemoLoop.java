public class DemoLoop {
  public static void main(String[] args) {
    int x = 3;
    x *= 3;
    x *= 3;
    System.out.println(x);

    // for (initialization; critria to continue; modifier)
    x = 3;
    for (int i = 0; i < 4; i++) {
      x *= 3;
    }
    System.out.println(x); // 243

    // Step 1: i = 0
    // Step 2: i < 4 ? Yes
    // Step 3: x *= 3
    // Step 4: i++, i -> 1
    // Step 5: i < 4 ? Yes
    // Step 6: x *= 3

    // Step 7: i++, i -> 2
    // Step 8: i < 4 ? Yes
    // Step 9: x *= 3

    // Step 10: i++, i -> 3
    // Step 11: i < 4 ? Yes
    // Step 12: x *= 3

    // Step 13: i++, i -> 4
    // Step 14: i < 4 ? No -> exit loop


    // print 50 hello
    for (int i = 0; i < 50; i++) { // 0-49
      System.out.println("hello");
    }

    // 0 - 100
    // print even numbers
    // for loop + if
    for (int i = 0; i <= 100; i++) { // 0 - 100
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // 0 - 20
    // print odd numbers and the number > 5
    for (int i = 0; i <= 20; i++) {
      if (i > 5 && i % 2 == 1) {
        System.out.println("odd numbers and the number > 5.");
      }
    }

    // leap year
    // divided by 100, not a leap year, unless divided by 400 (i.e. 2000 is a leap year)
    // i.e. 2100 is not a leap year, 2004 is a leap year

    int year = 2100;
    boolean isLeapYear = false;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true; // 2000
        }
      } else {
        isLeapYear = true; // 2004
      }
    }
    System.out.println(isLeapYear);
    
    isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    System.out.println(isLeapYear);

    // sum up 1-100
    int total = 0;
    for (int i = 0; i <= 100; i++) {
      total += i;
    }
    System.out.println(total);

    // the number of values between 1 - 100, which is divided by 6
    int count = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 6 == 0) {
        count++;
      }
    }
    System.out.println("the number of values between 1 - 100 divided by 6: " + count);

    // convert 1-100 to char values, then concat them together
    String result = "";
    for (int i = 1; i <= 100; i++){
      result += (char) i; // String + any type of value -> String
    }
    System.out.println(result);

    // ! break -> exit earlier
    // the first number between 1 - 50, which is divided by 7.
    int target = -1;
    for(int i = 1; i <= 50; i++){
      
      if( i % 7 == 0) {
        target = i;
        break; //break loop
        
      }
      if (target == -1) {
        System.out.println("Not Found.");
      } else {
       System.out.println(target); 
      }
      
    }

//Find the largest number < 1000, divided by 7
for(int i = 1000; i >= 0; i--){
  if(i % 7 == 0){
    System.out.println(i);
    break; 
  }
}
    
String currentTime = "23:42:00";
int secondToAdd = 6500;
int addSec = 23*60*60 + 42*60 + 6500;
int divideHr = addSec/60/60;

//Keep double a given number, until it just > 10000. What is the number?
int n = 9;
while(n<=10000){
  n *= 2;
}
System.out.println(n);

String s10 = "HELLOXWORLD";
//Find the index of 'X', -1 if not found.
//i.e. Use loop, not indexOf()

int index1 = -1; // 預設為 -1，表示沒找到
        
        for (int i = 0; i < s10.length(); i++) {
            if (s10.charAt(i) == 'X') {
                index1 = i;
                break;
        
            }
            
          }System.out.println(index1);

    //Prime numbers between 1 - 50
        for (int num = 2; num <= 50; num++) {        // 從 2 開始（1 不是質數）
            boolean isPrime = true;                  // 先假設它是質數

            for (int i = 2; i < num; i++) {          // 用 2 到 num-1 去試除
                if (num % i == 0) {                  // 如果被整除 → 不是質數
                    isPrime = false;
                    break;                           // 找到一個就夠了，馬上跳出
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
 
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++){
        System.out.println("i=" + i + ", j=" + j);
    }
  }

  // *
  // **
  // ***
  // ****
  int k = 4;
  for(int i = 0; i < k; i++){ //row
    for(int j = 0; j < k; j++){ //

    }
  }



  }
}