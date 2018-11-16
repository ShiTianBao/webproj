package com.szhw.webproj.persistent.message;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HJF
 * @date 2018/11/16 19:12
 */
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
