package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: TimeProvider */
public interface l2 {

    /* renamed from: a  reason: collision with root package name */
    public static final l2 f35171a = new a();

    /* compiled from: TimeProvider */
    class a implements l2 {
        a() {
        }

        public long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
