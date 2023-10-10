package JogoCartasRPG;

import JogoCartasRPG.Service.BauDeCartasTexto;
import JogoCartasRPG.Service.PlacarN;
import JogoCartasRPG.Service.Regra;
import JogoCartasRPG.Textos.MenuBauDesenho;
import JogoCartasRPG.Util.Player.InteracaoPlayer;

import java.util.Scanner;

/*
 *
 * Menu do jogo, contendo as opcoes do jogo, antes de comecar a GamePlay.
 *
 * */

public class Menu {

    public void teclado() {
        Regra regra = new Regra();
        InteracaoPlayer player = new InteracaoPlayer();
        Scanner teclado = new Scanner(System.in);
        String pressioneTecla = teclado.nextLine();
        BauDeCartasTexto bauDeCartasTexto = new BauDeCartasTexto();
        MenuBauDesenho menuBauDesenho = new MenuBauDesenho();
        Menu menu = new Menu();
        PlacarN placarN = new PlacarN();

        switch (pressioneTecla) {
            case "1":
                player.escolhaUmaCarta();
                break;
            case "2":
                regra.regras();
                break;
            case "3":
                menuBauDesenho.BauDeCartas();
                bauDeCartasTexto.visualizarCartas();
                break;
            case "placar":
                System.out.println("<PLACAR>");
                break;
            case "voltar":
                menu.teclado();
                break;

        }
        while (pressioneTecla.equals("1")) {
            player.escolhaUmaCarta();
//            placarN.rodada();
        }
    }
}