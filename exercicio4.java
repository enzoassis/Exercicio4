import java.util.Scanner;

public class exercicio4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota do primeiro bimestre: ");
        int nota1 = scan.nextInt();

        System.out.println("Digite sua nota do segundo bimestre: ");
        int nota2 = scan.nextInt();

        System.out.println("Digite sua nota do terceiro bimestre: ");
        int nota3 = scan.nextInt();

        System.out.println("Digite sua nota do quarto bimestre: ");
        int nota4 = scan.nextInt();

        System.out.println("Sua média é: " + ((nota1 + nota2 + nota3 + nota4) / 4));
        scan.close();
    }
}
