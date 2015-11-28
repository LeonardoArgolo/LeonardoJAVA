import java.util.Scanner;
import java.util.Random;

public class Caixa {
    
    
    public static void main(String[] args){
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
    
        System.out.println("Cadastrando novo cliente.");
        System.out.print("Digite o nome do clientee: ");
        nome = entrada.nextLine();
        
        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();
        
        //Criando a conta de um cliente
        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
    }
    
    
}
