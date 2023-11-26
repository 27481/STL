import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        while (testCases > 0) {
            int n = input.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }

            int minimum = 0;
            boolean isSorted = true;

            for (int i = 0; i < n - 1; i++) {
                if (array[i] <= array[i + 1]) {

                } else {
                    isSorted = false;
                }
            }

            if (isSorted) {
                for (int i = n - 2; i >= 0; i--) {
                    int left = array[i];
                    int right = array[i + 1];
                    int difference = right - left;

                    int division = difference / 2;
                    if (difference % 2 != 0)
                        division++;

                    if (minimum == 0)
                        minimum = division;
                    else {
                        if (division < minimum)
                            minimum = division;
                    }
                }
                System.out.println(minimum);
            } else {
                System.out.println(0);
            }
            testCases--;
        }
        input.close();
    }
}
