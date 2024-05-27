package desafios.pessoas;
import java.util.Scanner;
import java.util.Locale;

public class Pessoas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        byte contadorFeminino = 0;
        double maiorAltura = 0, menorAltura = 0;
        String nomeMenorAltura = "", nomeMaiorAltura = "";

        System.out.println("Digite quantas pessoas participaram (no mínimo duas pessoas)");
        final byte pessoas = scan.nextByte();

        if(pessoas < 2) {
            System.out.println("fim do programa");
            return;
        }

        for(byte c = 1; c <= pessoas; c++) {
            System.out.println("Digite o nome da " + c + "º pessoa abaixo");
            String nome = scan.next();

            System.out.println("Digite a altura de " + nome);
            double altura = scan.nextDouble();

            System.out.println("Defina o sexo de " + nome + " (digite 'M' para masculino e 'F' para feminino)");
            String sexo = scan.next();

            if(sexo.equalsIgnoreCase("F")) contadorFeminino++;

            if(altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaiorAltura = nome;
            } else {
                menorAltura = altura;
                nomeMenorAltura = nome;
            }
        }

        scan.close();

        System.out.println(contadorFeminino + " pessoa(s) do sexo feminino");
        System.out.println("pessoa mais alta: " + nomeMaiorAltura + " (" + maiorAltura + "m)");
        System.out.println("pessoa mais baixa: " + nomeMenorAltura + " (" + menorAltura + "m)");
    }
}