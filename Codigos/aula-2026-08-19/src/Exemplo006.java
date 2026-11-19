import java.util.Scanner;

public class Exemplo006 {
    public static int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("0- Sair");
        System.out.println("Opcao: ");
        int opcao = input.nextInt();
        return opcao;
    }

    public static void main(String[] args) {
        int op;
        do {
            op = menu();

        } while (op!=0);

    }
}
