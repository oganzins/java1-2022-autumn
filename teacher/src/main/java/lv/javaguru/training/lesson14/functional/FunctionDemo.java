package lv.javaguru.training.lesson14.functional;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, String> toString = new Function<Integer, String>() {
            @Override
            public String execute(Integer argument) {
                return argument.toString();
            }
        };

        Function<Integer, String> toStringLambda = (argument) -> {return argument.toString();};

        Function<Integer, String> toStringSimplified = argument -> argument.toString();

    }

}
