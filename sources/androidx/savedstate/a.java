package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import b1.d;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateRegistry.kt */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final b f4797g = new b((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final m.b<String, c> f4798a = new m.b<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f4799b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f4800c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4801d;

    /* renamed from: e  reason: collision with root package name */
    private Recreator.b f4802e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4803f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* compiled from: SavedStateRegistry.kt */
    public interface C0081a {
        void a(d dVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface c {
        Bundle a();
    }

    /* access modifiers changed from: private */
    public static final void d(a aVar, p pVar, i.a aVar2) {
        m.e(aVar, "this$0");
        m.e(pVar, "<anonymous parameter 0>");
        m.e(aVar2, "event");
        if (aVar2 == i.a.ON_START) {
            aVar.f4803f = true;
        } else if (aVar2 == i.a.ON_STOP) {
            aVar.f4803f = false;
        }
    }

    public final Bundle b(String str) {
        m.e(str, "key");
        if (this.f4801d) {
            Bundle bundle = this.f4800c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f4800c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f4800c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f4800c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        m.e(str, "key");
        Iterator<Map.Entry<String, c>> it = this.f4798a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            m.d(next, "components");
            c cVar = (c) next.getValue();
            if (m.a((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(i iVar) {
        m.e(iVar, "lifecycle");
        if (!this.f4799b) {
            iVar.a(new b1.b(this));
            this.f4799b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        if (!this.f4799b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f4801d) {
            this.f4800c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f4801d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    public final void g(Bundle bundle) {
        m.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4800c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<K, V>.d e10 = this.f4798a.e();
        m.d(e10, "this.components.iteratorWithAdditions()");
        while (e10.hasNext()) {
            Map.Entry entry = (Map.Entry) e10.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        m.e(str, "key");
        m.e(cVar, "provider");
        if (!(this.f4798a.h(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends C0081a> cls) {
        m.e(cls, "clazz");
        if (this.f4803f) {
            Recreator.b bVar = this.f4802e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f4802e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f4802e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    m.d(name, "clazz.name");
                    bVar2.b(name);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
