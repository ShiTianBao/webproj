package com.szhw.webproj.common.message;

import com.szhw.webproj.persistent.entity.Message;
import com.szhw.webproj.persistent.repository.MessageRepository;
import com.szhw.webproj.persistent.entity.User;
import com.szhw.webproj.persistent.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Optional;

/**
 * 发送站内信的类
 *
 * @author HJF
 * @date 2018/11/26 16:30
 */
@Component
public class MessageHelper {
    @Resource
    MessageRepository messageRepository;
    @Resource
    UserRepository userRepository;

    public boolean sendMessage(int recvId, String message) {
        Optional<User> user = userRepository.findById(recvId);
        if (!user.isPresent()) {
            return false;
        }
        if (null == message || "".equals(message)) {
            return false;
        }
        Message msg = new Message();
        msg.setRecvId(recvId);
        msg.setMessage(message);
        msg.setSendTime(new Timestamp(System.currentTimeMillis()));
        messageRepository.saveAndFlush(msg);
        return true;
    }
}
