package pl.edu.ur.main;

import java.util.*;

public class Zad7 {
    int i;
    double[] a = new double[i];
    Scanner scan = new Scanner(System.in);
    
    public Zad7() {
    }

    public Zad7(int i,double a) {
        this.i = i;
        this.a = new double[i];
    }
    
    
    public void lista(){
        System.out.println("Aby zakończyć wprowadzanie liczb wpisz '0'");
        do{
            System.out.println("Wprowadź liczbę");
            a[i]=scan.nextDouble();
            i++;
        }while(a[i]!=0);
    }
    
}
