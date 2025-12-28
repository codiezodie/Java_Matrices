public class RowWithMaxOnes {
  public static int findRowWithMaxOnes(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return -1;
    }
    
    int maxOnesCount = -1;
    int maxOnesRow = -1;
    
    for (int i = 0; i < matrix.length; i++) {
      int onesCount = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 1) {
          onesCount++;
        }
      }
      
      if (onesCount > maxOnesCount) {
        maxOnesCount = onesCount;
        maxOnesRow = i;
      }
    }
    
    return maxOnesRow;
  }
  
  public static void main(String[] args) {
    int[][] matrix = {
      {0, 1, 1, 0},
      {1, 1, 1, 1},
      {0, 0, 1, 0},
      {1, 1, 0, 1}
    };
    
    int rowIndex = findRowWithMaxOnes(matrix);
    System.out.println("Row with maximum ones: " + rowIndex);
  }
}