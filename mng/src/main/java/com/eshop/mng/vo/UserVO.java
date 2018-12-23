package com.eshop.mng.vo;

import com.eshop.mng.dto.Role;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.List;

/**
 * @author 佳琪如梦
 * @create 2018-12-23 15:34
 **/

@Data
public class UserVO {
    private int id;

    private String username;

    private String password;

    private int status;

    private Date createdTime;

    private Date updatedTime;

    private List<Role> roleList;
}
