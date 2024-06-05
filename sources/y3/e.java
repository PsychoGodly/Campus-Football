package y3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import k4.c;
import k4.n0;
import n2.h;
import s6.u;

/* compiled from: CueGroup */
public final class e implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final e f23862c = new e(u.y(), 0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f23863d = n0.r0(0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f23864f = n0.r0(1);

    /* renamed from: g  reason: collision with root package name */
    public static final h.a<e> f23865g = d.f39377a;

    /* renamed from: a  reason: collision with root package name */
    public final u<b> f23866a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23867b;

    public e(List<b> list, long j10) {
        this.f23866a = u.u(list);
        this.f23867b = j10;
    }

    /* access modifiers changed from: private */
    public static final e b(Bundle bundle) {
        u<b> uVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f23863d);
        if (parcelableArrayList == null) {
            uVar = u.y();
        } else {
            uVar = c.b(b.K, parcelableArrayList);
        }
        return new e(uVar, bundle.getLong(f23864f));
    }
}
