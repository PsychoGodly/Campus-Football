package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import b1.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.h;

/* compiled from: Recreator.kt */
public final class Recreator implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4794b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f4795a;

    /* compiled from: Recreator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: Recreator.kt */
    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<String> f4796a = new LinkedHashSet();

        public b(a aVar) {
            kotlin.jvm.internal.m.e(aVar, "registry");
            aVar.h("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4796a));
            return bundle;
        }

        public final void b(String str) {
            kotlin.jvm.internal.m.e(str, "className");
            this.f4796a.add(str);
        }
    }

    public Recreator(d dVar) {
        kotlin.jvm.internal.m.e(dVar, "owner");
        this.f4795a = dVar;
    }

    private final void g(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.C0081a.class);
            kotlin.jvm.internal.m.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    kotlin.jvm.internal.m.d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.C0081a) newInstance).a(this.f4795a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    public void onStateChanged(p pVar, i.a aVar) {
        kotlin.jvm.internal.m.e(pVar, "source");
        kotlin.jvm.internal.m.e(aVar, "event");
        if (aVar == i.a.ON_CREATE) {
            pVar.getLifecycle().d(this);
            Bundle b10 = this.f4795a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (b10 != null) {
                ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String g10 : stringArrayList) {
                        g(g10);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
