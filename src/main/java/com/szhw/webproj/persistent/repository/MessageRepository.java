package com.szhw.webproj.persistent.repository;

import com.szhw.webproj.persistent.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
