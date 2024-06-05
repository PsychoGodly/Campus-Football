package h5;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: a  reason: collision with root package name */
    private final String f18818a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f18819b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f18820c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f18821d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f18822f;

    c0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f18818a = str;
        this.f18819b = z10;
        this.f18820c = z11;
        this.f18821d = (Context) b.A1(a.C0158a.M0(iBinder));
        this.f18822f = z12;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.android.gms.dynamic.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f18818a, false);
        c.c(parcel, 2, this.f18819b);
        c.c(parcel, 3, this.f18820c);
        c.j(parcel, 4, b.B1(this.f18821d), false);
        c.c(parcel, 5, this.f18822f);
        c.b(parcel, a10);
    }
}
