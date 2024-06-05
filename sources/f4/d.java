package f4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import k4.a;
import y3.b;

/* compiled from: TtmlNode */
final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f18025a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18026b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18027c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18028d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18029e;

    /* renamed from: f  reason: collision with root package name */
    public final g f18030f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f18031g;

    /* renamed from: h  reason: collision with root package name */
    public final String f18032h;

    /* renamed from: i  reason: collision with root package name */
    public final String f18033i;

    /* renamed from: j  reason: collision with root package name */
    public final d f18034j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<String, Integer> f18035k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<String, Integer> f18036l;

    /* renamed from: m  reason: collision with root package name */
    private List<d> f18037m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f18025a = str;
        this.f18026b = str2;
        this.f18033i = str4;
        this.f18030f = gVar;
        this.f18031g = strArr;
        this.f18027c = str2 != null;
        this.f18028d = j10;
        this.f18029e = j11;
        this.f18032h = (String) a.e(str3);
        this.f18034j = dVar;
        this.f18035k = new HashMap<>();
        this.f18036l = new HashMap<>();
    }

    private void b(Map<String, g> map, b.C0250b bVar, int i10, int i11, int i12) {
        g f10 = f.f(this.f18030f, this.f18031g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            f.a(spannableStringBuilder2, i10, i11, f10, this.f18034j, map, i12);
            if ("p".equals(this.f18025a)) {
                if (f10.k() != Float.MAX_VALUE) {
                    bVar.m((f10.k() * -90.0f) / 100.0f);
                }
                if (f10.m() != null) {
                    bVar.p(f10.m());
                }
                if (f10.h() != null) {
                    bVar.j(f10.h());
                }
            }
        }
    }

    public static d c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, (String) null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d((String) null, f.b(str), -9223372036854775807L, -9223372036854775807L, (g) null, (String[]) null, MaxReward.DEFAULT_LABEL, (String) null, (d) null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), MaxReward.DEFAULT_LABEL);
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

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f18025a);
        boolean equals2 = "div".equals(this.f18025a);
        if (z10 || equals || (equals2 && this.f18033i != null)) {
            long j10 = this.f18028d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f18029e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f18037m != null) {
            for (int i10 = 0; i10 < this.f18037m.size(); i10++) {
                this.f18037m.get(i10).i(treeSet, z10 || equals);
            }
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, b.C0250b> map) {
        if (!map.containsKey(str)) {
            b.C0250b bVar = new b.C0250b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) a.e(map.get(str).e());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!MaxReward.DEFAULT_LABEL.equals(this.f18032h)) {
            str = this.f18032h;
        }
        if (!m(j10) || !"div".equals(this.f18025a) || this.f18033i == null) {
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).n(j10, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f18033i));
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, b.C0250b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = MaxReward.DEFAULT_LABEL.equals(this.f18032h) ? str : this.f18032h;
            Iterator<Map.Entry<String, Integer>> it = this.f18036l.entrySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str3 = (String) next.getKey();
                int intValue = this.f18035k.containsKey(str3) ? this.f18035k.get(str3).intValue() : 0;
                int intValue2 = ((Integer) next.getValue()).intValue();
                if (intValue != intValue2) {
                    b(map, (b.C0250b) a.e(map3.get(str3)), intValue, intValue2, ((e) a.e(map2.get(str2))).f18047j);
                } else {
                    Map<String, e> map4 = map2;
                    Map<String, b.C0250b> map5 = map3;
                }
            }
            Map<String, e> map6 = map2;
            Map<String, b.C0250b> map7 = map3;
            while (i10 < g()) {
                f(i10).o(j10, map, map2, str2, map3);
                i10++;
                Map<String, e> map8 = map2;
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, b.C0250b> map) {
        this.f18035k.clear();
        this.f18036l.clear();
        if (!"metadata".equals(this.f18025a)) {
            if (!MaxReward.DEFAULT_LABEL.equals(this.f18032h)) {
                str = this.f18032h;
            }
            if (this.f18027c && z10) {
                k(str, map).append((CharSequence) a.e(this.f18026b));
            } else if ("br".equals(this.f18025a) && z10) {
                k(str, map).append(10);
            } else if (m(j10)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f18035k.put((String) next.getKey(), Integer.valueOf(((CharSequence) a.e(((b.C0250b) next.getValue()).e())).length()));
                }
                boolean equals = "p".equals(this.f18025a);
                for (int i10 = 0; i10 < g(); i10++) {
                    f(i10).p(j10, z10 || equals, str, map);
                }
                if (equals) {
                    f.c(k(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f18036l.put((String) next2.getKey(), Integer.valueOf(((CharSequence) a.e(((b.C0250b) next2.getValue()).e())).length()));
                }
            }
        }
    }

    public void a(d dVar) {
        if (this.f18037m == null) {
            this.f18037m = new ArrayList();
        }
        this.f18037m.add(dVar);
    }

    public d f(int i10) {
        List<d> list = this.f18037m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f18037m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<b> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        n(j10, this.f18032h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j11 = j10;
        p(j11, false, this.f18032h, treeMap);
        o(j11, map, map2, this.f18032h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) a.e(map2.get(pair.first));
                arrayList2.add(new b.C0250b().f(decodeByteArray).k(eVar.f18039b).l(0).h(eVar.f18040c, 0).i(eVar.f18042e).n(eVar.f18043f).g(eVar.f18044g).r(eVar.f18047j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) a.e(map2.get(entry.getKey()));
            b.C0250b bVar = (b.C0250b) entry.getValue();
            e((SpannableStringBuilder) a.e(bVar.e()));
            bVar.h(eVar2.f18040c, eVar2.f18041d);
            bVar.i(eVar2.f18042e);
            bVar.k(eVar2.f18039b);
            bVar.n(eVar2.f18043f);
            bVar.q(eVar2.f18046i, eVar2.f18045h);
            bVar.r(eVar2.f18047j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f18031g;
    }

    public boolean m(long j10) {
        long j11 = this.f18028d;
        return (j11 == -9223372036854775807L && this.f18029e == -9223372036854775807L) || (j11 <= j10 && this.f18029e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f18029e) || (j11 <= j10 && j10 < this.f18029e));
    }
}
