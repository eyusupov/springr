/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eyusupov.spring_test.domain;

import java.io.Serializable;

/**
 *
 * @author eyusupov
 */
public class Entry implements Serializable {
    private String title;
    private String text;
    
    public String getTitle() {
        return title;
    }
    
    public String getText() {
        return text;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString() {
        return title + ": " + text;
    }
}
