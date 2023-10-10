package JogoCartasRPG.EstudarIdeias;

import javax.swing.*;

public class Swing {


        public static void main(String[] args) {
            // Cria a janela
            JFrame janela = new JFrame("Exemplo de Tela Java");
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setSize(300, 200);

            // Cria um botão
            JButton botao = new JButton("Clique aqui");
            botao.setBounds(100, 70, 100, 30);

            // Adiciona uma ação ao botão
            botao.addActionListener(e -> {
                JOptionPane.showMessageDialog(null, "Você clicou no botão!");
            });

            // Adiciona o botão à janela
            janela.add(botao);

            // Exibe a janela
            janela.setLayout(null);
            janela.setVisible(true);
        }
}
