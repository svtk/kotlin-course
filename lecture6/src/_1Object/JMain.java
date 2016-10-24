package _1Object;

public class JMain {
    public static void main(String[] args) {
        Class<JSingleton> singletonClass = JSingleton.class;
        System.out.println("===");
        JSingleton.INSTANCE.foo();
    }
}
