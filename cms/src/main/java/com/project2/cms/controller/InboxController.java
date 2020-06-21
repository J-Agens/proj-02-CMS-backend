package com.project2.cms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project2.cms.dtos.NewInboxDto;
import com.project2.cms.model.Inbox;
import com.project2.cms.model.Writer;
import com.project2.cms.services.InboxService;
import com.project2.cms.services.WriterService;

@RestController
@Controller
@RequestMapping("/inboxes")
public class InboxController {
  
  @Autowired
  InboxService inboxService;
  @Autowired
  WriterService writerService;
  
  @GetMapping("/all")
  public List<Inbox> getAllInboxes() {
    return inboxService.getAll();
  }
  
  @GetMapping("/owner/{id}")
  public Inbox getInboxById(@PathVariable Integer id) {
//    return inboxService.getInboxById(id);
    return inboxService.openInboxOfUser(id);
  }
  
  @PostMapping("/new")
  public Inbox create(@RequestBody NewInboxDto dto) {
    
    // Get writer who owns the inbox
    Writer myOwner;
    Integer myOwnerId = dto.getOwnerId();
    myOwner = writerService.getSenderOfMessage(myOwnerId);
    
    // Attempt to create new inbox or throw exception
    try {
      Inbox ourInbox = new Inbox(0, myOwner, null);
      return inboxService.create(ourInbox);
    } catch (Throwable e) {
      System.out.println("Failed to create new inbox : " + e);
      throw e;
    }
  }
}
