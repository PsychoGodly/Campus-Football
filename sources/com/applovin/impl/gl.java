package com.applovin.impl;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gl extends bk {

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f8041q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f8042r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f8043o = new StringBuilder();

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList f8044p = new ArrayList();

    public gl() {
        super("SubripDecoder");
    }

    private static long a(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0) + (Long.parseLong((String) a1.a((Object) matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) a1.a((Object) matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    static float b(int i10) {
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

    private String a(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f8042r.matcher(trim);
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
    public kl a(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        mc mcVar = new mc();
        yg ygVar = new yg(bArr, i10);
        while (true) {
            String l10 = ygVar.l();
            int i11 = 0;
            if (l10 == null) {
                break;
            } else if (l10.length() != 0) {
                try {
                    Integer.parseInt(l10);
                    String l11 = ygVar.l();
                    if (l11 == null) {
                        kc.d("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f8041q.matcher(l11);
                    if (matcher.matches()) {
                        mcVar.a(a(matcher, 1));
                        mcVar.a(a(matcher, 6));
                        this.f8043o.setLength(0);
                        this.f8044p.clear();
                        for (String l12 = ygVar.l(); !TextUtils.isEmpty(l12); l12 = ygVar.l()) {
                            if (this.f8043o.length() > 0) {
                                this.f8043o.append("<br>");
                            }
                            this.f8043o.append(a(l12, this.f8044p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f8043o.toString());
                        String str = null;
                        while (true) {
                            if (i11 >= this.f8044p.size()) {
                                break;
                            }
                            String str2 = (String) this.f8044p.get(i11);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(a(fromHtml, str));
                        arrayList.add(z4.f13750s);
                    } else {
                        kc.d("SubripDecoder", "Skipping invalid timing: " + l11);
                    }
                } catch (NumberFormatException unused) {
                    kc.d("SubripDecoder", "Skipping invalid index: " + l10);
                }
            }
        }
        return new hl((z4[]) arrayList.toArray(new z4[0]), mcVar.b());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.z4 a(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            com.applovin.impl.z4$b r1 = new com.applovin.impl.z4$b
            r1.<init>()
            r2 = r17
            com.applovin.impl.z4$b r1 = r1.a((java.lang.CharSequence) r2)
            if (r0 != 0) goto L_0x0014
            com.applovin.impl.z4 r0 = r1.a()
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
            r1.b((int) r3)
            goto L_0x0095
        L_0x008d:
            r1.b((int) r15)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.b((int) r2)
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
            r1.a((int) r3)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.a((int) r0)
            goto L_0x0101
        L_0x00fe:
            r1.a((int) r15)
        L_0x0101:
            int r0 = r1.d()
            float r0 = b(r0)
            com.applovin.impl.z4$b r0 = r1.b((float) r0)
            int r1 = r1.c()
            float r1 = b(r1)
            r2 = 0
            com.applovin.impl.z4$b r0 = r0.a(r1, r2)
            com.applovin.impl.z4 r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gl.a(android.text.Spanned, java.lang.String):com.applovin.impl.z4");
    }
}
