package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzatt;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.a0;
import n4.b0;
import n4.d;
import n4.d0;
import n4.h;
import n4.s;
import n4.y;
import o4.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class d3 {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnc f14434a;

    /* renamed from: b  reason: collision with root package name */
    private final y4 f14435b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f14436c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final a0 f14437d;

    /* renamed from: e  reason: collision with root package name */
    final y f14438e;

    /* renamed from: f  reason: collision with root package name */
    private a f14439f;

    /* renamed from: g  reason: collision with root package name */
    private d f14440g;

    /* renamed from: h  reason: collision with root package name */
    private h[] f14441h;

    /* renamed from: i  reason: collision with root package name */
    private e f14442i;

    /* renamed from: j  reason: collision with root package name */
    private u0 f14443j;

    /* renamed from: k  reason: collision with root package name */
    private b0 f14444k;

    /* renamed from: l  reason: collision with root package name */
    private String f14445l;

    /* renamed from: m  reason: collision with root package name */
    private final ViewGroup f14446m;

    /* renamed from: n  reason: collision with root package name */
    private int f14447n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14448o;

    /* renamed from: p  reason: collision with root package name */
    private s f14449p;

    public d3(ViewGroup viewGroup, int i10) {
        this(viewGroup, (AttributeSet) null, false, y4.f14626a, (u0) null, i10);
    }

    private static z4 b(Context context, h[] hVarArr, int i10) {
        for (h equals : hVarArr) {
            if (equals.equals(h.f20935q)) {
                return z4.y();
            }
        }
        z4 z4Var = new z4(context, hVarArr);
        z4Var.f14655k = c(i10);
        return z4Var;
    }

    private static boolean c(int i10) {
        return i10 == 1;
    }

    public final void A(b0 b0Var) {
        n4 n4Var;
        this.f14444k = b0Var;
        try {
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                if (b0Var == null) {
                    n4Var = null;
                } else {
                    n4Var = new n4(b0Var);
                }
                u0Var.zzU(n4Var);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final boolean B(u0 u0Var) {
        try {
            a zzn = u0Var.zzn();
            if (zzn == null || ((View) b.A1(zzn)).getParent() != null) {
                return false;
            }
            this.f14446m.addView((View) b.A1(zzn));
            this.f14443j = u0Var;
            return true;
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final h[] a() {
        return this.f14441h;
    }

    public final d d() {
        return this.f14440g;
    }

    public final h e() {
        z4 zzg;
        try {
            u0 u0Var = this.f14443j;
            if (!(u0Var == null || (zzg = u0Var.zzg()) == null)) {
                return d0.c(zzg.f14650f, zzg.f14647b, zzg.f14646a);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        h[] hVarArr = this.f14441h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public final s f() {
        return this.f14449p;
    }

    public final y g() {
        p2 p2Var = null;
        try {
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                p2Var = u0Var.zzk();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        return y.f(p2Var);
    }

    public final a0 i() {
        return this.f14437d;
    }

    public final b0 j() {
        return this.f14444k;
    }

    public final e k() {
        return this.f14442i;
    }

    public final s2 l() {
        u0 u0Var = this.f14443j;
        if (u0Var != null) {
            try {
                return u0Var.zzl();
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
        return null;
    }

    public final String m() {
        u0 u0Var;
        if (this.f14445l == null && (u0Var = this.f14443j) != null) {
            try {
                this.f14445l = u0Var.zzr();
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
        return this.f14445l;
    }

    public final void n() {
        try {
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                u0Var.zzx();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o(a aVar) {
        this.f14446m.addView((View) b.A1(aVar));
    }

    public final void p(z2 z2Var) {
        u0 u0Var;
        try {
            if (this.f14443j == null) {
                if (this.f14441h == null || this.f14445l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f14446m.getContext();
                z4 b10 = b(context, this.f14441h, this.f14447n);
                if ("search_v2".equals(b10.f14646a)) {
                    u0Var = (u0) new m(x.a(), context, b10, this.f14445l).d(context, false);
                } else {
                    u0Var = (u0) new k(x.a(), context, b10, this.f14445l, this.f14434a).d(context, false);
                }
                this.f14443j = u0Var;
                u0Var.zzD(new p4(this.f14438e));
                a aVar = this.f14439f;
                if (aVar != null) {
                    this.f14443j.zzC(new z(aVar));
                }
                e eVar = this.f14442i;
                if (eVar != null) {
                    this.f14443j.zzG(new zzatt(eVar));
                }
                if (this.f14444k != null) {
                    this.f14443j.zzU(new n4(this.f14444k));
                }
                this.f14443j.zzP(new h4(this.f14449p));
                this.f14443j.zzN(this.f14448o);
                u0 u0Var2 = this.f14443j;
                if (u0Var2 != null) {
                    try {
                        a zzn = u0Var2.zzn();
                        if (zzn != null) {
                            if (((Boolean) zzbci.zzf.zze()).booleanValue()) {
                                if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                                    zzbyt.zza.post(new a3(this, zzn));
                                }
                            }
                            this.f14446m.addView((View) b.A1(zzn));
                        }
                    } catch (RemoteException e10) {
                        zzbza.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
            u0 u0Var3 = this.f14443j;
            Objects.requireNonNull(u0Var3);
            u0Var3.zzaa(this.f14435b.a(this.f14446m.getContext(), z2Var));
        } catch (RemoteException e11) {
            zzbza.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void q() {
        try {
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                u0Var.zzz();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void r() {
        try {
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                u0Var.zzB();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void s(a aVar) {
        try {
            this.f14439f = aVar;
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                u0Var.zzC(aVar != null ? new z(aVar) : null);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void t(d dVar) {
        this.f14440g = dVar;
        this.f14438e.d(dVar);
    }

    public final void u(h... hVarArr) {
        if (this.f14441h == null) {
            v(hVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void v(h... hVarArr) {
        this.f14441h = hVarArr;
        try {
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                u0Var.zzF(b(this.f14446m.getContext(), this.f14441h, this.f14447n));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        this.f14446m.requestLayout();
    }

    public final void w(String str) {
        if (this.f14445l == null) {
            this.f14445l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void x(e eVar) {
        try {
            this.f14442i = eVar;
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                u0Var.zzG(eVar != null ? new zzatt(eVar) : null);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void y(boolean z10) {
        this.f14448o = z10;
        try {
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                u0Var.zzN(z10);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void z(s sVar) {
        try {
            this.f14449p = sVar;
            u0 u0Var = this.f14443j;
            if (u0Var != null) {
                u0Var.zzP(new h4(sVar));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    d3(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, y4 y4Var, u0 u0Var, int i10) {
        z4 z4Var;
        this.f14434a = new zzbnc();
        this.f14437d = new a0();
        this.f14438e = new b3(this);
        this.f14446m = viewGroup;
        this.f14435b = y4Var;
        this.f14443j = null;
        this.f14436c = new AtomicBoolean(false);
        this.f14447n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                h5 h5Var = new h5(context, attributeSet);
                this.f14441h = h5Var.b(z10);
                this.f14445l = h5Var.a();
                if (viewGroup.isInEditMode()) {
                    zzbyt b10 = x.b();
                    h hVar = this.f14441h[0];
                    int i11 = this.f14447n;
                    if (hVar.equals(h.f20935q)) {
                        z4Var = z4.y();
                    } else {
                        z4 z4Var2 = new z4(context, hVar);
                        z4Var2.f14655k = c(i11);
                        z4Var = z4Var2;
                    }
                    b10.zzn(viewGroup, z4Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e10) {
                x.b().zzm(viewGroup, new z4(context, h.f20927i), e10.getMessage(), e10.getMessage());
            }
        }
    }
}
