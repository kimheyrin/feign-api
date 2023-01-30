package com.example.feigntest.client;

import com.example.feigntest.dto.Contributor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="feign", url="url입력",configuration = Config.class)
public interface GitHubFeignClient {
    @GetMapping(value = "?q=SELECT * FROM SYS.TB_REMEASVALLOG_DYNM_RT LIMIT 5")
    Contributor getContributor();
}
