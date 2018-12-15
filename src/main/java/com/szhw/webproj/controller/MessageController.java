package com.szhw.webproj.controller;

import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.persistent.entity.Message;
import com.szhw.webproj.persistent.repository.MessageRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HJF
 * @date 2018/11/26 16:40
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    @Resource
    MessageRepository messageRepository;

    @GetMapping("/list")
    public CommonResult listMessage() {
        CommonResult result = new CommonResult();
        List<Message> messageList = messageRepository.findAll(Sort.by(
                Sort.Order.asc("is_read"),
                Sort.Order.desc("send_date")));
        result.setData(messageList);
        return result;
    }

    @GetMapping("/get")
    public CommonResult getMessage(Integer recvId) {
        Message msg = new Message();
        msg.setRecvId(recvId);
        // 默认取得未读消息
        msg.setIsRead((byte) 0);
        List<Message> messageList = messageRepository.findAll(Example.of(msg));
        CommonResult ret = new CommonResult();
        ret.setData(messageList);
        return ret;
    }
}
