package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Juegaso {

    private int cont1 = 0;

    public float pedirNum() {
        float num;
        do {
            String dato = JOptionPane.showInputDialog("Introducir número entre 1-50: ");
            num = Float.parseFloat(dato);
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

    public void jugar() {

        float resp = this.pedirNum();
        int intento = this.intentosMax();
        float num;

        do {
            String dato = JOptionPane.showInputDialog("DALE AHÍ");
            num = Float.parseFloat(dato);
            cont1++;
            if (num < resp) {
                JOptionPane.showMessageDialog(null, "Mas Alto.");
            }
            if (num > resp) {
                JOptionPane.showMessageDialog(null, "Mas Bajo.");
            }
        } while (num != resp && cont1 != intento);

        if (num == resp) {
            JOptionPane.showMessageDialog(null, "WIN");
        }
        if (cont1 == intento) {
            JOptionPane.showMessageDialog(null, "LOSE");
        }
    }
}
