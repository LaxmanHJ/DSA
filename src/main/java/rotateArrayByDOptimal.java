public class rotateArrayByDOptimal {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int d = 3;
    rotateArrayByD(arr, d);
  }

  public static void rotateArrayByD(int[] arr, int d) {
    int n = arr.length;
    arr = reverseArray(arr, 0, d - 1);
    arr = reverseArray(arr, d, n - 1);
    arr = reverseArray(arr, 0, n - 1);

    for (int k = 0; k < n; k++) {
      System.out.println(arr[k]);
    }
  }

  public static int[] reverseArray(int[] arr, int start, int end) {
    int temp;
    while (start < end) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }
}