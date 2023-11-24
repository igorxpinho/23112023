import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
               
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        System.out.print("Voce quer fazer uma soma? Digite (s) para sim e (n) para nao: ");
        String resposta = stringScanner.nextLine();

        if (resposta.equals("s")) {

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = intScanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = intScanner.nextInt();
       
        System.out.println(n1 + n2);

        } else {

            System.out.println("Ok, obrigado por usar o programa");                

        intScanner.close();
        stringScanner.close();
    }
  }
}