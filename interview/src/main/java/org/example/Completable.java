package org.example;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Completable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var executorService = Executors.newCachedThreadPool();
        var listFuture = executorService.submit(() -> List.of(1));
        listFuture.get().forEach(System.out::println);

        var completableFuture = new CompletableFuture<String>();
        var integerCompletableFuture = completableFuture.supplyAsync(() -> 1);
        System.out.println(integerCompletableFuture.get());
        completableFuture.join();
    }
}
