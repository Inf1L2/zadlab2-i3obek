package pl.edu.ur.main;

import java.util.*;

public class Zad3 {
    Operations calc = new Algorytmy();
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    Wybor wybierz = new Wybor();
    double tab[]= new double[10];
    int j = tab.length;

    public Zad3(double[] tab, int j) {
        this.tab = new double[10];
        this.j = tab.length;
    }
    
    public Zad3() {
    }
    
    public void wpiszTab(){        
    for(int i=0;i<j;i++){
        System.out.println("Wpisz liczbę nr. "+(i+1)+" i zatwierdź Enterem");
        tab[i]=scan.nextDouble();
        }
    }
    
    public int petlaMenu(int i){
        do{
            i=wybierz.zad3();
            if(i==0){
            }else if(i==1){
                for(i=0;i<j;i++){
                System.out.println("liczba "+(i+1)+"\t"+tab[i]+"\t o indeksie "+i);
                }
            }else if(i==2){
                for(i=j;i>0;i--){
                System.out.println("liczba "+(i+1)+"\t"+tab[i]+"\t o indeksie "+i);
                }
            }else if(i==3){
                for(i=1;i<j;){
                System.out.println("liczba "+(i+1)+"\t"+tab[i]+"\t o indeksie "+i);
                i+=2;
                }
            }else if(i==4){
                for(i=0;i<j;){
                System.out.println("liczba "+(i+1)+"\t"+tab[i]+"\t o indeksie "+i);
                i+=2;
                }
            }else{
                System.out.println("Wprowadzono błędne dane");
            }
            System.out.println("");
        }while(i!=0);
        return 0;
    }
    
    public void losuj(){
        for(int i=0;i<j;i++){
        tab[i]=random.nextDouble()*1000;
        }
    }
    
}
