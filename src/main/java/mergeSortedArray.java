import java.util.Arrays;

class mergeSortedArray {
  public static void main(String[] args) {

    int[] arr1 = { 1, 1, 2, 3, 4, 5 };
    int[] arr2 = { 2, 3, 4, 5, 6 };
    System.out.println("-");
    merge(arr1, arr1.length, arr2, arr2.length);

  }

  static void merge(int[] myArr, int m, int[] nums2, int n) {

    int[] nums1 = Arrays.copyOf(myArr, myArr.length + nums2.length);

    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] >= nums2[j]) {
        nums1[k] = nums1[i];
        k--;
        i--;
      } else {
        nums1[k] = nums2[j];
        j--;
        k--;

      }
    }
    while (i >= 0) {
      nums1[k] = nums1[i];
      k--;
      i--;

    }
    while (j >= 0) {
      nums1[k] = nums2[j];
      k--;
      j--;

    }

    for (int l = 0; l < nums1.length; l++) {
      System.out.println(nums1[l]);
    }
  }
}