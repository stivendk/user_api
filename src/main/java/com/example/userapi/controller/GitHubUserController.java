package com.example.userapi.controller;

import com.example.userapi.client.GitHubApiClient;
import com.example.userapi.model.GitHubUserSearchResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubUserController {

    private final GitHubApiClient gitHubApiClient;

    public GitHubUserController(GitHubApiClient gitHubApiClient) {
        this.gitHubApiClient = gitHubApiClient;
    }

    @GetMapping("/search")
    public GitHubUserSearchResult searchGitHubUsers(@RequestParam String name) {
        return gitHubApiClient.searchUsers(name);
    }
}
