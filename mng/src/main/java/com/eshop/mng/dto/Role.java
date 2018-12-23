package com.eshop.mng.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 佳琪如梦
 * @create 2018-12-23 1:41
 **/

@Data
@Table(name = "t_mng_role")
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "role_Name")
    private String roleName;

    private String description;

    private int status;

    @CreatedDate
    @Column(name = "created_Time")
    private Date createdTime;

    @LastModifiedDate
    @Column(name = "updated_Time")
    private Date updatedTime;

}
