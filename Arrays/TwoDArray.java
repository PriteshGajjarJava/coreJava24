public class TwoDArray {
  public static void main(String[] args) {
    // Declaring 2-D array with data
    int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}}; // 3*3 matrix

    // Traversing
    for (int i=0; i < arr.length; i++) {
      for (int j=0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  } 
}
