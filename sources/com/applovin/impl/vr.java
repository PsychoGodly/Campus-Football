package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class vr {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f12873c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f12874d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final yg f12875a = new yg();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f12876b = new StringBuilder();

    private static boolean a(yg ygVar) {
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        byte[] c10 = ygVar.c();
        int i10 = d10 + 2;
        if (i10 > e10) {
            return false;
        }
        int i11 = d10 + 1;
        if (c10[d10] != 47 || c10[i11] != 42) {
            return false;
        }
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= e10) {
                ygVar.g(e10 - ygVar.d());
                return true;
            } else if (((char) c10[i10]) == '*' && ((char) c10[i12]) == '/') {
                i10 += 2;
                e10 = i10;
            } else {
                i10 = i12;
            }
        }
    }

    private static boolean b(yg ygVar) {
        char a10 = a(ygVar, ygVar.d());
        if (a10 != 9 && a10 != 10 && a10 != 12 && a10 != 13 && a10 != ' ') {
            return false;
        }
        ygVar.g(1);
        return true;
    }

    private static String d(yg ygVar, StringBuilder sb2) {
        f(ygVar);
        if (ygVar.a() < 5 || !"::cue".equals(ygVar.c(5))) {
            return null;
        }
        int d10 = ygVar.d();
        String b10 = b(ygVar, sb2);
        if (b10 == null) {
            return null;
        }
        if ("{".equals(b10)) {
            ygVar.f(d10);
            return MaxReward.DEFAULT_LABEL;
        }
        String d11 = "(".equals(b10) ? d(ygVar) : null;
        if (!")".equals(b(ygVar, sb2))) {
            return null;
        }
        return d11;
    }

    static void e(yg ygVar) {
        do {
        } while (!TextUtils.isEmpty(ygVar.l()));
    }

    static void f(yg ygVar) {
        while (true) {
            boolean z10 = true;
            while (ygVar.a() > 0 && z10) {
                if (!b(ygVar) && !a(ygVar)) {
                    z10 = false;
                }
            }
            return;
        }
    }

    public List c(yg ygVar) {
        this.f12876b.setLength(0);
        int d10 = ygVar.d();
        e(ygVar);
        this.f12875a.a(ygVar.c(), ygVar.d());
        this.f12875a.f(d10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String d11 = d(this.f12875a, this.f12876b);
            if (d11 == null || !"{".equals(b(this.f12875a, this.f12876b))) {
                return arrayList;
            }
            wr wrVar = new wr();
            a(wrVar, d11);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int d12 = this.f12875a.d();
                String b10 = b(this.f12875a, this.f12876b);
                boolean z11 = b10 == null || "}".equals(b10);
                if (!z11) {
                    this.f12875a.f(d12);
                    a(this.f12875a, wrVar, this.f12876b);
                }
                str = b10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(wrVar);
            }
        }
    }

    static String b(yg ygVar, StringBuilder sb2) {
        f(ygVar);
        if (ygVar.a() == 0) {
            return null;
        }
        String a10 = a(ygVar, sb2);
        if (!MaxReward.DEFAULT_LABEL.equals(a10)) {
            return a10;
        }
        return MaxReward.DEFAULT_LABEL + ((char) ygVar.w());
    }

    private static String a(yg ygVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        while (d10 < e10 && !z10) {
            char c10 = (char) ygVar.c()[d10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                d10++;
                sb2.append(c10);
            }
        }
        ygVar.g(d10 - ygVar.d());
        return sb2.toString();
    }

    private static String d(yg ygVar) {
        int d10 = ygVar.d();
        int e10 = ygVar.e();
        loop0:
        while (true) {
            boolean z10 = false;
            while (d10 < e10 && !z10) {
                int i10 = d10 + 1;
                if (((char) ygVar.c()[d10]) == ')') {
                    z10 = true;
                    d10 = i10;
                } else {
                    d10 = i10;
                }
            }
        }
        return ygVar.c((d10 - 1) - ygVar.d()).trim();
    }

    private static void a(yg ygVar, wr wrVar, StringBuilder sb2) {
        f(ygVar);
        String a10 = a(ygVar, sb2);
        if (!MaxReward.DEFAULT_LABEL.equals(a10) && ":".equals(b(ygVar, sb2))) {
            f(ygVar);
            String c10 = c(ygVar, sb2);
            if (c10 != null && !MaxReward.DEFAULT_LABEL.equals(c10)) {
                int d10 = ygVar.d();
                String b10 = b(ygVar, sb2);
                if (!";".equals(b10)) {
                    if ("}".equals(b10)) {
                        ygVar.f(d10);
                    } else {
                        return;
                    }
                }
                if ("color".equals(a10)) {
                    wrVar.b(q3.a(c10));
                } else if ("background-color".equals(a10)) {
                    wrVar.a(q3.a(c10));
                } else {
                    boolean z10 = true;
                    if ("ruby-position".equals(a10)) {
                        if ("over".equals(c10)) {
                            wrVar.d(1);
                        } else if ("under".equals(c10)) {
                            wrVar.d(2);
                        }
                    } else if ("text-combine-upright".equals(a10)) {
                        if (!"all".equals(c10) && !c10.startsWith("digits")) {
                            z10 = false;
                        }
                        wrVar.b(z10);
                    } else if ("text-decoration".equals(a10)) {
                        if ("underline".equals(c10)) {
                            wrVar.d(true);
                        }
                    } else if ("font-family".equals(a10)) {
                        wrVar.a(c10);
                    } else if ("font-weight".equals(a10)) {
                        if ("bold".equals(c10)) {
                            wrVar.a(true);
                        }
                    } else if ("font-style".equals(a10)) {
                        if ("italic".equals(c10)) {
                            wrVar.c(true);
                        }
                    } else if ("font-size".equals(a10)) {
                        a(c10, wrVar);
                    }
                }
            }
        }
    }

    private static String c(yg ygVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int d10 = ygVar.d();
            String b10 = b(ygVar, sb2);
            if (b10 == null) {
                return null;
            }
            if ("}".equals(b10) || ";".equals(b10)) {
                ygVar.f(d10);
                z10 = true;
            } else {
                sb3.append(b10);
            }
        }
        return sb3.toString();
    }

    private static char a(yg ygVar, int i10) {
        return (char) ygVar.c()[i10];
    }

    private static void a(String str, wr wrVar) {
        Matcher matcher = f12874d.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            kc.d("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) a1.a((Object) matcher.group(2));
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
                wrVar.c(3);
                break;
            case 1:
                wrVar.c(2);
                break;
            case 2:
                wrVar.c(1);
                break;
            default:
                throw new IllegalStateException();
        }
        wrVar.a(Float.parseFloat((String) a1.a((Object) matcher.group(1))));
    }

    private void a(wr wrVar, String str) {
        if (!MaxReward.DEFAULT_LABEL.equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f12873c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    wrVar.d((String) a1.a((Object) matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] a10 = yp.a(str, "\\.");
            String str2 = a10[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                wrVar.c(str2.substring(0, indexOf2));
                wrVar.b(str2.substring(indexOf2 + 1));
            } else {
                wrVar.c(str2);
            }
            if (a10.length > 1) {
                wrVar.a((String[]) yp.a((Object[]) a10, 1, a10.length));
            }
        }
    }
}
