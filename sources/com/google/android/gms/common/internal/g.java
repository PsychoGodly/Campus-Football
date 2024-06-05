package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.c;
import h5.d;
import h5.e;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class g<T extends IInterface> extends c<T> implements a.f, i0 {
    private static volatile Executor zaa;
    private final d zab;
    private final Set<Scope> zac;
    private final Account zad;

    protected g(Context context, Handler handler, int i10, d dVar) {
        super(context, handler, h.b(context), e.q(), i10, (c.a) null, (c.b) null);
        this.zab = (d) q.k(dVar);
        this.zad = dVar.a();
        this.zac = zaa(dVar.c());
    }

    private final Set<Scope> zaa(Set<Scope> set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope contains : validateScopes) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    public final Account getAccount() {
        return this.zad;
    }

    /* access modifiers changed from: protected */
    public final Executor getBindServiceExecutor() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final d getClientSettings() {
        return this.zab;
    }

    public d[] getRequiredFeatures() {
        return new d[0];
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    protected g(Context context, Looper looper, int i10, d dVar) {
        this(context, looper, h.b(context), e.q(), i10, dVar, (com.google.android.gms.common.api.internal.e) null, (m) null);
    }

    @Deprecated
    protected g(Context context, Looper looper, int i10, d dVar, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        this(context, looper, i10, dVar, (com.google.android.gms.common.api.internal.e) bVar, (m) cVar);
    }

    protected g(Context context, Looper looper, int i10, d dVar, com.google.android.gms.common.api.internal.e eVar, m mVar) {
        this(context, looper, h.b(context), e.q(), i10, dVar, (com.google.android.gms.common.api.internal.e) q.k(eVar), (m) q.k(mVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected g(android.content.Context r11, android.os.Looper r12, com.google.android.gms.common.internal.h r13, h5.e r14, int r15, com.google.android.gms.common.internal.d r16, com.google.android.gms.common.api.internal.e r17, com.google.android.gms.common.api.internal.m r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.g0 r3 = new com.google.android.gms.common.internal.g0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.h0 r0 = new com.google.android.gms.common.internal.h0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.h()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.zab = r0
            android.accounts.Account r1 = r16.a()
            r9.zad = r1
            java.util.Set r0 = r16.c()
            java.util.Set r0 = r10.zaa(r0)
            r9.zac = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.g.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.h, h5.e, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.e, com.google.android.gms.common.api.internal.m):void");
    }
}
