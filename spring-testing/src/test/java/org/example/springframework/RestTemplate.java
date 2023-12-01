package org.example.springframework;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestTemplate {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void name() {
        Boolean forObject = testRestTemplate.getForObject("/callServiceBoolean", Boolean.class);

        Assertions.assertThat(forObject).isFalse();
    }
}
