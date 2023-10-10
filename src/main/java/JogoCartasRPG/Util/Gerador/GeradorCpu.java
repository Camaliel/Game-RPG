package JogoCartasRPG.Util.Gerador;

import JogoCartasRPG.Elementos;

import java.util.Random;

public class GeradorCpu {

    public int Cpu() {
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

        return cartaGerada;
    }
}
