package e2e.oss.service;

public class GreetingApp {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new GreetingApp().getGreeting());
    }
}
