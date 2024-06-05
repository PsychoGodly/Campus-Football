package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.e2;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.i1;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.n1;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import m5.m;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class e<O extends a.d> {
    protected final f zaa;
    private final Context zab;
    private final String zac;
    private final a<O> zad;
    private final O zae;
    private final b<O> zaf;
    private final Looper zag;
    private final int zah;
    private final GoogleApiClient zai;
    private final r zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f15026c = new C0156a().a();

        /* renamed from: a  reason: collision with root package name */
        public final r f15027a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f15028b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static class C0156a {

            /* renamed from: a  reason: collision with root package name */
            private r f15029a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f15030b;

            public a a() {
                if (this.f15029a == null) {
                    this.f15029a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.f15030b == null) {
                    this.f15030b = Looper.getMainLooper();
                }
                return new a(this.f15029a, this.f15030b);
            }

            public C0156a b(Looper looper) {
                q.l(looper, "Looper must not be null.");
                this.f15030b = looper;
                return this;
            }

            public C0156a c(r rVar) {
                q.l(rVar, "StatusExceptionMapper must not be null.");
                this.f15029a = rVar;
                return this;
            }
        }

        private a(r rVar, Account account, Looper looper) {
            this.f15027a = rVar;
            this.f15028b = looper;
        }
    }

    public e(Activity activity, a<O> aVar, O o10, a aVar2) {
        this((Context) activity, activity, aVar, o10, aVar2);
    }

    private final <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends i, A>> T zad(int i10, T t10) {
        t10.k();
        this.zaa.F(this, i10, t10);
        return t10;
    }

    private final <TResult, A extends a.b> Task<TResult> zae(int i10, s<A, TResult> sVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.G(this, i10, sVar, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    /* access modifiers changed from: protected */
    public d.a createClientSettingsBuilder() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a10;
        d.a aVar = new d.a();
        O o10 = this.zae;
        if (!(o10 instanceof a.d.b) || (a10 = ((a.d.b) o10).a()) == null) {
            O o11 = this.zae;
            account = o11 instanceof a.d.C0155a ? ((a.d.C0155a) o11).b() : null;
        } else {
            account = a10.v();
        }
        aVar.d(account);
        O o12 = this.zae;
        if (o12 instanceof a.d.b) {
            GoogleSignInAccount a11 = ((a.d.b) o12).a();
            if (a11 == null) {
                set = Collections.emptySet();
            } else {
                set = a11.B();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.c(set);
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    /* access modifiers changed from: protected */
    public Task<Boolean> disconnectService() {
        return this.zaa.z(this);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends i, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends i, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    @Deprecated
    public <A extends a.b, T extends n<A, ?>, U extends u<A, ?>> Task<Void> doRegisterEventListener(T t10, U u10) {
        q.k(t10);
        q.k(u10);
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(j.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends i, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    public final b<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    /* access modifiers changed from: protected */
    public String getContextAttributionTag() {
        return this.zac;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> j<L> registerListener(L l10, String str) {
        return k.a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final a.f zab(Looper looper, i1<O> i1Var) {
        Looper looper2 = looper;
        a.f buildClient = ((a.C0154a) q.k(this.zad.a())).buildClient(this.zab, looper2, createClientSettingsBuilder().a(), this.zae, (GoogleApiClient.b) i1Var, (GoogleApiClient.c) i1Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof c)) {
            ((c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof l)) {
            ((l) buildClient).f(contextAttributionTag);
        }
        return buildClient;
    }

    public final e2 zac(Context context, Handler handler) {
        return new e2(context, handler, createClientSettingsBuilder().a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.app.Activity r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.r r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>((android.app.Activity) r2, r3, r4, (com.google.android.gms.common.api.e.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.r):void");
    }

    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(s<A, TResult> sVar) {
        return zae(2, sVar);
    }

    public <TResult, A extends a.b> Task<TResult> doRead(s<A, TResult> sVar) {
        return zae(0, sVar);
    }

    public Task<Boolean> doUnregisterEventListener(j.a<?> aVar, int i10) {
        q.l(aVar, "Listener key cannot be null.");
        return this.zaa.A(this, aVar, i10);
    }

    public <TResult, A extends a.b> Task<TResult> doWrite(s<A, TResult> sVar) {
        return zae(1, sVar);
    }

    private e(Context context, Activity activity, a<O> aVar, O o10, a aVar2) {
        q.l(context, "Null context is not permitted.");
        q.l(aVar, "Api must not be null.");
        q.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (m.l()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = aVar;
        this.zae = o10;
        this.zag = aVar2.f15028b;
        b<O> a10 = b.a(aVar, o10, str);
        this.zaf = a10;
        this.zai = new n1(this);
        f x10 = f.x(this.zab);
        this.zaa = x10;
        this.zah = x10.m();
        this.zaj = aVar2.f15027a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            z.j(activity, x10, a10);
        }
        x10.b(this);
    }

    public <A extends a.b> Task<Void> doRegisterEventListener(o<A, ?> oVar) {
        q.k(oVar);
        throw null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.r r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.b(r5)
            r0.c(r6)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.e.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, android.os.Looper, com.google.android.gms.common.api.internal.r):void");
    }

    public e(Context context, a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.r r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.c(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.e.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.r):void");
    }
}
