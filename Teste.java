package view;

import helper.Utils;
import model.Cliente;
import model.Conta;


public class Teste {
    public static void main(String[] args) {
        
    Cliente pablo = new Cliente(
        "Pablo Maia",
        "pablo@gmail.com",
        "123.456.789.01",
        Utils.stringParaData("17/05/1981")
        );

    Cliente mariana = new Cliente(
            "Mariana Alves",
            "mariana@gmail.com",
            "234.567.890.12",
            Utils.stringParaData("23/02/1978")
        );

        // System.out.println(pablo);
        // System.out.println();
        // System.out.println(mariana);

        Conta c101 = new Conta(pablo);
        Conta c102 = new Conta(mariana);

        //Depositando um valor positivo
        c101.depositar(500.00);
        c102.depositar(500.00);

        c101.setlimite(200.0);
        // c101.sacar(600.0);

        c101.transferir(c102, 100.0);

        System.out.println(c101);
        System.out.println();
        System.out.println(c102);
    }
}
