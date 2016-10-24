package _1Object;

// В Java инициализация статического поля происходит при первом обращении (а не при загрузке класса).
// Для object в Котлине генерируется код, эквивалентный Java классу.

public class JSingleton {
    public final static JSingleton INSTANCE;

    static {
        INSTANCE = new JSingleton();
    }

    private JSingleton() {
        System.out.println("Constructor");
    }

    public void foo() {
        System.out.println("Foo");
    }
}
