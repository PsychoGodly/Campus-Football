package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class rf {

    class a extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f11181a;

        a(Comparator comparator) {
            this.f11181a = comparator;
        }

        /* access modifiers changed from: package-private */
        public Map b() {
            return new TreeMap(this.f11181a);
        }
    }

    private static final class b implements Supplier, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f11182a;

        b(int i10) {
            this.f11182a = n3.a(i10, "expectedValuesPerKey");
        }

        public List get() {
            return new ArrayList(this.f11182a);
        }
    }

    public static abstract class c extends rf {
        c() {
            super((qf) null);
        }

        public abstract ac b();
    }

    public static abstract class d {

        class a extends c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f11183a;

            a(int i10) {
                this.f11183a = i10;
            }

            public ac b() {
                return sf.a(d.this.b(), (Supplier) new b(this.f11183a));
            }
        }

        d() {
        }

        public c a() {
            return a(2);
        }

        /* access modifiers changed from: package-private */
        public abstract Map b();

        public c a(int i10) {
            n3.a(i10, "expectedValuesPerKey");
            return new a(i10);
        }
    }

    private rf() {
    }

    /* synthetic */ rf(qf qfVar) {
        this();
    }

    public static d a(Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new a(comparator);
    }

    public static d a() {
        return a(tg.a());
    }
}
