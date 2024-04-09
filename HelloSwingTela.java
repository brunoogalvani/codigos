import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwingTela {
    public static void criarTela() {
        JFrame tela = new JFrame("Hello, Swing!!!");
        // destrói o objeto quando fecha a janela
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // constrói um JLabel
        JLabel helloSwingLabel = new JLabel("Hello, Swing!");
        // obtém o painel de conteúdo
        Container painel = tela.getContentPane();
        // adiciona o JLabel ao painel de conteúdo
        painel.add(helloSwingLabel);
        // ajusta automaticamente a altura e a largura para o necessário para exibir o conteúdo
        tela.pack();
        // torna a tela visível
        tela.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
            criarTela();
        });
    }
}