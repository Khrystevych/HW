public class Array1 {

    public static void dividesArrayElements(int a) {
        double[] array1 = {3, 5, 7, 10};
        double[] array2 = new double[4];
        try {
            for (int i = 0; i < array1.length; i++) {
                array2[i] = array1[i] / a;
                System.out.println(array2[i]);
            }
        } catch (ArithmeticException exception) {
            System.out.println("Arithmetic exception caught");
        }
    }

    public static void main(String[] args) {
        dividesArrayElements(2);
    }
}
