package pl.edu.ur.main;

import java.util.*;

public class Zad6 {
    Scanner scan = new Scanner(System.in);
    private int i = 0;

    public Zad6(){
    }
    
    public void calkowite(){
        while(i>=0){
            System.out.println("Podaj liczbę całkowitą i zatwierdź Enterem, (mniejsza od '0' kończy program)");
            i=scan.nextInt();
            }
    }
    
    public void calkowiteIf(){
        while(1==1){
            System.out.println("Podaj liczbę całkowitą i zatwierdź Enterem, (mniejsza od '0' kończy program)");
            i=scan.nextInt();
            if(i<0){
                break;
            }
        }
    }
    
}
