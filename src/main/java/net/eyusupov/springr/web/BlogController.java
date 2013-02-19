/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eyusupov.springr.web;

import javax.validation.Valid;
import net.eyusupov.springr.domain.Entry;
import net.eyusupov.springr.service.EntryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {
    private EntryManager entryManager;

    @Autowired
    public BlogController(EntryManager entryManager) {
        this.entryManager = entryManager;
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String addEntry(@Valid Entry entry, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/";
        }
        entryManager.addEntry(entry);
        return "redirect:/";
    }
    
    @RequestMapping("/")
    public String showEntries(Model model) {
        model.addAttribute(new Entry());
        model.addAttribute("entries", entryManager.getEntries());
        return "show_entries";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}