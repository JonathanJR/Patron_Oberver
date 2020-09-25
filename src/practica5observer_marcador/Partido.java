package practica5observer_marcador;

/**
 *
 * @author Jonathan
 */
public class Partido {

    Equipo local;
    Equipo visitante;
    int totalGoles;

    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
        totalGoles = 0;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getTotalGoles() {
        return local.getGoles() + visitante.getGoles();
    }

    public void setTotalGoles(int totalGoles) {
        this.totalGoles = totalGoles;
    }

    @Override
    public String toString() {
        return local.getNombre() + ": " + local.getGoles() + " - " + visitante.getNombre() + ": " + visitante.getGoles();
    }

}
