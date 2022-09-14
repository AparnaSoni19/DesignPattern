package java8feature.foreach;

import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }

    public void accept2(Integer t) {
        System.out.println("Consumer impl Value2::"+t);
    }
}