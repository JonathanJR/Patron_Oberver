package practica5observer_marcador;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Online implements Observador {

    @Override
    public void Actualizar(Partido p, String e) {
        JOptionPane.showMessageDialog(
                null,
                "Marcador: " + p,
                "ONLINE", JOptionPane.INFORMATION_MESSAGE,
                null);
    }
}
