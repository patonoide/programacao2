package caixa;





public class Conta {

    

        private String agencia;
        private String numerconta;
        private String nomecorrentista;
        private double saldo;
        private boolean ativa;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumerconta() {
        return numerconta;
    }

    public void setNumerconta(String numerconta) {
        this.numerconta = numerconta;
    }

    public String getNomecorrentista() {
        return nomecorrentista;
    }

    public void setNomecorrentista(String nomecorrentista) {
        this.nomecorrentista = nomecorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
        
        
   Conta()
   {
       agencia=null;
       numerconta=null;
       nomecorrentista = null;
       ativa=false;
       saldo=0.0;
       
   }
        
    

    public void Abrir(String vagencia, String vnumero, String vnome) {
        this.agencia= vagencia;
        this.numerconta=vnumero;
        nomecorrentista=vnome;
        saldo=0.0;
        ativa=true;
        
        
       
    }
    Boolean fechar(){
        if (saldo == 0){
                ativa=false;
                
        return true;}
        
        else {
            
            
        return false;
        }
    }
                
   Boolean depositar (double valor){
        if(ativa==true){
            saldo=saldo + valor;
            return true;
            
        }else{
            return false;
        }
    }
    Boolean sacar(double valor){
        if(ativa==true && valor<=saldo){
            saldo=saldo- valor;
            return true;
    }    else{
            return false;
        }}
    double Saldo()
    {       
        return saldo;
    

}
}
            

