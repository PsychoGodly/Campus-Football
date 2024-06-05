package androidx.webkit.internal;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ApiFeature */
public abstract class a implements k {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<a> f4979c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f4980a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4981b;

    /* renamed from: androidx.webkit.internal.a$a  reason: collision with other inner class name */
    /* compiled from: ApiFeature */
    private static class C0088a {

        /* renamed from: a  reason: collision with root package name */
        static final Set<String> f4982a = new HashSet(Arrays.asList(h0.d().a()));
    }

    /* compiled from: ApiFeature */
    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* compiled from: ApiFeature */
    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* compiled from: ApiFeature */
    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return false;
        }
    }

    /* compiled from: ApiFeature */
    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* compiled from: ApiFeature */
    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* compiled from: ApiFeature */
    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* compiled from: ApiFeature */
    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* compiled from: ApiFeature */
    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f4980a = str;
        this.f4981b = str2;
        f4979c.add(this);
    }

    public static Set<a> d() {
        return Collections.unmodifiableSet(f4979c);
    }

    public String a() {
        return this.f4980a;
    }

    public abstract boolean b();

    public boolean c() {
        return mf.a.b(C0088a.f4982a, this.f4981b);
    }

    public boolean isSupported() {
        return b() || c();
    }
}
