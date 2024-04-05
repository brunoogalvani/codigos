import javax.swing.JOptionPane;

public class ExemploFor {
    public static void main(String[] args) {
        double nota1,nota2,nota3;
        for(int contador = 1; contador <= 5;contador = contador + 1);{
            nota1 = Double.parseDouble( JOptionPane.showInputDialog("Digite a Primeira Nota" ));
            nota2 = Double.parseDouble( JOptionPane.showInputDialog("Digite a Segunda Nota" ));
            nota3 = Double.parseDouble( JOptionPane.showInputDialog("Digite a Terceira Nota" ));
            double media = (nota1 + nota2 + nota3)/3;
            JOptionPane.showMessageDialog(null,
                "Media: "+media+(media>=70?"\nAprovado":"\nReprovado" ));
       }   
    }
}
