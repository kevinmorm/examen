package iTicket.com.entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Concierto")
public class Concierto implements Serializable {
    @Id
    private int id;
    private String artista;
    private int costo;
    private String fecha;
    private int capacidadMax;
    private String lugar;

    public Concierto(int id, String artista, int costo, String fecha, int capacidadMax, String lugar) {
        this.id = id;
        this.artista = artista;
        this.costo = costo;
        this.fecha = fecha;
        this.capacidadMax = capacidadMax;
        this.lugar = lugar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    
    
}
