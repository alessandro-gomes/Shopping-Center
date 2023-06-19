public class Alimentacao extends Loja {
    
    Data dataAlvara;
    
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }
    
    public String toString() {
        return super.toString() + "\nData alvará: " + dataAlvara;
    }
    
    public Data getDataAlvara() {
        return dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
    
}