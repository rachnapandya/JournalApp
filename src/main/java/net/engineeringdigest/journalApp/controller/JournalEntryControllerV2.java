package net.engineeringdigest.journalApp.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
        
        @Autowired
        private JournalEntryService journalEntryService;

        @GetMapping
        public List<JournalEntry> getAll(){
            return null;
       }

        @PostMapping
        public boolean createEntry(@RequestBody JournalEntry entry){
           journalEntryService.saveEntry(entry);
            return true;
       }

       @GetMapping("id/{myId}")
       public JournalEntry getJournalEntryById(@PathVariable String myId){
        return null;
       }

       @DeleteMapping("id/{myId}")
       public JournalEntry deleteJournalEntryById(@PathVariable String myId){
        return null;
       }

       @PutMapping("id/{myId}")
       public JournalEntry updateJournalEntryById(@PathVariable String myId, @RequestBody JournalEntry entry){
        return null;
           
       }

} 