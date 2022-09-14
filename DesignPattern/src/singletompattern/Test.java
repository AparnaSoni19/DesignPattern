package singletompattern;

public class Test {
    public static void main(String[] args) {
        SingletonPattern object = SingletonPattern.getObject();
        System.out.println(object.hashCode());
    }
}
