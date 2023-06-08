public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static void task1() {
        System.out.println("Задача 1");

        int[] expenses = generateRandomArray();
        int sum = 0;

        for (int element : expenses) {
            sum += element;
        }
        System.out.println(sum);
    }
    private static void task2() {
        System.out.println("Задача 2");

        int[] expenses = generateRandomArray();
        int min = 0;
        int max = 0;

        if (expenses.length > 0) {
            min = expenses[0];
            max = expenses[0];

            for (int expense : expenses) {
                if (expense < min) {
                    min = expense;
                } else if (expense > max) {
                    max = expense;
                }
            }
            System.out.println("Минимальное : " + min);
            System.out.println("Максимальное : " + max);
        }
    }
    private static void task3() {
        System.out.println("Задача 3");

        int[] expenses = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < expenses.length - 1; i++) {
            sum += expenses[i];
        }
        double average = (double) sum / expenses.length;
        System.out.printf("Среднее за месяц: %.2f \n ", average);
    }
    private static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}