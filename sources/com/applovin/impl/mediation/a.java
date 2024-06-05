package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.de;
import com.applovin.impl.p;
import com.applovin.impl.q;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;

public class a extends p {

    /* renamed from: a  reason: collision with root package name */
    private final q f9411a;

    /* renamed from: b  reason: collision with root package name */
    private final t f9412b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9413c = zp.l(k.k());

    /* renamed from: d  reason: collision with root package name */
    private C0125a f9414d;

    /* renamed from: e  reason: collision with root package name */
    private de f9415e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9416f;

    /* renamed from: g  reason: collision with root package name */
    private int f9417g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9418h;

    /* renamed from: com.applovin.impl.mediation.a$a  reason: collision with other inner class name */
    public interface C0125a {
        void b(de deVar);
    }

    a(k kVar) {
        this.f9412b = kVar.L();
        this.f9411a = kVar.e();
    }

    public void a(boolean z10) {
        this.f9416f = z10;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!activity.getClass().getName().equals(this.f9413c) || (!this.f9415e.q0() && !this.f9416f)) {
            if (!this.f9418h) {
                this.f9418h = true;
            }
            this.f9417g++;
            if (t.a()) {
                this.f9412b.a("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f9417g);
                return;
            }
            return;
        }
        if (t.a()) {
            this.f9412b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
        }
        if (this.f9414d != null) {
            if (t.a()) {
                this.f9412b.a("AdActivityObserver", "Invoking callback...");
            }
            this.f9414d.b(this.f9415e);
        }
        a();
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f9418h) {
            this.f9417g--;
            if (t.a()) {
                this.f9412b.a("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f9417g);
            }
            if (this.f9417g <= 0) {
                if (t.a()) {
                    this.f9412b.a("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f9414d != null) {
                    if (t.a()) {
                        this.f9412b.a("AdActivityObserver", "Invoking callback...");
                    }
                    this.f9414d.b(this.f9415e);
                }
                a();
            }
        }
    }

    public void a(de deVar, C0125a aVar) {
        if (t.a()) {
            t tVar = this.f9412b;
            tVar.a("AdActivityObserver", "Starting for ad " + deVar.getAdUnitId() + "...");
        }
        a();
        this.f9414d = aVar;
        this.f9415e = deVar;
        this.f9411a.a(this);
    }

    public void a() {
        if (t.a()) {
            this.f9412b.a("AdActivityObserver", "Cancelling...");
        }
        this.f9411a.b(this);
        this.f9414d = null;
        this.f9415e = null;
        this.f9417g = 0;
        this.f9418h = false;
    }
}
