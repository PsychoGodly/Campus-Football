package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zap;
import java.util.concurrent.ExecutorService;
import n5.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f15071a = zap.zaa().zac(2, new c("GAC_Executor"), 2);

    public static ExecutorService a() {
        return f15071a;
    }
}
