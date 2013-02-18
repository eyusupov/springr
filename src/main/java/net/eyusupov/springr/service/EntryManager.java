/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eyusupov.springr.service;

import java.util.List;
import net.eyusupov.springr.domain.Entry;

/**
 *
 * @author eyusupov
 */
public interface EntryManager {
    public List<Entry> getEntries();
    public void addEntry(Entry entry);
}
