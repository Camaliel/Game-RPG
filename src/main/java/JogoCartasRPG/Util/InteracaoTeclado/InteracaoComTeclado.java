package JogoCartasRPG.Util.InteracaoTeclado;

import JogoCartasRPG.Menu;
import JogoCartasRPG.Service.BauDeCartasTexto;
import JogoCartasRPG.Service.Regra;
import JogoCartasRPG.Textos.MenuBauDesenho;

import java.util.Scanner;

public class InteracaoComTeclado {
    public void Menu() {
        BauDeCartasTexto bauDeCartasTexto = new BauDeCartasTexto();
        MenuBauDesenho menuBauDesenho = new MenuBauDesenho();
        InteracaoComTeclado interacaoComTeclado = new InteracaoComTeclado();
        Regra regra = new Regra();
        Menu menuTeste = new Menu();

        // Interacao com o teclado
        Scanner menu = new Scanner(System.in);
        String numero = menu.nextLine();
        switch (numero) {
            case "1":
                System.out.println("                                INICIANDO JOGO");
                break;
            case "2":
                System.out.println("                                REGRAS DO JOGO ...");
                regra.regras();
                break;
            case "3":

                break;
            case "voltar":
//                interacaoComTeclado.Menu();


                System.out.println("-                              Voltar");
        }
    }
}
