package Java_Basics;

import java.util.Arrays;

class Cuboid {

    public int[] find(int l, int b, int h) {
        int surfaceArea = 2 * (l * b + b * h + h * l);
        int volume = l * b * h;

        return new int[]{surfaceArea, volume};
    }

    public static void main(String[] args) {
        Cuboid obj = new Cuboid();

        int[] result = obj.find(1, 2, 3);

        System.out.println(Arrays.toString(result));
    }
}