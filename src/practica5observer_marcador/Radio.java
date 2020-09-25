package practica5observer_marcador;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Radio implements Observador {

    @Override
    public void Actualizar(Partido p, String e) {
        JOptionPane.showMessageDialog(
                null,
                "Goooooooooooooooooooool del " + e + "    |||||   " + p,
                "RADIO", JOptionPane.INFORMATION_MESSAGE,
                null);
    }

}
