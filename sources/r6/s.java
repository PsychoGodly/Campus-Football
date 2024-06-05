package r6;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Splitter */
public final class s {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d f29820a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29821b;

    /* renamed from: c  reason: collision with root package name */
    private final c f29822c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f29823d;

    /* compiled from: Splitter */
    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f29824a;

        /* renamed from: r6.s$a$a  reason: collision with other inner class name */
        /* compiled from: Splitter */
        class C0331a extends b {
            C0331a(s sVar, CharSequence charSequence) {
                super(sVar, charSequence);
            }

            /* access modifiers changed from: package-private */
            public int e(int i10) {
                return i10 + 1;
            }

            /* access modifiers changed from: package-private */
            public int f(int i10) {
                return a.this.f29824a.c(this.f29826c, i10);
            }
        }

        a(d dVar) {
            this.f29824a = dVar;
        }

        /* renamed from: b */
        public b a(s sVar, CharSequence charSequence) {
            return new C0331a(sVar, charSequence);
        }
    }

    /* compiled from: Splitter */
    private static abstract class b extends b<String> {

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f29826c;

        /* renamed from: d  reason: collision with root package name */
        final d f29827d;

        /* renamed from: f  reason: collision with root package name */
        final boolean f29828f;

        /* renamed from: g  reason: collision with root package name */
        int f29829g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f29830h;

        protected b(s sVar, CharSequence charSequence) {
            this.f29827d = sVar.f29820a;
            this.f29828f = sVar.f29821b;
            this.f29830h = sVar.f29823d;
            this.f29826c = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String a() {
            int i10;
            int i11 = this.f29829g;
            while (true) {
                int i12 = this.f29829g;
                if (i12 == -1) {
                    return (String) b();
                }
                int f10 = f(i12);
                if (f10 == -1) {
                    f10 = this.f29826c.length();
                    this.f29829g = -1;
                } else {
                    this.f29829g = e(f10);
                }
                int i13 = this.f29829g;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.f29829g = i14;
                    if (i14 > this.f29826c.length()) {
                        this.f29829g = -1;
                    }
                } else {
                    while (i11 < f10 && this.f29827d.e(this.f29826c.charAt(i11))) {
                        i11++;
                    }
                    while (i10 > i11 && this.f29827d.e(this.f29826c.charAt(i10 - 1))) {
                        f10 = i10 - 1;
                    }
                    if (!this.f29828f || i11 != i10) {
                        int i15 = this.f29830h;
                    } else {
                        i11 = this.f29829g;
                    }
                }
            }
            int i152 = this.f29830h;
            if (i152 == 1) {
                i10 = this.f29826c.length();
                this.f29829g = -1;
                while (i10 > i11 && this.f29827d.e(this.f29826c.charAt(i10 - 1))) {
                    i10--;
                }
            } else {
                this.f29830h = i152 - 1;
            }
            return this.f29826c.subSequence(i11, i10).toString();
        }

        /* access modifiers changed from: package-private */
        public abstract int e(int i10);

        /* access modifiers changed from: package-private */
        public abstract int f(int i10);
    }

    /* compiled from: Splitter */
    private interface c {
        Iterator<String> a(s sVar, CharSequence charSequence);
    }

    private s(c cVar) {
        this(cVar, false, d.f(), a.e.API_PRIORITY_OTHER);
    }

    public static s d(char c10) {
        return e(d.d(c10));
    }

    public static s e(d dVar) {
        o.o(dVar);
        return new s(new a(dVar));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f29822c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        o.o(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public s h() {
        return i(d.h());
    }

    public s i(d dVar) {
        o.o(dVar);
        return new s(this.f29822c, this.f29821b, dVar, this.f29823d);
    }

    private s(c cVar, boolean z10, d dVar, int i10) {
        this.f29822c = cVar;
        this.f29821b = z10;
        this.f29820a = dVar;
        this.f29823d = i10;
    }
}
