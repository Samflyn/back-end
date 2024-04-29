package org.example.aggregator.feign;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "post-client",
        url = "https://jsonplaceholder.typicode.com",
        configuration = PostClientConfig.class)
public interface PostClient {

    @GetMapping("/postss")
    @Cacheable(cacheNames = "demo-cache", key = "#posts")
    String getPosts();
}
