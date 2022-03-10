package iTicket.com.service;

import iTicket.com.entidad.Concierto;
import iTicket.com.interfaceService.IConciertoService;
import iTicket.com.interfaces.IConcierto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ConciertoService implements IConciertoService{
    @Autowired
    private IConcierto data;
    
    @Override
    public List<Concierto> listar() {
        return(List<Concierto>)data.findAll();
            }

    @Override
    public Optional<Concierto> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int save(Concierto c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
