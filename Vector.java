package Java_Basics;



public class Vector {

    public static int checkVectors(int a1, int a2, int a3,
                                   int b1, int b2, int b3) {

        // Zero vector
        if ((a1 == 0 && a2 == 0 && a3 == 0) ||
                (b1 == 0 && b2 == 0 && b3 == 0)) {
            return 0;
        }

        // Dot product
        int dot = a1 * b1 + a2 * b2 + a3 * b3;

        // Cross product
        int x = a2 * b3 - a3 * b2;
        int y = a3 * b1 - a1 * b3;
        int z = a1 * b2 - a2 * b1;

        // |A × B|²
        int crossSquared = x * x + y * y + z * z;

        if (crossSquared == 0) {
            return 1;       // Parallel
        }

        if (dot == 0) {
            return 2;       // Perpendicular
        }

        return 0;           // Neither
    }

    public static void main(String[] args) {



        int a1 = 3;
        int a2 = 2;
        int a3 = 1;

        int b1 = 6;
        int b2 = 4;
        int b3 = 2;

        int result = checkVectors(a1, a2, a3, b1, b2, b3);

        System.out.println(result);


    }
}