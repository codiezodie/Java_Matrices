import java.util.Arrays;

public class CircularRowRotationMatrix {

    public static boolean areRowsCircularRotations(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return true;
        }

        int[] firstRow = matrix[0];

        for (int i = 1; i < matrix.length; i++) {
            if (!isCircularRotation(firstRow, matrix[i])) {
                return false;
            }
        }

        return true;
    }

    private static boolean isCircularRotation(int[] original, int[] rotated) {
        if (original.length != rotated.length) {
            return false;
        }

        String originalStr = arrayToString(original);
        String doubled = originalStr + "," + originalStr;
        String rotatedStr = arrayToString(rotated);

        return doubled.contains(rotatedStr);
    }

    private static String arrayToString(int[] arr) {
        return Arrays.toString(arr)
                     .replace("[", "")
                     .replace("]", "")
                     .replace(" ", "");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        };

        System.out.println(areRowsCircularRotations(matrix)); // true
    }
}
