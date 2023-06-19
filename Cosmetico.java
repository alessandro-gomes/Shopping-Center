public class Cosmetico extends Loja {
    
    private double taxaComercializacao;
    
    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public String toString(){
        return super.toString() + "\nTaxa de comercialização: " + taxaComercializacao;
    }
    
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
    
}