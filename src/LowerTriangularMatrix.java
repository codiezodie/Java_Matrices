public class LowerTriangularMatrix {
  private int[][] matrix;
  private int n;

  public LowerTriangularMatrix(int n) {
    this.n = n;
    this.matrix = new int[n][n];
  }

  public void set(int i, int j, int value) {
    if (i >= j) {
      matrix[i][j] = value;
    }
  }

  public int get(int i, int j) {
    if (i >= j) {
      return matrix[i][j];
    }
    return 0;
  }

  public void display() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(get(i, j) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    LowerTriangularMatrix ltm = new LowerTriangularMatrix(4);
    
    ltm.set(0, 0, 1);
    ltm.set(1, 0, 2);
    ltm.set(1, 1, 3);
    ltm.set(2, 0, 4);
    ltm.set(2, 1, 5);
    ltm.set(2, 2, 6);
    
    ltm.display();
  }
}