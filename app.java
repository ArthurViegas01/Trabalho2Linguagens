import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Item item = new Item(); //Classe para instanciar objetos, pego do trabalho 1

        // E -> TE’ | A | B | C |
        //E’ -> +TE’ | 
        //T -> FT’
        //T’ -> *FT’ | 
        //F -> ( E ) | id 

        System.out.println("Por favor digite uma linha");

        String simbolo = sc.nextLine();

        System.out.println("\nSua String:" + simbolo);
        String[] arrayOp = simbolo.split("[|>-]");

        for(int i = 0; i < arrayOp.length; i++){
            System.out.printf(arrayOp[i]);
        }

        sc.close();
    }
}