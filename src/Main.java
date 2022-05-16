
public class Main {
    public static void main(String[] args) {
        double[][][] data = {
                {
                    {1, 2, 3}
                },
                {
                    {4, 5, 6}
                },
                {
                    {7, 8, 9}
                }
        };
        Matrix matrix = new Matrix(data);
        double[] flattened = matrix.flatten();
        for (int i = 0; i < flattened.length; i++) {
            System.out.println(flattened[i]);
        }
    }
}

