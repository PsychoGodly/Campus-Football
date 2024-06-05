package com.google.firebase.auth;

import android.app.Activity;
import com.google.android.gms.common.internal.q;
import com.google.firebase.auth.q0;
import d7.o;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseAuth f26297a;

    /* renamed from: b  reason: collision with root package name */
    private Long f26298b;

    /* renamed from: c  reason: collision with root package name */
    private q0.b f26299c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f26300d;

    /* renamed from: e  reason: collision with root package name */
    private String f26301e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f26302f;

    /* renamed from: g  reason: collision with root package name */
    private q0.a f26303g;

    /* renamed from: h  reason: collision with root package name */
    private l0 f26304h;

    /* renamed from: i  reason: collision with root package name */
    private t0 f26305i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f26306j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f26307k;

    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseAuth f26308a;

        /* renamed from: b  reason: collision with root package name */
        private String f26309b;

        /* renamed from: c  reason: collision with root package name */
        private Long f26310c;

        /* renamed from: d  reason: collision with root package name */
        private q0.b f26311d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f26312e;

        /* renamed from: f  reason: collision with root package name */
        private Activity f26313f;

        /* renamed from: g  reason: collision with root package name */
        private q0.a f26314g;

        /* renamed from: h  reason: collision with root package name */
        private l0 f26315h;

        /* renamed from: i  reason: collision with root package name */
        private t0 f26316i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f26317j;

        public a(FirebaseAuth firebaseAuth) {
            this.f26308a = (FirebaseAuth) q.k(firebaseAuth);
        }

        public final p0 a() {
            q.l(this.f26308a, "FirebaseAuth instance cannot be null");
            q.l(this.f26310c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            q.l(this.f26311d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f26312e = this.f26308a.F0();
            if (this.f26310c.longValue() < 0 || this.f26310c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            l0 l0Var = this.f26315h;
            boolean z10 = false;
            if (l0Var == null) {
                q.h(this.f26309b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                q.b(!this.f26317j, "You cannot require sms validation without setting a multi-factor session.");
                if (this.f26316i == null) {
                    z10 = true;
                }
                q.b(z10, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else {
                if (l0Var != null && ((o) l0Var).zzd()) {
                    q.g(this.f26309b);
                    if (this.f26316i == null) {
                        z10 = true;
                    }
                    q.b(z10, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
                } else {
                    q.b(this.f26316i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    if (this.f26309b == null) {
                        z10 = true;
                    }
                    q.b(z10, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
                }
            }
            return new p0(this.f26308a, this.f26310c, this.f26311d, this.f26312e, this.f26309b, this.f26313f, this.f26314g, this.f26315h, this.f26316i, this.f26317j);
        }

        public final a b(Activity activity) {
            this.f26313f = activity;
            return this;
        }

        public final a c(q0.b bVar) {
            this.f26311d = bVar;
            return this;
        }

        public final a d(q0.a aVar) {
            this.f26314g = aVar;
            return this;
        }

        public final a e(t0 t0Var) {
            this.f26316i = t0Var;
            return this;
        }

        public final a f(l0 l0Var) {
            this.f26315h = l0Var;
            return this;
        }

        public final a g(String str) {
            this.f26309b = str;
            return this;
        }

        public final a h(Long l10, TimeUnit timeUnit) {
            this.f26310c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    private p0(FirebaseAuth firebaseAuth, Long l10, q0.b bVar, Executor executor, String str, Activity activity, q0.a aVar, l0 l0Var, t0 t0Var, boolean z10) {
        this.f26297a = firebaseAuth;
        this.f26301e = str;
        this.f26298b = l10;
        this.f26299c = bVar;
        this.f26302f = activity;
        this.f26300d = executor;
        this.f26303g = aVar;
        this.f26304h = l0Var;
        this.f26305i = t0Var;
        this.f26306j = z10;
    }

    public final Activity a() {
        return this.f26302f;
    }

    public final void b(boolean z10) {
        this.f26307k = true;
    }

    public final FirebaseAuth c() {
        return this.f26297a;
    }

    public final l0 d() {
        return this.f26304h;
    }

    public final q0.a e() {
        return this.f26303g;
    }

    public final q0.b f() {
        return this.f26299c;
    }

    public final t0 g() {
        return this.f26305i;
    }

    public final Long h() {
        return this.f26298b;
    }

    public final String i() {
        return this.f26301e;
    }

    public final Executor j() {
        return this.f26300d;
    }

    public final boolean k() {
        return this.f26307k;
    }

    public final boolean l() {
        return this.f26306j;
    }

    public final boolean m() {
        return this.f26304h != null;
    }
}
