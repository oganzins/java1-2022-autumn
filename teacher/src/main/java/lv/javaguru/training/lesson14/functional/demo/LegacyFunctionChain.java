package lv.javaguru.training.lesson14.functional.demo;

public class LegacyFunctionChain {

    // 1) fruit
    // 2) FRUIT
    // 3) TIURF
    // 4) TRF

    public static void main(String[] args) {
        String value = "Fruit";
        String processedValue = removeVowels(reverse(toUpperCase(value)));

        System.out.println(processedValue);
    }


    private static String toUpperCase(String value) {
        return value.toUpperCase();
    }

    private static String reverse(String value) {
        char[] content = value.toCharArray();
        StringBuilder reverseValue = new StringBuilder();
        for (int i = content.length - 1; i >= 0; i--) {
            reverseValue.append(content[i]);
        }
        return reverseValue.toString();
    }

    private static String removeVowels(String value) {
        return value.replaceAll("A", "")
                .replaceAll("E", "")
                .replaceAll("I", "")
                .replaceAll("O", "")
                .replaceAll("U", "");
    }

}
