package test.java.Task_1_primal_types;
public class Hello {
    private String peopleName;

    public void setupName(String name) {
        this.peopleName = name;
    }

    public void welcome() {
        System.out.println(String.format("Hello, %s ", this.peopleName));
    }

    public void hello_world() {

        System.out.println("Hello World!");

    }
    public void byeBay() {
        System.out.println(String.format("Bye, %s ", this.peopleName));
    }


}