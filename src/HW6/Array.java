package HW6;

public class Array {
    void minValue() {

        int[] array = {5, 11, 7, 20};

        int c1 = Math.abs(array[0] - array[1]);
        int c2 = Math.abs(array[0] - array[2]);
        int c3 = Math.abs(array[0] - array[3]);
        int c4 = Math.abs(array[1] - array[2]);
        int c5 = Math.abs(array[1] - array[3]);
        int c6 = Math.abs(array[2] - array[3]);

        int[] array1 = {c1, c2, c3, c4, c5, c6};
        int minValue = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < minValue) {
                minValue = array1[i];
            }
        }
        System.out.println(minValue);
    }

    public static void main(String[] args) {
        Array array1 = new Array();
        array1.minValue();
    }
}

