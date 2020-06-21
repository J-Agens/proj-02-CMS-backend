package com.project2.cms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project2.cms.model.Inbox;
import com.project2.cms.services.InboxService;

@RestController
@Controller
@RequestMapping("/inboxes")
public class InboxController {
  
  @Autowired
  InboxService inboxService;
  
  @GetMapping("/all")
  public List<Inbox> getAllInboxes() {
    return inboxService.getAll();
  }
  
  @GetMapping("/owner/{id}")
  public Inbox getInboxById(@PathVariable Integer id) {
//    return inboxService.getInboxById(id);
    return inboxService.openInboxOfUser(id);
  }
}
