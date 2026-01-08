public class DiagonalMatrixCheck {
  
  public static boolean isDiagonalMatrix(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    // Check if all non-diagonal elements are zero
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i != j && matrix[i][j] != 0) {
          return false;
        }
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    int[][] diagonalMatrix = {
      {5, 0, 0},
      {0, 3, 0},
      {0, 0, 2}
    };
    
    int[][] notDiagonal = {
      {1, 2, 0},
      {0, 3, 0},
      {0, 0, 4}
    };
    
    System.out.println("Is diagonal matrix? " + isDiagonalMatrix(diagonalMatrix));
    System.out.println("Is diagonal matrix? " + isDiagonalMatrix(notDiagonal));
  }
}