package test.java.Task_2_types_converting;

public class Changing_variable_value_4 {
    public static void main(String[] args) {

        int a = 3;
        int b = 8;
        int c = 9;

        a = a + b;
        b = c - a;
        c = a + b;

        System.out.println("a is " + a + ", b is " + b + ", c is " + c);
    }

}

