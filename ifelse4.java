import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);

        System.out.println("Digita sua idade: ");
        int n1 = intScanner.nextInt();
        
        if (n1 > 18) {
            System.out.println("Você é maior de idade!");
      } else {
            System.out.println("Você é menor de idade!");
                
        }
        intScanner.close();
    }    
}
    

