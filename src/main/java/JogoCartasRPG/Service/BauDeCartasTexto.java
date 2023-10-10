package JogoCartasRPG.Service;

import JogoCartasRPG.Menu;
import JogoCartasRPG.Textos.MenuBemVindoDesenho;
import JogoCartasRPG.Util.InteracaoTeclado.InteracaoComTeclado;
import JogoCartasRPG.Util.Player.InteracaoPlayer;

import java.util.*;

public class BauDeCartasTexto {

    public ArrayList<String> list = new ArrayList<String>();
    private static String raio = "Raio";
    private static String vento = "vento";
    private static String lava = "lava";
    private static String grama = "grama";

    Menu menu = new Menu();

    public boolean bauTeclado() {

        Scanner teclado = new Scanner(System.in);
        String interacao = teclado.nextLine();
        InteracaoComTeclado interacaoComTeclado = new InteracaoComTeclado();
        MenuBemVindoDesenho menuBemVindoDesenho = new MenuBemVindoDesenho();

        switch (interacao) {
            case "voltar":
                System.out.println(" ");
                break;
            case "1":
                System.out.println("CARTAS ADQUIRIDAS");
                break;
            case "2":
                System.out.println("VISUALIZE SUAS CARTAS");
                visualizarCartas();
                break;
            case "3":
                System.out.println("CARTAS");
//                teclasBAU();
                break;
            case "teste":
                menuBemVindoDesenho.textoMenu();
                menu.teclado();
                break;
            case "todos":
                System.out.println("TO AQUI ");
                visualizarCartas();
                break;
            case "fogo":
                System.out.println(visualizarCartas().get("fogo"));
                break;
            case "agua":
                System.out.println(visualizarCartas().get("agua"));
                break;
            case "vento":
                System.out.println(visualizarCartas().get("vento"));
                break;
            case "rocha":
                System.out.println(visualizarCartas().get("rocha"));
                break;
            case "areia":
                System.out.println(visualizarCartas().get("areia"));
                break;
            case "tudo":
                System.out.println(visualizarCartas().keySet());
                break;
        }

        return true;

    }

    /*
     *
     * LISTAR CARTAS TODAS AS CARTAS.
     * LISTAR CADA CARTA INDIVIDUALMENTE COM DESCRIÇÕES.
     * <ACHO QUE TA FALTANDO, INVESTIGAR O QUE É !!!!>
     *
     * */
    public Map<String, String> visualizarCartas() {
        Menu menu = new Menu();
        InteracaoPlayer player = new InteracaoPlayer();
        InteracaoComTeclado interacaoComTeclado = new InteracaoComTeclado();

        Menu texto = new Menu();
        MenuBemVindoDesenho menuBemVindoDesenho = new MenuBemVindoDesenho();

        Map<String, String> cartas = new HashMap<>();
        cartas.put("fogo", "CARTAS DE FOGO, GERALMENTE SAO FRACAS CONTRA AGUA!! ");
        cartas.put("agua", "PODE SER COMBINADA COM OUTRAS CARTAS");
        cartas.put("vento", "PODE SER COMBINADA PARA CRIAR NOVAS FUNCIONALIDADES");
        cartas.put("rocha", "ROCHA É APENAS ROXA, ATE SER COMBINADA");
        cartas.put("areia", "AREIA PODE PODE SER COMBINADA COM OUTROS ELEMENTOS  ");
        for (String entrada : cartas.keySet()) ;

        return cartas;
    }

    public void opcoes() {

        // FAZER UM IF PARA NAO EXECUTAR CADA SIM MAS SE EM UMA CONDICAO ESPECIFICA.

        while (bauTeclado()) {
            System.out.println(" ");
            System.out.println("SUAS OPCOES: ");
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        BauDeCartasTexto bauDeCartasTexto = new BauDeCartasTexto();
        bauDeCartasTexto.opcoes();

    }
}

