package array;

public class OneDArray {
  public static void main(String[] arg) {
    int[] arr = new int[8];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (i + 1) * 10;
    }

    for (int value : arr) {
      System.out.print(value + " ");
    }
  }
}
