package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
final class q extends k0 {

    /* renamed from: k  reason: collision with root package name */
    private static final l0.b f3691k = new a();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Fragment> f3692d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, q> f3693e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, o0> f3694f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3695g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3696h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3697i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3698j = false;

    /* compiled from: FragmentManagerViewModel */
    class a implements l0.b {
        a() {
        }

        public <T extends k0> T a(Class<T> cls) {
            return new q(true);
        }

        public /* synthetic */ k0 b(Class cls, p0.a aVar) {
            return m0.b(this, cls, aVar);
        }
    }

    q(boolean z10) {
        this.f3695g = z10;
    }

    static q j(o0 o0Var) {
        return (q) new l0(o0Var, f3691k).a(q.class);
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3696h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f3692d.equals(qVar.f3692d) || !this.f3693e.equals(qVar.f3693e) || !this.f3694f.equals(qVar.f3694f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (this.f3698j) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f3692d.containsKey(fragment.f3424g)) {
            this.f3692d.put(fragment.f3424g, fragment);
            if (n.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (n.F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f3693e.get(fragment.f3424g);
        if (qVar != null) {
            qVar.d();
            this.f3693e.remove(fragment.f3424g);
        }
        o0 o0Var = this.f3694f.get(fragment.f3424g);
        if (o0Var != null) {
            o0Var.a();
            this.f3694f.remove(fragment.f3424g);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        return this.f3692d.get(str);
    }

    public int hashCode() {
        return (((this.f3692d.hashCode() * 31) + this.f3693e.hashCode()) * 31) + this.f3694f.hashCode();
    }

    /* access modifiers changed from: package-private */
    public q i(Fragment fragment) {
        q qVar = this.f3693e.get(fragment.f3424g);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f3695g);
        this.f3693e.put(fragment.f3424g, qVar2);
        return qVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> k() {
        return new ArrayList(this.f3692d.values());
    }

    /* access modifiers changed from: package-private */
    public o0 l(Fragment fragment) {
        o0 o0Var = this.f3694f.get(fragment.f3424g);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0();
        this.f3694f.put(fragment.f3424g, o0Var2);
        return o0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f3696h;
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (!this.f3698j) {
            if ((this.f3692d.remove(fragment.f3424g) != null) && n.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (n.F0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10) {
        this.f3698j = z10;
    }

    /* access modifiers changed from: package-private */
    public boolean p(Fragment fragment) {
        if (!this.f3692d.containsKey(fragment.f3424g)) {
            return true;
        }
        if (this.f3695g) {
            return this.f3696h;
        }
        return !this.f3697i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f3692d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f3693e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3694f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
