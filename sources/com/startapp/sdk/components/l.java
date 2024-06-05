package com.startapp.sdk.components;

import com.startapp.i2;
import com.startapp.sdk.components.ComponentLocator;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Sta */
public class l implements i2<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f17217a;

    public l(ComponentLocator.n nVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f17217a = threadPoolExecutor;
    }

    public Object a() {
        return Integer.valueOf(this.f17217a.getMaximumPoolSize() - this.f17217a.getActiveCount());
    }
}
