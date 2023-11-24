import java.util.*;
public class ifelse3 {
    public static void main(String[] args) {
        String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};
        Scanner scanTxt1 = new Scanner(System.in);
        System.out.println("Digite uma palavra ou texto que contenha numeros");
        String txt1 = scanTxt1.nextLine();

        String caracterAtual;
        List<String> numeroEncontrados = new ArrayList<>();
        boolean achouNumero = false;
        for (int i = 0; i < txt1.length(); i++) {
            System.out.println("n: " + i);
            System.out.println("txt1.subwtring(i, i): " + txt1.substring(i, i+1));
            for (int n = 0; n < numeros.length; n++) {
                System.out.println("n: " + n);
                System.out.println("numeros[n]: " + numeros [n]);
                caracterAtual = txt1.substring(i, i+1);
                if (caracterAtual.equals(numeros[n])){
                    numeroEncontrados.add(numeros[n]);
                    achouNumero = true;
                }
            }
       }

       if (achouNumero == true) {
        System.out.println("Foram encontrador os números digitados a seguir:  " + numeroEncontrados);
       }
       scanTxt1.close();
    }
}
