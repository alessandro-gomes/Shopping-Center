public class Vestuario extends Loja {
    
    private boolean produtosImportados;
    
    
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
    }
    
    public String toString() {
        return super.toString() + "\nProdutos importados: " + produtosImportados;
    }
    
    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    
}