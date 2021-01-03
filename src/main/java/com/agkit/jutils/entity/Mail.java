package com.agkit.jutils.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 邮件
 *
 * @author agcms
 */
@Data
public class Mail implements Serializable {

    private static final long serialVersionUID = 4885093464493499448L;

    private Long id;
    private Long userId;
    private String username;
    private String toEmail;
    private String subject;
    private String content;
    private Integer status;
    private Date sendTime;
    private Date createTime;
    private Date updateTime;

}
