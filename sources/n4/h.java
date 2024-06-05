package n4;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class h {

    /* renamed from: i  reason: collision with root package name */
    public static final h f20927i = new h(320, 50, "320x50_mb");

    /* renamed from: j  reason: collision with root package name */
    public static final h f20928j = new h(468, 60, "468x60_as");

    /* renamed from: k  reason: collision with root package name */
    public static final h f20929k = new h(320, 100, "320x100_as");

    /* renamed from: l  reason: collision with root package name */
    public static final h f20930l = new h(728, 90, "728x90_as");

    /* renamed from: m  reason: collision with root package name */
    public static final h f20931m = new h(300, 250, "300x250_as");

    /* renamed from: n  reason: collision with root package name */
    public static final h f20932n = new h(160, 600, "160x600_as");
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    public static final h f20933o = new h(-1, -2, "smart_banner");

    /* renamed from: p  reason: collision with root package name */
    public static final h f20934p = new h(-3, -4, "fluid");

    /* renamed from: q  reason: collision with root package name */
    public static final h f20935q = new h(0, 0, "invalid");

    /* renamed from: r  reason: collision with root package name */
    public static final h f20936r = new h(-3, 0, "search_v2");

    /* renamed from: s  reason: collision with root package name */
    public static final h f20937s = new h(50, 50, "50x50_mb");

    /* renamed from: a  reason: collision with root package name */
    private final int f20938a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20939b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20940c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20941d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20942e;

    /* renamed from: f  reason: collision with root package name */
    private int f20943f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20944g;

    /* renamed from: h  reason: collision with root package name */
    private int f20945h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(int r4, int r5) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r4)
        L_0x000a:
            r1 = -2
            if (r5 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r5)
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "_as"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.h.<init>(int, int):void");
    }

    public static h a(Context context, int i10) {
        h zzc = zzbyt.zzc(context, i10, 50, 0);
        zzc.f20941d = true;
        return zzc;
    }

    public static h b(Context context, int i10) {
        int zza = zzbyt.zza(context, 0);
        if (zza == -1) {
            return f20935q;
        }
        h hVar = new h(i10, 0);
        hVar.f20943f = zza;
        hVar.f20942e = true;
        return hVar;
    }

    public static h e(int i10, int i11) {
        h hVar = new h(i10, 0);
        hVar.f20943f = i11;
        hVar.f20942e = true;
        if (i11 < 32) {
            zzbza.zzj("The maximum height set for the inline adaptive ad size was " + i11 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return hVar;
    }

    public static h f(Context context, int i10) {
        h zzc = zzbyt.zzc(context, i10, 50, 2);
        zzc.f20941d = true;
        return zzc;
    }

    public static h g(Context context, int i10) {
        int zza = zzbyt.zza(context, 2);
        h hVar = new h(i10, 0);
        if (zza == -1) {
            return f20935q;
        }
        hVar.f20943f = zza;
        hVar.f20942e = true;
        return hVar;
    }

    public static h h(Context context, int i10) {
        h zzc = zzbyt.zzc(context, i10, 50, 1);
        zzc.f20941d = true;
        return zzc;
    }

    public static h i(Context context, int i10) {
        int zza = zzbyt.zza(context, 1);
        h hVar = new h(i10, 0);
        if (zza == -1) {
            return f20935q;
        }
        hVar.f20943f = zza;
        hVar.f20942e = true;
        return hVar;
    }

    public int c() {
        return this.f20939b;
    }

    public int d(Context context) {
        int i10 = this.f20939b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return z4.b(context.getResources().getDisplayMetrics());
        }
        x.b();
        return zzbyt.zzy(context, this.f20939b);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20938a == hVar.f20938a && this.f20939b == hVar.f20939b && this.f20940c.equals(hVar.f20940c);
    }

    public int hashCode() {
        return this.f20940c.hashCode();
    }

    public int j() {
        return this.f20938a;
    }

    public int k(Context context) {
        int i10 = this.f20938a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            x.b();
            return zzbyt.zzy(context, this.f20938a);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<z4> creator = z4.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean l() {
        return this.f20938a == -3 && this.f20939b == -4;
    }

    /* access modifiers changed from: package-private */
    public final int m() {
        return this.f20945h;
    }

    /* access modifiers changed from: package-private */
    public final int n() {
        return this.f20943f;
    }

    /* access modifiers changed from: package-private */
    public final void o(int i10) {
        this.f20943f = i10;
    }

    /* access modifiers changed from: package-private */
    public final void p(int i10) {
        this.f20945h = i10;
    }

    /* access modifiers changed from: package-private */
    public final void q(boolean z10) {
        this.f20942e = true;
    }

    /* access modifiers changed from: package-private */
    public final void r(boolean z10) {
        this.f20944g = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return this.f20941d;
    }

    /* access modifiers changed from: package-private */
    public final boolean t() {
        return this.f20942e;
    }

    public String toString() {
        return this.f20940c;
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        return this.f20944g;
    }

    h(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i10);
        } else if (i11 >= 0 || i11 == -2 || i11 == -4) {
            this.f20938a = i10;
            this.f20939b = i11;
            this.f20940c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i11);
        }
    }
}
