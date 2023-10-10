package JogoCartasRPG.Util.Gerador;

import java.util.Random;


public class GeradorCampo {
    public String terra = "Terra";
    public String agua = "Agua";
    public String ceu = "ceu";
    public String lava = "lava";
    public String floresta = "floresta";
    Random geradorCampo = new Random();
    int camposAleatorios = geradorCampo.nextInt(5) + 1;
    public int campo(){

        if (camposAleatorios == 1) {
            System.out.println("Voce esta no campo da " + terra);
        }
        if (camposAleatorios == 2) {
            System.out.println("Voce esta no campo da " + agua);
        }
        if (camposAleatorios == 3) {
            System.out.println("Voce esta no campo do " + ceu);
        }
        if (camposAleatorios == 4) {
            System.out.println("Voce esta no campo da " + lava);
        }
        if (camposAleatorios == 5) {
            System.out.println("Voce esta no campo da " + floresta);
        }
        return camposAleatorios;


    }
// TESTDE
    public static void main(String[] args) {
        GeradorCampo campo = new GeradorCampo();
        campo.campo();
    }

 }


