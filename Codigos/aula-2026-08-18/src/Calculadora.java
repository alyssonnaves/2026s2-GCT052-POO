import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // out - saida.  Scanner - entrada
        Scanner input = new Scanner(System.in);

        System.out.println("Digite primeiro valor: ");
        double numero1 = input.nextDouble();
        
        System.out.println("Operacao: ");
        String operacao = input.next();

        System.out.println("Digite segundo valor: ");
        double numero2 = input.nextDouble();

        double resultado = 0;
        // processamento
        if (operacao.equals("+")){
            resultado = numero1+numero2;
        }else if(operacao.equals("-")){
            resultado = numero1-numero2;
        }else if(operacao.equals("*")){
            resultado = numero1*numero2;
        }else if(operacao.equals("/")){
            resultado = numero1/numero2;
        }else{
            System.out.println("operacao invalida");
            return;
        }
        System.out.println("Resultado = " + resultado);
        
    }
}
