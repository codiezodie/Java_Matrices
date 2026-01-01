public class ZigzagMatrixTraversal {
  
  public static void zigzagTraversal(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    for (int i = 0; i < rows + cols - 1; i++) {
      if (i % 2 == 0) {
        // Even diagonal: bottom-left to top-right
        int row = Math.min(i, rows - 1);
        int col = i - row;
        
        while (row >= 0 && col < cols) {
          System.out.print(matrix[row][col] + " ");
          row--;
          col++;
        }
      } else {
        // Odd diagonal: top-right to bottom-left
        int col = Math.min(i, cols - 1);
        int row = i - col;
        
        while (col >= 0 && row < rows) {
          System.out.print(matrix[row][col] + " ");
          row++;
          col--;
        }
      }
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    zigzagTraversal(matrix);
  }
}