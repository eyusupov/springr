/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eyusupov.spring_test.service;

import java.util.List;
import net.eyusupov.spring_test.domain.Entry;

/**
 *
 * @author eyusupov
 */
public class SimpleEntryManager implements EntryManager {
    private List<Entry> entries;

    @Override
    public List<Entry> getEntries() {
        return entries;
    }

    @Override
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }    
}
