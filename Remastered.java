import java.util.Arrays;
import java.util.Scanner;

public class Remastered {

    public static void main(String[] args) {

//        readElements(readInteger());
        findMin(readElements(readInteger()));
    }

    private static int readInteger() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose the length of your string of numbers:");
        return s.nextInt();
    }

    private static int[] readElements(int length) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please insert number " + (i+1));
            numbers[i] = s.nextInt();
        }
        System.out.println("Numbers: " + Arrays.toString(numbers));
        return numbers;
    }

    private static int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }
}
