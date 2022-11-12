package com.example.springboot.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 接受前端登录请求的参数
 */
@Data
public class UserDTO {
    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("邮箱")
    private String avatarUrl;

    private String token;
}