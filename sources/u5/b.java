package u5;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class b extends a.C0154a<v5.a, a> {
    b() {
    }

    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, d dVar, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        a aVar = (a) obj;
        return new v5.a(context, looper, true, dVar, v5.a.e(dVar), bVar, cVar);
    }
}
