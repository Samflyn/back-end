package org.example.aggregator.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.aggregator.feign.PostClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {
    private final RestTemplate restTemplate;
    private final PostClient postClient;

    public String getPosts() {
//        return restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class).getBody();
        return postClient.getPosts();
    }
}
