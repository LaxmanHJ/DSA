import java.util.ArrayList;

public class unionOfTwoSorArray {
  public static void main(String[] args) {
    int[] arr1 = { 1, 1, 2, 3, 4, 5 };
    int[] arr2 = { 2, 3, 4, 5, 6 };
    System.out.println("-");
    ArrayList<Integer> unoin = unionOfSorArray(arr1, arr2);
    for (int val : unoin) {
      System.out.print(val + ",");
    }
  }

  static ArrayList<Integer> unionOfSorArray(int[] arr1, int[] arr2) {
    int len1 = arr1.length;
    int len2 = arr2.length;
    ArrayList<Integer> arr3 = new ArrayList<Integer>();
    int i = 0;
    int j = 0;
    while (i < len1 && j < len2) {
      if (arr1[i] < arr2[j]) {
        if (arr3.size() == 0 || arr3.get(arr3.size() - 1) != arr1[i]) {
          arr3.add(arr1[i]);
          i++;
        }
      } else {
        if (arr3.size() == 0 || arr3.get(arr3.size() - 1) != arr2[j]) {
          arr3.add(arr2[j]);
          j++;
        }
      }
    }

    while (i < len1) {
      if (arr3.get(arr3.size() - 1) != arr1[i]) {
        arr3.add(arr1[i]);
        i++;
      }
    }

    while (j < len2) {
      if (arr3.get(arr3.size() - 1) != arr1[j]) {
        arr3.add(arr2[j]);
        j++;
      }
    }

    return arr3;
  }
}