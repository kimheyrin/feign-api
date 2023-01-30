package com.example.feigntest.controller;


import com.example.feigntest.dto.Contributor;
import com.example.feigntest.service.GitHubFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
public class GitHubFeignController {

    private final GitHubFeignService GitHubFeignService;

    @GetMapping(value = "/start")
    public Contributor getGitHubContributors(){
        return GitHubFeignService.getContributor();
    }
}
