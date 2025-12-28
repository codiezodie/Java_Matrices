public class SearchSortedMatrix {
  
  /**
   * Search for a target value in a matrix that is sorted row-wise and column-wise.
   * Time Complexity: O(m + n) where m is rows and n is columns
   */
  public static boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }
    
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    // Start from top-right corner
    int row = 0;
    int col = cols - 1;
    
    while (row < rows && col >= 0) {
      if (matrix[row][col] == target) {
        return true;
      } else if (matrix[row][col] > target) {
        col--;  // Move left
      } else {
        row++;  // Move down
      }
    }
    
    return false;
  }
  
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 4, 7, 11},
      {2, 5, 8, 12},
      {3, 6, 9, 16},
      {10, 13, 14, 17}
    };
    
    int target = 5;
    boolean found = searchMatrix(matrix, target);
    System.out.println("Element " + target + " found: " + found);
    
    target = 20;
    found = searchMatrix(matrix, target);
    System.out.println("Element " + target + " found: " + found);
  }
}