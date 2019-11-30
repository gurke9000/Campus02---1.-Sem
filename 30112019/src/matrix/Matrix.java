package matrix;

public class Matrix {

    public static void main(String[] args) {

        double [][] m1 = generateIdentityMatrix(6);
        printM(m1);
        double [][] m2 = generateIdentityMatrix(10);
//        printM(m2);
    }

    public static double [][] generateIdentityMatrix (int size)
    {
        double [][] m = new double[size][size];
        for(int i = 0; i < size; i++)
        {
            m[i][i] = 1.0;
        }
        return m;
    }

    public static void printM(double [][] matrix)
    {
        for(int z = 0; z < matrix.length; z++) {
            for (int s = 0; s < matrix[z].length; s++) {
                System.out.print(matrix [z][s] + " ");
            }
            System.out.println();
        }
    }
}


// int [] [] a = new int [][];