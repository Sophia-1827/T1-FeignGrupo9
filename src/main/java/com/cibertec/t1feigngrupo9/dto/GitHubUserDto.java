package com.cibertec.t1feigngrupo9.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GitHubUserDto {
    private Long id;
    private String login;
    private Boolean site_admin;
    private String avatar_url;
}
