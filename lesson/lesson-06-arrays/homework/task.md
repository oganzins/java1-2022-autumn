# 6. Nodarbība
## 1. Uzdevums
### Sava vārda izvade konsolē

Pa soļiem:

1. Izveidojam klasi PrintMyName:
```
public class PrintMyName {

    public static void main(String[] args) {

    }

}
```
2. Izveidojam simbolu masīvu, kur katrs elements ir varda burts
```aidl
char[] myName = {'O', 'L', 'E', 'G', 'S'};
```
3. Izmantojot **for** ciklu, izvadām vārdu konsolē izmantojot *System.out.print(myName[i])*

## 2. Uzdevums
### Masīva elementu summa.

Pa soļiem:

1. Izveidojam klasi ArraySum:
```aidl
public class ArraySum {

    public static void main(String[] args) {

    }

}
```
2. Izveidojam int tipa masīvu.
3. Aizpildam masīvu ar sekojošiem skaitļiem 1, 3, 9, 11, 20.
4. Izmantojot *for* ciklu saskaitām masīva elementus.
5. Izvadām masīva elementu summu uz ekrāna.

Sagiadāmais rezultāts:
```
44
```

## 3. Uzdevums
### Masīva kopija

Pa soļiem

1. Izveidojam klasi ArrayUtils.
2. Izveidojam metodi *int[] copy(int[] sourceArray);*:
```aidl
public class ArrayUtils {

    public int[] copy(int[] sourceArray) {

    }

}
```
3. Implementējam copy metodi.
4. Izveidojam klasi ArrayCopyDemo
```aidl
public class ArrayCopyDemo {

    public static void main(String[] args) {
        int[] source = {1, 3, 5, 7};
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] copy = arrayUtils.copy(source);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(copy));
    }

}
```
5. Izpidlām ArrayCopyDemo

Sagaidāmais rezultāts:
```aidl
[1, 3, 5, 7]
[1, 3, 5, 7]
```

## 4. Uzdevums
### Reversais masīvs (masīva spoguļkopija)

Pa soļiem:

1. Klasē ArrayUtils izveidojam metodi **int[] reverse(int[] sourceArray)**:
```aidl
    public int[] reverse(int[] sourceArray) {

    }
```
2. Implementējam metodi reverse; ja metode saņem masīvu [1, 2, 3], tad atgriežamais rezultāts ir [3, 2, 1]
3. Izveidojam, klasi ArraysReverseDemo:
```aidl
public class ArrayReverseDemo {

    public static void main(String[] args) {
        int[] source = {1, 3, 5, 7};
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] reversedArray = arrayUtils.reverse(source);

        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(reversedArray));
    }

}
```
4. Izpildām klasi ArrayReverseDemo.

Sagaidāmais rezultāts:
```aidl
[1, 3, 5, 7]
[7, 5, 3, 1]
```