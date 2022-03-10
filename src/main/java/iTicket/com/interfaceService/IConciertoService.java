package iTicket.com.interfaceService;

import iTicket.com.entidad.Concierto;
import java.util.List;
import java.util.Optional;

public interface IConciertoService {
    public List<Concierto>listar();
    public Optional<Concierto>listarId(int id);
    public int save(Concierto c);
    public void delete(int id);
}
