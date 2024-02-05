public class isArraySorted {
  public static void main(String[] args) {
    Boolean isSorted = isArraySor(new int[] { 1, 2, 6,3, 4, 5, 19 });
    System.out.println(isSorted);

  }

  public static Boolean isArraySor(int[] myArray) {
    for (int i = 1; i < myArray.length; i++) {
      if (myArray[i] >= myArray[i - 1]) {
        continue;
      }else{
        return false;

      }
    }
    return true;
  }
}