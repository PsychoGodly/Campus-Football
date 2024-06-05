package j5;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class d extends e<x> implements w {

    /* renamed from: a  reason: collision with root package name */
    private static final a.g<e> f19495a;

    /* renamed from: b  reason: collision with root package name */
    private static final a.C0154a<e, x> f19496b;

    /* renamed from: c  reason: collision with root package name */
    private static final a<x> f19497c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f19498d = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f19495a = gVar;
        c cVar = new c();
        f19496b = cVar;
        f19497c = new a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, x xVar) {
        super(context, f19497c, xVar, e.a.f15026c);
    }

    public final Task<Void> a(u uVar) {
        s.a a10 = s.a();
        a10.d(zad.zaa);
        a10.c(false);
        a10.b(new b(uVar));
        return doBestEffortWrite(a10.a());
    }
}
