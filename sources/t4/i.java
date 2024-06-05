package t4;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    public final String f22689a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22690b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22691c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22692d;

    /* renamed from: f  reason: collision with root package name */
    public final String f22693f;

    /* renamed from: g  reason: collision with root package name */
    public final String f22694g;

    /* renamed from: h  reason: collision with root package name */
    public final String f22695h;

    /* renamed from: i  reason: collision with root package name */
    public final Intent f22696i;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f22697j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f22698k;

    public i(Intent intent, c0 c0Var) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent, b.B1(c0Var).asBinder(), false);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.f22689a, false);
        c.q(parcel, 3, this.f22690b, false);
        c.q(parcel, 4, this.f22691c, false);
        c.q(parcel, 5, this.f22692d, false);
        c.q(parcel, 6, this.f22693f, false);
        c.q(parcel, 7, this.f22694g, false);
        c.q(parcel, 8, this.f22695h, false);
        c.p(parcel, 9, this.f22696i, i10, false);
        c.j(parcel, 10, b.B1(this.f22697j).asBinder(), false);
        c.c(parcel, 11, this.f22698k);
        c.b(parcel, a10);
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10) {
        this.f22689a = str;
        this.f22690b = str2;
        this.f22691c = str3;
        this.f22692d = str4;
        this.f22693f = str5;
        this.f22694g = str6;
        this.f22695h = str7;
        this.f22696i = intent;
        this.f22697j = (c0) b.A1(a.C0158a.M0(iBinder));
        this.f22698k = z10;
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, c0 c0Var) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null, b.B1(c0Var).asBinder(), false);
    }
}
