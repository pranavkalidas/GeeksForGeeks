package medium;

public class FindStringInGrid {
    public static void main(String[] args) {
        String word = "abe";
        char[][] matrix = {{'a', 'b', 'a', 'b'}, {'a', 'b', 'e', 'b'}, {'e', 'b', 'e', 'b'}};
        int[][] solution = searchWord(matrix, word);
    }

    private static int[][] searchWord(char[][] matrix, String word) {
        int[][] solution = new int[matrix.length][2];
        return solution;
    }
}
