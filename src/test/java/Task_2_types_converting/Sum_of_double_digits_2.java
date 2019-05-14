package test.java.Task_2_types_converting;

public class Sum_of_double_digits_2 {
    public static void main(String[] args) {
        double n = 75d;
        double first = n / 10;
        double firstS = Math.floor(first);
        double second = n % 10;
        double sum = firstS + second;
        System.out.println("Result=" + sum);
    }
}
