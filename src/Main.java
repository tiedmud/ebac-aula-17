import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Boas-vindas! ");

        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario();
        usuario.setNome("Fulano");

        System.out.printf("Digite a quantidade de produtos desejados: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Produto[] produtosUsuario = new Produto[quantidade];
        int produtoEscolhido = 0;

        for (int i = 0; i < (quantidade); i++) {
            produtosUsuario[i] = new Produto();

            System.out.printf("Digite o produto / 1.Televisão - 2.Rádio - 3.Videogame - 4.Tablet - 5.Celular - 6.Finalizar: ");
            produtoEscolhido = scanner.nextInt();
            scanner.nextLine();

            switch (produtoEscolhido) {
                case 1:
                    produtosUsuario[i].setNome(TipoProduto.TELEVISÃO.getDescricao());
                    produtosUsuario[i].setPreco(Float.parseFloat(TipoProduto.TELEVISÃO_PREÇO.getDescricao()));
                    break;
                case 2:
                    produtosUsuario[i].setNome(TipoProduto.RÁDIO.getDescricao());
                    produtosUsuario[i].setPreco(Float.parseFloat(TipoProduto.RÁDIO_PREÇO.getDescricao()));
                    break;
                case 3:
                    produtosUsuario[i].setNome(TipoProduto.VIDEOGAME.getDescricao());
                    produtosUsuario[i].setPreco(Float.parseFloat(TipoProduto.VIDEOGAME_PREÇO.getDescricao()));
                    break;
                case 4:
                    produtosUsuario[i].setNome(TipoProduto.TABLET.getDescricao());
                    produtosUsuario[i].setPreco(Float.parseFloat(TipoProduto.TABLET_PREÇO.getDescricao()));
                    break;
                case 5:
                    produtosUsuario[i].setNome(TipoProduto.CELULAR.getDescricao());
                    produtosUsuario[i].setPreco(Float.parseFloat(TipoProduto.CELULAR_PREÇO.getDescricao()));
                    break;
                case 6:
                    System.out.printf("Obrigado pelas compras! ");
                    break;
                default:
                    System.out.printf("Opção inválida! ");
                    break;
            }
        }

        usuario.setProdutos(produtosUsuario);

        System.out.printf("Usuário: " + usuario.toString() + " / ");
        System.out.printf("Lista de produtos: " + usuario.visualizaProdutos(produtosUsuario));
        System.out.printf(usuario.precoFinal(produtosUsuario));

        scanner.close();
    }
}