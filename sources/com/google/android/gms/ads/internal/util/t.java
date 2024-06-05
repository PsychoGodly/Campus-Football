package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzdsf;
import com.google.android.gms.internal.ads.zzfuu;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14890a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdsf f14891b;

    /* renamed from: c  reason: collision with root package name */
    private String f14892c;

    /* renamed from: d  reason: collision with root package name */
    private String f14893d;

    /* renamed from: e  reason: collision with root package name */
    private String f14894e;

    /* renamed from: f  reason: collision with root package name */
    private String f14895f;

    /* renamed from: g  reason: collision with root package name */
    private int f14896g;

    /* renamed from: h  reason: collision with root package name */
    private int f14897h;

    /* renamed from: i  reason: collision with root package name */
    private PointF f14898i;

    /* renamed from: j  reason: collision with root package name */
    private PointF f14899j;

    /* renamed from: k  reason: collision with root package name */
    private Handler f14900k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f14901l;

    public t(Context context) {
        this.f14896g = 0;
        this.f14901l = new s(this);
        this.f14890a = context;
        this.f14897h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.t.v().b();
        this.f14900k = com.google.android.gms.ads.internal.t.v().a();
        this.f14891b = com.google.android.gms.ads.internal.t.u().a();
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u10 = u(arrayList, "None", true);
        int u11 = u(arrayList, "Shake", true);
        int u12 = u(arrayList, "Flick", true);
        zzdsb zzdsb = zzdsb.NONE;
        int ordinal = this.f14891b.zza().ordinal();
        int i10 = ordinal != 1 ? ordinal != 2 ? u10 : u12 : u11;
        com.google.android.gms.ads.internal.t.r();
        AlertDialog.Builder g10 = b2.g(context);
        AtomicInteger atomicInteger = new AtomicInteger(i10);
        g10.setTitle("Setup gesture");
        g10.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new k(atomicInteger));
        g10.setNegativeButton("Dismiss", new l(this));
        g10.setPositiveButton("Save", new m(this, atomicInteger, i10, u11, u12));
        g10.setOnCancelListener(new n(this));
        g10.create().show();
    }

    private final boolean t(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f14898i.x - f10) < ((float) this.f14897h) && Math.abs(this.f14898i.y - f11) < ((float) this.f14897h) && Math.abs(this.f14899j.x - f12) < ((float) this.f14897h) && Math.abs(this.f14899j.y - f13) < ((float) this.f14897h);
    }

    private static final int u(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        s(this.f14890a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        s(this.f14890a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(zzfuu zzfuu) {
        if (!com.google.android.gms.ads.internal.t.u().j(this.f14890a, this.f14893d, this.f14894e)) {
            com.google.android.gms.ads.internal.t.u().d(this.f14890a, this.f14893d, this.f14894e);
        } else {
            zzfuu.execute(new g(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzfuu zzfuu) {
        if (!com.google.android.gms.ads.internal.t.u().j(this.f14890a, this.f14893d, this.f14894e)) {
            com.google.android.gms.ads.internal.t.u().d(this.f14890a, this.f14893d, this.f14894e);
        } else {
            zzfuu.execute(new r(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        com.google.android.gms.ads.internal.t.u().c(this.f14890a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        com.google.android.gms.ads.internal.t.u().c(this.f14890a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        this.f14896g = 4;
        r();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                this.f14891b.zzk(zzdsb.SHAKE);
            } else if (atomicInteger.get() == i12) {
                this.f14891b.zzk(zzdsb.FLICK);
            } else {
                this.f14891b.zzk(zzdsb.NONE);
            }
        }
        r();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.t.r();
        b2.q(this.f14890a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 == i10) {
            if (!(this.f14890a instanceof Activity)) {
                zzbza.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = this.f14892c;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb2 = new StringBuilder();
                com.google.android.gms.ads.internal.t.r();
                Map l10 = b2.l(build);
                for (String str3 : l10.keySet()) {
                    sb2.append(str3);
                    sb2.append(" = ");
                    sb2.append((String) l10.get(str3));
                    sb2.append("\n\n");
                }
                String trim = sb2.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            com.google.android.gms.ads.internal.t.r();
            AlertDialog.Builder g10 = b2.g(this.f14890a);
            g10.setMessage(str2);
            g10.setTitle("Ad Information");
            g10.setPositiveButton("Share", new e(this, str2));
            g10.setNegativeButton("Close", f.f14794a);
            g10.create().show();
        } else if (i15 == i11) {
            zzbza.zze("Debug mode [Creative Preview] selected.");
            zzbzn.zza.execute(new d(this));
        } else if (i15 == i12) {
            zzbza.zze("Debug mode [Troubleshooting] selected.");
            zzbzn.zza.execute(new h(this));
        } else if (i15 == i13) {
            zzfuu zzfuu = zzbzn.zze;
            zzfuu zzfuu2 = zzbzn.zza;
            if (this.f14891b.zzo()) {
                zzfuu.execute(new o(this));
            } else {
                zzfuu2.execute(new p(this, zzfuu));
            }
        } else if (i15 == i14) {
            zzfuu zzfuu3 = zzbzn.zze;
            zzfuu zzfuu4 = zzbzn.zza;
            if (this.f14891b.zzo()) {
                zzfuu3.execute(new i(this));
            } else {
                zzfuu4.execute(new j(this, zzfuu3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        x u10 = com.google.android.gms.ads.internal.t.u();
        Context context = this.f14890a;
        String str = this.f14893d;
        String str2 = this.f14894e;
        String str3 = this.f14895f;
        boolean m10 = u10.m();
        u10.h(u10.j(context, str, str2));
        if (u10.m()) {
            if (!m10 && !TextUtils.isEmpty(str3)) {
                u10.e(context, str2, str3, str);
            }
            zzbza.zze("Device is linked for debug signals.");
            u10.i(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        u10.d(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        x u10 = com.google.android.gms.ads.internal.t.u();
        Context context = this.f14890a;
        String str = this.f14893d;
        String str2 = this.f14894e;
        if (!u10.k(context, str, str2)) {
            u10.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if (CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(u10.f14923f)) {
            zzbza.zze("Creative is not pushed for this device.");
            u10.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(u10.f14923f)) {
            zzbza.zze("The app is not linked for creative preview.");
            u10.d(context, str, str2);
        } else if ("0".equals(u10.f14923f)) {
            zzbza.zze("Device is linked for in app preview.");
            u10.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f14896g = 0;
            this.f14898i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f14896g;
        if (i10 != -1) {
            if (i10 == 0) {
                if (actionMasked == 5) {
                    this.f14896g = 5;
                    this.f14899j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.f14900k.postDelayed(this.f14901l, ((Long) a0.c().zzb(zzbar.zzek)).longValue());
                }
            } else if (i10 == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z10 = false;
                        for (int i11 = 0; i11 < historySize; i11++) {
                            z10 |= !t(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                        }
                        if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f14896g = -1;
                this.f14900k.removeCallbacks(this.f14901l);
            }
        }
    }

    public final void n(String str) {
        this.f14893d = str;
    }

    public final void o(String str) {
        this.f14894e = str;
    }

    public final void p(String str) {
        this.f14892c = str;
    }

    public final void q(String str) {
        this.f14895f = str;
    }

    public final void r() {
        try {
            if (!(this.f14890a instanceof Activity)) {
                zzbza.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.t.u().b())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != com.google.android.gms.ads.internal.t.u().m()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int u10 = u(arrayList, "Ad information", true);
            int u11 = u(arrayList, str, true);
            int u12 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) a0.c().zzb(zzbar.zziu)).booleanValue();
            int u13 = u(arrayList, "Open ad inspector", booleanValue);
            int u14 = u(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.t.r();
            AlertDialog.Builder g10 = b2.g(this.f14890a);
            g10.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new q(this, u10, u11, u12, u13, u14));
            g10.create().show();
        } catch (WindowManager.BadTokenException e10) {
            n1.b(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f14892c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f14895f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f14894e);
        sb2.append(",Ad Unit ID: ");
        sb2.append(this.f14893d);
        sb2.append("}");
        return sb2.toString();
    }

    public t(Context context, String str) {
        this(context);
        this.f14892c = str;
    }
}
