public class produto {

    public int codigo;
    public String descProduto;
    public float preco;
    public int quantidade;
    public int fechar;

    public int getFechar() {
        return this.fechar;
    }

    public void setFechar(int fechar) {
        this.fechar = fechar;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescProduto() {
        return this.descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void listarDados() {

    }

    @Override
    public String toString() {
        return "\nCodigo: " + this.codigo + "\nDescrição Produto: " + this.descProduto + "\nPreço: " + this.preco
                + "\nQuantidade: " + this.quantidade;

    }

}
