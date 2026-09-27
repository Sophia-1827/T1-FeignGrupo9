package com.cibertec.t1feigngrupo9.controller;

import com.cibertec.t1feigngrupo9.dto.GitHubUserDto;
import com.cibertec.t1feigngrupo9.service.GitHubService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/gitHub")
public class GitHubController {
    private final GitHubService gitHubService;

    @GetMapping("/users")
    public List<GitHubUserDto> getUsers() {
        return gitHubService.obtenerUsuarios();
    }
}
