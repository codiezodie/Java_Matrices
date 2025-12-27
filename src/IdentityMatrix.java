public class IdentityMatrix {
  
  public static boolean isIdentityMatrix(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }
    
    int n = matrix.length;
    
    // Check if matrix is square
    for (int[] row : matrix) {
      if (row.length != n) {
        return false;
      }
    }
    
    // Check identity matrix properties
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          if (matrix[i][j] != 1) {
            return false;
          }
        } else {
          if (matrix[i][j] != 0) {
            return false;
          }
        }
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    int[][] identity = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    int[][] notIdentity = {{1, 0, 0}, {0, 2, 0}, {0, 0, 1}};
    
    System.out.println("Is identity matrix: " + isIdentityMatrix(identity));
    System.out.println("Is identity matrix: " + isIdentityMatrix(notIdentity));
  }
}