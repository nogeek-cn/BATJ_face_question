package com.darian.BaTJ_face_Question.token_bucket;

import com.google.common.util.concurrent.RateLimiter;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TokenLimit {

    // Gurava -> 令牌桶，漏桶

    // bursty(令牌桶)
    RateLimiter rateLimiter = RateLimiter.create(10); // QPS = 1000 峰值

    /** 漏桶*/
    RateLimiter rateLimiterSeep = rateLimiter.create(1000,10,TimeUnit.MILLISECONDS);

    public void doPay(){
        // 尝试去获取一个令牌
        if(rateLimiter.tryAcquire()){
            System.out.println(Thread.currentThread().getName() + "开始执行代码");
        }else{
            System.out.println("系统繁忙");
        }
    }

    public static void main(String[] args) throws IOException {
        TokenLimit token = new TokenLimit();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Random random = new Random(10);
        for (int i = 0; i< 20; i++){
            new Thread(() -> {
                try {
                    countDownLatch.await();
                    Thread.sleep(random.nextInt(1000));
                    token.doPay();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        countDownLatch.countDown();
        System.in.read();
    }
}
