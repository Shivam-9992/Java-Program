public class FrequencyCount {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 2, 1, 5, 1, 2, 3, 3, 3 };

        System.out.println("Frequency of each integer:");

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            System.out.println(numbers[i] + ": " + count);
        }
    }
}
