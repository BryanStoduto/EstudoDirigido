import java.util.Scanner;
import java.util.ArrayList;

public class carrinho {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        produto P = new produto();

        ArrayList<produto> itens = new ArrayList<>();

        System.out.println("######## Cadastro de Produtos ########");

        do {
            System.out.println("Digite o codigo do produto: ");
            P.setCodigo(ler.nextInt());

            System.out.println("Descrição do produto: ");
            P.setDescProduto(ler.nextLine());
            P.setDescProduto(ler.nextLine());

            System.out.println("Preço do Produto: ");
            P.setPreco(ler.nextFloat());

            System.out.println("Digite a quantidade: ");
            P.setQuantidade(ler.nextInt());

            System.out.println("(0) para fechar (1) para continuar: ");
            P.setFechar(ler.nextInt());

            itens.add(P);

        } while (P.getFechar() != 0);

        System.out.println(itens);

    }
}
