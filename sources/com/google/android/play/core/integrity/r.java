package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.o;
import com.google.android.play.integrity.internal.z;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class r extends o {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f26056a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Long f26057b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f26058c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f26059d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t f26060e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(t tVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f26060e = tVar;
        this.f26056a = bArr;
        this.f26057b = l10;
        this.f26058c = taskCompletionSource2;
        this.f26059d = integrityTokenRequest;
    }

    public final void a(Exception exc) {
        if (exc instanceof z) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.integrity.internal.k] */
    /* access modifiers changed from: protected */
    public final void b() {
        try {
            this.f26060e.f26064a.e().p1(t.a(this.f26060e, this.f26056a, this.f26057b), new s(this.f26060e, this.f26058c));
        } catch (RemoteException e10) {
            this.f26060e.f26065b.c(e10, "requestIntegrityToken(%s)", this.f26059d);
            this.f26058c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
