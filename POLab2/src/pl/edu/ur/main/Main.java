// zad 3,4,6,7
package pl.edu.ur.main;
// Borek.Kamil-104986
public class Main {

    public static void main(String[] args) {
        Zad3 zadanie3 = new Zad3();
        Zad4 zadanie4 = new Zad4();
        Zad6 zadanie6 = new Zad6();
        Zad7 zadanie7 = new Zad7();
        Wybor wybierz = new Wybor();
        int i;
        do{
        switch(i=wybierz.wybierzZad()){
            case 0:
                break;
            case 3:
                i=wybierz.czyLosowe();
                if(i==1){
                    zadanie3.wpiszTab();
                    zadanie3.petlaMenu(0);
                }else if(i==0){
                    zadanie3.losuj();
                    zadanie3.petlaMenu(0);
                }else{
                    break;
                }
                break;
            case 4:
                i=wybierz.czyLosowe();
                if(i==1){
                    zadanie4.wpiszTab();
                    zadanie4.menu();
                }else if(i==0){
                    zadanie4.losuj();
                    zadanie4.menu();
                }else{
                    break;
                }
                break;
            case 6:
                zadanie6.calkowite();
                break;
            case 7:
                zadanie7.lista();
                zadanie7.sortowanie();
                break;
            default:
                System.out.println("Zadanie nie zostało wykonane");
                break;
        }
    }while(i!=0);
    }
    
}
