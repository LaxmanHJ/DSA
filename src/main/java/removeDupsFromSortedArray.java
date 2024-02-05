//java pass by values ,methods wont create copy any changes in methods will reflect in original Array

public class removeDupsFromSortedArray {
  public static void main(String[] args) {
     int ar[] = {1,1,2,2,2,3,3};
      int k = removeDuplicates(ar);
      for (int i = 0; i < k; i++) {
          System.out.print(ar[i] + " ");
      }
  }
  static int removeDuplicates(int[] arr) {
      int i = 0;
      for (int j = 1; j < arr.length; j++) {
          if (arr[i] != arr[j]) {
              i++;
              arr[i] = arr[j];
          }
      }
      return i + 1;
  }
}