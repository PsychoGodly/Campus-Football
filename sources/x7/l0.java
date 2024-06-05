package x7;

import com.unity3d.services.UnityAdsConstants;
import dd.j1;
import java.util.Locale;
import r7.y0;
import y7.b;
import y7.g;
import y7.v;

/* compiled from: OnlineStateTracker */
class l0 {

    /* renamed from: a  reason: collision with root package name */
    private y0 f31069a = y0.UNKNOWN;

    /* renamed from: b  reason: collision with root package name */
    private int f31070b;

    /* renamed from: c  reason: collision with root package name */
    private g.b f31071c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f31072d = true;

    /* renamed from: e  reason: collision with root package name */
    private final g f31073e;

    /* renamed from: f  reason: collision with root package name */
    private final a f31074f;

    /* compiled from: OnlineStateTracker */
    interface a {
        void a(y0 y0Var);
    }

    l0(g gVar, a aVar) {
        this.f31073e = gVar;
        this.f31074f = aVar;
    }

    private void b() {
        g.b bVar = this.f31071c;
        if (bVar != null) {
            bVar.c();
            this.f31071c = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f31071c = null;
        b.d(this.f31069a == y0.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        g(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", new Object[]{10}));
        h(y0.OFFLINE);
    }

    private void g(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", new Object[]{str});
        if (this.f31072d) {
            v.e("OnlineStateTracker", "%s", format);
            this.f31072d = false;
            return;
        }
        v.a("OnlineStateTracker", "%s", format);
    }

    private void h(y0 y0Var) {
        if (y0Var != this.f31069a) {
            this.f31069a = y0Var;
            this.f31074f.a(y0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public y0 c() {
        return this.f31069a;
    }

    /* access modifiers changed from: package-private */
    public void d(j1 j1Var) {
        boolean z10 = true;
        if (this.f31069a == y0.ONLINE) {
            h(y0.UNKNOWN);
            b.d(this.f31070b == 0, "watchStreamFailures must be 0", new Object[0]);
            if (this.f31071c != null) {
                z10 = false;
            }
            b.d(z10, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i10 = this.f31070b + 1;
        this.f31070b = i10;
        if (i10 >= 1) {
            b();
            g(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", new Object[]{1, j1Var}));
            h(y0.OFFLINE);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f31070b == 0) {
            h(y0.UNKNOWN);
            b.d(this.f31071c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f31071c = this.f31073e.k(g.d.ONLINE_STATE_TIMEOUT, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, new k0(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void i(y0 y0Var) {
        b();
        this.f31070b = 0;
        if (y0Var == y0.ONLINE) {
            this.f31072d = false;
        }
        h(y0Var);
    }
}
