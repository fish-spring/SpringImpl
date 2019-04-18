package aop.proxy;

import aop.worker.Knight;

public class KnightProxy {
    private Knight knight;
    public KnightProxy(Knight knight){
        this.knight = knight;
    }

}
