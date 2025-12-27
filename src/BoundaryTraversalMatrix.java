public class BoundaryTraversalMatrix {
  
  public static void printBoundary(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    // Print top row
    for (int j = 0; j < cols; j++) {
      System.out.print(matrix[0][j] + " ");
    }
    
    // Print right column (excluding top corner)
    for (int i = 1; i < rows; i++) {
      System.out.print(matrix[i][cols - 1] + " ");
    }
    
    // Print bottom row (excluding right corner)
    if (rows > 1) {
      for (int j = cols - 2; j >= 0; j--) {
        System.out.print(matrix[rows - 1][j] + " ");
      }
    }
    
    // Print left column (excluding both corners)
    if (cols > 1) {
      for (int i = rows - 2; i > 0; i--) {
        System.out.print(matrix[i][0] + " ");
      }
    }
    
    System.out.println();
  }
  
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };
    
    printBoundary(matrix);
  }
}