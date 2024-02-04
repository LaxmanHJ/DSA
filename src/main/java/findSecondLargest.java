//Time Complexity: O(2n)
//Space Complexity: O(1)

public class findSecondLargest {
  public static void main(String[] args) {

    int[] myArray = { 1, 2, 8, 4, 7, 7, 5, 9 };
    // int secondLargest = finsSecLar(myArray);
    int secondLargestOPT = finSecLarOPT(myArray);
    System.out.print(secondLargestOPT);
  }

  public static int finSecLarOPT(int[] myArray) {
    int firstLargest = myArray[0];
    int secLargest = 0;
    int n = myArray.length;
    for (int i = 1; i < n; i++) {
      if (myArray[i] > firstLargest) {
        secLargest = firstLargest;
        firstLargest = myArray[i];
      } else if (myArray[i] > secLargest) {
        secLargest = myArray[i];
      }
    }
    return secLargest;
  }

  public static int finsSecLar(int[] myArray) {
    int firstLargest = myArray[0];
    int n = myArray.length;
    int secondLargest = myArray[0];

    for (int i = 1; i < n; i++) {
      if (myArray[i] > firstLargest) {
        firstLargest = myArray[i];
      }
    }

    for (int i = 1; i < n; i++) {
      if (myArray[i] > secondLargest && myArray[i] != firstLargest) {
        secondLargest = myArray[i];
      }

    }
    return secondLargest;

  }
}