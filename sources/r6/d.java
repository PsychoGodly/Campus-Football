package r6;

/* compiled from: CharMatcher */
public abstract class d implements p<Character> {

    /* compiled from: CharMatcher */
    static abstract class a extends d {
        a() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return d.super.b((Character) obj);
        }
    }

    /* compiled from: CharMatcher */
    private static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final char f29796a;

        b(char c10) {
            this.f29796a = c10;
        }

        public boolean e(char c10) {
            return c10 == this.f29796a;
        }

        public String toString() {
            String a10 = d.g(this.f29796a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(a10);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* compiled from: CharMatcher */
    static abstract class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f29797a;

        c(String str) {
            this.f29797a = (String) o.o(str);
        }

        public final String toString() {
            return this.f29797a;
        }
    }

    /* renamed from: r6.d$d  reason: collision with other inner class name */
    /* compiled from: CharMatcher */
    private static final class C0329d extends c {

        /* renamed from: b  reason: collision with root package name */
        static final C0329d f29798b = new C0329d();

        private C0329d() {
            super("CharMatcher.none()");
        }

        public int c(CharSequence charSequence, int i10) {
            o.r(i10, charSequence.length());
            return -1;
        }

        public boolean e(char c10) {
            return false;
        }
    }

    /* compiled from: CharMatcher */
    static final class e extends c {

        /* renamed from: b  reason: collision with root package name */
        static final int f29799b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c  reason: collision with root package name */
        static final e f29800c = new e();

        e() {
            super("CharMatcher.whitespace()");
        }

        public boolean e(char c10) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c10) >>> f29799b) == c10;
        }
    }

    protected d() {
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0329d.f29798b;
    }

    /* access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static d h() {
        return e.f29800c;
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        o.r(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
