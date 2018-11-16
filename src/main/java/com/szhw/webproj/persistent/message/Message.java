package com.szhw.webproj.persistent.message;

import javax.persistence.*;
import java.util.Date;

/**
 * @author HJF
 * @date 2018/11/12 18:17
 */
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /*
    消息接收方id
     */
    @Column
    private Integer receiver;
    /*
    消息内容
     */
    @Column
    private String message;
    /*
    消息是否已读
     */
    @Column
    private Boolean isRead;
    /*
    消息发送时间
     */
    @Column
    private String sendDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
}
