package s6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import r6.o;
import r6.v;

/* compiled from: MultimapBuilder */
public abstract class j0<K0, V0> {

    /* compiled from: MultimapBuilder */
    class a extends d<K0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f30185a;

        a(Comparator comparator) {
            this.f30185a = comparator;
        }

        /* access modifiers changed from: package-private */
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f30185a);
        }
    }

    /* compiled from: MultimapBuilder */
    private static final class b<V> implements v<List<V>>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f30186a;

        b(int i10) {
            this.f30186a = i.b(i10, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f30186a);
        }
    }

    /* compiled from: MultimapBuilder */
    public static abstract class c<K0, V0> extends j0<K0, V0> {
        c() {
            super((i0) null);
        }

        public abstract <K extends K0, V extends V0> d0<K, V> c();
    }

    /* compiled from: MultimapBuilder */
    public static abstract class d<K0> {

        /* compiled from: MultimapBuilder */
        class a extends c<K0, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f30187a;

            a(int i10) {
                this.f30187a = i10;
            }

            public <K extends K0, V> d0<K, V> c() {
                return k0.b(d.this.c(), new b(this.f30187a));
            }
        }

        d() {
        }

        public c<K0, Object> a() {
            return b(2);
        }

        public c<K0, Object> b(int i10) {
            i.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        /* access modifiers changed from: package-private */
        public abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ j0(i0 i0Var) {
        this();
    }

    public static d<Comparable> a() {
        return b(p0.c());
    }

    public static <K0> d<K0> b(Comparator<K0> comparator) {
        o.o(comparator);
        return new a(comparator);
    }

    private j0() {
    }
}
