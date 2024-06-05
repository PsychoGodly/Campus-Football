package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzcaa;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    private final View f14831a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f14832b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14833c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14834d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14835e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f14836f;

    public l1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f14832b = activity;
        this.f14831a = view;
        this.f14836f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        if (!this.f14833c) {
            Activity activity = this.f14832b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f14836f;
                ViewTreeObserver f10 = f(activity);
                if (f10 != null) {
                    f10.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            t.z();
            zzcaa.zza(this.f14831a, this.f14836f);
            this.f14833c = true;
        }
    }

    private final void h() {
        Activity activity = this.f14832b;
        if (activity != null && this.f14833c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f14836f;
            ViewTreeObserver f10 = f(activity);
            if (f10 != null) {
                f10.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f14833c = false;
        }
    }

    public final void a() {
        this.f14835e = false;
        h();
    }

    public final void b() {
        this.f14835e = true;
        if (this.f14834d) {
            g();
        }
    }

    public final void c() {
        this.f14834d = true;
        if (this.f14835e) {
            g();
        }
    }

    public final void d() {
        this.f14834d = false;
        h();
    }

    public final void e(Activity activity) {
        this.f14832b = activity;
    }
}
