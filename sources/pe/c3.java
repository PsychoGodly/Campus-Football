package pe;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c3 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f37284b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f37285c;

    public /* synthetic */ c3(int i10, String str, AtomicInteger atomicInteger) {
        this.f37283a = i10;
        this.f37284b = str;
        this.f37285c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return d3.c(this.f37283a, this.f37284b, this.f37285c, runnable);
    }
}
