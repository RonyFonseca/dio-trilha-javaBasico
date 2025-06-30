import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("Não aceitamos que o segundo número seja menor que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo número: "+ (i+1));
        }
    }
}
