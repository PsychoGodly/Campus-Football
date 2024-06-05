package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import sd.g;

/* compiled from: SavedStateHandleSupport.kt */
public final class f0 implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.savedstate.a f3911a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3912b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f3913c;

    /* renamed from: d  reason: collision with root package name */
    private final g f3914d;

    /* compiled from: SavedStateHandleSupport.kt */
    static final class a extends n implements fe.a<g0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0 f3915a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p0 p0Var) {
            super(0);
            this.f3915a = p0Var;
        }

        /* renamed from: a */
        public final g0 invoke() {
            return e0.e(this.f3915a);
        }
    }

    public f0(androidx.savedstate.a aVar, p0 p0Var) {
        m.e(aVar, "savedStateRegistry");
        m.e(p0Var, "viewModelStoreOwner");
        this.f3911a = aVar;
        this.f3914d = i.a(new a(p0Var));
    }

    private final g0 c() {
        return (g0) this.f3914d.getValue();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3913c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : c().f().entrySet()) {
            String str = (String) next.getKey();
            Bundle a10 = ((d0) next.getValue()).c().a();
            if (!m.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f3912b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        m.e(str, "key");
        d();
        Bundle bundle = this.f3913c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3913c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3913c;
        boolean z10 = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            this.f3913c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (!this.f3912b) {
            this.f3913c = this.f3911a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f3912b = true;
            c();
        }
    }
}
