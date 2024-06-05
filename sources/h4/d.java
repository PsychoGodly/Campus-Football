package h4;

import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import r6.c;

/* compiled from: WebvttCssStyle */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f18750a = MaxReward.DEFAULT_LABEL;

    /* renamed from: b  reason: collision with root package name */
    private String f18751b = MaxReward.DEFAULT_LABEL;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f18752c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f18753d = MaxReward.DEFAULT_LABEL;

    /* renamed from: e  reason: collision with root package name */
    private String f18754e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f18755f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18756g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f18757h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f18758i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f18759j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f18760k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f18761l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f18762m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f18763n = -1;

    /* renamed from: o  reason: collision with root package name */
    private float f18764o;

    /* renamed from: p  reason: collision with root package name */
    private int f18765p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18766q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f18760k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f18758i) {
            return this.f18757h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f18766q;
    }

    public int c() {
        if (this.f18756g) {
            return this.f18755f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f18754e;
    }

    public float e() {
        return this.f18764o;
    }

    public int f() {
        return this.f18763n;
    }

    public int g() {
        return this.f18765p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f18750a.isEmpty() && this.f18751b.isEmpty() && this.f18752c.isEmpty() && this.f18753d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f18750a, str, 1073741824), this.f18751b, str2, 2), this.f18753d, str3, 4);
        if (B == -1 || !set.containsAll(this.f18752c)) {
            return 0;
        }
        return B + (this.f18752c.size() * 4);
    }

    public int i() {
        int i10 = this.f18761l;
        if (i10 == -1 && this.f18762m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f18762m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public boolean j() {
        return this.f18758i;
    }

    public boolean k() {
        return this.f18756g;
    }

    public boolean l() {
        return this.f18759j == 1;
    }

    public boolean m() {
        return this.f18760k == 1;
    }

    public d n(int i10) {
        this.f18757h = i10;
        this.f18758i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f18761l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f18766q = z10;
        return this;
    }

    public d q(int i10) {
        this.f18755f = i10;
        this.f18756g = true;
        return this;
    }

    public d r(String str) {
        this.f18754e = str == null ? null : c.e(str);
        return this;
    }

    public d s(float f10) {
        this.f18764o = f10;
        return this;
    }

    public d t(int i10) {
        this.f18763n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f18762m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f18765p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f18752c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f18750a = str;
    }

    public void y(String str) {
        this.f18751b = str;
    }

    public void z(String str) {
        this.f18753d = str;
    }
}
