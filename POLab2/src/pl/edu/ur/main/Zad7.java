package pl.edu.ur.main;

import java.util.*;

public class Zad7 {
    Scanner scan = new Scanner(System.in);
    int i;
    double a;// = new double[i];
    List<Double> list = new ArrayList<Double>();;
    
    public Zad7() {
    }

    public Zad7(int i,double a) {
        this.list = new ArrayList<Double>();
        this.i = i;
        this.a = a;
        //this.a = new double[i];
    }
    
    public void lista(){
        System.out.println("Aby zakończyć wprowadzanie liczb wpisz '0'");
        i=0;
        do{
            System.out.println("Wprowadź liczbę");
            a=scan.nextDouble();
            if(a!=0){
                list.add(a);
                i++;
            }else{
                break;
            }
        }while(a!=0);
    }
    
    public void sortowanie(){
        for (int i=0;i<list.size();i++) {
            for (int j=0;j<list.size()-1;j++) {
                if (list.get(j)>list.get(j+1)) {
                    double temp,tem;
                    temp = list.get(j+1);
                    tem = list.get(j);
                    list.set(j,temp);
                    list.set(j+1,tem);
                }
            }
        }
        System.out.println(list+"\n");
    }
}
