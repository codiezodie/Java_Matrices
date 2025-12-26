public class SpiralMatrixTraversal {
  
  public static void spiralTraversal(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }
    
    int top = 0, bottom = matrix.length - 1;
    int left = 0, right = matrix[0].length - 1;
    
    while (top <= bottom && left <= right) {
      // Traverse right
      for (int i = left; i <= right; i++) {
        System.out.print(matrix[top][i] + " ");
      }
      top++;
      
      // Traverse down
      for (int i = top; i <= bottom; i++) {
        System.out.print(matrix[i][right] + " ");
      }
      right--;
      
      // Traverse left
      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          System.out.print(matrix[bottom][i] + " ");
        }
        bottom--;
      }
      
      // Traverse up
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          System.out.print(matrix[i][left] + " ");
        }
        left++;
      }
    }
  }
  
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };
    
    System.out.println("Spiral traversal:");
    spiralTraversal(matrix);
  }
}