public class rotateArrayByDPlaces {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int byd = 17;
    int n = arr.length;
    int d = byd % n; // rotating with d==n gives same array back
    rotateArrayByD(arr, d);
  }

  public static void rotateArrayByD(int[] arr, int d) {
    int n = arr.length;
    int[] temp = new int[n];

    // copying first rotated elements to temp
    for (int i = d; i <= n - 1; i++) {
      temp[i - d] = arr[i];
    }

    // copying last rotated elements to temp
    int m = 0;
    for (int i = n - d; i < n; i++) {
      temp[i] = arr[m];
      m++;
    }

    for (int k = 0; k <= n - 1; k++) {
      System.out.println(temp[k]);
    }

  }
}