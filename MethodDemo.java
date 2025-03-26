public class MethodDemo {

    // greet method that prints a greeting message
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // printMessage method that prints the given message
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // main method: entry point of the program
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling the printMessage method with a custom message
    }
}

}