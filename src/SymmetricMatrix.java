public class SymmetricMatrix {
  
  public static boolean isSymmetric(int[][] matrix) {
    int rows = matrix.length;
    
    // Check if matrix is square
    for (int[] row : matrix) {
      if (row.length != rows) {
        return false;
      }
    }
    
    // Check if matrix equals its transpose
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != matrix[j][i]) {
          return false;
        }
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3},
      {2, 4, 5},
      {3, 5, 6}
    };
    
    System.out.println("Is symmetric: " + isSymmetric(matrix));
  }
}