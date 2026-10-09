package array;

public class OneDArray {
  public static void main(String[] arg) {
    int[] arr;
    arr = new int[8];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (i + 1) * 10;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
