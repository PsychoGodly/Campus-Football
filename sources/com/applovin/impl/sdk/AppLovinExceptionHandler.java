package com.applovin.impl.sdk;

import android.os.Process;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: d  reason: collision with root package name */
    private static final AppLovinExceptionHandler f11415d = new AppLovinExceptionHandler();

    /* renamed from: a  reason: collision with root package name */
    private final Set f11416a = new HashSet(2);

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f11417b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f11418c;

    public static AppLovinExceptionHandler shared() {
        return f11415d;
    }

    public void addSdk(k kVar) {
        if (!this.f11416a.contains(kVar)) {
            this.f11416a.add(kVar);
        }
    }

    public void enable() {
        if (this.f11417b.compareAndSet(false, true)) {
            this.f11418c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        long j10 = 500;
        for (k kVar : this.f11416a) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            kVar.B().a(o.b.CRASH, CollectionUtils.map("top_main_method", th.toString()));
            kVar.C().trackEventSynchronously("paused");
            j10 = ((Long) kVar.a(oj.f10435w3)).longValue();
        }
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11418c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
