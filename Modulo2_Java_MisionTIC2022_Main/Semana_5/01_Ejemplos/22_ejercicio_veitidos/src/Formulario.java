/* Swing - JLabel
 * La clase JLabel nos permite mostrar b�sicamente 
 * un texto.
 *
 * Problema: Confeccionar una ventana que muestre el 
 * nombre de un programa en la parte superior y su n�mero 
 * de versi�n en la parte inferior. No permitir modificar 
 * el tama�o de la ventana en tiempo de ejecuci�n.
 */

import javax.swing.*;
public class Formulario extends JFrame {
    private JLabel label1,label2;
    public Formulario() {
        setLayout(null);
        label1=new JLabel("Sistema de Facturaci�n.");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2=new JLabel("Vesion 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }
    
    public static void main(String[] ar) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,300,200);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
