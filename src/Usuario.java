public class Usuario {
    private String nome;
    private Produto[] produtos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public String visualizaProdutos(Produto[] produtos) {
        String retorno = "";

        for (int i = 0; i < produtos.length; i++) {
            retorno = retorno + ("Produto" + (i+1) + "(" + produtos[i].getNome() + ") " + ": " + String.valueOf(produtos[i].getPreco() + " / "));
        }

        return retorno;
    }

    public String precoFinal(Produto[] produtos) {
        String retorno = "";

        float precoFinal = 0;

        for (int i = 0; i < produtos.length; i++) {
             precoFinal = precoFinal + produtos[i].getPreco();
        }

        retorno = "Preço final: " + String.valueOf(precoFinal);

        return retorno;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + "}";
    }
}
