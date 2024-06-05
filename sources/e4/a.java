package e4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.a0;
import k4.r;
import k4.s;
import r6.e;
import y3.b;
import y3.g;
import y3.h;

/* compiled from: SubripDecoder */
public final class a extends g {

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f17924q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f17925r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f17926o = new StringBuilder();

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<String> f17927p = new ArrayList<>();

    public a() {
        super("SubripDecoder");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private y3.b B(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            y3.b$b r1 = new y3.b$b
            r1.<init>()
            r2 = r17
            y3.b$b r1 = r1.o(r2)
            if (r0 != 0) goto L_0x0014
            y3.b r0 = r1.a()
            return r0
        L_0x0014:
            int r2 = r18.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r2) {
                case -685620710: goto L_0x0073;
                case -685620679: goto L_0x006b;
                case -685620648: goto L_0x0063;
                case -685620617: goto L_0x005b;
                case -685620586: goto L_0x0053;
                case -685620555: goto L_0x004b;
                case -685620524: goto L_0x0043;
                case -685620493: goto L_0x003a;
                case -685620462: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x007b
        L_0x0032:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003a:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x007b
            r2 = 8
            goto L_0x007c
        L_0x0043:
            boolean r2 = r0.equals(r8)
            if (r2 == 0) goto L_0x007b
            r2 = 2
            goto L_0x007c
        L_0x004b:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 4
            goto L_0x007c
        L_0x0053:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = 7
            goto L_0x007c
        L_0x005b:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x0063:
            boolean r2 = r0.equals(r12)
            if (r2 == 0) goto L_0x007b
            r2 = 3
            goto L_0x007c
        L_0x006b:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0073:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x0091
            if (r2 == r3) goto L_0x0091
            if (r2 == r15) goto L_0x0091
            if (r2 == r5) goto L_0x008d
            if (r2 == r4) goto L_0x008d
            r4 = 5
            if (r2 == r4) goto L_0x008d
            r1.l(r3)
            goto L_0x0095
        L_0x008d:
            r1.l(r15)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.l(r2)
        L_0x0095:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto L_0x00de;
                case -685620679: goto L_0x00d6;
                case -685620648: goto L_0x00ce;
                case -685620617: goto L_0x00c6;
                case -685620586: goto L_0x00be;
                case -685620555: goto L_0x00b5;
                case -685620524: goto L_0x00ad;
                case -685620493: goto L_0x00a5;
                case -685620462: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e6
        L_0x009d:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00a5:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x00ad:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e6
            r0 = 3
            goto L_0x00e7
        L_0x00b5:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x00be:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00c6:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00ce:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e6
            r0 = 2
            goto L_0x00e7
        L_0x00d6:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = 1
            goto L_0x00e7
        L_0x00de:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00fe
            if (r0 == r3) goto L_0x00fe
            if (r0 == r15) goto L_0x00fe
            if (r0 == r5) goto L_0x00f9
            r2 = 4
            if (r0 == r2) goto L_0x00f9
            r2 = 5
            if (r0 == r2) goto L_0x00f9
            r1.i(r3)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.i(r0)
            goto L_0x0101
        L_0x00fe:
            r1.i(r15)
        L_0x0101:
            int r0 = r1.d()
            float r0 = D(r0)
            y3.b$b r0 = r1.k(r0)
            int r1 = r1.c()
            float r1 = D(r1)
            r2 = 0
            y3.b$b r0 = r0.h(r1, r2)
            y3.b r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.a.B(android.text.Spanned, java.lang.String):y3.b");
    }

    private Charset C(a0 a0Var) {
        Charset O = a0Var.O();
        return O != null ? O : e.f29803c;
    }

    static float D(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long E(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0) + (Long.parseLong((String) k4.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) k4.a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f17925r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, MaxReward.DEFAULT_LABEL);
            i10 += length;
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        s sVar = new s();
        a0 a0Var = new a0(bArr, i10);
        Charset C = C(a0Var);
        while (true) {
            String s10 = a0Var.s(C);
            int i11 = 0;
            if (s10 == null) {
                break;
            } else if (s10.length() != 0) {
                try {
                    Integer.parseInt(s10);
                    String s11 = a0Var.s(C);
                    if (s11 == null) {
                        r.i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f17924q.matcher(s11);
                    if (matcher.matches()) {
                        sVar.a(E(matcher, 1));
                        sVar.a(E(matcher, 6));
                        this.f17926o.setLength(0);
                        this.f17927p.clear();
                        for (String s12 = a0Var.s(C); !TextUtils.isEmpty(s12); s12 = a0Var.s(C)) {
                            if (this.f17926o.length() > 0) {
                                this.f17926o.append("<br>");
                            }
                            this.f17926o.append(F(s12, this.f17927p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f17926o.toString());
                        String str = null;
                        while (true) {
                            if (i11 >= this.f17927p.size()) {
                                break;
                            }
                            String str2 = this.f17927p.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(B(fromHtml, str));
                        arrayList.add(b.f23820s);
                    } else {
                        r.i("SubripDecoder", "Skipping invalid timing: " + s11);
                    }
                } catch (NumberFormatException unused) {
                    r.i("SubripDecoder", "Skipping invalid index: " + s10);
                }
            }
        }
        return new b((b[]) arrayList.toArray(new b[0]), sVar.d());
    }
}
