package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import androidx.core.view.a0;
import h.j;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: AppCompatTextHelper */
class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1494a;

    /* renamed from: b  reason: collision with root package name */
    private x0 f1495b;

    /* renamed from: c  reason: collision with root package name */
    private x0 f1496c;

    /* renamed from: d  reason: collision with root package name */
    private x0 f1497d;

    /* renamed from: e  reason: collision with root package name */
    private x0 f1498e;

    /* renamed from: f  reason: collision with root package name */
    private x0 f1499f;

    /* renamed from: g  reason: collision with root package name */
    private x0 f1500g;

    /* renamed from: h  reason: collision with root package name */
    private x0 f1501h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f1502i;

    /* renamed from: j  reason: collision with root package name */
    private int f1503j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1504k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f1505l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1506m;

    /* compiled from: AppCompatTextHelper */
    class a extends h.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1508b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f1509c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1507a = i10;
            this.f1508b = i11;
            this.f1509c = weakReference;
        }

        public void h(int i10) {
        }

        public void i(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1507a) != -1) {
                typeface = g.a(typeface, i10, (this.f1508b & 2) != 0);
            }
            b0.this.n(this.f1509c, typeface);
        }
    }

    /* compiled from: AppCompatTextHelper */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f1511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f1512b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1513c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1511a = textView;
            this.f1512b = typeface;
            this.f1513c = i10;
        }

        public void run() {
            this.f1511a.setTypeface(this.f1512b, this.f1513c);
        }
    }

    /* compiled from: AppCompatTextHelper */
    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper */
    static class d {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: AppCompatTextHelper */
    static class e {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper */
    static class f {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper */
    static class g {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    b0(TextView textView) {
        this.f1494a = textView;
        this.f1502i = new d0(textView);
    }

    private void B(int i10, float f10) {
        this.f1502i.w(i10, f10);
    }

    private void C(Context context, z0 z0Var) {
        String o10;
        this.f1503j = z0Var.k(j.H2, this.f1503j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 28) {
            int k10 = z0Var.k(j.M2, -1);
            this.f1504k = k10;
            if (k10 != -1) {
                this.f1503j = (this.f1503j & 2) | 0;
            }
        }
        int i11 = j.L2;
        if (z0Var.s(i11) || z0Var.s(j.N2)) {
            this.f1505l = null;
            int i12 = j.N2;
            if (z0Var.s(i12)) {
                i11 = i12;
            }
            int i13 = this.f1504k;
            int i14 = this.f1503j;
            if (!context.isRestricted()) {
                try {
                    Typeface j10 = z0Var.j(i11, this.f1503j, new a(i13, i14, new WeakReference(this.f1494a)));
                    if (j10 != null) {
                        if (i10 < 28 || this.f1504k == -1) {
                            this.f1505l = j10;
                        } else {
                            this.f1505l = g.a(Typeface.create(j10, 0), this.f1504k, (this.f1503j & 2) != 0);
                        }
                    }
                    this.f1506m = this.f1505l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1505l == null && (o10 = z0Var.o(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1504k == -1) {
                    this.f1505l = Typeface.create(o10, this.f1503j);
                    return;
                }
                Typeface create = Typeface.create(o10, 0);
                int i15 = this.f1504k;
                if ((this.f1503j & 2) != 0) {
                    z10 = true;
                }
                this.f1505l = g.a(create, i15, z10);
                return;
            }
            return;
        }
        int i16 = j.G2;
        if (z0Var.s(i16)) {
            this.f1506m = false;
            int k11 = z0Var.k(i16, 1);
            if (k11 == 1) {
                this.f1505l = Typeface.SANS_SERIF;
            } else if (k11 == 2) {
                this.f1505l = Typeface.SERIF;
            } else if (k11 == 3) {
                this.f1505l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, x0 x0Var) {
        if (drawable != null && x0Var != null) {
            j.i(drawable, x0Var, this.f1494a.getDrawableState());
        }
    }

    private static x0 d(Context context, j jVar, int i10) {
        ColorStateList f10 = jVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        x0 x0Var = new x0();
        x0Var.f1850d = true;
        x0Var.f1847a = f10;
        return x0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] a10 = c.a(this.f1494a);
            TextView textView = this.f1494a;
            if (drawable5 == null) {
                drawable5 = a10[0];
            }
            if (drawable2 == null) {
                drawable2 = a10[1];
            }
            if (drawable6 == null) {
                drawable6 = a10[2];
            }
            if (drawable4 == null) {
                drawable4 = a10[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i10 >= 17) {
                Drawable[] a11 = c.a(this.f1494a);
                if (!(a11[0] == null && a11[2] == null)) {
                    TextView textView2 = this.f1494a;
                    Drawable drawable7 = a11[0];
                    if (drawable2 == null) {
                        drawable2 = a11[1];
                    }
                    Drawable drawable8 = a11[2];
                    if (drawable4 == null) {
                        drawable4 = a11[3];
                    }
                    c.b(textView2, drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1494a.getCompoundDrawables();
            TextView textView3 = this.f1494a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void z() {
        x0 x0Var = this.f1501h;
        this.f1495b = x0Var;
        this.f1496c = x0Var;
        this.f1497d = x0Var;
        this.f1498e = x0Var;
        this.f1499f = x0Var;
        this.f1500g = x0Var;
    }

    /* access modifiers changed from: package-private */
    public void A(int i10, float f10) {
        if (!k1.f1693b && !l()) {
            B(i10, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f1495b == null && this.f1496c == null && this.f1497d == null && this.f1498e == null)) {
            Drawable[] compoundDrawables = this.f1494a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1495b);
            a(compoundDrawables[1], this.f1496c);
            a(compoundDrawables[2], this.f1497d);
            a(compoundDrawables[3], this.f1498e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1499f != null || this.f1500g != null) {
            Drawable[] a10 = c.a(this.f1494a);
            a(a10[0], this.f1499f);
            a(a10[2], this.f1500g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f1502i.b();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f1502i.h();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f1502i.i();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f1502i.j();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f1502i.k();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f1502i.l();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        x0 x0Var = this.f1501h;
        if (x0Var != null) {
            return x0Var.f1847a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        x0 x0Var = this.f1501h;
        if (x0Var != null) {
            return x0Var.f1848b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f1502i.q();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f1494a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.j r11 = androidx.appcompat.widget.j.b()
            int[] r2 = h.j.Y
            r12 = 0
            androidx.appcompat.widget.z0 r13 = androidx.appcompat.widget.z0.v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1494a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.r()
            r6 = 0
            r3 = r24
            r5 = r25
            androidx.core.view.a0.l0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = h.j.Z
            r14 = -1
            int r0 = r13.n(r0, r14)
            int r1 = h.j.f18315c0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.x0 r1 = d(r10, r11, r1)
            r7.f1495b = r1
        L_0x0042:
            int r1 = h.j.f18305a0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.x0 r1 = d(r10, r11, r1)
            r7.f1496c = r1
        L_0x0054:
            int r1 = h.j.f18320d0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.x0 r1 = d(r10, r11, r1)
            r7.f1497d = r1
        L_0x0066:
            int r1 = h.j.f18310b0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.x0 r1 = d(r10, r11, r1)
            r7.f1498e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = h.j.f18325e0
            boolean r3 = r13.s(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.n(r2, r12)
            androidx.appcompat.widget.x0 r2 = d(r10, r11, r2)
            r7.f1499f = r2
        L_0x0090:
            int r2 = h.j.f18330f0
            boolean r3 = r13.s(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.n(r2, r12)
            androidx.appcompat.widget.x0 r2 = d(r10, r11, r2)
            r7.f1500g = r2
        L_0x00a2:
            r13.w()
            android.widget.TextView r2 = r7.f1494a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = h.j.E2
            androidx.appcompat.widget.z0 r0 = androidx.appcompat.widget.z0.t(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = h.j.P2
            boolean r15 = r0.s(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = 0
            r15 = 0
        L_0x00cb:
            r7.C(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = h.j.I2
            boolean r17 = r0.s(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = h.j.J2
            boolean r18 = r0.s(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = h.j.K2
            boolean r19 = r0.s(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = h.j.Q2
            boolean r20 = r0.s(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.o(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = h.j.O2
            boolean r21 = r0.s(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.o(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.w()
            goto L_0x0125
        L_0x011e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0125:
            int[] r0 = h.j.E2
            androidx.appcompat.widget.z0 r0 = androidx.appcompat.widget.z0.v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = h.j.P2
            boolean r22 = r0.s(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = h.j.I2
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.c(r3)
        L_0x0152:
            int r3 = h.j.J2
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.c(r3)
        L_0x015e:
            int r3 = h.j.K2
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.c(r3)
        L_0x016a:
            int r3 = h.j.Q2
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.o(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = h.j.O2
            boolean r12 = r0.s(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.o(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = h.j.F2
            boolean r16 = r0.s(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.f(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.f1494a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.C(r10, r0)
            r0.w()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.f1494a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.f1494a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.f1494a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.s(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f1505l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f1504k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.f1494a
            int r4 = r7.f1503j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.f1494a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.f1494a
            androidx.appcompat.widget.b0.f.d(r0, r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020d
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.f1494a
            android.os.LocaleList r1 = androidx.appcompat.widget.b0.e.a(r5)
            androidx.appcompat.widget.b0.e.b(r0, r1)
            goto L_0x020d
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020d
            java.lang.String r0 = ","
            java.lang.String[] r0 = r5.split(r0)
            r1 = 0
            r0 = r0[r1]
            android.widget.TextView r1 = r7.f1494a
            java.util.Locale r0 = androidx.appcompat.widget.b0.d.a(r0)
            androidx.appcompat.widget.b0.c.c(r1, r0)
        L_0x020d:
            androidx.appcompat.widget.d0 r0 = r7.f1502i
            r1 = r24
            r0.r(r1, r9)
            boolean r0 = androidx.appcompat.widget.k1.f1693b
            if (r0 == 0) goto L_0x0255
            androidx.appcompat.widget.d0 r0 = r7.f1502i
            int r0 = r0.l()
            if (r0 == 0) goto L_0x0255
            androidx.appcompat.widget.d0 r0 = r7.f1502i
            int[] r0 = r0.k()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0255
            android.widget.TextView r2 = r7.f1494a
            int r2 = androidx.appcompat.widget.b0.f.a(r2)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x024f
            android.widget.TextView r0 = r7.f1494a
            androidx.appcompat.widget.d0 r2 = r7.f1502i
            int r2 = r2.i()
            androidx.appcompat.widget.d0 r3 = r7.f1502i
            int r3 = r3.h()
            androidx.appcompat.widget.d0 r4 = r7.f1502i
            int r4 = r4.j()
            r5 = 0
            androidx.appcompat.widget.b0.f.b(r0, r2, r3, r4, r5)
            goto L_0x0255
        L_0x024f:
            r5 = 0
            android.widget.TextView r2 = r7.f1494a
            androidx.appcompat.widget.b0.f.c(r2, r0, r5)
        L_0x0255:
            int[] r0 = h.j.f18335g0
            androidx.appcompat.widget.z0 r8 = androidx.appcompat.widget.z0.u(r10, r1, r0)
            int r0 = h.j.f18375o0
            r1 = -1
            int r0 = r8.n(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026c
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r3 = r0
            goto L_0x026d
        L_0x026c:
            r3 = 0
        L_0x026d:
            int r0 = h.j.f18400t0
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x027b
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r4 = r0
            goto L_0x027c
        L_0x027b:
            r4 = 0
        L_0x027c:
            int r0 = h.j.f18380p0
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x028a
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r5 = r0
            goto L_0x028b
        L_0x028a:
            r5 = 0
        L_0x028b:
            int r0 = h.j.f18365m0
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x0299
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r6 = r0
            goto L_0x029a
        L_0x0299:
            r6 = 0
        L_0x029a:
            int r0 = h.j.f18385q0
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x02a8
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r9 = r0
            goto L_0x02a9
        L_0x02a8:
            r9 = 0
        L_0x02a9:
            int r0 = h.j.f18370n0
            int r0 = r8.n(r0, r1)
            if (r0 == r1) goto L_0x02b7
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r10 = r0
            goto L_0x02b8
        L_0x02b7:
            r10 = 0
        L_0x02b8:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = h.j.f18390r0
            boolean r1 = r8.s(r0)
            if (r1 == 0) goto L_0x02d4
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.f1494a
            androidx.core.widget.i.g(r1, r0)
        L_0x02d4:
            int r0 = h.j.f18395s0
            boolean r1 = r8.s(r0)
            if (r1 == 0) goto L_0x02ec
            r1 = -1
            int r0 = r8.k(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.h0.d(r0, r2)
            android.widget.TextView r2 = r7.f1494a
            androidx.core.widget.i.h(r2, r0)
            goto L_0x02ed
        L_0x02ec:
            r1 = -1
        L_0x02ed:
            int r0 = h.j.f18410v0
            int r0 = r8.f(r0, r1)
            int r2 = h.j.f18415w0
            int r2 = r8.f(r2, r1)
            int r3 = h.j.f18420x0
            int r3 = r8.f(r3, r1)
            r8.w()
            if (r0 == r1) goto L_0x0309
            android.widget.TextView r4 = r7.f1494a
            androidx.core.widget.i.j(r4, r0)
        L_0x0309:
            if (r2 == r1) goto L_0x0310
            android.widget.TextView r0 = r7.f1494a
            androidx.core.widget.i.k(r0, r2)
        L_0x0310:
            if (r3 == r1) goto L_0x0317
            android.widget.TextView r0 = r7.f1494a
            androidx.core.widget.i.l(r0, r3)
        L_0x0317:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1506m) {
            this.f1505l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (a0.Q(textView)) {
                textView.post(new b(textView, typeface, this.f1503j));
            } else {
                textView.setTypeface(typeface, this.f1503j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!k1.f1693b) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String o10;
        ColorStateList c10;
        ColorStateList c11;
        ColorStateList c12;
        z0 t10 = z0.t(context, i10, j.E2);
        int i11 = j.P2;
        if (t10.s(i11)) {
            s(t10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = j.I2;
            if (t10.s(i13) && (c12 = t10.c(i13)) != null) {
                this.f1494a.setTextColor(c12);
            }
            int i14 = j.K2;
            if (t10.s(i14) && (c11 = t10.c(i14)) != null) {
                this.f1494a.setLinkTextColor(c11);
            }
            int i15 = j.J2;
            if (t10.s(i15) && (c10 = t10.c(i15)) != null) {
                this.f1494a.setHintTextColor(c10);
            }
        }
        int i16 = j.F2;
        if (t10.s(i16) && t10.f(i16, -1) == 0) {
            this.f1494a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i12 >= 26) {
            int i17 = j.O2;
            if (t10.s(i17) && (o10 = t10.o(i17)) != null) {
                f.d(this.f1494a, o10);
            }
        }
        t10.w();
        Typeface typeface = this.f1505l;
        if (typeface != null) {
            this.f1494a.setTypeface(typeface, this.f1503j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            c0.a.f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        this.f1494a.setAllCaps(z10);
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f1502i.s(i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void u(int[] iArr, int i10) throws IllegalArgumentException {
        this.f1502i.t(iArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        this.f1502i.u(i10);
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f1501h == null) {
            this.f1501h = new x0();
        }
        x0 x0Var = this.f1501h;
        x0Var.f1847a = colorStateList;
        x0Var.f1850d = colorStateList != null;
        z();
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f1501h == null) {
            this.f1501h = new x0();
        }
        x0 x0Var = this.f1501h;
        x0Var.f1848b = mode;
        x0Var.f1849c = mode != null;
        z();
    }
}
