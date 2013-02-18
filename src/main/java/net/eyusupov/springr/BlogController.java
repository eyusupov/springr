/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eyusupov.springr;

import java.util.Map;
import javax.validation.Valid;
import net.eyusupov.springr.domain.Entry;
import net.eyusupov.springr.service.EntryManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {
    private EntryManager entryManager;
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    public BlogController(EntryManager entryManager) {
        this.entryManager = entryManager;
    }

    @RequestMapping(value="/addEntry", method=RequestMethod.POST)
    public String addEntry(@Valid Entry entry, BindingResult bindingResult) {
        System.out.println("test");
        if (bindingResult.hasErrors()) {
            System.out.println("Entry has errors");
            return "blabla";
        }
        System.out.println("Saving entry " + entry.toString());
        entryManager.addEntry(entry);
        return "redirect:/";
    }
    
    @RequestMapping("/")
    public String showEntries(Model model) {
        logger.info("ShowEntries called");
        model.addAttribute(new Entry());
        model.addAttribute("entries", entryManager.getEntries());
        return "entries";
    }
}