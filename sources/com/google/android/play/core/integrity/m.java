package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class m implements IntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final t f26050a;

    m(t tVar) {
        this.f26050a = tVar;
    }

    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f26050a.b(integrityTokenRequest);
    }
}
