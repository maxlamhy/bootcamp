public class DemoLoop2 {
  public static void main(String[] args) {
    // print 3 hello
    for (int i = 0; i < 3; i++) {
      System.out.println("hello");
    }
    // print 1 - 10
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
    // name = "Mary", print every character of the name.
    String name = "Mary";
    for (int i = 0; i < name.length(); i++) { // 0-3
      System.out.println(name.charAt(i));
    }
    // principal = 1000.0, interest 3% per year, calculate the total amount after 3 years
    double principal = 1000.0;
    double interestRate = 3.0;
    double finalAmount = principal;
    for (int i = 0; i < 3; i++) {
      finalAmount = finalAmount * (1 + interestRate / 100.0);
    }
    System.out.println("Amount after 3 years=" + finalAmount);

    // 1-20, sum up all odd numbers and sum up all even numbers separately. Find the product of them.
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    int productOfEvenOdd = oddSum * evenSum;
    System.out.println(productOfEvenOdd); // 11000
    // result -> "1/2/3/4/5"
    int n = 5;
    String result = "";
    for (int i = 1; i <= n; i++) {
      result += i; // String + int -> String
      if (i < n) {
        result += "/";
      }
    }
    System.out.println(result);
    // given a string "llello", count the number of 'l'
    String s1 = "llello";
    char target = 'l';
    int countTarget = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == target) {
        countTarget++;
      }
    }
    System.out.println("The number of " + target + "=" + countTarget); // 4
    // "HeLLo", count the number of capitial letter (upper case letter)
    // ASCII
    String s2 = "HeLLo";
    countTarget = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z') { // ! compare char value (>, <, >=, <=) -> compare int
        countTarget++;
      }
    }
    System.out.println("The number of Capitial letter=" + countTarget); // 3

    // print 1 4 9 16 25 ... 100
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * i);
    }

    // given a string "apple", count the number of character a, e i, o, u
    String s3 = "apple";
    countTarget = 0;
    for (int i = 0; i < s3.length(); i++) {
      if (s3.charAt(i) == 'a' || s3.charAt(i) == 'e' || s3.charAt(i) == 'i'
          || s3.charAt(i) == 'o' || s3.charAt(i) == 'u') {
        countTarget++;
      }
    }
    // given a string "hello", print "hello", "hell", "hel", "he", "h"
    // substring
    String s4 = "hello";
    for (int i = 0; i < s4.length(); i++) {
      System.out.println(s4.substring(0, s4.length() - i)); // 1st round substring(0, 5 - 0 - 1)
    }

    // Given Password = "abcd@1234XYZ"
    // Check if the password is valid. Result is boolean.
    // 1. Length >= 12
    // 2. With at least one capitial letter
    // 3. With at least one speical character @#$!.
    String password = "abcd@1234XYZ";
    boolean isLengthValid = password.length() >= 12;
    boolean withCapitialLetter = false;
    boolean withSpecialChar = false;
    for (int i = 0; i < password.length(); i++) {
      if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
        withCapitialLetter = true;
      }
      if (password.charAt(i) == '@' || password.charAt(i) == '#'
          || password.charAt(i) == '$' || password.charAt(i) == '!'
          || password.charAt(i) == '.') {
        withSpecialChar = true;
      }
      if (withCapitialLetter && withSpecialChar) {
        break;
      }
    }
    boolean isPasswordValid =
        isLengthValid && withCapitialLetter && withSpecialChar;
    System.out.println("Is Password Valid? " + isPasswordValid);

    // Given a string s1 = "abc5uk20fs", move all numbers to another string.
    // s1 = "a,bc5u!k20fs" -> s2 = 520
    String s5 = "abc5uk20fs";
    String newString = "";
    for (int i = 0; i < s5.length(); i++) {
      if (s5.charAt(i) >= '0' && s5.charAt(i) <= '9') {
        newString += s5.charAt(i);
      }
    }
    System.out.println(newString);

    // Encrypt Password. "abcd" -> Algorithm: ASCII + 3 -> "defg"
    System.out.println('a' + 3); // char + int -> int
    String origPassword = "abcd";
    String encryptedPassword = "";
    for (int i = 0; i < origPassword.length(); i++) {
      encryptedPassword += (char) (origPassword.charAt(i) + 3);
    }
    System.out.println("Encrypted Password=" + encryptedPassword);


  }
}