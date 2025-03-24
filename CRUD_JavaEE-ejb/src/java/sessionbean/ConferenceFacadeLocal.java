/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Conference;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student 2
 */
@Local
public interface ConferenceFacadeLocal {

    void create(Conference conference);

    void edit(Conference conference);

    void remove(Conference conference);

    Conference find(Object id);

    List<Conference> findAll();

    List<Conference> findRange(int[] range);

    int count();
    
}
