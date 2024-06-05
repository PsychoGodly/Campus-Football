package d4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import d4.c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.a0;
import k4.n0;
import k4.r;
import r6.e;
import y3.b;
import y3.g;
import y3.h;

/* compiled from: SsaDecoder */
public final class a extends g {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f17703t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o  reason: collision with root package name */
    private final boolean f17704o;

    /* renamed from: p  reason: collision with root package name */
    private final b f17705p;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, c> f17706q;

    /* renamed from: r  reason: collision with root package name */
    private float f17707r = -3.4028235E38f;

    /* renamed from: s  reason: collision with root package name */
    private float f17708s = -3.4028235E38f;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f17704o = false;
            this.f17705p = null;
            return;
        }
        this.f17704o = true;
        String D = n0.D(list.get(0));
        k4.a.a(D.startsWith("Format:"));
        this.f17705p = (b) k4.a.e(b.a(D));
        H(new a0(list.get(1)), e.f29803c);
    }

    private static int B(long j10, List<Long> list, List<List<b>> list2) {
        int i10;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 != 0) {
            arrayList = new ArrayList(list2.get(i10 - 1));
        }
        list2.add(i10, arrayList);
        return i10;
    }

    private static float C(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static b D(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        b.C0250b o10 = new b.C0250b().o(spannableString);
        if (cVar != null) {
            if (cVar.f17716c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f17716c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f17723j == 3 && cVar.f17717d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f17717d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f17718e;
            if (!(f12 == -3.4028235E38f || f11 == -3.4028235E38f)) {
                o10.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f17719f;
            if (z10 && cVar.f17720g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f17720g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f17721h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f17722i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f17739a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f17715b : -1;
        }
        o10.p(N(i10)).l(M(i10)).i(L(i10));
        PointF pointF = bVar.f17740b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            o10.k(C(o10.d()));
            o10.h(C(o10.c()), 0);
        } else {
            o10.k(pointF.x / f10);
            o10.h(bVar.f17740b.y / f11, 0);
        }
        return o10.a();
    }

    private Charset E(a0 a0Var) {
        Charset O = a0Var.O();
        return O != null ? O : e.f29803c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        r3 = r12.f17711c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F(java.lang.String r11, d4.b r12, java.util.List<java.util.List<y3.b>> r13, java.util.List<java.lang.Long> r14) {
        /*
            r10 = this;
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r11.startsWith(r0)
            k4.a.a(r0)
            r0 = 9
            java.lang.String r0 = r11.substring(r0)
            int r1 = r12.f17713e
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2, r1)
            int r1 = r0.length
            int r2 = r12.f17713e
            java.lang.String r3 = "SsaDecoder"
            if (r1 == r2) goto L_0x0033
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Skipping dialogue line with fewer columns than format: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            k4.r.i(r3, r11)
            return
        L_0x0033:
            int r1 = r12.f17709a
            r1 = r0[r1]
            long r1 = K(r1)
            java.lang.String r4 = "Skipping invalid timing: "
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0059
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            k4.r.i(r3, r11)
            return
        L_0x0059:
            int r7 = r12.f17710b
            r7 = r0[r7]
            long r7 = K(r7)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0078
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            k4.r.i(r3, r11)
            return
        L_0x0078:
            java.util.Map<java.lang.String, d4.c> r11 = r10.f17706q
            if (r11 == 0) goto L_0x008e
            int r3 = r12.f17711c
            r4 = -1
            if (r3 == r4) goto L_0x008e
            r3 = r0[r3]
            java.lang.String r3 = r3.trim()
            java.lang.Object r11 = r11.get(r3)
            d4.c r11 = (d4.c) r11
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            int r12 = r12.f17712d
            r12 = r0[r12]
            d4.c$b r0 = d4.c.b.b(r12)
            java.lang.String r12 = d4.c.b.d(r12)
            java.lang.String r3 = "\\N"
            java.lang.String r4 = "\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\h"
            java.lang.String r4 = " "
            java.lang.String r12 = r12.replace(r3, r4)
            float r3 = r10.f17707r
            float r4 = r10.f17708s
            y3.b r11 = D(r12, r11, r0, r3, r4)
            int r12 = B(r1, r14, r13)
            int r14 = B(r7, r14, r13)
        L_0x00c1:
            if (r12 >= r14) goto L_0x00cf
            java.lang.Object r0 = r13.get(r12)
            java.util.List r0 = (java.util.List) r0
            r0.add(r11)
            int r12 = r12 + 1
            goto L_0x00c1
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.a.F(java.lang.String, d4.b, java.util.List, java.util.List):void");
    }

    private void G(a0 a0Var, List<List<b>> list, List<Long> list2, Charset charset) {
        b bVar = this.f17704o ? this.f17705p : null;
        while (true) {
            String s10 = a0Var.s(charset);
            if (s10 == null) {
                return;
            }
            if (s10.startsWith("Format:")) {
                bVar = b.a(s10);
            } else if (s10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    r.i("SsaDecoder", "Skipping dialogue line before complete format: " + s10);
                } else {
                    F(s10, bVar, list, list2);
                }
            }
        }
    }

    private void H(a0 a0Var, Charset charset) {
        while (true) {
            String s10 = a0Var.s(charset);
            if (s10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(s10)) {
                I(a0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(s10)) {
                this.f17706q = J(a0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(s10)) {
                r.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(s10)) {
                return;
            }
        }
    }

    private void I(a0 a0Var, Charset charset) {
        while (true) {
            String s10 = a0Var.s(charset);
            if (s10 == null) {
                return;
            }
            if (a0Var.a() == 0 || a0Var.h(charset) != '[') {
                String[] split = s10.split(":");
                if (split.length == 2) {
                    String e10 = r6.c.e(split[0].trim());
                    e10.hashCode();
                    if (e10.equals("playresx")) {
                        this.f17707r = Float.parseFloat(split[1].trim());
                    } else if (e10.equals("playresy")) {
                        try {
                            this.f17708s = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private static Map<String, c> J(a0 a0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String s10 = a0Var.s(charset);
            if (s10 == null || (a0Var.a() != 0 && a0Var.h(charset) == '[')) {
                return linkedHashMap;
            }
            if (s10.startsWith("Format:")) {
                aVar = c.a.a(s10);
            } else if (s10.startsWith("Style:")) {
                if (aVar == null) {
                    r.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + s10);
                } else {
                    c b10 = c.b(s10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f17714a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long K(String str) {
        Matcher matcher = f17703t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) n0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) n0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) n0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) n0.j(matcher.group(4))) * UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    private static int L(int i10) {
        switch (i10) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static int M(int i10) {
        switch (i10) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static Layout.Alignment N(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        Charset E = E(a0Var);
        if (!this.f17704o) {
            H(a0Var, E);
        }
        G(a0Var, arrayList, arrayList2, E);
        return new d(arrayList, arrayList2);
    }
}
