package h4;

import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.a;
import k4.a0;
import k4.f;
import k4.n0;
import k4.r;

/* compiled from: WebvttCssParser */
final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f18746c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f18747d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f18748a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f18749b = new StringBuilder();

    private void a(d dVar, String str) {
        if (!MaxReward.DEFAULT_LABEL.equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f18746c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.z((String) a.e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] R0 = n0.R0(str, "\\.");
            String str2 = R0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.y(str2.substring(0, indexOf2));
                dVar.x(str2.substring(indexOf2 + 1));
            } else {
                dVar.y(str2);
            }
            if (R0.length > 1) {
                dVar.w((String[]) n0.I0(R0, 1, R0.length));
            }
        }
    }

    private static boolean b(a0 a0Var) {
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        byte[] e10 = a0Var.e();
        if (f10 + 2 > g10) {
            return false;
        }
        int i10 = f10 + 1;
        if (e10[f10] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (e10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= g10) {
                a0Var.U(g10 - a0Var.f());
                return true;
            } else if (((char) e10[i11]) == '*' && ((char) e10[i12]) == '/') {
                i11 = i12 + 1;
                g10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(a0 a0Var) {
        char k10 = k(a0Var, a0Var.f());
        if (k10 != 9 && k10 != 10 && k10 != 12 && k10 != 13 && k10 != ' ') {
            return false;
        }
        a0Var.U(1);
        return true;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f18747d.matcher(r6.c.e(str));
        if (!matcher.matches()) {
            r.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) a.e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.t(3);
                break;
            case 1:
                dVar.t(2);
                break;
            case 2:
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) a.e(matcher.group(1))));
    }

    private static String f(a0 a0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        while (f10 < g10 && !z10) {
            char c10 = (char) a0Var.e()[f10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                f10++;
                sb2.append(c10);
            }
        }
        a0Var.U(f10 - a0Var.f());
        return sb2.toString();
    }

    static String g(a0 a0Var, StringBuilder sb2) {
        n(a0Var);
        if (a0Var.a() == 0) {
            return null;
        }
        String f10 = f(a0Var, sb2);
        if (!MaxReward.DEFAULT_LABEL.equals(f10)) {
            return f10;
        }
        return MaxReward.DEFAULT_LABEL + ((char) a0Var.G());
    }

    private static String h(a0 a0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int f10 = a0Var.f();
            String g10 = g(a0Var, sb2);
            if (g10 == null) {
                return null;
            }
            if ("}".equals(g10) || ";".equals(g10)) {
                a0Var.T(f10);
                z10 = true;
            } else {
                sb3.append(g10);
            }
        }
        return sb3.toString();
    }

    private static String i(a0 a0Var, StringBuilder sb2) {
        n(a0Var);
        if (a0Var.a() < 5 || !"::cue".equals(a0Var.D(5))) {
            return null;
        }
        int f10 = a0Var.f();
        String g10 = g(a0Var, sb2);
        if (g10 == null) {
            return null;
        }
        if ("{".equals(g10)) {
            a0Var.T(f10);
            return MaxReward.DEFAULT_LABEL;
        }
        String l10 = "(".equals(g10) ? l(a0Var) : null;
        if (!")".equals(g(a0Var, sb2))) {
            return null;
        }
        return l10;
    }

    private static void j(a0 a0Var, d dVar, StringBuilder sb2) {
        n(a0Var);
        String f10 = f(a0Var, sb2);
        if (!MaxReward.DEFAULT_LABEL.equals(f10) && ":".equals(g(a0Var, sb2))) {
            n(a0Var);
            String h10 = h(a0Var, sb2);
            if (h10 != null && !MaxReward.DEFAULT_LABEL.equals(h10)) {
                int f11 = a0Var.f();
                String g10 = g(a0Var, sb2);
                if (!";".equals(g10)) {
                    if ("}".equals(g10)) {
                        a0Var.T(f11);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f10)) {
                    dVar.q(f.b(h10));
                } else if ("background-color".equals(f10)) {
                    dVar.n(f.b(h10));
                } else {
                    boolean z10 = true;
                    if ("ruby-position".equals(f10)) {
                        if ("over".equals(h10)) {
                            dVar.v(1);
                        } else if ("under".equals(h10)) {
                            dVar.v(2);
                        }
                    } else if ("text-combine-upright".equals(f10)) {
                        if (!"all".equals(h10) && !h10.startsWith("digits")) {
                            z10 = false;
                        }
                        dVar.p(z10);
                    } else if ("text-decoration".equals(f10)) {
                        if ("underline".equals(h10)) {
                            dVar.A(true);
                        }
                    } else if ("font-family".equals(f10)) {
                        dVar.r(h10);
                    } else if ("font-weight".equals(f10)) {
                        if ("bold".equals(h10)) {
                            dVar.o(true);
                        }
                    } else if ("font-style".equals(f10)) {
                        if ("italic".equals(h10)) {
                            dVar.u(true);
                        }
                    } else if ("font-size".equals(f10)) {
                        e(h10, dVar);
                    }
                }
            }
        }
    }

    private static char k(a0 a0Var, int i10) {
        return (char) a0Var.e()[i10];
    }

    private static String l(a0 a0Var) {
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        boolean z10 = false;
        while (f10 < g10 && !z10) {
            int i10 = f10 + 1;
            z10 = ((char) a0Var.e()[f10]) == ')';
            f10 = i10;
        }
        return a0Var.D((f10 - 1) - a0Var.f()).trim();
    }

    static void m(a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.r()));
    }

    static void n(a0 a0Var) {
        while (true) {
            boolean z10 = true;
            while (a0Var.a() > 0 && z10) {
                if (!c(a0Var) && !b(a0Var)) {
                    z10 = false;
                }
            }
            return;
        }
    }

    public List<d> d(a0 a0Var) {
        this.f18749b.setLength(0);
        int f10 = a0Var.f();
        m(a0Var);
        this.f18748a.R(a0Var.e(), a0Var.f());
        this.f18748a.T(f10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f18748a, this.f18749b);
            if (i10 == null || !"{".equals(g(this.f18748a, this.f18749b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int f11 = this.f18748a.f();
                String g10 = g(this.f18748a, this.f18749b);
                boolean z11 = g10 == null || "}".equals(g10);
                if (!z11) {
                    this.f18748a.T(f11);
                    j(this.f18748a, dVar, this.f18749b);
                }
                str = g10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
