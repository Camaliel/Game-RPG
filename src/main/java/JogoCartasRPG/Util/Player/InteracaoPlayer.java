package JogoCartasRPG.Util.Player;

import JogoCartasRPG.Elementos;
import JogoCartasRPG.Menu;
import JogoCartasRPG.Service.BauDeCartasTexto;
import JogoCartasRPG.Service.PlacarN;
import JogoCartasRPG.Util.Gerador.GeradorCpu;

import java.util.Random;
import java.util.Scanner;

public class InteracaoPlayer {

    GeradorCpu cpu = new GeradorCpu();
    public Scanner escolhaCarta = new Scanner(System.in);
    PlacarN teste = new PlacarN();

    /*
     * Este metodo faz parte da visualizacao na tela.
     * Deve ficar assim para melhor visualizacao do usuario!!!
     *
     * */

    public Boolean escolhaUmaCarta() {
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

        System.out.println("====================== [ player " + PlacarN.getPlacarPlayer1() + " ] [ Oponente " +
                PlacarN.getPlacarCpu() + " ] ============================");
        // ESTRELA DE PONTOS
        System.out.println("[" + PlacarN.geteJogador() + "]                                                                " +
                "   [" + PlacarN.geteCpu() + "]");
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        System.out.print("DIGITE UM NUMERO: ");
        String numero = escolhaCarta.nextLine();
        Menu menu = new Menu();
        BauDeCartasTexto bauTexto = new BauDeCartasTexto();
        PlacarN placarN = new PlacarN();


        Random cpu = new Random();
        int cartaGerada = cpu.nextInt(5) + 1;

        if (cartaGerada == 1) {
            Elementos.setCPU("AGUA");
        }
        if (cartaGerada == 2) {
            Elementos.setCPU("FOGO");
        }
        if (cartaGerada == 3) {
            Elementos.setCPU("GELO");
        }
        if (cartaGerada == 4) {
            Elementos.setCPU("TERRA");
        }
        // TESTAR UM IF PARA VER SE RESOLVE O PROBLEMA ... EM TODAS AS TELAS ELE VOLTA PRA CÁ ...
        // PODE RESOLVER TESTAR UM TRY, OU UM ERR. SYSTEM COISA ASSIM NO SYSTEM.ERR.PRINT <= ACHO QUE É ISSO ...ISSO VAI PRINTAR O ERRO NA TELA
//        if (Elementos.getPlayer1().equals("1") || Elementos.getPlayer1().equals("2") || Elementos.getPlayer1().equals("3")
//                || Elementos.getPlayer1().equals("4") || Elementos.getPlayer1().equals("voltar")) {
        switch (numero) {
            case "1":
                Elementos.setPlayer1("agua");
                System.out.println("");
                System.out.println("                    Voce usou o " + Elementos.getAgua() + " X " + "CPU usou " + Elementos.getCPU());
                System.out.println("");
                placarN.rodada();
                break;
            case "2":
                Elementos.setPlayer1("fogo");
                System.out.println("");
                System.out.println("                    Voce usou o " + Elementos.getFogo() + " X " + "CPU usou " + Elementos.getCPU());
                System.out.println("");
                placarN.rodada();
                break;
            case "3":
                System.out.println("");
                Elementos.setPlayer1("gelo");
                System.out.println("                    Voce usou o " + Elementos.getGelo() + " X " + "CPU usou " + Elementos.getCPU());
                System.out.println("");
                placarN.rodada();
                break;
            case "4":
                System.out.println("");
                Elementos.setPlayer1("terra");
                System.out.println("                     Voce usou o " + Elementos.getTerra() + " X " + "CPU usou " + Elementos.getCPU());
                System.out.println("");
                placarN.rodada();
                break;
            case "voltar":
                System.out.println("");
                bauTexto.bauTeclado(); // TODO VER PRA ONDE VOLTAR

        }
        return true;

    }

}

