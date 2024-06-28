package com.example.userapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitHubUserSearchResult {

    private int totalCount;

    private boolean incompleteResults;

    private List<GitHubUser> items;
}
