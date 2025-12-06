public enum TipoProduto {
    TELEVISÃO("TELEVISÃO"),
    TELEVISÃO_PREÇO("3000"),
    RÁDIO("RÁDIO"),
    RÁDIO_PREÇO("300"),
    VIDEOGAME("VIDEOGAME"),
    VIDEOGAME_PREÇO("5000"),
    TABLET("TABLET"),
    TABLET_PREÇO("2000"),
    CELULAR("CELULAR"),
    CELULAR_PREÇO("2000");

    private String descricao;

    TipoProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
