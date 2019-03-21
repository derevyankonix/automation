//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package test.java.Task_1_primal_types;

        import java.util.Scanner;

public class Main2 {
    public Main2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt for the user's name
        System.out.print("Enter your name: ");

        String nameFromCmd = scanner.next();

        Hello hello = new Hello();
        hello.setupName(nameFromCmd);
        hello.welcome();
        hello.hello_world();
        hello.byeBay();
    }
}
