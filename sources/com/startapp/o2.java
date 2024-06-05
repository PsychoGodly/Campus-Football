package com.startapp;

import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class o2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentLocator f16192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.remoteconfig.a f16193b;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Boolean f16194a;

        public a(Boolean bool) {
            this.f16194a = bool;
        }

        public void run() {
            o2.this.f16193b.a(this.f16194a);
        }
    }

    public o2(com.startapp.sdk.adsbase.remoteconfig.a aVar, ComponentLocator componentLocator) {
        this.f16193b = aVar;
        this.f16192a = componentLocator;
    }

    public void run() {
        this.f16192a.h().execute(new a(this.f16193b.a()));
    }
}
