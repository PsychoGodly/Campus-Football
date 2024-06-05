package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: Sta */
public class sa {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f16399a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<View> f16400b;

    /* renamed from: c  reason: collision with root package name */
    public final BannerOptions f16401c;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f16402a;

        public a(b bVar) {
            this.f16402a = bVar;
        }

        public void run() {
            if (this.f16402a.onUpdate(sa.a(sa.this))) {
                sa.this.f16399a.postDelayed(this, 100);
            }
        }
    }

    /* compiled from: Sta */
    public interface b {
        boolean onUpdate(boolean z10);
    }

    public sa(View view, BannerOptions bannerOptions, b bVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f16399a = handler;
        this.f16400b = new WeakReference<>(view);
        this.f16401c = bannerOptions;
        handler.postDelayed(new a(bVar), 100);
    }

    public void a() {
        this.f16399a.removeCallbacksAndMessages((Object) null);
    }

    public static boolean a(sa saVar) {
        return qa.a((View) saVar.f16400b.get(), saVar.f16401c, (AtomicReference<JSONObject>) new AtomicReference()) == null;
    }
}
