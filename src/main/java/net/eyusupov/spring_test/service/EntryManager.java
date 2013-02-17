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
public interface EntryManager {
    public List<Entry> getEntries();
    public void setEntries(List<Entry> entries);
}
