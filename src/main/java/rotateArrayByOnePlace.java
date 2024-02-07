public class rotateArrayByOnePlace {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int byPlace = 1;
    rotateArray(arr, byPlace);
  }

  static void rotateArray(int[] arr, int byPlace) {
    int len = arr.length - 1;
    int temp = arr[0];
    for (int i = 1; i <= len; i++) {
      arr[i - 1] = arr[i];
    }
    arr[len] = temp;
    for (int j = 0; j <= arr.length - 1; j++) {
      System.out.println(arr[j]);

    }
  }
}