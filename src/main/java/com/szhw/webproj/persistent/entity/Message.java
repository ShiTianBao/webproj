package com.szhw.webproj.persistent.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * 站内消息Entity
 * @author HJF
 * @date 2018/11/26 16:28
 */
@Entity
public class Message {
    private Integer id;
    private Byte isRead;
    private String message;
    private Integer recvId;
    private Timestamp sendTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "is_read")
    public Byte getIsRead() {
        return isRead;
    }

    public void setIsRead(Byte isRead) {
        this.isRead = isRead;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "recv_id")
    public Integer getRecvId() {
        return recvId;
    }

    public void setRecvId(Integer recvId) {
        this.recvId = recvId;
    }

    @Basic
    @Column(name = "send_time")
    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return id == message1.id &&
                Objects.equals(isRead, message1.isRead) &&
                Objects.equals(message, message1.message) &&
                Objects.equals(recvId, message1.recvId) &&
                Objects.equals(sendTime, message1.sendTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isRead, message, recvId, sendTime);
    }
}
