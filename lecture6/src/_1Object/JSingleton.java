package _1Object;

public class JSingleton {
    public final static JSingleton INSTANCE;

    static {
        INSTANCE = new JSingleton();
    }

    private JSingleton() {
        System.out.println("" +
                "Instance of JSingleton created");
    }

    public void foo() {
        System.out.println("Foo called");
    }
}
