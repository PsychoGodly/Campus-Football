package io.flutter.plugins.googlemobileads;

import android.content.Context;
import n4.h;

/* compiled from: FlutterAdSize */
class m {

    /* renamed from: a  reason: collision with root package name */
    final h f34045a;

    /* renamed from: b  reason: collision with root package name */
    final int f34046b;

    /* renamed from: c  reason: collision with root package name */
    final int f34047c;

    /* compiled from: FlutterAdSize */
    static class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public h a(Context context, int i10) {
            return h.a(context, i10);
        }

        /* access modifiers changed from: package-private */
        public h b(Context context, int i10) {
            return h.b(context, i10);
        }

        /* access modifiers changed from: package-private */
        public h c(int i10, int i11) {
            return h.e(i10, i11);
        }

        /* access modifiers changed from: package-private */
        public h d(Context context, int i10) {
            return h.f(context, i10);
        }

        /* access modifiers changed from: package-private */
        public h e(Context context, int i10) {
            return h.g(context, i10);
        }

        /* access modifiers changed from: package-private */
        public h f(Context context, int i10) {
            return h.h(context, i10);
        }

        /* access modifiers changed from: package-private */
        public h g(Context context, int i10) {
            return h.i(context, i10);
        }
    }

    /* compiled from: FlutterAdSize */
    static class b extends m {

        /* renamed from: d  reason: collision with root package name */
        final String f34048d;

        b(Context context, a aVar, String str, int i10) {
            super(b(context, aVar, str, i10));
            this.f34048d = str;
        }

        private static h b(Context context, a aVar, String str, int i10) {
            if (str == null) {
                return aVar.a(context, i10);
            }
            if (str.equals("portrait")) {
                return aVar.f(context, i10);
            }
            if (str.equals("landscape")) {
                return aVar.d(context, i10);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }
    }

    /* compiled from: FlutterAdSize */
    static class c extends m {
        c() {
            super(h.f20934p);
        }
    }

    /* compiled from: FlutterAdSize */
    static class d extends m {

        /* renamed from: d  reason: collision with root package name */
        final Integer f34049d;

        /* renamed from: e  reason: collision with root package name */
        final Integer f34050e;

        d(a aVar, Context context, int i10, Integer num, Integer num2) {
            super(b(aVar, context, i10, num, num2));
            this.f34049d = num;
            this.f34050e = num2;
        }

        private static h b(a aVar, Context context, int i10, Integer num, Integer num2) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return aVar.g(context, i10);
                }
                return aVar.e(context, i10);
            } else if (num2 != null) {
                return aVar.c(i10, num2.intValue());
            } else {
                return aVar.b(context, i10);
            }
        }
    }

    /* compiled from: FlutterAdSize */
    static class e extends m {
        e() {
            super(h.f20933o);
        }
    }

    m(int i10, int i11) {
        this(new h(i10, i11));
    }

    public h a() {
        return this.f34045a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f34046b == mVar.f34046b && this.f34047c == mVar.f34047c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34046b * 31) + this.f34047c;
    }

    m(h hVar) {
        this.f34045a = hVar;
        this.f34046b = hVar.j();
        this.f34047c = hVar.c();
    }
}
