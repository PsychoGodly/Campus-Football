package com.onesignal.flutter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import lc.k;

/* compiled from: FlutterRegistrarResponder */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    Context f27772a;

    /* renamed from: b  reason: collision with root package name */
    k f27773b;

    /* renamed from: c  reason: collision with root package name */
    lc.c f27774c;

    /* renamed from: com.onesignal.flutter.a$a  reason: collision with other inner class name */
    /* compiled from: FlutterRegistrarResponder */
    class C0291a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f27775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f27776b;

        C0291a(k.d dVar, Object obj) {
            this.f27775a = dVar;
            this.f27776b = obj;
        }

        public void run() {
            this.f27775a.success(this.f27776b);
        }
    }

    /* compiled from: FlutterRegistrarResponder */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f27778a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27779b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27780c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f27781d;

        b(k.d dVar, String str, String str2, Object obj) {
            this.f27778a = dVar;
            this.f27779b = str;
            this.f27780c = str2;
            this.f27781d = obj;
        }

        public void run() {
            this.f27778a.error(this.f27779b, this.f27780c, this.f27781d);
        }
    }

    /* compiled from: FlutterRegistrarResponder */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f27783a;

        c(k.d dVar) {
            this.f27783a = dVar;
        }

        public void run() {
            this.f27783a.notImplemented();
        }
    }

    /* compiled from: FlutterRegistrarResponder */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f27785a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27786b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f27787c;

        d(k kVar, String str, HashMap hashMap) {
            this.f27785a = kVar;
            this.f27786b = str;
            this.f27787c = hashMap;
        }

        public void run() {
            this.f27785a.c(this.f27786b, this.f27787c);
        }
    }

    a() {
    }

    private void s(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(String str, HashMap hashMap) {
        s(new d(this.f27773b, str, hashMap));
    }

    /* access modifiers changed from: package-private */
    public void p(k.d dVar, String str, String str2, Object obj) {
        s(new b(dVar, str, str2, obj));
    }

    /* access modifiers changed from: package-private */
    public void q(k.d dVar) {
        s(new c(dVar));
    }

    /* access modifiers changed from: package-private */
    public void r(k.d dVar, Object obj) {
        s(new C0291a(dVar, obj));
    }
}
