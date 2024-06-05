package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.l;
import com.google.android.play.integrity.internal.n;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class s extends l {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f26061a;

    /* renamed from: b  reason: collision with root package name */
    private final n f26062b = new n("OnRequestIntegrityTokenCallback");

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f26063c;

    s(t tVar, TaskCompletionSource taskCompletionSource) {
        this.f26061a = tVar;
        this.f26063c = taskCompletionSource;
    }

    public final void b(Bundle bundle) {
        this.f26061a.f26064a.r(this.f26063c);
        this.f26062b.d("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f26063c.trySetException(new IntegrityServiceException(i10, (Throwable) null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f26063c.trySetException(new IntegrityServiceException(-100, (Throwable) null));
            return;
        }
        TaskCompletionSource taskCompletionSource = this.f26063c;
        d dVar = new d();
        dVar.a(string);
        taskCompletionSource.trySetResult(dVar.b());
    }
}
