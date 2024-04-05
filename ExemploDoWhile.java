import javax.swing.JOptionPane;

public class ExemploDoWhile {
    public static void main(String[] args) {
        int menu;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("1- Bom dia\n2- Boa tarde\n3- Boa noite\n4- Sair"));
            switch(menu){
                case 1:
                    JOptionPane.showMessageDialog(null, "Bom dia");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Boa tarde");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Boa noite");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Tchau");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while(menu != 4);
    }
}
