package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.components.x;
import com.startapp.sdk.triggeredlinks.AppEventsMetadata;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.util.Map;

/* compiled from: Sta */
public class f0 extends x1 {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f15806a;

    /* renamed from: b  reason: collision with root package name */
    public int f15807b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15808c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15809d;

    public f0(g0 g0Var) {
        this.f15806a = g0Var;
    }

    public void onActivityStarted(Activity activity) {
        if (activity != null) {
            int i10 = this.f15807b + 1;
            this.f15807b = i10;
            if (i10 == 1 && !this.f15808c) {
                Map<String, String> map = null;
                if (!this.f15809d) {
                    this.f15809d = true;
                    StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f15806a;
                    StartAppSDKInternal.h(startAppSDKInternal.f16814h);
                    z8 z8Var = startAppSDKInternal.B;
                    if (z8Var != null) {
                        TriggeredLinksMetadata a10 = z8Var.a();
                        AppEventsMetadata a11 = a10 != null ? a10.a() : null;
                        Map<String, String> c10 = a11 != null ? a11.c() : null;
                        if (c10 != null) {
                            z8Var.a(a10, c10, "Launch");
                        }
                    }
                }
                StartAppSDKInternal startAppSDKInternal2 = (StartAppSDKInternal) this.f15806a;
                Application application = startAppSDKInternal2.f16814h;
                if (application != null) {
                    k8 w10 = ComponentLocator.a((Context) application).w();
                    w10.f16051b.execute(new i8(w10));
                    e0 d10 = ComponentLocator.a((Context) startAppSDKInternal2.f16814h).d();
                    ((x) d10.f15771a).getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = d10.f15775e;
                    AppSessionConfig a12 = d10.f15772b.a();
                    if (elapsedRealtime > Math.max(0, a12 != null ? a12.a() : 600000) + j10 || d10.f15774d <= 0) {
                        d10.f15774d = elapsedRealtime;
                        d10.f15773c.clear();
                    }
                }
                StartAppSDKInternal.h(startAppSDKInternal2.f16814h);
                z8 z8Var2 = startAppSDKInternal2.B;
                if (z8Var2 != null) {
                    TriggeredLinksMetadata a13 = z8Var2.a();
                    AppEventsMetadata a14 = a13 != null ? a13.a() : null;
                    if (a14 != null) {
                        map = a14.a();
                    }
                    if (map != null) {
                        z8Var2.a(a13, map, "Active");
                    }
                }
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity != null) {
            this.f15807b--;
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            this.f15808c = isChangingConfigurations;
            if (this.f15807b == 0 && !isChangingConfigurations) {
                StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f15806a;
                Application application = startAppSDKInternal.f16814h;
                if (application != null) {
                    k8 w10 = ComponentLocator.a((Context) application).w();
                    w10.f16051b.execute(new j8(w10));
                    e0 d10 = ComponentLocator.a((Context) startAppSDKInternal.f16814h).d();
                    ((x) d10.f15771a).getClass();
                    d10.f15775e = SystemClock.elapsedRealtime();
                }
                StartAppSDKInternal.h(startAppSDKInternal.f16814h);
                z8 z8Var = startAppSDKInternal.B;
                if (z8Var != null) {
                    TriggeredLinksMetadata a10 = z8Var.a();
                    Map<String, String> map = null;
                    AppEventsMetadata a11 = a10 != null ? a10.a() : null;
                    if (a11 != null) {
                        map = a11.b();
                    }
                    if (map != null) {
                        z8Var.a(a10, map, "Inactive");
                    }
                }
                Application application2 = startAppSDKInternal.f16814h;
                if (application2 != null) {
                    try {
                        ComponentLocator.a((Context) application2).q().c();
                    } catch (Throwable th) {
                        i3.a(th);
                    }
                }
            }
        }
    }
}
