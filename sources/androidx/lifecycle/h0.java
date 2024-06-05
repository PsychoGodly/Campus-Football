package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.savedstate.a;
import b1.d;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateViewModelFactory.kt */
public final class h0 extends l0.d implements l0.b {

    /* renamed from: b  reason: collision with root package name */
    private Application f3917b;

    /* renamed from: c  reason: collision with root package name */
    private final l0.b f3918c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f3919d;

    /* renamed from: e  reason: collision with root package name */
    private i f3920e;

    /* renamed from: f  reason: collision with root package name */
    private a f3921f;

    public h0(Application application, d dVar, Bundle bundle) {
        l0.a aVar;
        m.e(dVar, "owner");
        this.f3921f = dVar.getSavedStateRegistry();
        this.f3920e = dVar.getLifecycle();
        this.f3919d = bundle;
        this.f3917b = application;
        if (application != null) {
            aVar = l0.a.f3947f.a(application);
        } else {
            aVar = new l0.a();
        }
        this.f3918c = aVar;
    }

    public <T extends k0> T a(Class<T> cls) {
        m.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends k0> T b(Class<T> cls, p0.a aVar) {
        Constructor<T> constructor;
        m.e(cls, "modelClass");
        m.e(aVar, "extras");
        String str = (String) aVar.a(l0.c.f3956d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(e0.f3907a) != null && aVar.a(e0.f3908b) != null) {
            Application application = (Application) aVar.a(l0.a.f3949h);
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = i0.c(cls, i0.f3932b);
            } else {
                constructor = i0.c(cls, i0.f3931a);
            }
            if (constructor == null) {
                return this.f3918c.b(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return i0.d(cls, constructor, e0.b(aVar));
            }
            return i0.d(cls, constructor, application, e0.b(aVar));
        } else if (this.f3920e != null) {
            return d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public void c(k0 k0Var) {
        m.e(k0Var, "viewModel");
        if (this.f3920e != null) {
            a aVar = this.f3921f;
            m.b(aVar);
            i iVar = this.f3920e;
            m.b(iVar);
            LegacySavedStateHandleController.a(k0Var, aVar, iVar);
        }
    }

    public final <T extends k0> T d(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t10;
        Application application;
        m.e(str, "key");
        m.e(cls, "modelClass");
        i iVar = this.f3920e;
        if (iVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f3917b == null) {
                constructor = i0.c(cls, i0.f3932b);
            } else {
                constructor = i0.c(cls, i0.f3931a);
            }
            if (constructor != null) {
                a aVar = this.f3921f;
                m.b(aVar);
                SavedStateHandleController b10 = LegacySavedStateHandleController.b(aVar, iVar, str, this.f3919d);
                if (!isAssignableFrom || (application = this.f3917b) == null) {
                    t10 = i0.d(cls, constructor, b10.h());
                } else {
                    m.b(application);
                    t10 = i0.d(cls, constructor, application, b10.h());
                }
                t10.e("androidx.lifecycle.savedstate.vm.tag", b10);
                return t10;
            } else if (this.f3917b != null) {
                return this.f3918c.a(cls);
            } else {
                return l0.c.f3954b.a().a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
