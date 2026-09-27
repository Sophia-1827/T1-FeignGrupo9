package com.cibertec.t1feigngrupo9.client;

import com.cibertec.t1feigngrupo9.dto.GitHubUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "gitHubClient", url = "https://api.github.com")
public interface GitHubClient {

    @GetMapping("/users")
    List<GitHubUserDto> getUsers();
}
