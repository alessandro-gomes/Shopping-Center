public class Bijuteria extends Loja {
    
    private double metaVendas;
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }
    
    public String toString() {
        return super.toString() + "\nMeta de vendas: R$ " + metaVendas;
    }
    
    public double getMetaVendas() {
        return metaVendas;
    }
    
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
}