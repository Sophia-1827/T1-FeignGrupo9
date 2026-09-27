package com.cibertec.t1feigngrupo9.service;

import com.cibertec.t1feigngrupo9.client.GitHubClient;
import com.cibertec.t1feigngrupo9.dto.GitHubUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GitHubService {
    private final GitHubClient gitHubClient;

    public List<GitHubUserDto> obtenerUsuarios(){
        List<GitHubUserDto> users = gitHubClient.getUsers();
        return users.stream()
                .filter(user -> user.getLogin() != null && user.getLogin().length() <= 5)
                .filter(user -> Boolean.FALSE.equals(user.getSite_admin()))
                .collect(Collectors.toList());
    }
}
