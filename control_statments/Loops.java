public class Loops {
  public static void main(String[] args) {
    // Print first 10 even numbers
    for (int i = 0; i < 10; i++) {
      // System.out.print(i * 2 + " ");
    }
    // System.out.println();

    // Print first 10 odd numbers
    // int i = 0;
    // while (i < 10) {
    // // System.out.print(i * 2 + 1 + " ");
    // i++;
    // }

    // FizzBuzz program
    for (int j = 1; j <= 40; j++) {
      if (j % 3 == 0 && j % 5 == 0) {
        // System.out.println(j + " FizzBuzz");
      } else if (j % 3 == 0) {
        // System.out.println(j + " Fizz");
      } else if (j % 5 == 0) {
        // System.out.println(j + " Buzz");
      }
    }

    for (int j = 1; j <= 4; j++) {
    for (int k = 1; k <= j; k++) {
    System.out.print(" * ");
    }
    System.out.println();
    }

    int decimalValue = 97;
    for (int i = 0; i <= 20; i++) {
      char char_value = (char) (decimalValue + i);
      System.out.print(char_value + " ");
    }
  }
}
