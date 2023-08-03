import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println("Normal array: " + Arrays.toString(returnedArray));
        reverse(returnedArray);


        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a list of numbers, divided each by ,");
        String numbers = scanner.nextLine();
        String[] splits = numbers.split(",");
        int[] intArray = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            intArray[i] = Integer.parseInt(splits[i]);
        }
        return intArray;
    }

    private static int findMin(int[] intArray) {
        Arrays.sort(intArray);
        return intArray[0];
    }

    private static void reverse(int[] intArray) {
        for (int i = 0; i < intArray.length/2; i++ ) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(intArray));
    }
}
