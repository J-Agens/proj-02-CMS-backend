package com.project2.cms.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.project2.cms.model.Inbox;

@Repository
public interface InboxRepository extends JpaRepository<Inbox, Integer>{
  
  // Get inbox from writer id
  @Query(value = "select * from project2.inboxes where owner = :userId", nativeQuery = true)
  List<Inbox> grabInboxWithUserId(Integer userId);
}
