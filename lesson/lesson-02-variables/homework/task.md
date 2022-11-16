# 2. Nodarbība
## 1. Uzdevums
### Izdukāt sveicienu konsolē

Izveidot programmu, kas konsolē izvada sveicienu

```
Hello, {vārds} {uzvārds}!
```

Piemērs: ja jūsu vārds ir *"Jānis Bērziņš'*, tad konsolē ir jāizvada sekojošs sveiciens:
```
Hello, Jānis Bērziņš!

System.out.println("Hello, Janis Berziņš)"

Pa soļiem:
* Izveidojiet klasi ar nosaukumu Greeting.
* Pievienojiet main metodi;
```
public static void main(String[] args) {

}
```
* Pieveinojot kodu sveiciena izvadei.

## 2. uzdevums

### Četrstūra perimetra aprēķins

Izveidojiet klasi Quad, kas spēs aprēķināt četrstūra perimetru

Pa soļiem:

* Izveidojiet 4 integer (int) tipa mainīgos (katrs mainīgais apzīmēs vienu no četrstūra malām)
* Saskaitiet visas mainīgos kopā;
* Izvadiet resultātu konsolē, sekojošā formātā:
```
Četrsturā perimetrs ir {X} metri!
```
{X} - perimetra kopsumma

## 3. uzdevums

### Vienādojums

Izveidojiet klasi *"Equation"*, kas spēs atrisināt sekojošu vienādojumu:
```
x + y * z
```

Pa soļiem:
* Izveidojiet trīs integer (int) tipa mainīgos x, y, z;
* Izpildiet aritmētisko vienādojumu ar mainīgajiem;
* Resultātu ierakstiet mainīgajā result;
* Izdrukājiet result vērtību konsolē

## Papilduzdeumi

## 4. Uzdevums

### Nestrādājoša koda salabošana

Salabojiet sekojošu kodu:

```
public class BankAccountBalance {
    
    public static void main(String[] args) {
        double accountBalance = 2132.58
        System.out.println("Your account balance is" + accountBalance
    }
    
}
```

Pa soļiem
* Izveidojiet klasi BankAccountBalance
* Ievietojiet BankAccountBalance klasē nestrādājošo kodu
* Salabojiet to;
* Izpildiet salaboto kodu un pārliecinieties, ka konsolē tiek izvadīts sekojošs teksts:

```
Your account balance is 2132.58" to the console.
```