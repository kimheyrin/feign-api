package com.example.feigntest.service;

import com.example.feigntest.client.GitHubFeignClient;
import com.example.feigntest.dto.Contributor;

import com.google.gson.JsonArray;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class GitHubFeignService {

  @Autowired
  private GitHubFeignClient gitHubFeignClient;
  public Contributor getContributor() {

    Contributor contributors = gitHubFeignClient.getContributor();
    JsonArray jArray = contributors.getData(); //json 데이터 가져오기
    String jsonString = jArray.toString(); //string 형식으로 바꾸기
    System.out.println(jsonString.getClass().getTypeName());

  
    return contributors;
  }

}
