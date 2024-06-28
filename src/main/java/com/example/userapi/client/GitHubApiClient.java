package com.example.userapi.client;

import com.example.userapi.model.GitHubUserSearchResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GitHubApiClient {

    private final RestTemplate restTemplate;
    private final String gitHubApiUrl;

    public GitHubApiClient(RestTemplate restTemplate, @Value("${github.api.url}") String gitHubApiUrl) {
        this.restTemplate = restTemplate;
        this.gitHubApiUrl = gitHubApiUrl;
    }

    public GitHubUserSearchResult searchUsers(String name) {
        String apiUrl = gitHubApiUrl + "/search/users?q=" + name;
        return restTemplate.getForObject(apiUrl, GitHubUserSearchResult.class);
    }
}
