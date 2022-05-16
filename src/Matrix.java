public class Matrix {
    final private int width;
    final private int height;
    final private int depth;
    final private double[][][] data;

    public Matrix(double[][][] data) {
        this.width = data.length;
        this.height = data[0].length;
        this.depth = data[0][0].length;
        this.data = data;
    }

    // Getters for encapsulation
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public double[][][] getData() {
        return data;
    }

    public double[] flatten() {
        int numOfElements = this.width * this.height * this.depth;
        double[] flattenedArray = new double[numOfElements];
        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < this.height; y++) {
                for (int z = 0; z < this.depth; z++) {
                    int newIndex = z * height * depth + y * height + x;
                    flattenedArray[newIndex] = this.data[x][y][z];
                }
            }
        }
        return flattenedArray;
    }
}
