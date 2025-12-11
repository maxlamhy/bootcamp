import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray3_mine {
  public static void main(String[] args) {
    
    // array 10, 25, 3, 48, 57
    //print all numbers

    int[] array = new int [] {10, 25, 3, 48, 57};
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
  }
  
  // scores 23, 44, 67, 88, 91, 12
  // loop -> print all even numbers

  int[] scores = new int [] {23, 44, 67, 88, 91, 12};
  for (int i = 0; i < scores.length; i++) {
    if(scores[i] % 2 == 0){
      System.out.println(scores[i]);
    }
  }

  // Find the median, 34, 78, 12, 89, 45, 99, 23
int [] median = new int[] {34, 78, 12, 89, 45, 99, 23};
int backup = -1;
  for (int i = 0; i < median.length - 1; i++) {
      for (int j = 0; j < median.length - i - 1; j++) {
        if (median[j] > median[j + 1]) {
          backup = median[j];
          median[j] = median[j + 1];
          median[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(median));
    System.out.println(median[3]);

    // price 99.9, 13.8, 9.9, 1200.0
    // quantities 3, 10, 12, 20
    // amounts (amount = price * quantity)
    double amounts = 0.0;
    double [] price = new double[] {99.9, 13.8, 9.9, 1200.0};
    int [] quantities = new int[] {3, 10, 12, 20};
    for (int i = 0; i < price.length; i++) {
        amounts += price[i] * quantities[i];
    }
    System.out.println(amounts);


    //
    String[] usernames = new String[] {"johnwong", "stevenchan", "jennyng"};
    String[] password = new String[] {"abcd1234", "ijk789", "xyz456"};

    String usernameInput = "stevenchan";
    String passwordInput = "ijk789";

    // 1. Username is NOT Found.
    // 2. Password is wrong (Scenario: Username is found.)
    // 3. Login success.

    // ages 16, 66, 18, 37
    // genders 'M', 'F', 'M', 'F'
    // smokers false, true, true, false

    // baseFee = 100

    // 1. Smoker -> 20% fee
    // 2. age > 60 -> +30% fee
    // 3. genders female -> +5% fee

    // calculate fees

int [] ages = new int[] {16, 66, 18, 37};
char [] genders = new char[] {'M', 'F', 'M', 'F'};
boolean [] smokers = new boolean [] {false, true, true, false};
for (int i = 0; i < ages.length; i++) {
  int fee = 0;
  if (ages[i] > 60){
    fee += 30;
  }
  if (genders[i] == 'F'){
    fee += 5;
  }
  if (smokers[i] == true){
    fee += 20;
  }
  System.out.println(100 * (1 + fee/100.0));
}

// toCharArray()
String staff = "John";
char[] chs = staff.toCharArray();

//lowercase letter
char[]characters = new char[] {'a', 'z', 'b', 'a', 'c', 'c', 'a'};

//which letter has the max count.
//Step 1: new int[26], count each letter
//Step 2: find max.
int [] counts = new int [26];
for(int i = 0; i < characters.length; i++ ){
  
}


int x = 'a';
System.out.println(x);


}
}
