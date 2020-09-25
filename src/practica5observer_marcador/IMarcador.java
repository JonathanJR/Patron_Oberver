package practica5observer_marcador;

/**
 *
 * @author Jonathan
 */
public interface IMarcador {

    public void anotarGol(Equipo e); //Equipo local o equipo visitante

    public void AgregarObservador(Observador o);

    public void EliminarObservador(Observador o);

    public void NotificarObservadores();
}
