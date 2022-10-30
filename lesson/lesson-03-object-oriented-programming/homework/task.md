# 3. Nodarbība

## 1. Uzdevums
### Grāmata

1. Izveidojiet klasi Book.
2. Izveidojiet sekojošus klases laukus:
   * Nosaukums (title);
   * Autors (author);
   * Lappušu skaits (pageCount).
3. Visiem klases laukiem izveidot *get* un *set* metodes.
4. Izveidot klasi BookDemo ar main metodi.
5. BookDemo main metodē izveidojiet Book objektu un aizpildiet visus laukus ar *set* metožu palīdzību.
6. Izvadiet konsolē Book objekta datus sekojošā formātā:
```
Book title: {title}, Author: {author}, Page count: {page count}
```
Piemērs:
```
Book title: Clean Code, Author: Robert Cecil Martin, Page count: 403
```

## 2. Uzdevums
### Kaķis

1. Izveidot klasi Cat ar sekojošiem laukiem:
* Vārds (name);
* Krāsa (color);
* Suga (species);
* Vecums (age);
* Svars (weight).

2. Izveidot sekojošus klases konstruktorus:

* Noklusētais konstruktors bez parametriem;
* Konstruktors ar vienu parametru - vārds;
* Konstruktors ar sekojošiem parametriem:
  * Vārds;
  * Krāsa;
  * Vecums.

3. Izveidot *get* un *set* metodes visiem laukiem.

2. Izveidot klasi CatDemo ar main metodi, kurā tiek inicializēti trīs Cat objekti izmantojot dažādus konstruktorus:
* Bez parametriem;
* Norādot vārdu;
* Norādot vārdu, krāsu, vecumu.

3. Visiem trim Cat objektiem, kas tika izveidoti otrajā punktā, uzstādīt neuzstādītās vērtības izmantojot *set* metodes.


4. Klasē Cat izveidot metodi *printInfo()*, kura izdrukā konsolē visas Cat objekta vērtības

Piemērs:

```
public void printInfo() {
    System.out.println("Cat's name: " + name);
    ...
}
```
5. Klasē CatDemo izsaukt metodi *printInfo* visiem definētajiem Cat objektiem.

## 3. Uzdevums

1. Izvēlieties patvaļigī jebkādu objektu no apkārtējās pasaules un izveidojiet tam klasi (klase, lauki, *get* un *set* metodes).
2. Izveidojiet atsevišķu klasi ar main metodi, kurā tiek inicializēts objekts klasei, kas tika izveidota pirmajā punktā.
