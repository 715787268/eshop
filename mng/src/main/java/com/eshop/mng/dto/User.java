package com.eshop.mng.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 佳琪如梦
 * @create 2018-12-23 1:54
 **/

@Table(name = "t_mng_user")
@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private int status;

    @CreatedDate
    @Column(name = "created_Time")
    private Date createdTime;

    @LastModifiedDate
    @Column(name = "updated_Time")
    private Date updatedTime;
}
