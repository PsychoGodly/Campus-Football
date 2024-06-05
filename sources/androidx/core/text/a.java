package androidx.core.text;

import android.text.SpannableStringBuilder;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.util.Locale;

/* compiled from: BidiFormatter */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final d f3035d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f3036e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f3037f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f3038g;

    /* renamed from: h  reason: collision with root package name */
    static final a f3039h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3040a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3041b;

    /* renamed from: c  reason: collision with root package name */
    private final d f3042c;

    /* renamed from: androidx.core.text.a$a  reason: collision with other inner class name */
    /* compiled from: BidiFormatter */
    public static final class C0040a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f3043a;

        /* renamed from: b  reason: collision with root package name */
        private int f3044b;

        /* renamed from: c  reason: collision with root package name */
        private d f3045c;

        public C0040a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f3039h : a.f3038g;
        }

        private void c(boolean z10) {
            this.f3043a = z10;
            this.f3045c = a.f3035d;
            this.f3044b = 2;
        }

        public a a() {
            if (this.f3044b == 2 && this.f3045c == a.f3035d) {
                return b(this.f3043a);
            }
            return new a(this.f3043a, this.f3044b, this.f3045c);
        }
    }

    /* compiled from: BidiFormatter */
    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f3046f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f3047a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3048b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3049c;

        /* renamed from: d  reason: collision with root package name */
        private int f3050d;

        /* renamed from: e  reason: collision with root package name */
        private char f3051e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f3046f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f3047a = charSequence;
            this.f3048b = z10;
            this.f3049c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f3046f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f3050d;
            do {
                int i11 = this.f3050d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3047a;
                int i12 = i11 - 1;
                this.f3050d = i12;
                charAt = charSequence.charAt(i12);
                this.f3051e = charAt;
                if (charAt == '&') {
                    return Ascii.FF;
                }
            } while (charAt != ';');
            this.f3050d = i10;
            this.f3051e = ';';
            return Ascii.CR;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f3050d;
                if (i10 >= this.f3049c) {
                    return Ascii.FF;
                }
                CharSequence charSequence = this.f3047a;
                this.f3050d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f3051e = charAt;
            } while (charAt != ';');
            return Ascii.FF;
        }

        private byte h() {
            char charAt;
            int i10 = this.f3050d;
            while (true) {
                int i11 = this.f3050d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3047a;
                int i12 = i11 - 1;
                this.f3050d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f3051e = charAt2;
                if (charAt2 == '<') {
                    return Ascii.FF;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f3050d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3047a;
                        int i14 = i13 - 1;
                        this.f3050d = i14;
                        charAt = charSequence2.charAt(i14);
                        this.f3051e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f3050d = i10;
            this.f3051e = '>';
            return Ascii.CR;
        }

        private byte i() {
            char charAt;
            int i10 = this.f3050d;
            while (true) {
                int i11 = this.f3050d;
                if (i11 < this.f3049c) {
                    CharSequence charSequence = this.f3047a;
                    this.f3050d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f3051e = charAt2;
                    if (charAt2 == '>') {
                        return Ascii.FF;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f3050d;
                            if (i12 >= this.f3049c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f3047a;
                            this.f3050d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f3051e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f3050d = i10;
                    this.f3051e = '<';
                    return Ascii.CR;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.f3047a.charAt(this.f3050d - 1);
            this.f3051e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3047a, this.f3050d);
                this.f3050d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3050d--;
            byte c10 = c(this.f3051e);
            if (!this.f3048b) {
                return c10;
            }
            char c11 = this.f3051e;
            if (c11 == '>') {
                return h();
            }
            return c11 == ';' ? f() : c10;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.f3047a.charAt(this.f3050d);
            this.f3051e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f3047a, this.f3050d);
                this.f3050d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3050d++;
            byte c10 = c(this.f3051e);
            if (!this.f3048b) {
                return c10;
            }
            char c11 = this.f3051e;
            if (c11 == '<') {
                return i();
            }
            return c11 == '&' ? g() : c10;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f3050d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f3050d < this.f3049c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f3050d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e() {
            /*
                r7 = this;
                int r0 = r7.f3049c
                r7.f3050d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f3050d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.a.b.e():int");
        }
    }

    static {
        d dVar = e.f3069c;
        f3035d = dVar;
        f3038g = new a(false, 2, dVar);
        f3039h = new a(true, 2, dVar);
    }

    a(boolean z10, int i10, d dVar) {
        this.f3040a = z10;
        this.f3041b = i10;
        this.f3042c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0040a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f3040a && (a10 || b(charSequence) == 1)) {
            return f3036e;
        }
        if (this.f3040a) {
            return (!a10 || b(charSequence) == -1) ? f3037f : MaxReward.DEFAULT_LABEL;
        }
        return MaxReward.DEFAULT_LABEL;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f3040a && (a10 || a(charSequence) == 1)) {
            return f3036e;
        }
        if (this.f3040a) {
            return (!a10 || a(charSequence) == -1) ? f3037f : MaxReward.DEFAULT_LABEL;
        }
        return MaxReward.DEFAULT_LABEL;
    }

    public boolean d() {
        return (this.f3041b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f3042c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append(g(charSequence, a10 ? e.f3068b : e.f3067a));
        }
        if (a10 != this.f3040a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append(f(charSequence, a10 ? e.f3068b : e.f3067a));
        }
        return spannableStringBuilder;
    }
}
