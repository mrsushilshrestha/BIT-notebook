public class ArrayProgramExaple4 {
    static void minimum(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The minimum Value is : " +min);
    }

    public static void main(String[] args) {
        int a[] = { 50, 10, 20, 30, 40 };
        minimum(a);

    }

}
