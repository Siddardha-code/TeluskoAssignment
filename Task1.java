package Telesko;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int numRows = 10;
        PascalTriangle(numRows);
    }

    public static int Coefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        String key = n + "," + k;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int coefficient = Coefficient(n - 1, k - 1) + Coefficient(n - 1, k);
        memo.put(key, coefficient);
        return coefficient;
    }

    public static void PascalTriangle(int numRows) {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= row; col++) {
                int coefficient = Coefficient(row, col);
                System.out.print(coefficient + " ");
            }
            System.out.println();
        }
    }
}