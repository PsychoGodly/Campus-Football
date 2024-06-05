package pc;

import android.app.Activity;
import com.applovin.mediation.MaxReward;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.l0;
import com.google.firebase.auth.o0;
import com.google.firebase.auth.p0;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.t0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lc.d;
import pc.a1;
import y6.l;

/* compiled from: PhoneNumberVerificationStreamHandler */
public class f3 implements d.C0413d {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<Integer, q0.a> f37078l = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<Activity> f37079a;

    /* renamed from: b  reason: collision with root package name */
    final FirebaseAuth f37080b;

    /* renamed from: c  reason: collision with root package name */
    final String f37081c;

    /* renamed from: d  reason: collision with root package name */
    final t0 f37082d;

    /* renamed from: f  reason: collision with root package name */
    final int f37083f;

    /* renamed from: g  reason: collision with root package name */
    final b f37084g;

    /* renamed from: h  reason: collision with root package name */
    final l0 f37085h;

    /* renamed from: i  reason: collision with root package name */
    String f37086i;

    /* renamed from: j  reason: collision with root package name */
    Integer f37087j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public d.b f37088k;

    /* compiled from: PhoneNumberVerificationStreamHandler */
    class a extends q0.b {
        a() {
        }

        public void onCodeAutoRetrievalTimeOut(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put(MediationMetaData.KEY_NAME, "Auth#phoneCodeAutoRetrievalTimeout");
            if (f3.this.f37088k != null) {
                f3.this.f37088k.success(hashMap);
            }
        }

        public void onCodeSent(String str, q0.a aVar) {
            int hashCode = aVar.hashCode();
            f3.f37078l.put(Integer.valueOf(hashCode), aVar);
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("forceResendingToken", Integer.valueOf(hashCode));
            hashMap.put(MediationMetaData.KEY_NAME, "Auth#phoneCodeSent");
            if (f3.this.f37088k != null) {
                f3.this.f37088k.success(hashMap);
            }
        }

        public void onVerificationCompleted(o0 o0Var) {
            int hashCode = o0Var.hashCode();
            f3.this.f37084g.a(o0Var);
            HashMap hashMap = new HashMap();
            hashMap.put("token", Integer.valueOf(hashCode));
            if (o0Var.y() != null) {
                hashMap.put("smsCode", o0Var.y());
            }
            hashMap.put(MediationMetaData.KEY_NAME, "Auth#phoneVerificationCompleted");
            if (f3.this.f37088k != null) {
                f3.this.f37088k.success(hashMap);
            }
        }

        public void onVerificationFailed(l lVar) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            a1.g e10 = v.e(lVar);
            hashMap2.put("code", e10.f36951a.replaceAll("ERROR_", MaxReward.DEFAULT_LABEL).toLowerCase(Locale.ROOT).replaceAll("_", "-"));
            hashMap2.put("message", e10.getMessage());
            hashMap2.put("details", e10.f36952b);
            hashMap.put("error", hashMap2);
            hashMap.put(MediationMetaData.KEY_NAME, "Auth#phoneVerificationFailed");
            if (f3.this.f37088k != null) {
                f3.this.f37088k.success(hashMap);
            }
        }
    }

    /* compiled from: PhoneNumberVerificationStreamHandler */
    interface b {
        void a(o0 o0Var);
    }

    public f3(Activity activity, a1.b bVar, a1.e0 e0Var, l0 l0Var, t0 t0Var, b bVar2) {
        AtomicReference<Activity> atomicReference = new AtomicReference<>((Object) null);
        this.f37079a = atomicReference;
        atomicReference.set(activity);
        this.f37085h = l0Var;
        this.f37082d = t0Var;
        this.f37080b = u.P(bVar);
        this.f37081c = e0Var.f();
        this.f37083f = e3.a(e0Var.g().longValue());
        if (e0Var.b() != null) {
            this.f37086i = e0Var.b();
        }
        if (e0Var.c() != null) {
            this.f37087j = Integer.valueOf(e3.a(e0Var.c().longValue()));
        }
        this.f37084g = bVar2;
    }

    public void g(Object obj) {
        this.f37088k = null;
        this.f37079a.set((Object) null);
    }

    public void h(Object obj, d.b bVar) {
        q0.a aVar;
        this.f37088k = bVar;
        a aVar2 = new a();
        if (this.f37086i != null) {
            this.f37080b.o().c(this.f37081c, this.f37086i);
        }
        p0.a aVar3 = new p0.a(this.f37080b);
        aVar3.b(this.f37079a.get());
        aVar3.c(aVar2);
        String str = this.f37081c;
        if (str != null) {
            aVar3.g(str);
        }
        l0 l0Var = this.f37085h;
        if (l0Var != null) {
            aVar3.f(l0Var);
        }
        t0 t0Var = this.f37082d;
        if (t0Var != null) {
            aVar3.e(t0Var);
        }
        aVar3.h(Long.valueOf((long) this.f37083f), TimeUnit.MILLISECONDS);
        Integer num = this.f37087j;
        if (!(num == null || (aVar = f37078l.get(num)) == null)) {
            aVar3.d(aVar);
        }
        q0.b(aVar3.a());
    }
}
