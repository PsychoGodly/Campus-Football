package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.p001firebaseauthapi.zzaai;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.internal.p001firebaseauthapi.zzacm;
import com.google.android.gms.internal.p001firebaseauthapi.zzacw;
import com.google.android.gms.internal.p001firebaseauthapi.zzadt;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.android.gms.internal.p001firebaseauthapi.zzafj;
import com.google.android.gms.internal.p001firebaseauthapi.zzafk;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import com.google.android.gms.internal.p001firebaseauthapi.zzaga;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.q0;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import d7.d0;
import d7.d1;
import d7.e;
import d7.e1;
import d7.h0;
import d7.i1;
import d7.m0;
import d7.o;
import d7.t;
import d7.t0;
import d7.w;
import d7.w1;
import d7.x0;
import d7.y0;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import y6.f;
import y6.l;
import z7.i;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class FirebaseAuth implements d7.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public f f26147a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f26148b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List<d7.a> f26149c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List<a> f26150d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzaai f26151e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public a0 f26152f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public e f26153g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f26154h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String f26155i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f26156j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public String f26157k;

    /* renamed from: l  reason: collision with root package name */
    private t0 f26158l;

    /* renamed from: m  reason: collision with root package name */
    private final RecaptchaAction f26159m;

    /* renamed from: n  reason: collision with root package name */
    private final RecaptchaAction f26160n;

    /* renamed from: o  reason: collision with root package name */
    private final RecaptchaAction f26161o;

    /* renamed from: p  reason: collision with root package name */
    private final y0 f26162p;

    /* renamed from: q  reason: collision with root package name */
    private final e1 f26163q;

    /* renamed from: r  reason: collision with root package name */
    private final d0 f26164r;

    /* renamed from: s  reason: collision with root package name */
    private final b8.b<c7.b> f26165s;

    /* renamed from: t  reason: collision with root package name */
    private final b8.b<i> f26166t;

    /* renamed from: u  reason: collision with root package name */
    private x0 f26167u;

    /* renamed from: v  reason: collision with root package name */
    private final Executor f26168v;

    /* renamed from: w  reason: collision with root package name */
    private final Executor f26169w;

    /* renamed from: x  reason: collision with root package name */
    private final Executor f26170x;

    /* renamed from: y  reason: collision with root package name */
    private String f26171y;

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    class c implements i1 {
        c() {
        }

        public final void a(zzafn zzafn, a0 a0Var) {
            q.k(zzafn);
            q.k(a0Var);
            a0Var.m0(zzafn);
            FirebaseAuth.this.g0(a0Var, zzafn, true);
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    class d implements w, i1 {
        d() {
        }

        public final void a(zzafn zzafn, a0 a0Var) {
            q.k(zzafn);
            q.k(a0Var);
            a0Var.m0(zzafn);
            FirebaseAuth.this.h0(a0Var, zzafn, true, true);
        }

        public final void zza(Status status) {
            if (status.w() == 17011 || status.w() == 17021 || status.w() == 17005 || status.w() == 17091) {
                FirebaseAuth.this.E();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(y6.f r13, b8.b<c7.b> r14, b8.b<z7.i> r15, @a7.a java.util.concurrent.Executor r16, @a7.b java.util.concurrent.Executor r17, @a7.c java.util.concurrent.Executor r18, @a7.c java.util.concurrent.ScheduledExecutorService r19, @a7.d java.util.concurrent.Executor r20) {
        /*
            r12 = this;
            com.google.android.gms.internal.firebase-auth-api.zzaai r2 = new com.google.android.gms.internal.firebase-auth-api.zzaai
            r1 = r13
            r9 = r17
            r0 = r19
            r2.<init>(r13, r9, r0)
            d7.y0 r3 = new d7.y0
            android.content.Context r0 = r13.m()
            java.lang.String r4 = r13.s()
            r3.<init>(r0, r4)
            d7.e1 r4 = d7.e1.f()
            d7.d0 r5 = d7.d0.b()
            r0 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r10 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(y6.f, b8.b, b8.b, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    private final synchronized x0 K0() {
        return L0(this);
    }

    private static x0 L0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f26167u == null) {
            firebaseAuth.f26167u = new x0((f) q.k(firebaseAuth.f26147a));
        }
        return firebaseAuth.f26167u;
    }

    private final Task<i> M(j jVar, a0 a0Var, boolean z10) {
        return new g1(this, z10, a0Var, jVar).b(this, this.f26157k, this.f26159m, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<Void> S(a0 a0Var, d1 d1Var) {
        q.k(a0Var);
        return this.f26151e.zza(this.f26147a, a0Var, d1Var);
    }

    private final Task<i> Z(String str, String str2, String str3, a0 a0Var, boolean z10) {
        return new f1(this, str, z10, a0Var, str2, str3).b(this, str3, this.f26160n, "EMAIL_PASSWORD_PROVIDER");
    }

    /* access modifiers changed from: private */
    public final q0.b c0(String str, q0.b bVar) {
        return (!this.f26153g.g() || str == null || !str.equals(this.f26153g.d())) ? bVar : new l2(this, bVar);
    }

    private static void e0(FirebaseAuth firebaseAuth, a0 a0Var) {
        if (a0Var != null) {
            String c10 = a0Var.c();
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + c10 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f26170x.execute(new w2(firebaseAuth));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r0 == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void f0(com.google.firebase.auth.FirebaseAuth r4, com.google.firebase.auth.a0 r5, com.google.android.gms.internal.p001firebaseauthapi.zzafn r6, boolean r7, boolean r8) {
        /*
            com.google.android.gms.common.internal.q.k(r5)
            com.google.android.gms.common.internal.q.k(r6)
            com.google.firebase.auth.a0 r0 = r4.f26152f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r5.c()
            com.google.firebase.auth.a0 r3 = r4.f26152f
            java.lang.String r3 = r3.c()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 != 0) goto L_0x0024
            if (r8 == 0) goto L_0x0024
            return
        L_0x0024:
            com.google.firebase.auth.a0 r8 = r4.f26152f
            if (r8 != 0) goto L_0x002a
        L_0x0028:
            r1 = 1
            goto L_0x0046
        L_0x002a:
            com.google.android.gms.internal.firebase-auth-api.zzafn r8 = r8.p0()
            java.lang.String r8 = r8.zzc()
            java.lang.String r3 = r6.zzc()
            boolean r8 = r8.equals(r3)
            r8 = r8 ^ r2
            if (r0 == 0) goto L_0x0041
            if (r8 != 0) goto L_0x0041
            r8 = 0
            goto L_0x0042
        L_0x0041:
            r8 = 1
        L_0x0042:
            r2 = r8
            if (r0 != 0) goto L_0x0046
            goto L_0x0028
        L_0x0046:
            com.google.android.gms.common.internal.q.k(r5)
            com.google.firebase.auth.a0 r8 = r4.f26152f
            if (r8 == 0) goto L_0x007e
            java.lang.String r8 = r5.c()
            java.lang.String r0 = r4.c()
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005c
            goto L_0x007e
        L_0x005c:
            com.google.firebase.auth.a0 r8 = r4.f26152f
            java.util.List r0 = r5.z()
            r8.k0(r0)
            boolean r8 = r5.C()
            if (r8 != 0) goto L_0x0070
            com.google.firebase.auth.a0 r8 = r4.f26152f
            r8.n0()
        L_0x0070:
            com.google.firebase.auth.h0 r8 = r5.y()
            java.util.List r8 = r8.b()
            com.google.firebase.auth.a0 r0 = r4.f26152f
            r0.o0(r8)
            goto L_0x0080
        L_0x007e:
            r4.f26152f = r5
        L_0x0080:
            if (r7 == 0) goto L_0x0089
            d7.y0 r8 = r4.f26162p
            com.google.firebase.auth.a0 r0 = r4.f26152f
            r8.f(r0)
        L_0x0089:
            if (r2 == 0) goto L_0x0097
            com.google.firebase.auth.a0 r8 = r4.f26152f
            if (r8 == 0) goto L_0x0092
            r8.m0(r6)
        L_0x0092:
            com.google.firebase.auth.a0 r8 = r4.f26152f
            r0(r4, r8)
        L_0x0097:
            if (r1 == 0) goto L_0x009e
            com.google.firebase.auth.a0 r8 = r4.f26152f
            e0(r4, r8)
        L_0x009e:
            if (r7 == 0) goto L_0x00a5
            d7.y0 r7 = r4.f26162p
            r7.d(r5, r6)
        L_0x00a5:
            com.google.firebase.auth.a0 r5 = r4.f26152f
            if (r5 == 0) goto L_0x00b4
            d7.x0 r4 = L0(r4)
            com.google.android.gms.internal.firebase-auth-api.zzafn r5 = r5.p0()
            r4.d(r5)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.f0(com.google.firebase.auth.FirebaseAuth, com.google.firebase.auth.a0, com.google.android.gms.internal.firebase-auth-api.zzafn, boolean, boolean):void");
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) f.o().k(FirebaseAuth.class);
    }

    public static void i0(p0 p0Var) {
        String str;
        String str2;
        if (p0Var.m()) {
            FirebaseAuth c10 = p0Var.c();
            if (((o) q.k(p0Var.d())).zzd()) {
                str2 = q.g(p0Var.i());
                str = str2;
            } else {
                t0 t0Var = (t0) q.k(p0Var.g());
                String g10 = q.g(t0Var.c());
                str2 = t0Var.getPhoneNumber();
                str = g10;
            }
            if (p0Var.e() == null || !zzadt.zza(str, p0Var.f(), p0Var.a(), p0Var.j())) {
                c10.f26164r.a(c10, str2, p0Var.a(), c10.J0(), p0Var.k()).addOnCompleteListener(new i2(c10, p0Var, str));
                return;
            }
            return;
        }
        FirebaseAuth c11 = p0Var.c();
        String g11 = q.g(p0Var.i());
        if ((p0Var.e() != null) || !zzadt.zza(g11, p0Var.f(), p0Var.a(), p0Var.j())) {
            c11.f26164r.a(c11, g11, p0Var.a(), c11.J0(), p0Var.k()).addOnCompleteListener(new j2(c11, p0Var, g11));
        }
    }

    public static void l0(l lVar, p0 p0Var, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        p0Var.j().execute(new h2(zzadt.zza(str, p0Var.f(), (zzacx) null), lVar));
    }

    private static void r0(FirebaseAuth firebaseAuth, a0 a0Var) {
        if (a0Var != null) {
            String c10 = a0Var.c();
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + c10 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f26170x.execute(new u2(firebaseAuth, new h8.b(a0Var != null ? a0Var.zzd() : null)));
    }

    private final boolean s0(String str) {
        f c10 = f.c(str);
        return c10 != null && !TextUtils.equals(this.f26157k, c10.d());
    }

    public Task<i> A(h hVar) {
        q.k(hVar);
        h x10 = hVar.x();
        if (x10 instanceof j) {
            j jVar = (j) x10;
            if (!jVar.zzf()) {
                return Z(jVar.zzc(), (String) q.k(jVar.zzd()), this.f26157k, (a0) null, false);
            } else if (s0(q.g(jVar.zze()))) {
                return Tasks.forException(zzacf.zza(new Status(17072)));
            } else {
                return M(jVar, (a0) null, false);
            }
        } else if (!(x10 instanceof o0)) {
            return this.f26151e.zza(this.f26147a, x10, this.f26157k, (i1) new c());
        } else {
            return this.f26151e.zza(this.f26147a, (o0) x10, this.f26157k, (i1) new c());
        }
    }

    public Task<i> B(String str) {
        q.g(str);
        return this.f26151e.zza(this.f26147a, str, this.f26157k, (i1) new c());
    }

    public final Executor B0() {
        return this.f26168v;
    }

    public Task<i> C(String str, String str2) {
        q.g(str);
        q.g(str2);
        return Z(str, str2, this.f26157k, (a0) null, false);
    }

    public Task<i> D(String str, String str2) {
        return A(k.b(str, str2));
    }

    public final Executor D0() {
        return this.f26169w;
    }

    public void E() {
        H0();
        x0 x0Var = this.f26167u;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    public Task<i> F(Activity activity, n nVar) {
        q.k(nVar);
        q.k(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f26163q.c(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzacf.zza(new Status(17057)));
        }
        m0.d(activity.getApplicationContext(), this);
        nVar.c(activity);
        return taskCompletionSource.getTask();
    }

    public final Executor F0() {
        return this.f26170x;
    }

    public void G() {
        synchronized (this.f26154h) {
            this.f26155i = zzacw.zza();
        }
    }

    public void H(String str, int i10) {
        q.g(str);
        q.b(i10 >= 0 && i10 <= 65535, "Port number must be in the range 0-65535");
        zzaed.zza(this.f26147a, str, i10);
    }

    public final void H0() {
        q.k(this.f26162p);
        a0 a0Var = this.f26152f;
        if (a0Var != null) {
            y0 y0Var = this.f26162p;
            q.k(a0Var);
            y0Var.e(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{a0Var.c()}));
            this.f26152f = null;
        }
        this.f26162p.e("com.google.firebase.auth.FIREBASE_USER");
        r0(this, (a0) null);
        e0(this, (a0) null);
    }

    public Task<String> I(String str) {
        q.g(str);
        return this.f26151e.zzd(this.f26147a, str, this.f26157k);
    }

    public final Task<zzafj> J() {
        return this.f26151e.zza();
    }

    /* access modifiers changed from: package-private */
    public final boolean J0() {
        return zzacm.zza(l().m());
    }

    public final Task<i> K(Activity activity, n nVar, a0 a0Var) {
        q.k(activity);
        q.k(nVar);
        q.k(a0Var);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f26163q.d(activity, taskCompletionSource, this, a0Var)) {
            return Tasks.forException(zzacf.zza(new Status(17057)));
        }
        m0.e(activity.getApplicationContext(), this, a0Var);
        nVar.a(activity);
        return taskCompletionSource.getTask();
    }

    public final Task<Void> L(e eVar, String str) {
        q.g(str);
        if (this.f26155i != null) {
            if (eVar == null) {
                eVar = e.K();
            }
            eVar.J(this.f26155i);
        }
        return this.f26151e.zza(this.f26147a, eVar, str);
    }

    public final Task<Void> N(a0 a0Var) {
        q.k(a0Var);
        return this.f26151e.zza(a0Var, (t) new q2(this, a0Var));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> O(a0 a0Var, h hVar) {
        q.k(hVar);
        q.k(a0Var);
        if (hVar instanceof j) {
            return new n2(this, a0Var, (j) hVar.x()).b(this, a0Var.B(), this.f26161o, "EMAIL_PASSWORD_PROVIDER");
        }
        return this.f26151e.zza(this.f26147a, a0Var, hVar.x(), (String) null, (d1) new d());
    }

    public final Task<Void> P(a0 a0Var, i0 i0Var, String str) {
        q.k(a0Var);
        q.k(i0Var);
        if (i0Var instanceof r0) {
            return this.f26151e.zza(this.f26147a, (r0) i0Var, a0Var, str, (i1) new c());
        } else if (!(i0Var instanceof w0)) {
            return Tasks.forException(zzacf.zza(new Status(17499)));
        } else {
            return this.f26151e.zza(this.f26147a, (w0) i0Var, a0Var, str, this.f26157k, (i1) new c());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> Q(a0 a0Var, o0 o0Var) {
        q.k(a0Var);
        q.k(o0Var);
        return this.f26151e.zza(this.f26147a, a0Var, (o0) o0Var.x(), (d1) new d());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> R(a0 a0Var, d1 d1Var) {
        q.k(a0Var);
        q.k(d1Var);
        return this.f26151e.zza(this.f26147a, a0Var, d1Var, (d1) new d());
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> T(a0 a0Var, String str) {
        q.k(a0Var);
        q.g(str);
        return this.f26151e.zza(this.f26147a, a0Var, str, this.f26157k, (d1) new d()).continueWithTask(new r2(this));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d7.d1, com.google.firebase.auth.v2] */
    public final Task<c0> U(a0 a0Var, boolean z10) {
        if (a0Var == null) {
            return Tasks.forException(zzacf.zza(new Status(17495)));
        }
        zzafn p02 = a0Var.p0();
        if (!p02.zzg() || z10) {
            return this.f26151e.zza(this.f26147a, a0Var, p02.zzd(), (d1) new v2(this));
        }
        return Tasks.forResult(h0.a(p02.zzc()));
    }

    public final Task<i> V(i0 i0Var, o oVar, a0 a0Var) {
        q.k(i0Var);
        q.k(oVar);
        if (i0Var instanceof r0) {
            return this.f26151e.zza(this.f26147a, a0Var, (r0) i0Var, q.g(oVar.zzc()), (i1) new c());
        } else if (i0Var instanceof w0) {
            return this.f26151e.zza(this.f26147a, a0Var, (w0) i0Var, q.g(oVar.zzc()), this.f26157k, (i1) new c());
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
    }

    public final Task<z0> W(o oVar) {
        q.k(oVar);
        return this.f26151e.zza(oVar, this.f26157k).continueWithTask(new s2(this));
    }

    public final Task<zzafk> X(String str) {
        return this.f26151e.zza(this.f26157k, str);
    }

    public final Task<Void> Y(String str, String str2, e eVar) {
        q.g(str);
        q.g(str2);
        if (eVar == null) {
            eVar = e.K();
        }
        String str3 = this.f26155i;
        if (str3 != null) {
            eVar.J(str3);
        }
        return this.f26151e.zza(str, str2, eVar);
    }

    public void a(d7.a aVar) {
        q.k(aVar);
        this.f26149c.remove(aVar);
        K0().c(this.f26149c.size());
    }

    public void b(d7.a aVar) {
        q.k(aVar);
        this.f26149c.add(aVar);
        K0().c(this.f26149c.size());
    }

    /* access modifiers changed from: package-private */
    public final q0.b b0(p0 p0Var, q0.b bVar) {
        if (p0Var.k()) {
            return bVar;
        }
        return new k2(this, p0Var, bVar);
    }

    public String c() {
        a0 a0Var = this.f26152f;
        if (a0Var == null) {
            return null;
        }
        return a0Var.c();
    }

    public Task<c0> d(boolean z10) {
        return U(this.f26152f, z10);
    }

    public void e(a aVar) {
        this.f26150d.add(aVar);
        this.f26170x.execute(new t2(this, aVar));
    }

    public void f(b bVar) {
        this.f26148b.add(bVar);
        this.f26170x.execute(new g2(this, bVar));
    }

    public Task<Void> g(String str) {
        q.g(str);
        return this.f26151e.zza(this.f26147a, str, this.f26157k);
    }

    public final void g0(a0 a0Var, zzafn zzafn, boolean z10) {
        h0(a0Var, zzafn, true, false);
    }

    public Task<d> h(String str) {
        q.g(str);
        return this.f26151e.zzb(this.f26147a, str, this.f26157k);
    }

    /* access modifiers changed from: package-private */
    public final void h0(a0 a0Var, zzafn zzafn, boolean z10, boolean z11) {
        f0(this, a0Var, zzafn, true, z11);
    }

    public Task<Void> i(String str, String str2) {
        q.g(str);
        q.g(str2);
        return this.f26151e.zza(this.f26147a, str, str2, this.f26157k);
    }

    public Task<i> j(String str, String str2) {
        q.g(str);
        q.g(str2);
        return new m2(this, str, str2).b(this, this.f26157k, this.f26161o, "EMAIL_PASSWORD_PROVIDER");
    }

    public final void j0(p0 p0Var, String str, String str2) {
        long longValue = p0Var.h().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String g10 = q.g(p0Var.i());
        zzaga zzaga = new zzaga(g10, longValue, p0Var.e() != null, this.f26155i, this.f26157k, str, str2, J0());
        q0.b c02 = c0(g10, p0Var.f());
        this.f26151e.zza(this.f26147a, zzaga, TextUtils.isEmpty(str) ? b0(p0Var, c02) : c02, p0Var.a(), p0Var.j());
    }

    @Deprecated
    public Task<v0> k(String str) {
        q.g(str);
        return this.f26151e.zzc(this.f26147a, str, this.f26157k);
    }

    public final synchronized void k0(t0 t0Var) {
        this.f26158l = t0Var;
    }

    public f l() {
        return this.f26147a;
    }

    public a0 m() {
        return this.f26152f;
    }

    public final Task<i> m0(Activity activity, n nVar, a0 a0Var) {
        q.k(activity);
        q.k(nVar);
        q.k(a0Var);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f26163q.d(activity, taskCompletionSource, this, a0Var)) {
            return Tasks.forException(zzacf.zza(new Status(17057)));
        }
        m0.e(activity.getApplicationContext(), this, a0Var);
        nVar.b(activity);
        return taskCompletionSource.getTask();
    }

    public String n() {
        return this.f26171y;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> n0(a0 a0Var) {
        return S(a0Var, new d());
    }

    public w o() {
        return this.f26153g;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> o0(a0 a0Var, String str) {
        q.g(str);
        q.k(a0Var);
        return this.f26151e.zzb(this.f26147a, a0Var, str, new d());
    }

    public String p() {
        String str;
        synchronized (this.f26154h) {
            str = this.f26155i;
        }
        return str;
    }

    public String q() {
        String str;
        synchronized (this.f26156j) {
            str = this.f26157k;
        }
        return str;
    }

    public final synchronized t0 q0() {
        return this.f26158l;
    }

    public void r(a aVar) {
        this.f26150d.remove(aVar);
    }

    public void s(b bVar) {
        this.f26148b.remove(bVar);
    }

    public Task<Void> t(String str) {
        q.g(str);
        return u(str, (e) null);
    }

    public final b8.b<c7.b> t0() {
        return this.f26165s;
    }

    public Task<Void> u(String str, e eVar) {
        q.g(str);
        if (eVar == null) {
            eVar = e.K();
        }
        String str2 = this.f26155i;
        if (str2 != null) {
            eVar.J(str2);
        }
        eVar.I(1);
        return new p2(this, str, eVar).b(this, this.f26157k, this.f26159m, "EMAIL_PASSWORD_PROVIDER");
    }

    public Task<Void> v(String str, e eVar) {
        q.g(str);
        q.k(eVar);
        if (eVar.v()) {
            String str2 = this.f26155i;
            if (str2 != null) {
                eVar.J(str2);
            }
            return new o2(this, str, eVar).b(this, this.f26157k, this.f26159m, "EMAIL_PASSWORD_PROVIDER");
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARNING: type inference failed for: r9v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<i> v0(a0 a0Var, h hVar) {
        q.k(a0Var);
        q.k(hVar);
        h x10 = hVar.x();
        if (x10 instanceof j) {
            j jVar = (j) x10;
            if (URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD.equals(jVar.w())) {
                return Z(jVar.zzc(), q.g(jVar.zzd()), a0Var.B(), a0Var, true);
            } else if (s0(q.g(jVar.zze()))) {
                return Tasks.forException(zzacf.zza(new Status(17072)));
            } else {
                return M(jVar, a0Var, true);
            }
        } else if (x10 instanceof o0) {
            return this.f26151e.zzb(this.f26147a, a0Var, (o0) x10, this.f26157k, (d1) new d());
        } else {
            return this.f26151e.zzc(this.f26147a, a0Var, x10, a0Var.B(), new d());
        }
    }

    public void w(String str) {
        String str2;
        q.g(str);
        if (str.startsWith("chrome-extension://")) {
            this.f26171y = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.f26171y = (String) q.k(new URI(str2).getHost());
        } catch (URISyntaxException e10) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e10.getMessage());
            }
            this.f26171y = str;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> w0(a0 a0Var, String str) {
        q.k(a0Var);
        q.g(str);
        return this.f26151e.zzc(this.f26147a, a0Var, str, new d());
    }

    public void x(String str) {
        q.g(str);
        synchronized (this.f26154h) {
            this.f26155i = str;
        }
    }

    public final b8.b<i> x0() {
        return this.f26166t;
    }

    public void y(String str) {
        q.g(str);
        synchronized (this.f26156j) {
            this.f26157k = str;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [d7.d1, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task<Void> y0(a0 a0Var, String str) {
        q.k(a0Var);
        q.g(str);
        return this.f26151e.zzd(this.f26147a, a0Var, str, new d());
    }

    public Task<i> z() {
        a0 a0Var = this.f26152f;
        if (a0Var == null || !a0Var.C()) {
            return this.f26151e.zza(this.f26147a, (i1) new c(), this.f26157k);
        }
        d7.d dVar = (d7.d) this.f26152f;
        dVar.u0(false);
        return Tasks.forResult(new w1(dVar));
    }

    @Keep
    public static FirebaseAuth getInstance(f fVar) {
        return (FirebaseAuth) fVar.k(FirebaseAuth.class);
    }

    private FirebaseAuth(f fVar, zzaai zzaai, y0 y0Var, e1 e1Var, d0 d0Var, b8.b<c7.b> bVar, b8.b<i> bVar2, @a7.a Executor executor, @a7.b Executor executor2, @a7.c Executor executor3, @a7.d Executor executor4) {
        zzafn a10;
        this.f26148b = new CopyOnWriteArrayList();
        this.f26149c = new CopyOnWriteArrayList();
        this.f26150d = new CopyOnWriteArrayList();
        this.f26154h = new Object();
        this.f26156j = new Object();
        this.f26159m = RecaptchaAction.custom("getOobCode");
        this.f26160n = RecaptchaAction.custom("signInWithPassword");
        this.f26161o = RecaptchaAction.custom("signUpPassword");
        this.f26147a = (f) q.k(fVar);
        this.f26151e = (zzaai) q.k(zzaai);
        y0 y0Var2 = (y0) q.k(y0Var);
        this.f26162p = y0Var2;
        this.f26153g = new e();
        e1 e1Var2 = (e1) q.k(e1Var);
        this.f26163q = e1Var2;
        this.f26164r = (d0) q.k(d0Var);
        this.f26165s = bVar;
        this.f26166t = bVar2;
        this.f26168v = executor2;
        this.f26169w = executor3;
        this.f26170x = executor4;
        a0 b10 = y0Var2.b();
        this.f26152f = b10;
        if (!(b10 == null || (a10 = y0Var2.a(b10)) == null)) {
            f0(this, this.f26152f, a10, false, false);
        }
        e1Var2.b(this);
    }
}
