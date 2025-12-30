public class UpperTriangularMatrix {
  
  public static boolean isUpperTriangular(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    // Check if all elements below the diagonal are zero
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i > j && matrix[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    int[][] matrix1 = {
      {1, 2, 3},
      {0, 4, 5},
      {0, 0, 6}
    };
    
    int[][] matrix2 = {
      {1, 2, 3},
      {1, 4, 5},
      {0, 0, 6}
    };
    
    System.out.println("Matrix 1 is upper triangular: " + isUpperTriangular(matrix1));
    System.out.println("Matrix 2 is upper triangular: " + isUpperTriangular(matrix2));
  }
}