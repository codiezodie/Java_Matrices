public class DiagonalSumMatrix {
  
  public static int sumOfDiagonals(int[][] matrix) {
    int n = matrix.length;
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
      // Primary diagonal (top-left to bottom-right)
      sum += matrix[i][i];
      
      // Secondary diagonal (top-right to bottom-left)
      if (i != n - 1 - i) {  // Avoid counting center element twice
        sum += matrix[i][n - 1 - i];
      }
    }
    
    return sum;
  }
  
  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    
    System.out.println("Diagonal Sum: " + sumOfDiagonals(matrix));
  }
}