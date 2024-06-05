package f4;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c4.b;
import c4.c;
import c4.d;
import java.util.ArrayDeque;
import java.util.Map;
import k4.a;
import k4.n0;
import k4.r;

/* compiled from: TtmlRenderUtil */
final class f {
    public static void a(Spannable spannable, int i10, int i11, g gVar, d dVar, Map<String, g> map, int i12) {
        d e10;
        g f10;
        int i13;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i10, i11, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.q()) {
            c.a(spannable, new ForegroundColorSpan(gVar.c()), i10, i11, 33);
        }
        if (gVar.p()) {
            c.a(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.d() != null) {
            c.a(spannable, new TypefaceSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.o() != null) {
            b bVar = (b) a.e(gVar.o());
            int i14 = bVar.f18005a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f18006b;
            }
            int i15 = bVar.f18007c;
            if (i15 == -2) {
                i15 = 1;
            }
            c.a(spannable, new d(i14, i13, i15), i10, i11, 33);
        }
        int j10 = gVar.j();
        if (j10 == 2) {
            d d10 = d(dVar, map);
            if (!(d10 == null || (e10 = e(d10, map)) == null)) {
                if (e10.g() != 1 || e10.f(0).f18026b == null) {
                    r.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) n0.j(e10.f(0).f18026b);
                    g f11 = f(e10.f18030f, e10.l(), map);
                    int i16 = f11 != null ? f11.i() : -1;
                    if (i16 == -1 && (f10 = f(d10.f18030f, d10.l(), map)) != null) {
                        i16 = f10.i();
                    }
                    spannable.setSpan(new b(str, i16), i10, i11, 33);
                }
            }
        } else if (j10 == 3 || j10 == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.n()) {
            c.a(spannable, new c4.a(), i10, i11, 33);
        }
        int f12 = gVar.f();
        if (f12 == 1) {
            c.a(spannable, new AbsoluteSizeSpan((int) gVar.e(), true), i10, i11, 33);
        } else if (f12 == 2) {
            c.a(spannable, new RelativeSizeSpan(gVar.e()), i10, i11, 33);
        } else if (f12 == 3) {
            c.a(spannable, new RelativeSizeSpan(gVar.e() / 100.0f), i10, i11, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    private static d d(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g f10 = f(dVar.f18030f, dVar.l(), map);
            if (f10 != null && f10.j() == 1) {
                return dVar;
            }
            dVar = dVar.f18034j;
        }
        return null;
    }

    private static d e(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g f10 = f(dVar2.f18030f, dVar2.l(), map);
            if (f10 != null && f10.j() == 3) {
                return dVar2;
            }
            for (int g10 = dVar2.g() - 1; g10 >= 0; g10--) {
                arrayDeque.push(dVar2.f(g10));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
