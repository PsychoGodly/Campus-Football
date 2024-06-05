package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.concurrent.CountDownLatch;

public class SyncBaseCallbackResultImpl<T> extends BaseCallbackResultImpl<T> {
    public final CountDownLatch latch = new CountDownLatch(1);
    public T result = null;

    public void defaultBehaviour(T t10) {
        this.latch.countDown();
    }

    public void error(String str, String str2, Object obj) {
        this.latch.countDown();
    }

    public void notImplemented() {
        defaultBehaviour((Object) null);
    }

    public void success(Object obj) {
        boolean z10;
        T decodeResult = decodeResult(obj);
        this.result = decodeResult;
        if (decodeResult == null) {
            z10 = nullSuccess();
        } else {
            z10 = nonNullSuccess(decodeResult);
        }
        if (z10) {
            defaultBehaviour(decodeResult);
        } else {
            this.latch.countDown();
        }
    }
}
