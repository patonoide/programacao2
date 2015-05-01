
package caixa;

import javax.swing.JOptionPane;


public class Caixa {

    
    public static void main(String[] args) {
       Integer opcao=-1;
       Conta conta=new Conta();
       Banco banco=new Banco();
       while(opcao!=0)
       {
           opcao=Integer.parseInt(JOptionPane.showInputDialog("CAIXA ElETRÔNICO \n opcões \n 1 abrir conta \n 2 depositar \n 3 sacar \n 4 consultar saldo \n 5 fechar conta \n 6 verificar banco\n 7 resumo da conta\n 0 sair"));
           if (opcao==1){
               conta.Abrir(JOptionPane.showInputDialog("digite o numero da agencia"), JOptionPane.showInputDialog("digite o numero da conta"), JOptionPane.showInputDialog("digite o nome do correntista"));
               
           }else if(opcao==2){
               
             double valor=Double.parseDouble (JOptionPane.showInputDialog("digite o valor que deseja depositar:"));
             Boolean ret=conta.depositar(valor);
             if (ret==true){
                     JOptionPane.showMessageDialog(null, "deposito feito com sucesso");
                             }else JOptionPane.showMessageDialog(null, "aocnteceu algum erro");
             
           }else if (opcao==3){
            double valor=Double.parseDouble (JOptionPane.showInputDialog("digite o valor que deseja sacar:"));
            Boolean ret2=conta.sacar(valor);
            if(ret2==true)
            {
                JOptionPane.showMessageDialog(null, "saque feito com sucesso");
            }else
                JOptionPane.showMessageDialog(null, "aconteceu algo errado");
            
           }else if (opcao==4){
           JOptionPane.showMessageDialog(null, conta.Saldo());
           }else if (opcao==5){
            Boolean ret3=conta.fechar();
               if(ret3 ==true)
                   JOptionPane.showMessageDialog(null, "conta fechada  com sucesso");
               else JOptionPane.showMessageDialog(null,"conta não pode ser fechada");
               
               
           }else if (opcao==6){
              String vnumero=JOptionPane.showInputDialog("digite o numero do banco");
               banco.buscarBanco(vnumero);
               JOptionPane.showMessageDialog(null, banco.nomebanco);
           }else if (opcao==7){
               JOptionPane.showMessageDialog(null, "resumo da conta"+"\nnumero da conta: " + conta.getNumerconta() +"\nnome do correntista: "+ conta.getNomecorrentista()+"\nnumero da agencia:"+conta.getAgencia()+"\nsaldo:" + conta.getSaldo());
               
               
           }
       }
       
      
    
    
}}
