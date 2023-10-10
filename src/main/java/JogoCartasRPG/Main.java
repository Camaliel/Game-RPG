package JogoCartasRPG;

import JogoCartasRPG.Service.BauDeCartasTexto;
import JogoCartasRPG.Textos.MenuBemVindoDesenho;

public class Main {
    public static void main(String[] args) {


        MenuBemVindoDesenho menuBemVindoDesenho = new MenuBemVindoDesenho();
        Menu menu = new Menu();
        BauDeCartasTexto bauDeCartasTexto = new BauDeCartasTexto();


        menuBemVindoDesenho.textoMenu();
        menu.teclado();
        bauDeCartasTexto.opcoes();

    }
}