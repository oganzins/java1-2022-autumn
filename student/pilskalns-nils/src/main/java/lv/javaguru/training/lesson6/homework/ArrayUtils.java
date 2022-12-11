package lv.javaguru.training.lesson6.homework;

import java.util.Arrays;

public class ArrayUtils {
    public int[] copy(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            /*
                Šeit nekas netiek kopēts, bet gan tiek izvadīts konsolē.
                System.out.println - izvada nevis kopē.

                Šai funkcijai ir jātgriež jauns masīvs, kas ir kopija sourceArray massīvam

                1. Ir jāizveido jauns masīvs
                    int[] copyArray = new int[sourceArray.length];
                2. copyArray ir jāsarasta sourceArray dati
                    for (int i = 0; i < sourceArray.length; i++) {
                        copyArray[i] = sourceArray[i];
                    }
                3. Metodes beigās ir jāatgriež copyArray
                   return copyArray

                   Līdzīgi ir jāizdara arī reverse metodē. Arī tur pašlaik tiek izvadīts masīvs
                   nevis izveidots jauns masīvs, kas satur apgriestu sourceArray.

             */
            System.out.print(sourceArray [i] + " ");
        }

        return sourceArray;
    }

    public int[] reverse(int[] sourceArray) {
        for (int i = sourceArray.length -1; i >= 0; i--) {
            System.out.print(sourceArray[i] + " ");
        }
        return sourceArray;
    }
}
