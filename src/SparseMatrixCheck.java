public class SparseMatrixCheck {
  
  public static boolean isSparseMatrix(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    int totalElements = rows * cols;
    int zeroCount = 0;
    
    for (int[] row : matrix) {
      for (int element : row) {
        if (element == 0) {
          zeroCount++;
        }
      }
    }
    
    // A matrix is sparse if more than half of its elements are zero
    return zeroCount > totalElements / 2;
  }
  
  public static void main(String[] args) {
    int[][] sparseMatrix = {
      {0, 0, 3},
      {0, 0, 0},
      {1, 0, 0}
    };
    
    System.out.println("Is sparse: " + isSparseMatrix(sparseMatrix));
  }
}