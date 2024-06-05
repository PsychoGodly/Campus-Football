package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdkUtils;

public class gb {

    /* renamed from: a  reason: collision with root package name */
    private final k f7963a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f7964b;

    /* renamed from: c  reason: collision with root package name */
    private AlertDialog f7965c;

    /* renamed from: d  reason: collision with root package name */
    private a f7966d;

    public interface a {
        void b();

        void c();
    }

    public gb(Activity activity, k kVar) {
        this.f7963a = kVar;
        this.f7964b = activity;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        AlertDialog alertDialog = this.f7965c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f7965c = new AlertDialog.Builder(this.f7964b).setTitle((CharSequence) this.f7963a.a(oj.f10409t1)).setMessage((CharSequence) this.f7963a.a(oj.f10417u1)).setCancelable(false).setPositiveButton((CharSequence) this.f7963a.a(oj.f10433w1), new fx(this)).setNegativeButton((CharSequence) this.f7963a.a(oj.f10425v1), new gx(this)).show();
    }

    public void a() {
        this.f7964b.runOnUiThread(new ix(this));
    }

    public boolean b() {
        AlertDialog alertDialog = this.f7965c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    public void e() {
        this.f7964b.runOnUiThread(new jx(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, DialogInterface dialogInterface, int i10) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f7964b);
        builder.setTitle(bVar.a0());
        String Y = bVar.Y();
        if (AppLovinSdkUtils.isValidString(Y)) {
            builder.setMessage(Y);
        }
        builder.setPositiveButton(bVar.Z(), new hx(runnable));
        builder.setCancelable(false);
        this.f7965c = builder.show();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i10) {
        this.f7966d.b();
    }

    public void b(b bVar, Runnable runnable) {
        this.f7964b.runOnUiThread(new kx(this, bVar, runnable));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        this.f7966d.c();
    }

    public void a(a aVar) {
        this.f7966d = aVar;
    }
}
