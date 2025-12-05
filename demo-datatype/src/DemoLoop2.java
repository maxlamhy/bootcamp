public class DemoLoop2 {
  public static void main(String[] args) {
    //print 3 hello
    for(int i = 0; i < 3; i++){
      System.out.println("hello");
    }

    // print 1 - 10
    for(int i = 1; i <= 10; i++){
      System.out.println(i);
    }

    // name = "Mary", print every character of the name.
    String name = "Mary";
    for(int i = 0; i < name.length(); i++){
      char nameChar = name.charAt(i);
      System.out.println(nameChar);
    }
    
    //principle = 1000.0, interest 3% per year, calculate the total amount after 3 years.
    double principle = 1000;
    for(int i = 0; i < 3; i++){
      principle *= 1 + 3/100.0;     
    }
    System.out.println(principle);

    //1-20, sum up all odd numbers and sum up all even numbers seperately. Find the product of them.
    int y = 0;
    for(int i = 1; i <= 20; i++){
      if(i % 2 == 1) {
        y += i;
        
      }
    }

    int x = 0;
    for(int i = 1; i <= 20; i++){
      if(i % 2 == 0) {
        x += i;
        
      }
    }

    System.out.println(x * y);

    //result -> "1/2/3/4/5"
    for(int i = 1; i <= 5; i++){
      System.out.println(i);
    }

    //given string "llello", count the number of "l"
    int count = 0;
    String l = "llello";
    for(int i = 0; i < l.length(); i++)
      if(l.charAt(i) == 'l'){
        count++;
      }
      System.out.println(count);

    //"Hello", count the number of capital letter (upper case letter)
      int countCap = 0;
    String h = "Hello";
    String hUp = h.toUpperCase();
    for(int i = 0; i < h.length(); i++)
      if(h.charAt(i) == hUp.charAt(i)){
        countCap++;
      }
      System.out.println(countCap);


    //print 1 4 9 16 25...100


    //given a string "apple", count the number of character a, e, i, o, u
      int countVowel = 0;
    String a = "apple";
    for(int i = 0; i < a.length(); i++)
      if(a.charAt(i) == 'a'||a.charAt(i) == 'e'||a.charAt(i) == 'i'||a.charAt(i) == 'o'||a.charAt(i) == 'u'){
        countVowel++;
      }
      System.out.println(countVowel);


    //given a string "hello", print "hello", "hell", "hel", "he", "h"
    String hello = "hello";  
    for(int i = 0; i < hello.length(); i++){
      System.out.println(hello.substring(0, hello.length()-i));
      }

    //Given Password = "abcd@1234XYZ"
    //Check if the password is valid. Result is boolean.
    //1. Length >= 12
    //2. With at least one capital letter
    //3. With at least one special character @#$1.
      
    String password = "abcd@1234XYZ";

    boolean isValid = password.length()>=12;  



    //Give a string s1 = "fmj948u5h39", move all numbers to another string.
    //s1 = "fmj948u5h39" -> s2 = 948539

    //Encrypt Password. "abcd" -> Algorithm: ASCII + 3 -> "defg"
      String pW = "abcd";
      String Password = "";
      for(int i = 0; i < pW.length(); i++){
        char passWord = pW.charAt(i);
        Password += (char) (passWord + 3);
      }
System.out.println(Password);
    }



  }

