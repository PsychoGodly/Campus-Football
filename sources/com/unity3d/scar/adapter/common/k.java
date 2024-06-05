package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import bb.d;
import cb.b;
import cb.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ScarAdapterBase */
public abstract class k implements f {

    /* renamed from: a  reason: collision with root package name */
    protected c f32043a;

    /* renamed from: b  reason: collision with root package name */
    protected Map<String, bb.a> f32044b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    protected bb.a f32045c;

    /* renamed from: d  reason: collision with root package name */
    protected d<m> f32046d;

    /* compiled from: ScarAdapterBase */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f32047a;

        a(Activity activity) {
            this.f32047a = activity;
        }

        public void run() {
            k.this.f32045c.a(this.f32047a);
        }
    }

    public k(d<m> dVar) {
        this.f32046d = dVar;
    }

    public void a(Context context, String str, d dVar, b bVar) {
        this.f32043a.a(context, str, dVar, bVar);
    }

    public void b(Context context, boolean z10, b bVar) {
        this.f32043a.b(context, z10, bVar);
    }

    public void c(Activity activity, String str, String str2) {
        bb.a aVar = this.f32044b.get(str2);
        if (aVar == null) {
            d<m> dVar = this.f32046d;
            dVar.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
            return;
        }
        this.f32045c = aVar;
        l.a(new a(activity));
    }
}
