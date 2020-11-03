package m05;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
 
public class Beer extends JFrame {
    private int x;
    private JTextArea text;
 
    public static void main(String[] args) {
        new Beer().setVisible(true);
    }
 
    public Beer() {
        x = 5;
 
        //Mostra un botó que amb el text entre parentesis
        JButton take = new JButton("Take one down, pass it around");
        take.addActionListener(this::onTakeClick); //Al clickar el botó executa la funció onTakeClick()
 
        //Mostra el text en la pestanya
        text = new JTextArea(4, 30);
        text.setText(x + " bottles of beer on the wall\n" + x + " bottles of beer");
        text.setEditable(false);
 
        //Defineix la pestanya que s'obrirà per a mostar les beer que queden
        setLayout(new BorderLayout());
        add(text, BorderLayout.CENTER);
        add(take, BorderLayout.PAGE_END);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
 
    private void onTakeClick(ActionEvent event) {
        //Mostra una nova pestanya amb el text entre parentesis
        JOptionPane.showMessageDialog(null, --x + " bottles of beer on the wall");
        //Modifica el text que es mosta en la primera pestanya oberta
        text.setText(x + " bottles of beer on the wall\n" + x + " bottles of beer");
        //Si no queden beer es tanca a la pestanya
        if (x == 0) {
            dispose();
        }
    }
}