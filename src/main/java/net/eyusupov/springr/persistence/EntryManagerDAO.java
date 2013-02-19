/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eyusupov.springr.persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.eyusupov.springr.domain.Entry;
import net.eyusupov.springr.service.EntryManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eyusupov
 */
@Repository("entryManagerDAO")
public class EntryManagerDAO implements EntryManager {
    private static final String ALL_ENTRIES = 
            "SELECT s FROM Entry s";
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    @Transactional(readOnly = true)
    public List<Entry> getEntries() {
        return em.createQuery(ALL_ENTRIES).getResultList();
    }

    @Override
    @Transactional
    public void addEntry(Entry entry) {
        em.persist(entry);
    }
}
