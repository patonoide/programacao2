
package caixa;

public class Banco {
    String numerobanco;
    String nomebanco;
    
   void buscarBanco(String vnumero){
        switch (vnumero) {
            case "001":
                numerobanco=vnumero;
                nomebanco=("Banco do Brasil");
                break;
            case "047":
                numerobanco=vnumero;
                nomebanco=("Banco do Estado de Sergipe");
                break;
            case "037":
                numerobanco=vnumero;
                nomebanco=("Banco do EStado do Pará");
                break;
            case "041":
                numerobanco=vnumero;
                nomebanco=("Banco do Estado do Rio Grande do Sul");
                break;
            case "004":
                numerobanco=vnumero;
                nomebanco=("Banco do Nordeste do Brasil");
                break;
            default:
                nomebanco=("opcao invalida");
        }
        
   }
           
   }
    

    

