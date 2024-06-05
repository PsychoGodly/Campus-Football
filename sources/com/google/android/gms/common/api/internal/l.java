package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.q;
import h5.b;
import h5.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class l implements a.f, ServiceConnection {

    /* renamed from: m  reason: collision with root package name */
    private static final String f15185m = l.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final String f15186a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15187b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f15188c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f15189d;

    /* renamed from: f  reason: collision with root package name */
    private final e f15190f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f15191g;

    /* renamed from: h  reason: collision with root package name */
    private final m f15192h;

    /* renamed from: i  reason: collision with root package name */
    private IBinder f15193i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15194j;

    /* renamed from: k  reason: collision with root package name */
    private String f15195k;

    /* renamed from: l  reason: collision with root package name */
    private String f15196l;

    private final void g() {
        if (Thread.currentThread() != this.f15191g.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void h(String str) {
        String.valueOf(this.f15193i);
    }

    public final void connect(c.C0157c cVar) {
        g();
        h("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f15188c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f15186a).setAction(this.f15187b);
            }
            boolean bindService = this.f15189d.bindService(intent, this, h.a());
            this.f15194j = bindService;
            if (!bindService) {
                this.f15193i = null;
                this.f15192h.onConnectionFailed(new b(16));
            }
            h("Finished connect.");
        } catch (SecurityException e10) {
            this.f15194j = false;
            this.f15193i = null;
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f15194j = false;
        this.f15193i = null;
        h("Disconnected.");
        this.f15190f.onConnectionSuspended(1);
    }

    public final void disconnect() {
        g();
        h("Disconnect called.");
        try {
            this.f15189d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f15194j = false;
        this.f15193i = null;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(IBinder iBinder) {
        this.f15194j = false;
        this.f15193i = iBinder;
        h("Connected.");
        this.f15190f.onConnected(new Bundle());
    }

    public final void f(String str) {
        this.f15196l = str;
    }

    public final d[] getAvailableFeatures() {
        return new d[0];
    }

    public final String getEndpointPackageName() {
        String str = this.f15186a;
        if (str != null) {
            return str;
        }
        q.k(this.f15188c);
        return this.f15188c.getPackageName();
    }

    public final String getLastDisconnectMessage() {
        return this.f15195k;
    }

    public final int getMinApkVersion() {
        return 0;
    }

    public final void getRemoteService(j jVar, Set<Scope> set) {
    }

    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    public final Intent getSignInIntent() {
        return new Intent();
    }

    public final boolean isConnected() {
        g();
        return this.f15193i != null;
    }

    public final boolean isConnecting() {
        g();
        return this.f15194j;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f15191g.post(new x1(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15191g.post(new w1(this));
    }

    public final void onUserSignOut(c.e eVar) {
    }

    public final boolean providesSignIn() {
        return false;
    }

    public final boolean requiresGooglePlayServices() {
        return false;
    }

    public final boolean requiresSignIn() {
        return false;
    }

    public final void disconnect(String str) {
        g();
        this.f15195k = str;
        disconnect();
    }
}
