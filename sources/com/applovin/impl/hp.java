package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class hp {

    /* renamed from: a  reason: collision with root package name */
    public final String f8344a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8345b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8346c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8347d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8348e;

    /* renamed from: f  reason: collision with root package name */
    public final kp f8349f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f8350g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8351h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8352i;

    /* renamed from: j  reason: collision with root package name */
    public final hp f8353j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap f8354k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap f8355l;

    /* renamed from: m  reason: collision with root package name */
    private List f8356m;

    private hp(String str, String str2, long j10, long j11, kp kpVar, String[] strArr, String str3, String str4, hp hpVar) {
        this.f8344a = str;
        this.f8345b = str2;
        this.f8352i = str4;
        this.f8349f = kpVar;
        this.f8350g = strArr;
        this.f8346c = str2 != null;
        this.f8347d = j10;
        this.f8348e = j11;
        this.f8351h = (String) a1.a((Object) str3);
        this.f8353j = hpVar;
        this.f8354k = new HashMap();
        this.f8355l = new HashMap();
    }

    public void a(hp hpVar) {
        if (this.f8356m == null) {
            this.f8356m = new ArrayList();
        }
        this.f8356m.add(hpVar);
    }

    public long[] b() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] c() {
        return this.f8350g;
    }

    private void a(Map map, z4.b bVar, int i10, int i11, int i12) {
        kp a10 = jp.a(this.f8349f, this.f8350g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.a((CharSequence) spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (a10 != null) {
            jp.a(spannableStringBuilder2, i10, i11, a10, this.f8353j, map, i12);
            if ("p".equals(this.f8344a)) {
                if (a10.j() != Float.MAX_VALUE) {
                    bVar.c((a10.j() * -90.0f) / 100.0f);
                }
                if (a10.l() != null) {
                    bVar.b(a10.l());
                }
                if (a10.g() != null) {
                    bVar.a(a10.g());
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (m6 m6Var : (m6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), m6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(m6Var), spannableStringBuilder.getSpanEnd(m6Var), MaxReward.DEFAULT_LABEL);
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == 10) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == 10) {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    public hp a(int i10) {
        List list = this.f8356m;
        if (list != null) {
            return (hp) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        List list = this.f8356m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(TreeSet treeSet, boolean z10) {
        boolean equals = "p".equals(this.f8344a);
        boolean equals2 = "div".equals(this.f8344a);
        if (z10 || equals || (equals2 && this.f8352i != null)) {
            long j10 = this.f8347d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f8348e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f8356m != null) {
            for (int i10 = 0; i10 < this.f8356m.size(); i10++) {
                ((hp) this.f8356m.get(i10)).a(treeSet, z10 || equals);
            }
        }
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            z4.b bVar = new z4.b();
            bVar.a((CharSequence) new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) a1.a((Object) ((z4.b) map.get(str)).e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(long r9) {
        /*
            r8 = this;
            long r0 = r8.f8347d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0011
            long r5 = r8.f8348e
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x002b
        L_0x0011:
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x001b
            long r0 = r8.f8348e
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x002b
        L_0x001b:
            if (r4 != 0) goto L_0x0023
            long r0 = r8.f8348e
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x002b
        L_0x0023:
            if (r5 > 0) goto L_0x002d
            long r0 = r8.f8348e
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x002d
        L_0x002b:
            r9 = 1
            goto L_0x002e
        L_0x002d:
            r9 = 0
        L_0x002e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.hp.a(long):boolean");
    }

    private void a(long j10, String str, List list) {
        if (!MaxReward.DEFAULT_LABEL.equals(this.f8351h)) {
            str = this.f8351h;
        }
        if (!a(j10) || !"div".equals(this.f8344a) || this.f8352i == null) {
            for (int i10 = 0; i10 < a(); i10++) {
                a(i10).a(j10, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f8352i));
    }

    private void a(long j10, Map map, Map map2, String str, Map map3) {
        int i10;
        if (a(j10)) {
            String str2 = MaxReward.DEFAULT_LABEL.equals(this.f8351h) ? str : this.f8351h;
            Iterator it = this.f8355l.entrySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f8354k.containsKey(str3) ? ((Integer) this.f8354k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    a(map, (z4.b) a1.a((Object) (z4.b) map3.get(str3)), intValue, intValue2, ((ip) a1.a((Object) (ip) map2.get(str2))).f8586j);
                } else {
                    Map map4 = map2;
                    Map map5 = map3;
                }
            }
            Map map6 = map2;
            Map map7 = map3;
            while (i10 < a()) {
                a(i10).a(j10, map, map2, str2, map3);
                i10++;
                Map map8 = map2;
            }
        }
    }

    private void a(long j10, boolean z10, String str, Map map) {
        this.f8354k.clear();
        this.f8355l.clear();
        if (!"metadata".equals(this.f8344a)) {
            if (!MaxReward.DEFAULT_LABEL.equals(this.f8351h)) {
                str = this.f8351h;
            }
            if (this.f8346c && z10) {
                a(str, map).append((CharSequence) a1.a((Object) this.f8345b));
            } else if ("br".equals(this.f8344a) && z10) {
                a(str, map).append(10);
            } else if (a(j10)) {
                for (Map.Entry entry : map.entrySet()) {
                    this.f8354k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) a1.a((Object) ((z4.b) entry.getValue()).e())).length()));
                }
                boolean equals = "p".equals(this.f8344a);
                for (int i10 = 0; i10 < a(); i10++) {
                    a(i10).a(j10, z10 || equals, str, map);
                }
                if (equals) {
                    jp.a(a(str, map));
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    this.f8355l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) a1.a((Object) ((z4.b) entry2.getValue()).e())).length()));
                }
            }
        }
    }

    public static hp a(String str) {
        return new hp((String) null, jp.a(str), -9223372036854775807L, -9223372036854775807L, (kp) null, (String[]) null, MaxReward.DEFAULT_LABEL, (String) null, (hp) null);
    }

    public static hp a(String str, long j10, long j11, kp kpVar, String[] strArr, String str2, String str3, hp hpVar) {
        return new hp(str, (String) null, j10, j11, kpVar, strArr, str2, str3, hpVar);
    }

    public List a(long j10, Map map, Map map2, Map map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        a(j10, this.f8351h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j11 = j10;
        a(j11, false, this.f8351h, (Map) treeMap);
        a(j11, map, map2, this.f8351h, (Map) treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                ip ipVar = (ip) a1.a((Object) (ip) map2.get(pair.first));
                arrayList2.add(new z4.b().a(decodeByteArray).b(ipVar.f8578b).b(0).a(ipVar.f8579c, 0).a(ipVar.f8581e).d(ipVar.f8582f).a(ipVar.f8583g).c(ipVar.f8586j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ip ipVar2 = (ip) a1.a((Object) (ip) map2.get(entry.getKey()));
            z4.b bVar = (z4.b) entry.getValue();
            a((SpannableStringBuilder) a1.a((Object) bVar.e()));
            bVar.a(ipVar2.f8579c, ipVar2.f8580d);
            bVar.a(ipVar2.f8581e);
            bVar.b(ipVar2.f8578b);
            bVar.d(ipVar2.f8582f);
            bVar.b(ipVar2.f8585i, ipVar2.f8584h);
            bVar.c(ipVar2.f8586j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }
}
