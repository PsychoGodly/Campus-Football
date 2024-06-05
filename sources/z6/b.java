package z6;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o7.d;
import q5.a;
import y6.f;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public class b implements a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f31431c;

    /* renamed from: a  reason: collision with root package name */
    private final a f31432a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, Object> f31433b = new ConcurrentHashMap();

    private b(a aVar) {
        q.k(aVar);
        this.f31432a = aVar;
    }

    public static a c(f fVar, Context context, d dVar) {
        q.k(fVar);
        q.k(context);
        q.k(dVar);
        q.k(context.getApplicationContext());
        if (f31431c == null) {
            synchronized (b.class) {
                if (f31431c == null) {
                    Bundle bundle = new Bundle(1);
                    if (fVar.y()) {
                        dVar.a(y6.b.class, c.f31434a, d.f31435a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", fVar.x());
                    }
                    f31431c = new b(zzdf.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return f31431c;
    }

    static /* synthetic */ void d(o7.a aVar) {
        boolean z10 = ((y6.b) aVar.a()).f31317a;
        synchronized (b.class) {
            ((b) q.k(f31431c)).f31432a.u(z10);
        }
    }

    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.a.e(str) && com.google.firebase.analytics.connector.internal.a.b(str2, bundle) && com.google.firebase.analytics.connector.internal.a.d(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.a.a(str, str2, bundle);
            this.f31432a.n(str, str2, bundle);
        }
    }

    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.a.e(str) && com.google.firebase.analytics.connector.internal.a.c(str, str2)) {
            this.f31432a.t(str, str2, obj);
        }
    }
}
