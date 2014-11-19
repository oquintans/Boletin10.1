package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Juegaso {

    private int cont1 = 0;

    public int pedirNum() {
        int num;
        do {
            String dato = JOptionPane.showInputDialog("Introducir número entre 1-50: ");
            num = Integer.parseInt(dato);
        } while (num < 1 || num > 50);
        return num;
    }

    public int intentosMax() {
        int num;
        do {
            String dato = JOptionPane.showInputDialog("Introducir número de intentos: ");
            num = Integer.parseInt(dato);
        } while (num <= 0);
        return num;
    }

    public int validarInt() {
        int num;
        do {
            String dato = JOptionPane.showInputDialog("DALE AHÍ");
            num = Integer.parseInt(dato);
        } while (num < 1 || num > 50);
        return num;
    }

    public String jugar() {

        int num;
        int cont;
        int resp = this.pedirNum();
        int intento = this.intentosMax();

        
        String dato = JOptionPane.showInputDialog("DALE AHÍ");
        num = Integer.parseInt(dato);

        for (cont = 1; cont < intento && num != resp; cont++) {
            if (num < resp) {
                JOptionPane.showMessageDialog(null, "Mas Alto.");
            }
            if (num > resp) {
                JOptionPane.showMessageDialog(null, "Mas Bajo.");
            }
            do {
                String dato2 = JOptionPane.showInputDialog("DALE AHÍ\nIntentos: " + (intento - cont));
                num = Integer.parseInt(dato2);
            } while (num > 50 || num < 0);

        }

        if (num == resp) {
            JOptionPane.showMessageDialog(null, "WIN");
        }
        if (cont1 == intento) {
            JOptionPane.showMessageDialog(null, "LOSE");
        }
        
        String end=JOptionPane.showInputDialog("PLAY AGAIN?");
        
        return end;
    }
}
