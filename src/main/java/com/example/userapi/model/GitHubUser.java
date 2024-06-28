package com.example.userapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitHubUser {

    private String login;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("avatar_url")
    private String avatarUrl;
}
