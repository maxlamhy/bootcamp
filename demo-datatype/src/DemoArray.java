public class DemoArray {
  public static void main(String[] args) {
    int x = 3;
    int y = 10;
    int z = 18;
    System.out.println(y);

    //Array - store a set of same type values
    // arr is a variable name
    // "int[] arr" is to describe the type of variable
    int [] array = new int [4]; // auto-allocate appropriate memory location
    //arr[0] ->
    arr[0] = 23;
    arr[1] = 49;
    arr[2] = 71;
    arr[3] = 100;
    //arr[4] = -2 // ArrayIndexOutOfBoundsException

    // ! arr.length
    System.out.println("arr.length=" + arr.lengh);//4
    for(int i = 0; i < arr.length; i++){ //0-3
      System.out.println(arr([i]);//read
    }

    //String[]
    //apple, banana, kiwi
    //for loop
    String[] arr2 = new String[3];
    arr2[0]= "apple";
    arr2[1]= "banana";
    arr2[2]= "kiwi";
    for(int i =0; i < arr2.length; i++){
      System.out.println(arr2[i]);
    }

    //char[]
    // i j k a b
    char[] arr3 = new char[5];
    arr3[0] = 'i';
    arr3[1] = 'j';
    arr3[2] = 'k';
    arr3[3] = 'a';
    arr3[4] = 'b';

    //boolean{}
    //true,false,true



  }
  
}
