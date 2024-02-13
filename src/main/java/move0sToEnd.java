public class move0sToEnd {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5 };
    move0sToEndofArray(arr);
  }

  static void move0sToEndofArray(int[] nums) {
      
          int j = -1;
          int n = nums.length - 1;
    //find first Zeroth index
          for (int i = 0; i <= n; i++) {
              if (nums[i] == 0) {
                  j = i;
                  break;
              }
          }

    //only if zero index is found
          if (j != -1) {
            //swap zeroth index with next non zeroth index
              for (int i = j + 1; i <= n; i++) {
                  if (nums[i] != 0) {
                      nums[j] = nums[i];
                      nums[i] = 0;
                      j++;
                  }
              }

          }
      

    for (int k = 0; k <= n; k++) {
      System.out.println("--" + nums[k]);
    }

  }
}