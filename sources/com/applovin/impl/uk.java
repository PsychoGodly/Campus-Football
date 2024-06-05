package com.applovin.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.wk;
import com.applovin.impl.z4;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class uk extends bk {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f12604t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o  reason: collision with root package name */
    private final boolean f12605o;

    /* renamed from: p  reason: collision with root package name */
    private final vk f12606p;

    /* renamed from: q  reason: collision with root package name */
    private Map f12607q;

    /* renamed from: r  reason: collision with root package name */
    private float f12608r = -3.4028235E38f;

    /* renamed from: s  reason: collision with root package name */
    private float f12609s = -3.4028235E38f;

    public uk(List list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f12605o = false;
            this.f12606p = null;
            return;
        }
        this.f12605o = true;
        String a10 = yp.a((byte[]) list.get(0));
        a1.a(a10.startsWith("Format:"));
        this.f12606p = (vk) a1.a((Object) vk.a(a10));
        a(new yg((byte[]) list.get(1)));
    }

    private static int a(long j10, List list, List list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (((Long) list.get(size)).longValue() == j10) {
                return size;
            } else {
                if (((Long) list.get(size)).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    private static float b(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private void b(yg ygVar) {
        while (true) {
            String l10 = ygVar.l();
            if (l10 == null) {
                return;
            }
            if (ygVar.a() == 0 || ygVar.g() != 91) {
                String[] split = l10.split(":");
                if (split.length == 2) {
                    String lowerCase = Ascii.toLowerCase(split[0].trim());
                    lowerCase.hashCode();
                    if (lowerCase.equals("playresx")) {
                        this.f12608r = Float.parseFloat(split[1].trim());
                    } else if (lowerCase.equals("playresy")) {
                        try {
                            this.f12609s = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private static int c(int i10) {
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
                kc.d("SsaDecoder", "Unknown alignment: " + i10);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static int d(int i10) {
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
                kc.d("SsaDecoder", "Unknown alignment: " + i10);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static Layout.Alignment e(int i10) {
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
                kc.d("SsaDecoder", "Unknown alignment: " + i10);
                return null;
        }
    }

    private static Map c(yg ygVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        wk.a aVar = null;
        while (true) {
            String l10 = ygVar.l();
            if (l10 == null || (ygVar.a() != 0 && ygVar.g() == 91)) {
                return linkedHashMap;
            }
            if (l10.startsWith("Format:")) {
                aVar = wk.a.a(l10);
            } else if (l10.startsWith("Style:")) {
                if (aVar == null) {
                    kc.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + l10);
                } else {
                    wk a10 = wk.a(l10, aVar);
                    if (a10 != null) {
                        linkedHashMap.put(a10.f13076a, a10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static z4 a(String str, wk wkVar, wk.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        z4.b a10 = new z4.b().a((CharSequence) spannableString);
        if (wkVar != null) {
            if (wkVar.f13078c != null) {
                spannableString.setSpan(new ForegroundColorSpan(wkVar.f13078c.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = wkVar.f13079d;
            if (!(f12 == -3.4028235E38f || f11 == -3.4028235E38f)) {
                a10.b(f12 / f11, 1);
            }
            boolean z10 = wkVar.f13080e;
            if (z10 && wkVar.f13081f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (wkVar.f13081f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (wkVar.f13082g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (wkVar.f13083h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f13097a;
        if (i10 == -1) {
            i10 = wkVar != null ? wkVar.f13077b : -1;
        }
        a10.b(e(i10)).b(d(i10)).a(c(i10));
        PointF pointF = bVar.f13098b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            a10.b(b(a10.d()));
            a10.a(b(a10.c()), 0);
        } else {
            a10.b(pointF.x / f10);
            a10.a(bVar.f13098b.y / f11, 0);
        }
        return a10.a();
    }

    /* access modifiers changed from: protected */
    public kl a(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yg ygVar = new yg(bArr, i10);
        if (!this.f12605o) {
            a(ygVar);
        }
        a(ygVar, (List) arrayList, (List) arrayList2);
        return new xk(arrayList, arrayList2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        r3 = r12.f12777c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r11, com.applovin.impl.vk r12, java.util.List r13, java.util.List r14) {
        /*
            r10 = this;
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r11.startsWith(r0)
            com.applovin.impl.a1.a((boolean) r0)
            r0 = 9
            java.lang.String r0 = r11.substring(r0)
            int r1 = r12.f12779e
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2, r1)
            int r1 = r0.length
            int r2 = r12.f12779e
            java.lang.String r3 = "SsaDecoder"
            if (r1 == r2) goto L_0x0033
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Skipping dialogue line with fewer columns than format: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.applovin.impl.kc.d(r3, r11)
            return
        L_0x0033:
            int r1 = r12.f12775a
            r1 = r0[r1]
            long r1 = a((java.lang.String) r1)
            java.lang.String r4 = "Skipping invalid timing: "
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0059
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.applovin.impl.kc.d(r3, r11)
            return
        L_0x0059:
            int r7 = r12.f12776b
            r7 = r0[r7]
            long r7 = a((java.lang.String) r7)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0078
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.applovin.impl.kc.d(r3, r11)
            return
        L_0x0078:
            java.util.Map r11 = r10.f12607q
            if (r11 == 0) goto L_0x008e
            int r3 = r12.f12777c
            r4 = -1
            if (r3 == r4) goto L_0x008e
            r3 = r0[r3]
            java.lang.String r3 = r3.trim()
            java.lang.Object r11 = r11.get(r3)
            com.applovin.impl.wk r11 = (com.applovin.impl.wk) r11
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            int r12 = r12.f12778d
            r12 = r0[r12]
            com.applovin.impl.wk$b r0 = com.applovin.impl.wk.b.b(r12)
            java.lang.String r12 = com.applovin.impl.wk.b.d(r12)
            java.lang.String r3 = "\\N"
            java.lang.String r4 = "\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\h"
            java.lang.String r4 = " "
            java.lang.String r12 = r12.replace(r3, r4)
            float r3 = r10.f12608r
            float r4 = r10.f12609s
            com.applovin.impl.z4 r11 = a(r12, r11, r0, r3, r4)
            int r12 = a((long) r1, (java.util.List) r14, (java.util.List) r13)
            int r14 = a((long) r7, (java.util.List) r14, (java.util.List) r13)
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.uk.a(java.lang.String, com.applovin.impl.vk, java.util.List, java.util.List):void");
    }

    private void a(yg ygVar, List list, List list2) {
        vk vkVar = this.f12605o ? this.f12606p : null;
        while (true) {
            String l10 = ygVar.l();
            if (l10 == null) {
                return;
            }
            if (l10.startsWith("Format:")) {
                vkVar = vk.a(l10);
            } else if (l10.startsWith("Dialogue:")) {
                if (vkVar == null) {
                    kc.d("SsaDecoder", "Skipping dialogue line before complete format: " + l10);
                } else {
                    a(l10, vkVar, list, list2);
                }
            }
        }
    }

    private void a(yg ygVar) {
        while (true) {
            String l10 = ygVar.l();
            if (l10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(l10)) {
                b(ygVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(l10)) {
                this.f12607q = c(ygVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(l10)) {
                kc.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(l10)) {
                return;
            }
        }
    }

    private static long a(String str) {
        Matcher matcher = f12604t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) yp.a((Object) matcher.group(1))) * 3600000000L) + (Long.parseLong((String) yp.a((Object) matcher.group(2))) * 60000000) + (Long.parseLong((String) yp.a((Object) matcher.group(3))) * 1000000) + (Long.parseLong((String) yp.a((Object) matcher.group(4))) * UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }
}
