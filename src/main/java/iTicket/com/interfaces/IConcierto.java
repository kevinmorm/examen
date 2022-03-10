package iTicket.com.interfaces;

import iTicket.com.entidad.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kmor5
 */
@Repository
public interface IConcierto extends CrudRepository<Concierto, Integer>{
    
    
}
