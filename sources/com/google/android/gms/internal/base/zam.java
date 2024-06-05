package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public interface zam {
    ExecutorService zaa(ThreadFactory threadFactory, int i10);

    ExecutorService zab(int i10, int i11);

    ExecutorService zac(int i10, ThreadFactory threadFactory, int i11);
}
