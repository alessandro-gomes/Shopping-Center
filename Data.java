public class Data {

    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (verificaValidadeData() == false) {
            System.out.println("ERRO! Data não é válida.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    public boolean verificaValidadeData() {
        int ultimoDiaDoMes = 31;
        boolean resposta;
        
        if (mes > 12) {
            return false;
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                ultimoDiaDoMes--;
                resposta = validaUltimoDiaDoMes(ultimoDiaDoMes);
            } else if (mes == 2) {
                if (verificaAnoBissexto()) {
                    ultimoDiaDoMes -= 2;
                    resposta = validaUltimoDiaDoMes(ultimoDiaDoMes);
                } else {
                    ultimoDiaDoMes -= 3;
                    resposta = validaUltimoDiaDoMes(ultimoDiaDoMes);
                }
            } else {
                resposta = validaUltimoDiaDoMes(ultimoDiaDoMes);
            }
        }
        return resposta;
    }
    
    public boolean validaUltimoDiaDoMes(int ultimoDiaDoMes) {
        if (dia > ultimoDiaDoMes) {
            return false;
        } else {
            return true;
        }
    }
    
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
}