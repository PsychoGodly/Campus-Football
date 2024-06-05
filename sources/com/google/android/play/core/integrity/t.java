package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.b0;
import com.google.android.play.integrity.internal.h;
import com.google.android.play.integrity.internal.n;
import com.google.android.play.integrity.internal.y;
import java.util.ArrayList;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class t {

    /* renamed from: a  reason: collision with root package name */
    final y f26064a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n f26065b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26066c;

    t(Context context, n nVar) {
        this.f26066c = context.getPackageName();
        this.f26065b = nVar;
        if (!b0.a(context)) {
            nVar.b("Phonesky is not installed.", new Object[0]);
            this.f26064a = null;
            return;
        }
        this.f26064a = new y(context, nVar, "IntegrityService", u.f26067a, q.f26055a, (com.google.android.play.integrity.internal.t) null, (byte[]) null);
    }

    static /* bridge */ /* synthetic */ Bundle a(t tVar, byte[] bArr, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", tVar.f26066c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList<h> arrayList = new ArrayList<>();
        arrayList.add(h.c(3, System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (h b10 : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", b10.b());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(arrayList2));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f26064a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.f26065b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f26064a.p(new r(this, taskCompletionSource, decode, cloudProjectNumber, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
