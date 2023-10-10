package JogoCartasRPG;

public class Elementos {
    private static String fogo = "Fogo 🔥 ";

    private static String gelo = "Gelo 🧊";

    private static String agua = "Agua 🌊";

    private static String terra = "Terra";

    private static String vidro = "vidro";



    static String player1 = "";
    static String CPU = "";
    static String CPU2 = "";
    static String CPU3 = "";

    public static String getCPU2() {
        return CPU2;
    }

    public static void setCPU2(String CPU2) {
        Elementos.CPU2 = CPU2;
    }

    public static String getCPU3() {
        return CPU3;
    }

    public static void setCPU3(String CPU3) {
        Elementos.CPU3 = CPU3;
    }

    public static String getCPU4() {
        return CPU4;
    }

    public static void setCPU4(String CPU4) {
        Elementos.CPU4 = CPU4;
    }

    static String CPU4 = "";

    public static String getPlayer1() {
        return player1;
    }

    public static boolean setPlayer1(String player1) {
        Elementos.player1 = player1;
        return true;
    }

    public static String getCPU() {
        return CPU;
    }

    public static String setCPU(String CPU) {
        Elementos.CPU = CPU;
        return CPU;
    }

    public static String getFogo() {
        return fogo;
    }

    public static void setFogo(String fogo) {
        Elementos.fogo = fogo;
    }

    public static String getGelo() {
        return gelo;
    }

    public static void setGelo(String gelo) {
        Elementos.gelo = gelo;
    }

    public static String getAgua() {
        return agua;
    }

    public static void setAgua(String agua) {
        Elementos.agua = agua;
    }

    public static String getTerra() {
        return terra;
    }

    public static void setTerra(String terra) {
        Elementos.terra = terra;
    }

    public static String getVidro() {
        return vidro;
    }

    public static void setVidro(String vidro) {
        Elementos.vidro = vidro;
    }


}
