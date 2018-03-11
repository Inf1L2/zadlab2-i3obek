package pl.edu.ur.main;

import java.util.*;

public class Wybor {
    Scanner scan = new Scanner(System.in);
    private int i;
    
    public Wybor(){
    }
    
    public int wybierzZad(){
        System.out.println("Wybierz zadanie wpisując jego numer\nZad.1 - [1]\nZad.2 - [2]\nZad.3 - [3]\nZad.4 - [4]\nZad.5 - [5]\nZad.6 - [6]\nZad.7 - [7]");
        i=scan.nextInt();
        return i;
    }
    
    public int czyLosowe(){
        System.out.println("Czy chcesz wpisać liczby do tablicy?\n[0] - Nie\t[1] - Tak"); //\n[0] - Przerwij
        i=scan.nextInt();
        return i;
    }
    
    public int zad3(){
        System.out.println("Wybierz co chcesz wyświetlić:\n[1] - Tablicę od pierwszego do ostatniego indeksu\n[2] - Tablicę od ostatniego do pierwszego indeksu\n[3] - Elementy o nieparzystych indeksach\n[4] - Elementy o parzystych indeksach\n[0] - Zakończ program\nINFO : Numeracja (indeksy) w tabliczy rozpoczynają się od 0");
        i=scan.nextInt();
        return i;
    }
    
    public int zad4(){
        System.out.println("Wybierz co chcesz wyświetlić:\n[1] - Sumę elementów tablicy\n[2] - Iloczyn elementów tablicy\n[3] - Wartość średnią\n[4] - Wartość minimalną\n[5] - Wartość maksymalną\n[6] - Wyświetl liczby w tablicy\n[0] - Zakończ");
        i=scan.nextInt();
        return i;
    }
    
}
