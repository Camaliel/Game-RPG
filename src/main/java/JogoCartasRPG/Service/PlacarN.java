package JogoCartasRPG.Service;

import JogoCartasRPG.Elementos;

public class PlacarN {

    private static String eJogador;
    private static String eCpu;

    private static int placarPlayer1;

    public static int getPlacarPlayer1() {
        return placarPlayer1;
    }


    private static int placarCpu;


    public static void setPlacarPlayer1(int placarPlayer1) {
        PlacarN.placarPlayer1 = placarPlayer1;
    }

    public static int getPlacarCpu() {
        return placarCpu;
    }

    public static void setPlacarCpu(int placarCpu) {
        PlacarN.placarCpu = placarCpu;
    }

    public static String geteJogador() {
        return eJogador;
    }

    public static void seteJogador(String eJogador) {
        PlacarN.eJogador = eJogador;
    }

    public static String geteCpu() {
        return eCpu;
    }

    public static void seteCpu(String eCpu) {
        PlacarN.eCpu = eCpu;
    }



    // TODO PLACAR ARRUMADO ...

    /*
     *   Funcionalidade do placar, funciona de acordo com o resultado,
     *   Cada rodada vale uma estrela "*", quando um player completar 3 estrelas "**" -> na terceira estrela
     *   não adiciona a terceira estrelas, em vez disso adiciona um ponto ao placar, tendo assim 3 Rounds com uma vitoria
     *
     * */
    public void rodada() {

        // VOCE GANHOU

        if (Elementos.getPlayer1().equalsIgnoreCase("agua") &&
                Elementos.getCPU().equalsIgnoreCase("fogo")) {
            System.out.println("                                   WINNER");
            System.out.println("");

            if (geteJogador() == null) {
                seteJogador("*");
            } else if (geteJogador().equals("*")) {
                seteJogador("**");
            } else {
                seteJogador("***");
            }
            if (geteJogador().contains("***")) {
                int i = getPlacarPlayer1();
                setPlacarPlayer1(++i);
                seteJogador(null);
                seteCpu(null);
            }

        }
        if (Elementos.getPlayer1().equalsIgnoreCase("fogo") &&
                Elementos.getCPU().equalsIgnoreCase("gelo")) {
            System.out.println("                                   WINNER");
            System.out.println("");
            if (geteJogador() == null) {
                seteJogador("*");
            } else if (geteJogador().equals("*")) {
                seteJogador("**");
            } else {
                seteJogador("***");
            }
            if (geteJogador().contains("***")) {
                int i = getPlacarPlayer1();
                setPlacarPlayer1(++i);

                if (geteJogador().contains("***")) {
                    seteJogador(null);
                    seteCpu(null);
                }

            }


        }

        if (Elementos.getPlayer1().equalsIgnoreCase("terra") &&
                Elementos.getCPU().equalsIgnoreCase("fogo")) {
            System.out.println("                                   WINNER");
            System.out.println("");
            if (geteJogador() == null) {
                seteJogador("*");
            } else if (geteJogador().equals("*")) {
                seteJogador("**");
            } else {
                seteJogador("***");
            }
            if (geteJogador().contains("***")) {
                int i = getPlacarPlayer1();
                setPlacarPlayer1(++i);
                if (geteJogador().contains("***")) {
                    seteJogador(null);
                    seteCpu(null);
                }
            }


        }
        if (Elementos.getPlayer1().toLowerCase().equalsIgnoreCase("agua") &&
                Elementos.getCPU().equalsIgnoreCase("GELO")) {
            System.out.println("                                   WINNER");
            System.out.println("");
            if (geteJogador() == null) {
                seteJogador("*");
            } else if (geteJogador().equals("*")) {
                seteJogador("**");
            } else {
                seteJogador("***");
            }
            if (geteJogador().contains("***")) {
                int i = getPlacarPlayer1();
                setPlacarPlayer1(++i);
                if (geteJogador().equals("***")) {
                    seteJogador(null);
                    seteCpu(null);
                }
            }

        }


        // EMPATE
        if (Elementos.getPlayer1().toLowerCase().equalsIgnoreCase("agua") &&
                Elementos.getCPU().toLowerCase().equalsIgnoreCase("agua")) {
            System.out.println("                                   EMPATE");
            System.out.println("");
        }
        if (Elementos.getPlayer1().toLowerCase().equalsIgnoreCase("fogo") &&
                Elementos.getCPU().toLowerCase().equalsIgnoreCase("fogo")) {
            System.out.println("                                   EMPATE");
            System.out.println("");
        }
        if (Elementos.getPlayer1().toLowerCase().equalsIgnoreCase("gelo") &&
                Elementos.getCPU().toLowerCase().equalsIgnoreCase("gelo")) {
            System.out.println("                                   EMPATE");
            System.out.println("");
        }
        if (Elementos.getPlayer1().toLowerCase().equalsIgnoreCase("terra") &&
                Elementos.getCPU().toLowerCase().equalsIgnoreCase("terra")) {
            System.out.println("                                   EMPATE");
            System.out.println("");
        }


        // SEM EFEITO

        if (Elementos.getPlayer1().toLowerCase().equalsIgnoreCase("gelo") &&
                Elementos.getCPU().toLowerCase().equalsIgnoreCase("terra")) {
            System.out.println("                                   SEM EFEITO");
            System.out.println("");
        }
        if (Elementos.getPlayer1().toLowerCase().equalsIgnoreCase("terra") &&
                Elementos.getCPU().toLowerCase().equalsIgnoreCase("gelo")) {
            System.out.println("                                   SEM EFEITO");
            System.out.println("");
        }

        // VOCE PERDEU
        if (Elementos.getCPU().toLowerCase().equalsIgnoreCase("agua") &&
                Elementos.getPlayer1().toLowerCase().equalsIgnoreCase("fogo")) {
            System.out.println("                                  YOU LOOSE");
            System.out.println("");
            if (geteCpu() == null) {
                seteCpu("*");
            } else if (geteCpu().equals("*")) {
                seteCpu("**");
            } else {
                seteCpu("***");
            }
            if (geteCpu().contains("***")) {
                int i = getPlacarCpu();
                setPlacarCpu(++i);
            }
            if (geteCpu().contains("***")) {
                seteCpu(null);
                seteJogador(null);
            }
        }
        if (Elementos.getCPU().equalsIgnoreCase("fogo") &&
                Elementos.getCPU().toLowerCase().equalsIgnoreCase("GELO")) {
            System.out.println("                                    YOU LOOSE");
            System.out.println("");
            if (geteCpu() == null) {
                seteCpu("*");
            } else if (geteCpu().equals("*")) {
                seteCpu("**");
            } else {
                seteCpu("***");
            }
            if (geteCpu().contains("***")) {
                int i = getPlacarCpu();
                setPlacarCpu(++i);
            }
            if (geteCpu().contains("***")) {
                seteCpu(null);
                seteJogador(null);
            }


        }

    }
}

