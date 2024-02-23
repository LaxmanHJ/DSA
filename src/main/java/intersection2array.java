
import java.util.ArrayList;

public class intersection2array {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] arr1 = { 1, 2, 2, 3, 3, 4, 5, 6, 7 };
    int[] arr2 = { 2, 3, 3, 5, 6, 6, 7 };
    intersec(arr1, arr2);

  }

  static void intersec(int[] arr1, int[] arr2) {
    int i = 0;
    int j = 0;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] == arr2[j]) {
        arr.add(arr1[i]);
        i++;
        j++;
      } else if (arr1[i] > arr2[j]) {
        j++;
      } else {
        i++;
      }
    }

    for (int ar : arr) {
      System.out.print(ar + " ");
    }
  }

}
