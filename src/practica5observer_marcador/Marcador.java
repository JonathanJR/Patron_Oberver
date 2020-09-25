package practica5observer_marcador;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class Marcador implements IMarcador {

    private ArrayList<Observador> observadores;
    private Partido partido;
    String equipoQueHaMarcado;

    public Marcador(Partido partido) {
        observadores = new ArrayList<>();
        this.partido = partido;
    }

    @Override
    public void anotarGol(Equipo e) {
        e.setGoles(e.getGoles() + 1);
        equipoQueHaMarcado = e.getNombre();
    }

    @Override
    public void AgregarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void EliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void NotificarObservadores() {
        observadores.forEach((o) -> {
            o.Actualizar(partido, equipoQueHaMarcado);
        });
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Marcador{" + "Local:" + partido.local.getGoles() + ", Visitante: " + partido.visitante.getGoles() + '}';
    }

}
