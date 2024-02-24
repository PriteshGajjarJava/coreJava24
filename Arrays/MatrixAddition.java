import java.util.Arrays;

public class MatrixAddition {
  public static void main(String[] args) {
    int[][]arr1 = {{1,3,4}, {4,5,7}, {9,1,0}};
    int[][]arr2 = {{6,8,1}, {1,2,0}, {3,6,5}};

    int[][] arr3 = addMatrix(arr1, arr2);
    
    for (int i=0 ; i < arr3.length; i++) {
      System.out.println(Arrays.toString(arr3[i]));
    }
  }

  static int[][] addMatrix(int[][] arr1, int[][] arr2) {
    int[][] arr3 = new int[arr1.length][];

    for (int i=0; i < arr1.length; i++) {
      arr3[i] = new int[arr1[i].length];
      for (int j=0; j < arr1[i].length; j++) {
        arr3[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    return arr3;
  }
}
