package tiposprimitivos;

import java.util.Scanner;

/**
 * @since 05/11/2023
 * @version 1.0
 * @author myckazs
 */

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipagem de Código JAVA (Inteiros, Reais, Literais, Lógicos)
        
        //Usando saída de dados:
        float media = 8.5f; //Ou usando o TypeCast: float nota = (float) 8.5;
        double nota = 6.3f;
        int idade = (int) 10; // Usando TypeCast
        long diciplinas = (long) 30;
        char sexualidade = (char) 'M';
        String nome = ("Myckael");
        
        //Escreva "sout + tab" -> atalho para = System.out.println();
        System.out.println("==== Cadastro ==== \n"); //O "println" -> Quebra Linha 
        System.out.printf("Media: %.2f \n", media); //O "printf" -> Formata. Necessário para colocar %
        System.out.printf("Maior: Nota: %.2f \n", nota); // \n -> quebra de linha
        System.out.format("Idade: %d \n", idade); //O ".format" -> mesma coisa que "printf"
        System.out.println("Quantidade de Diciplinas " + diciplinas);
        System.out.println("Sexualidade: " + sexualidade);
        System.out.printf("Nome: %s \n", nome); // O %s -> para String. %d -> para int. %.2f -> para float
        System.out.println("\n================== \n");
        
        //Usando Entrada de dados:
        //Java n tem, precisa de uma Biblioteca chamada Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Pai: ");
        String pai = teclado.nextLine();
        System.out.println("Digite o nome do Mãe: ");
        String mae = teclado.nextLine();
        
    }
    
}