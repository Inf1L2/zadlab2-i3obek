package pl.edu.ur.main;

public class Zad4 extends Zad3 {
    Operations calc = new Algorytmy();
    Wybor wybierz = new Wybor();
    Zad3 zadanie3 = new Zad3();
    int i;
    double wynik;
    
    public Zad4(double[] tab, int j,int i,double wynik) {
        super(tab, j);
        this.i=i;
        this.wynik=wynik;
    }
    
    public Zad4() {
    }
    
    public double suma(){
        wynik=0;
        for(i=0;i<j;i++){
            //calc.plus(wynik,tab[i]);
            wynik+=tab[i];
        }
        //System.out.println("Suma wszystkic wartości w tablicy wynosi "+wynik);
        return wynik;
    }
    
    public void iloczyn(){
        wynik=1;
        for(i=0;i<j;i++){
            //calc.razy(wynik,tab[i]);
            wynik*=tab[i];
        }
        System.out.println("Wynikiem mnożenia liczb z tablicy jest "+wynik);
    }
    
    public double srednia(){
        wynik=calc.srednia(suma(),j);
        return wynik;
    }
    
    public void min(){
        for(int i=0; i<j;i++){
                if(tab[i]<wynik){
                    wynik=tab[i];
                }
        }
        System.out.println("Najmniejsza wartość w tablicy to "+wynik);
    }
    
    public void max(){
        for(int i=0; i<j;i++){
                if(tab[i]>wynik){
                    wynik=tab[i];
                }
        }
        System.out.println("Największa wartość w tablicy to "+wynik);
    }
    
    public void wpiszTab(){        
    for(int i=0;i<j;i++){
        System.out.println("Wpisz liczbę nr. "+(i+1)+" i zatwierdź Enterem");
        tab[i]=scan.nextDouble();
        }
    }
    
    public void losuj(){
        for(int i=0;i<j;i++){
        tab[i]=random.nextDouble()*1000;
        }
    }
    
    public void menu(){
        i=1;
        while(i>0){
        i=wybierz.zad4();
        switch(i){
            case 1:
                System.out.println("Suma wszystkic wartości w tablicy wynosi "+suma());
                break;
            case 2:
                iloczyn();
                break;
            case 3:
                System.out.println("Średnia wartość w tablicy wynosi "+srednia());
                break;
            case 4:
                min();
                break;
            case 5:
                max();
                break;
            case 6:
                for(i=0;i<j;i++){
                System.out.println("liczba "+(i+1)+"\t"+tab[i]+"\t o indeksie "+i);
                }
                break;
            case 0:
                break;
            default:
                break;
        }
        }        
    }
    
}
