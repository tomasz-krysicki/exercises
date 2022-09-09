package pl.krysicki.exercises.various.intsMatrix;

public class Main {

    public static void main(String[] args) {
        System.out.println(drawMatrixOfInts(9));
    }

    public static String drawMatrixOfInts(int n) {

        StringBuilder intsMatrixBuilder = new StringBuilder();

        for (int y = 0; y < 2 * n - 1; y++) {
            for (int x = 0; x < 2 * n - 1; x++) {
                intsMatrixBuilder.append(n - Math.min(Math.min(y, 2 * n - 2 - y), Math.min(x, 2 * n - 2 - x)));
                intsMatrixBuilder.append(" ");
            }
            intsMatrixBuilder.append("\n");
        }
        return String.valueOf(intsMatrixBuilder);
    }
}