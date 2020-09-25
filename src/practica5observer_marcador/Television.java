package practica5observer_marcador;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Television implements Observador {

    @Override
    public void Actualizar(Partido p, String e) {
        ImageIcon icon;
        if ("Real Betis".equals(e)) {
            icon = new ImageIcon(Ventana.class.getResource("/img/betisgol.png"));
        } else {
            icon = new ImageIcon(Ventana.class.getResource("/img/sevillagol.png"));
        }
        JOptionPane.showMessageDialog(
                null,
                "Gol del " + e + "   ---    Marcador: " + p,
                "TELEVISION", JOptionPane.INFORMATION_MESSAGE,
                icon);
    }
}
