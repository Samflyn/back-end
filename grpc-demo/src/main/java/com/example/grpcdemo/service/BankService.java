package com.example.grpcdemo.service;

import com.example.grpcdemo.model.BalanceCheckRequest;
import com.example.grpcdemo.model.BankBalance;
import com.example.grpcdemo.model.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<BankBalance> responseObserver) {

//        to send the response, and then we need to call onCompleted
        responseObserver.onNext(BankBalance.newBuilder().build());

//        when there is an error, if it's onError then the response is closed
        responseObserver.onError(new RuntimeException(""));

//        when everything is done
        responseObserver.onCompleted();
    }
}
