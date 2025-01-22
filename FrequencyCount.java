import java.util.Arrays;

public class FrequencyCount {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 2, 1, 5, 1, 2, 3, 3, 3 };

        Arrays.sort(numbers);

        System.out.println("Frequency of each integer:");

        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
            } else {
                System.out.println(numbers[i - 1] + ": " + count);
                count = 1; 
            }
        }
        System.out.println(numbers[numbers.length - 1] + ": " + count);
    }
}