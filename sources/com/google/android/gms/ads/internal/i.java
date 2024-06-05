package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjl;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class i implements Runnable, zzaps {

    /* renamed from: a  reason: collision with root package name */
    private final List f14668a = new Vector();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f14669b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference f14670c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    protected boolean f14671d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f14672f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f14673g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f14674h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final zzfhp f14675i;

    /* renamed from: j  reason: collision with root package name */
    private Context f14676j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f14677k;

    /* renamed from: l  reason: collision with root package name */
    private zzbzg f14678l;

    /* renamed from: m  reason: collision with root package name */
    private final zzbzg f14679m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f14680n;

    /* renamed from: o  reason: collision with root package name */
    final CountDownLatch f14681o = new CountDownLatch(1);

    /* renamed from: p  reason: collision with root package name */
    private int f14682p;

    public i(Context context, zzbzg zzbzg) {
        this.f14676j = context;
        this.f14677k = context;
        this.f14678l = zzbzg;
        this.f14679m = zzbzg;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f14674h = newCachedThreadPool;
        boolean booleanValue = ((Boolean) a0.c().zzb(zzbar.zzbX)).booleanValue();
        this.f14680n = booleanValue;
        this.f14675i = zzfhp.zza(context, newCachedThreadPool, booleanValue);
        this.f14672f = ((Boolean) a0.c().zzb(zzbar.zzbT)).booleanValue();
        this.f14673g = ((Boolean) a0.c().zzb(zzbar.zzbY)).booleanValue();
        if (((Boolean) a0.c().zzb(zzbar.zzbW)).booleanValue()) {
            this.f14682p = 2;
        } else {
            this.f14682p = 1;
        }
        if (!((Boolean) a0.c().zzb(zzbar.zzcX)).booleanValue()) {
            this.f14671d = c();
        }
        if (((Boolean) a0.c().zzb(zzbar.zzcQ)).booleanValue()) {
            zzbzn.zza.execute(this);
            return;
        }
        x.b();
        if (zzbyt.zzv()) {
            zzbzn.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzaps f() {
        if (e() == 2) {
            return (zzaps) this.f14670c.get();
        }
        return (zzaps) this.f14669b.get();
    }

    private final void g() {
        zzaps f10 = f();
        if (!this.f14668a.isEmpty() && f10 != null) {
            for (Object[] objArr : this.f14668a) {
                int length = objArr.length;
                if (length == 1) {
                    f10.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    f10.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f14668a.clear();
        }
    }

    private final void h(boolean z10) {
        this.f14669b.set(zzapv.zzu(this.f14678l.zza, i(this.f14676j), z10, this.f14682p));
    }

    private static final Context i(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzapp.zza(this.f14679m.zza, i(this.f14677k), z10, this.f14680n).zzp();
        } catch (NullPointerException e10) {
            this.f14675i.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        Context context = this.f14676j;
        zzfhp zzfhp = this.f14675i;
        h hVar = new h(this);
        return new zzfjl(this.f14676j, zzfir.zzb(context, zzfhp), hVar, ((Boolean) a0.c().zzb(zzbar.zzbU)).booleanValue()).zzd(1);
    }

    public final boolean d() {
        try {
            this.f14681o.await();
            return true;
        } catch (InterruptedException e10) {
            zzbza.zzk("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final int e() {
        if (!this.f14672f || this.f14671d) {
            return this.f14682p;
        }
        return 1;
    }

    public final void run() {
        boolean z10;
        long currentTimeMillis;
        try {
            if (((Boolean) a0.c().zzb(zzbar.zzcX)).booleanValue()) {
                this.f14671d = c();
            }
            boolean z11 = this.f14678l.zzd;
            z10 = false;
            if (!((Boolean) a0.c().zzb(zzbar.zzaQ)).booleanValue() && z11) {
                z10 = true;
            }
            if (e() == 1) {
                h(z10);
                if (this.f14682p == 2) {
                    this.f14674h.execute(new g(this, z10));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                zzapp zza = zzapp.zza(this.f14678l.zza, i(this.f14676j), z10, this.f14680n);
                this.f14670c.set(zza);
                if (this.f14673g && !zza.zzr()) {
                    this.f14682p = 1;
                    h(z10);
                }
            }
        } catch (NullPointerException e10) {
            this.f14682p = 1;
            h(z10);
            this.f14675i.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e10);
        } catch (Throwable th) {
            this.f14681o.countDown();
            this.f14676j = null;
            this.f14678l = null;
            throw th;
        }
        this.f14681o.countDown();
        this.f14676j = null;
        this.f14678l = null;
    }

    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, (Activity) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!d()) {
            return MaxReward.DEFAULT_LABEL;
        }
        zzaps f10 = f();
        if (((Boolean) a0.c().zzb(zzbar.zzja)).booleanValue()) {
            t.r();
            b2.f(view, 4, (MotionEvent) null);
        }
        if (f10 == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        g();
        return f10.zzf(i(context), str, view, activity);
    }

    public final String zzg(Context context) {
        zzaps f10;
        if (!d() || (f10 = f()) == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        g();
        return f10.zzg(i(context));
    }

    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) a0.c().zzb(zzbar.zziZ)).booleanValue()) {
            zzaps f10 = f();
            if (((Boolean) a0.c().zzb(zzbar.zzja)).booleanValue()) {
                t.r();
                b2.f(view, 2, (MotionEvent) null);
            }
            return f10 != null ? f10.zzh(context, view, activity) : MaxReward.DEFAULT_LABEL;
        } else if (!d()) {
            return MaxReward.DEFAULT_LABEL;
        } else {
            zzaps f11 = f();
            if (((Boolean) a0.c().zzb(zzbar.zzja)).booleanValue()) {
                t.r();
                b2.f(view, 2, (MotionEvent) null);
            }
            if (f11 != null) {
                return f11.zzh(context, view, activity);
            }
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public final void zzk(MotionEvent motionEvent) {
        zzaps f10 = f();
        if (f10 != null) {
            g();
            f10.zzk(motionEvent);
            return;
        }
        this.f14668a.add(new Object[]{motionEvent});
    }

    public final void zzl(int i10, int i11, int i12) {
        zzaps f10 = f();
        if (f10 != null) {
            g();
            f10.zzl(i10, i11, i12);
            return;
        }
        this.f14668a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaps f10;
        if (d() && (f10 = f()) != null) {
            f10.zzn(stackTraceElementArr);
        }
    }

    public final void zzo(View view) {
        zzaps f10 = f();
        if (f10 != null) {
            f10.zzo(view);
        }
    }
}
