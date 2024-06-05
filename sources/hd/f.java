package hd;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lf.c;
import lf.e;
import lf.l;
import lf.s;

/* compiled from: Hpack */
final class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final lf.f f33012a = lf.f.h(":");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final d[] f33013b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Map<lf.f, Integer> f33014c = f();

    /* compiled from: Hpack */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f33015a;

        /* renamed from: b  reason: collision with root package name */
        private final e f33016b;

        /* renamed from: c  reason: collision with root package name */
        private int f33017c;

        /* renamed from: d  reason: collision with root package name */
        private int f33018d;

        /* renamed from: e  reason: collision with root package name */
        d[] f33019e;

        /* renamed from: f  reason: collision with root package name */
        int f33020f;

        /* renamed from: g  reason: collision with root package name */
        int f33021g;

        /* renamed from: h  reason: collision with root package name */
        int f33022h;

        a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f33018d;
            int i11 = this.f33022h;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                d(i11 - i10);
            }
        }

        private void b() {
            Arrays.fill(this.f33019e, (Object) null);
            this.f33020f = this.f33019e.length - 1;
            this.f33021g = 0;
            this.f33022h = 0;
        }

        private int c(int i10) {
            return this.f33020f + 1 + i10;
        }

        private int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f33019e.length;
                while (true) {
                    length--;
                    i11 = this.f33020f;
                    if (length < i11 || i10 <= 0) {
                        d[] dVarArr = this.f33019e;
                        System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f33021g);
                        this.f33020f += i12;
                    } else {
                        d[] dVarArr2 = this.f33019e;
                        i10 -= dVarArr2[length].f33006c;
                        this.f33022h -= dVarArr2[length].f33006c;
                        this.f33021g--;
                        i12++;
                    }
                }
                d[] dVarArr3 = this.f33019e;
                System.arraycopy(dVarArr3, i11 + 1, dVarArr3, i11 + 1 + i12, this.f33021g);
                this.f33020f += i12;
            }
            return i12;
        }

        private lf.f f(int i10) throws IOException {
            if (i(i10)) {
                return f.f33013b[i10].f33004a;
            }
            int c10 = c(i10 - f.f33013b.length);
            if (c10 >= 0) {
                d[] dVarArr = this.f33019e;
                if (c10 < dVarArr.length) {
                    return dVarArr[c10].f33004a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void h(int i10, d dVar) {
            this.f33015a.add(dVar);
            int i11 = dVar.f33006c;
            if (i10 != -1) {
                i11 -= this.f33019e[c(i10)].f33006c;
            }
            int i12 = this.f33018d;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f33022h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f33021g + 1;
                d[] dVarArr = this.f33019e;
                if (i13 > dVarArr.length) {
                    d[] dVarArr2 = new d[(dVarArr.length * 2)];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f33020f = this.f33019e.length - 1;
                    this.f33019e = dVarArr2;
                }
                int i14 = this.f33020f;
                this.f33020f = i14 - 1;
                this.f33019e[i14] = dVar;
                this.f33021g++;
            } else {
                this.f33019e[i10 + c(i10) + d10] = dVar;
            }
            this.f33022h += i11;
        }

        private boolean i(int i10) {
            return i10 >= 0 && i10 <= f.f33013b.length - 1;
        }

        private int j() throws IOException {
            return this.f33016b.readByte() & 255;
        }

        private void m(int i10) throws IOException {
            if (i(i10)) {
                this.f33015a.add(f.f33013b[i10]);
                return;
            }
            int c10 = c(i10 - f.f33013b.length);
            if (c10 >= 0) {
                d[] dVarArr = this.f33019e;
                if (c10 <= dVarArr.length - 1) {
                    this.f33015a.add(dVarArr[c10]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void o(int i10) throws IOException {
            h(-1, new d(f(i10), k()));
        }

        private void p() throws IOException {
            h(-1, new d(f.e(k()), k()));
        }

        private void q(int i10) throws IOException {
            this.f33015a.add(new d(f(i10), k()));
        }

        private void r() throws IOException {
            this.f33015a.add(new d(f.e(k()), k()));
        }

        public List<d> e() {
            ArrayList arrayList = new ArrayList(this.f33015a);
            this.f33015a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public void g(int i10) {
            this.f33017c = i10;
            this.f33018d = i10;
            a();
        }

        /* access modifiers changed from: package-private */
        public lf.f k() throws IOException {
            int j10 = j();
            boolean z10 = (j10 & 128) == 128;
            int n10 = n(j10, 127);
            if (z10) {
                return lf.f.k(h.f().c(this.f33016b.p0((long) n10)));
            }
            return this.f33016b.r((long) n10);
        }

        /* access modifiers changed from: package-private */
        public void l() throws IOException {
            while (!this.f33016b.F()) {
                byte readByte = this.f33016b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m(n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    p();
                } else if ((readByte & 64) == 64) {
                    o(n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n10 = n(readByte, 31);
                    this.f33018d = n10;
                    if (n10 < 0 || n10 > this.f33017c) {
                        throw new IOException("Invalid dynamic table size update " + this.f33018d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    r();
                } else {
                    q(n(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int n(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int j10 = j();
                if ((j10 & 128) == 0) {
                    return i11 + (j10 << i13);
                }
                i11 += (j10 & 127) << i13;
                i13 += 7;
            }
        }

        a(int i10, int i11, s sVar) {
            this.f33015a = new ArrayList();
            d[] dVarArr = new d[8];
            this.f33019e = dVarArr;
            this.f33020f = dVarArr.length - 1;
            this.f33021g = 0;
            this.f33022h = 0;
            this.f33017c = i10;
            this.f33018d = i11;
            this.f33016b = l.b(sVar);
        }
    }

    /* compiled from: Hpack */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f33023a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f33024b;

        /* renamed from: c  reason: collision with root package name */
        int f33025c;

        /* renamed from: d  reason: collision with root package name */
        private int f33026d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f33027e;

        /* renamed from: f  reason: collision with root package name */
        private int f33028f;

        /* renamed from: g  reason: collision with root package name */
        d[] f33029g;

        /* renamed from: h  reason: collision with root package name */
        int f33030h;

        /* renamed from: i  reason: collision with root package name */
        private int f33031i;

        /* renamed from: j  reason: collision with root package name */
        private int f33032j;

        b(c cVar) {
            this(4096, false, cVar);
        }

        private void a() {
            Arrays.fill(this.f33029g, (Object) null);
            this.f33031i = this.f33029g.length - 1;
            this.f33030h = 0;
            this.f33032j = 0;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f33029g.length;
                while (true) {
                    length--;
                    i11 = this.f33031i;
                    if (length < i11 || i10 <= 0) {
                        d[] dVarArr = this.f33029g;
                        System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f33030h);
                        this.f33031i += i12;
                    } else {
                        d[] dVarArr2 = this.f33029g;
                        i10 -= dVarArr2[length].f33006c;
                        this.f33032j -= dVarArr2[length].f33006c;
                        this.f33030h--;
                        i12++;
                    }
                }
                d[] dVarArr3 = this.f33029g;
                System.arraycopy(dVarArr3, i11 + 1, dVarArr3, i11 + 1 + i12, this.f33030h);
                this.f33031i += i12;
            }
            return i12;
        }

        private void c(d dVar) {
            int i10 = dVar.f33006c;
            int i11 = this.f33028f;
            if (i10 > i11) {
                a();
                return;
            }
            b((this.f33032j + i10) - i11);
            int i12 = this.f33030h + 1;
            d[] dVarArr = this.f33029g;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[(dVarArr.length * 2)];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f33031i = this.f33029g.length - 1;
                this.f33029g = dVarArr2;
            }
            int i13 = this.f33031i;
            this.f33031i = i13 - 1;
            this.f33029g[i13] = dVar;
            this.f33030h++;
            this.f33032j += i10;
        }

        /* access modifiers changed from: package-private */
        public void d(lf.f fVar) throws IOException {
            if (!this.f33024b || h.f().e(fVar.t()) >= fVar.p()) {
                f(fVar.p(), 127, 0);
                this.f33023a.E0(fVar);
                return;
            }
            c cVar = new c();
            h.f().d(fVar.t(), cVar.e0());
            lf.f h02 = cVar.h0();
            f(h02.p(), 127, 128);
            this.f33023a.E0(h02);
        }

        /* access modifiers changed from: package-private */
        public void e(List<d> list) throws IOException {
            int i10;
            int i11;
            if (this.f33027e) {
                int i12 = this.f33026d;
                if (i12 < this.f33028f) {
                    f(i12, 31, 32);
                }
                this.f33027e = false;
                this.f33026d = a.e.API_PRIORITY_OTHER;
                f(this.f33028f, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                d dVar = list.get(i13);
                lf.f s10 = dVar.f33004a.s();
                lf.f fVar = dVar.f33005b;
                Integer num = (Integer) f.f33014c.get(s10);
                if (num != null) {
                    i11 = num.intValue() + 1;
                    if (i11 >= 2 && i11 <= 7) {
                        if (f.f33013b[i11 - 1].f33005b.equals(fVar)) {
                            i10 = i11;
                        } else if (f.f33013b[i11].f33005b.equals(fVar)) {
                            i10 = i11;
                            i11++;
                        }
                    }
                    i10 = i11;
                    i11 = -1;
                } else {
                    i11 = -1;
                    i10 = -1;
                }
                if (i11 == -1) {
                    int i14 = this.f33031i;
                    while (true) {
                        i14++;
                        d[] dVarArr = this.f33029g;
                        if (i14 >= dVarArr.length) {
                            break;
                        } else if (dVarArr[i14].f33004a.equals(s10)) {
                            if (this.f33029g[i14].f33005b.equals(fVar)) {
                                i11 = f.f33013b.length + (i14 - this.f33031i);
                                break;
                            } else if (i10 == -1) {
                                i10 = (i14 - this.f33031i) + f.f33013b.length;
                            }
                        }
                    }
                }
                if (i11 != -1) {
                    f(i11, 127, 128);
                } else if (i10 == -1) {
                    this.f33023a.G(64);
                    d(s10);
                    d(fVar);
                    c(dVar);
                } else if (!s10.q(f.f33012a) || d.f33001h.equals(s10)) {
                    f(i10, 63, 64);
                    d(fVar);
                    c(dVar);
                } else {
                    f(i10, 15, 0);
                    d(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i10, int i11, int i12) throws IOException {
            if (i10 < i11) {
                this.f33023a.G(i10 | i12);
                return;
            }
            this.f33023a.G(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f33023a.G(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f33023a.G(i13);
        }

        b(int i10, boolean z10, c cVar) {
            this.f33026d = a.e.API_PRIORITY_OTHER;
            d[] dVarArr = new d[8];
            this.f33029g = dVarArr;
            this.f33031i = dVarArr.length - 1;
            this.f33025c = i10;
            this.f33028f = i10;
            this.f33024b = z10;
            this.f33023a = cVar;
        }
    }

    static {
        lf.f fVar = d.f32998e;
        lf.f fVar2 = d.f32999f;
        lf.f fVar3 = d.f33000g;
        lf.f fVar4 = d.f32997d;
        f33013b = new d[]{new d(d.f33001h, (String) MaxReward.DEFAULT_LABEL), new d(fVar, "GET"), new d(fVar, "POST"), new d(fVar2, (String) UnityAdsConstants.DefaultUrls.AD_ASSET_PATH), new d(fVar2, "/index.html"), new d(fVar3, "http"), new d(fVar3, (String) HttpRequest.DEFAULT_SCHEME), new d(fVar4, "200"), new d(fVar4, "204"), new d(fVar4, "206"), new d(fVar4, "304"), new d(fVar4, "400"), new d(fVar4, "404"), new d(fVar4, "500"), new d("accept-charset", (String) MaxReward.DEFAULT_LABEL), new d("accept-encoding", "gzip, deflate"), new d("accept-language", (String) MaxReward.DEFAULT_LABEL), new d("accept-ranges", (String) MaxReward.DEFAULT_LABEL), new d("accept", (String) MaxReward.DEFAULT_LABEL), new d("access-control-allow-origin", (String) MaxReward.DEFAULT_LABEL), new d("age", (String) MaxReward.DEFAULT_LABEL), new d("allow", (String) MaxReward.DEFAULT_LABEL), new d("authorization", (String) MaxReward.DEFAULT_LABEL), new d("cache-control", (String) MaxReward.DEFAULT_LABEL), new d("content-disposition", (String) MaxReward.DEFAULT_LABEL), new d("content-encoding", (String) MaxReward.DEFAULT_LABEL), new d("content-language", (String) MaxReward.DEFAULT_LABEL), new d("content-length", (String) MaxReward.DEFAULT_LABEL), new d("content-location", (String) MaxReward.DEFAULT_LABEL), new d("content-range", (String) MaxReward.DEFAULT_LABEL), new d("content-type", (String) MaxReward.DEFAULT_LABEL), new d("cookie", (String) MaxReward.DEFAULT_LABEL), new d("date", (String) MaxReward.DEFAULT_LABEL), new d("etag", (String) MaxReward.DEFAULT_LABEL), new d("expect", (String) MaxReward.DEFAULT_LABEL), new d("expires", (String) MaxReward.DEFAULT_LABEL), new d("from", (String) MaxReward.DEFAULT_LABEL), new d((String) URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, (String) MaxReward.DEFAULT_LABEL), new d("if-match", (String) MaxReward.DEFAULT_LABEL), new d("if-modified-since", (String) MaxReward.DEFAULT_LABEL), new d("if-none-match", (String) MaxReward.DEFAULT_LABEL), new d("if-range", (String) MaxReward.DEFAULT_LABEL), new d("if-unmodified-since", (String) MaxReward.DEFAULT_LABEL), new d("last-modified", (String) MaxReward.DEFAULT_LABEL), new d("link", (String) MaxReward.DEFAULT_LABEL), new d("location", (String) MaxReward.DEFAULT_LABEL), new d("max-forwards", (String) MaxReward.DEFAULT_LABEL), new d("proxy-authenticate", (String) MaxReward.DEFAULT_LABEL), new d("proxy-authorization", (String) MaxReward.DEFAULT_LABEL), new d("range", (String) MaxReward.DEFAULT_LABEL), new d("referer", (String) MaxReward.DEFAULT_LABEL), new d("refresh", (String) MaxReward.DEFAULT_LABEL), new d("retry-after", (String) MaxReward.DEFAULT_LABEL), new d("server", (String) MaxReward.DEFAULT_LABEL), new d("set-cookie", (String) MaxReward.DEFAULT_LABEL), new d("strict-transport-security", (String) MaxReward.DEFAULT_LABEL), new d("transfer-encoding", (String) MaxReward.DEFAULT_LABEL), new d("user-agent", (String) MaxReward.DEFAULT_LABEL), new d("vary", (String) MaxReward.DEFAULT_LABEL), new d("via", (String) MaxReward.DEFAULT_LABEL), new d("www-authenticate", (String) MaxReward.DEFAULT_LABEL)};
    }

    /* access modifiers changed from: private */
    public static lf.f e(lf.f fVar) throws IOException {
        int p10 = fVar.p();
        int i10 = 0;
        while (i10 < p10) {
            byte i11 = fVar.i(i10);
            if (i11 < 65 || i11 > 90) {
                i10++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.u());
            }
        }
        return fVar;
    }

    private static Map<lf.f, Integer> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f33013b.length);
        int i10 = 0;
        while (true) {
            d[] dVarArr = f33013b;
            if (i10 >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i10].f33004a)) {
                linkedHashMap.put(dVarArr[i10].f33004a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
