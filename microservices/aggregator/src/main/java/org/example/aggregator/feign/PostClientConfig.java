package org.example.aggregator.feign;

import feign.Response;
import feign.RetryableException;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import io.github.resilience4j.spring6.fallback.FallbackDecorators;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;

@Slf4j
public class PostClientConfig implements ErrorDecoder, Retryer, FallbackFactory<String> {
    @Override
    public Exception decode(String s, Response response) {
        log.info(s, response);
        return new RuntimeException("Erroro");
    }

    @Override
    public void continueOrPropagate(RetryableException e) {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Retryer clone() {
        return null;
    }

    @Override
    public String create(Throwable cause) {
        return "FallBack data";
    }
}
