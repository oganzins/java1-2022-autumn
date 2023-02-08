package lv.javaguru.training.lesson14.functional;

@FunctionalInterface
public interface Function<T, R> {

    R execute(T argument);

}
