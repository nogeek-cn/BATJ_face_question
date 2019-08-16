package com.darian.BaTJ_face_Question.token_bucket;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;

/***
 * 摸拟演示令牌桶和漏通的差异
 */
public class GuavaTokenDemo {
    private int qps;
    private int countOfReq;

    private RateLimiter rateLimiter;

    public GuavaTokenDemo(int qps, int countOfReq) {
        this.qps = qps;
        this.countOfReq = countOfReq;
    }

    /***
     * 初始化一个令牌桶
     */
    public GuavaTokenDemo processWithTokenBucket() {
        rateLimiter = RateLimiter.create(qps);
        return this;
    }

    /***
     * 初始化一个漏桶
     */
    public GuavaTokenDemo processWithLeakyBucket() {
        rateLimiter = RateLimiter.create(qps, 0, TimeUnit.MILLISECONDS);
        return this;
    }

    private void processRequest() {
        System.out.println("RateLimiter" + rateLimiter.getClass());
        long start = System.currentTimeMillis();
        for (int i = 0; i < countOfReq; i++) {
            // 获取令牌
            rateLimiter.acquire();
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("    处理的请求数量：" + countOfReq
                + "     , 耗时：  " + end
                + "     qps:" + rateLimiter.getRate()
                + "     实际QPS:" + Math.ceil(countOfReq / (end / 1000.00)));
    }

    public void doProcessor() throws InterruptedException {
        // 通过间隔事件去掉方法
        for (int i = 0; i < 20; i = i + 5) {
            TimeUnit.SECONDS.sleep(i);
            processRequest();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new GuavaTokenDemo(50, 100)
                .processWithTokenBucket().doProcessor();
        new GuavaTokenDemo(50, 100)
                .processWithLeakyBucket().doProcessor();

    }
}
