package _2Object;

public class UseKotlinObjectFromJava {
    public static void main(String[] args) {
        JSingleton.INSTANCE.foo();
        KSingleton.INSTANCE.foo();
    }
}
