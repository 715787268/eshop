package com.eshop.mng.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 佳琪如梦
 * @create 2018-12-23 2:00
 **/

@Table(name = "t_mng_role_permission")
@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class RolePermission {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_Id")
    private int userId;

    @Column(name = "role_Id")
    private int roleId;

    @CreatedDate
    @Column(name = "created_Time")
    private Date createdTime;

    @LastModifiedDate
    @Column(name = "updated_Time")
    private Date updatedTime;
}
