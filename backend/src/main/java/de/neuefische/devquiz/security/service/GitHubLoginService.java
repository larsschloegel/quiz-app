package de.neuefische.devquiz.security.service;


import de.neuefische.devquiz.security.api.GitHubApiService;
import de.neuefische.devquiz.security.model.GitHubUserDto;
import org.springframework.stereotype.Service;

@Service
public class GitHubLoginService {

    private final GitHubApiService gitHubApiService;

    public GitHubLoginService(GitHubApiService gitHubApiService) {
        this.gitHubApiService = gitHubApiService;
    }

    public String verifyGitHubCode(String code) {
        //Verify code via Github
        String gitHubToken = gitHubApiService.retrieveGitHubToken(code);

        //Retrieve User Info
        GitHubUserDto gitHubUserDto = gitHubApiService.retrieveUserInfo(gitHubToken);

        //Create JWT access token

        return "null";
    }
}
