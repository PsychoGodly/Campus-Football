package androidx.core.text;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f3067a = new C0043e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f3068b = new C0043e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f3069c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f3070d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f3071e = new C0043e(a.f3073b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final d f3072f = f.f3078b;

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f3073b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f3074a;

        private a(boolean z10) {
            this.f3074a = z10;
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = e.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                    } else if (!this.f3074a) {
                        return 1;
                    }
                } else if (this.f3074a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f3074a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f3075a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = e.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class d implements d {

        /* renamed from: a  reason: collision with root package name */
        private final c f3076a;

        d(c cVar) {
            this.f3076a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f3076a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            } else if (this.f3076a == null) {
                return b();
            } else {
                return c(charSequence, i10, i11);
            }
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    /* renamed from: androidx.core.text.e$e  reason: collision with other inner class name */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0043e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3077b;

        C0043e(c cVar, boolean z10) {
            super(cVar);
            this.f3077b = z10;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.f3077b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f3078b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f3075a;
        f3069c = new C0043e(bVar, false);
        f3070d = new C0043e(bVar, true);
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
