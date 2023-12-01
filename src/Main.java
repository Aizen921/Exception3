// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        divisione(6,0);

    }
    public static void divisione(int num1, int num2){
        try{
            int risultato = num1 / num2;
            System.out.println("il risultato è: " + risultato);
        }catch (ArithmeticException e){
            System.out.println("errore: non si può dividere per 0 "+ e);
        }

    }
}