package JogoCartasRPG.Service;

import JogoCartasRPG.Elementos;
import JogoCartasRPG.Menu;

import java.util.Scanner;

public class Regra {
    Elementos elementos = new Elementos();

    public void regras() {
        System.out.println("-----------------------------------");
        System.out.println(" 1- FOGO -> A carta de fogo nao apaga agua");
        System.out.println(" 2- GELO -> Esta carta nao congela fogo");
        System.out.println(" 3- AGUA -> Esta carta nao derrete gelo");
        System.out.println(" 4- TERRA -> Esta carta pode ser combinada");
        System.out.println(" 5- combinar -> comando usado para combinar");
        System.out.println("------------------------------------------------");
    }

    public void teclado() {
        Menu teste = new Menu();
        Scanner ler = new Scanner(System.in);
        String teclado = ler.nextLine();
        switch (teclado) {
            case "voltar":

        }
    }
}





