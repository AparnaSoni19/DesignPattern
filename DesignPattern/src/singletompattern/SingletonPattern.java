package singletompattern;

public class SingletonPattern {
    private static final SingletonPattern value = new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern getObject()
    {
        return value;
    }
}
