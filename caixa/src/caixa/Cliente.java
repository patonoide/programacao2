
package caixa;


public class Cliente {
  private long cpf;
  private String  data;
  private String endereco;
  private Boolean spc;
  private Boolean serasa;
  private String pai;
  private String mae;
  private String correntista;

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }
  
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Boolean getNegativadosspc() {
        return spc;
    }

    public void setNegativadosspc(Boolean negativadosspc) {
        this.spc = negativadosspc;
    }

    public Boolean getNegativadosserasa() {
        return serasa;
    }

    public void setNegativadosserasa(Boolean negativadosserasa) {
        this.serasa = negativadosserasa;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }
  

public Boolean verificaCredito(){

Boolean retorno;
retorno = this.spc ==  false && this.serasa==false;
return retorno;
}
}