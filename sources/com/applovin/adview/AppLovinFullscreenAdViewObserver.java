package com.applovin.adview;

import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.y;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.k;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenAdViewObserver implements o {

    /* renamed from: a  reason: collision with root package name */
    private final k f6003a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f6004b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private n9 f6005c;

    /* renamed from: d  reason: collision with root package name */
    private ob f6006d;

    public AppLovinFullscreenAdViewObserver(i iVar, ob obVar, k kVar) {
        this.f6006d = obVar;
        this.f6003a = kVar;
        iVar.a(this);
    }

    @y(i.a.ON_DESTROY)
    public void onDestroy() {
        ob obVar = this.f6006d;
        if (obVar != null) {
            obVar.a();
            this.f6006d = null;
        }
        n9 n9Var = this.f6005c;
        if (n9Var != null) {
            n9Var.f();
            this.f6005c.v();
            this.f6005c = null;
        }
    }

    @y(i.a.ON_PAUSE)
    public void onPause() {
        n9 n9Var = this.f6005c;
        if (n9Var != null) {
            n9Var.w();
            this.f6005c.z();
        }
    }

    @y(i.a.ON_RESUME)
    public void onResume() {
        n9 n9Var;
        if (!this.f6004b.getAndSet(false) && (n9Var = this.f6005c) != null) {
            n9Var.x();
            this.f6005c.a(0);
        }
    }

    @y(i.a.ON_STOP)
    public void onStop() {
        n9 n9Var = this.f6005c;
        if (n9Var != null) {
            n9Var.y();
        }
    }

    public void setPresenter(n9 n9Var) {
        this.f6005c = n9Var;
    }
}
