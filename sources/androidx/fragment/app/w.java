package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private final j f3723a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f3724b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f3725c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    int f3726d;

    /* renamed from: e  reason: collision with root package name */
    int f3727e;

    /* renamed from: f  reason: collision with root package name */
    int f3728f;

    /* renamed from: g  reason: collision with root package name */
    int f3729g;

    /* renamed from: h  reason: collision with root package name */
    int f3730h;

    /* renamed from: i  reason: collision with root package name */
    boolean f3731i;

    /* renamed from: j  reason: collision with root package name */
    boolean f3732j = true;

    /* renamed from: k  reason: collision with root package name */
    String f3733k;

    /* renamed from: l  reason: collision with root package name */
    int f3734l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f3735m;

    /* renamed from: n  reason: collision with root package name */
    int f3736n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f3737o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f3738p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<String> f3739q;

    /* renamed from: r  reason: collision with root package name */
    boolean f3740r = false;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Runnable> f3741s;

    /* compiled from: FragmentTransaction */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f3742a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f3743b;

        /* renamed from: c  reason: collision with root package name */
        int f3744c;

        /* renamed from: d  reason: collision with root package name */
        int f3745d;

        /* renamed from: e  reason: collision with root package name */
        int f3746e;

        /* renamed from: f  reason: collision with root package name */
        int f3747f;

        /* renamed from: g  reason: collision with root package name */
        i.b f3748g;

        /* renamed from: h  reason: collision with root package name */
        i.b f3749h;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f3742a = i10;
            this.f3743b = fragment;
            i.b bVar = i.b.RESUMED;
            this.f3748g = bVar;
            this.f3749h = bVar;
        }
    }

    w(j jVar, ClassLoader classLoader) {
        this.f3723a = jVar;
        this.f3724b = classLoader;
    }

    public w b(int i10, Fragment fragment, String str) {
        k(i10, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public w c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.H = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public w d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f3725c.add(aVar);
        aVar.f3744c = this.f3726d;
        aVar.f3745d = this.f3727e;
        aVar.f3746e = this.f3728f;
        aVar.f3747f = this.f3729g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public w j() {
        if (!this.f3731i) {
            this.f3732j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void k(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f3443z;
            if (str2 == null || str.equals(str2)) {
                fragment.f3443z = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f3443z + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = fragment.f3441x;
                if (i12 == 0 || i12 == i10) {
                    fragment.f3441x = i10;
                    fragment.f3442y = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f3441x + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i11, fragment));
    }

    public w l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public w m(int i10, Fragment fragment) {
        return n(i10, fragment, (String) null);
    }

    public w n(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            k(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public w o(boolean z10) {
        this.f3740r = z10;
        return this;
    }
}
