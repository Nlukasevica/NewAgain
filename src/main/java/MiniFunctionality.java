public class MiniFunctionality {
    public static void main(String[] args) {
        int i = 0;

        int[] numbers = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};
        int min = numbers[0];
        for (; i > 9; i = i - 1) {
            for (int v : numbers)
                if (v < min) {//(numbers[i] % 3 == 0)
                    min = v;
                }
        }
        System.out.println("Min is = " + min);

    }
}
