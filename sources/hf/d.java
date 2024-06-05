package hf;

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
import lf.f;
import lf.l;
import lf.s;

/* compiled from: Hpack */
final class d {

    /* renamed from: a  reason: collision with root package name */
    static final c[] f33087a;

    /* renamed from: b  reason: collision with root package name */
    static final Map<f, Integer> f33088b = b();

    /* compiled from: Hpack */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f33089a;

        /* renamed from: b  reason: collision with root package name */
        private final e f33090b;

        /* renamed from: c  reason: collision with root package name */
        private final int f33091c;

        /* renamed from: d  reason: collision with root package name */
        private int f33092d;

        /* renamed from: e  reason: collision with root package name */
        c[] f33093e;

        /* renamed from: f  reason: collision with root package name */
        int f33094f;

        /* renamed from: g  reason: collision with root package name */
        int f33095g;

        /* renamed from: h  reason: collision with root package name */
        int f33096h;

        a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f33092d;
            int i11 = this.f33096h;
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
            Arrays.fill(this.f33093e, (Object) null);
            this.f33094f = this.f33093e.length - 1;
            this.f33095g = 0;
            this.f33096h = 0;
        }

        private int c(int i10) {
            return this.f33094f + 1 + i10;
        }

        private int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f33093e.length;
                while (true) {
                    length--;
                    i11 = this.f33094f;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f33093e;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f33095g);
                        this.f33094f += i12;
                    } else {
                        c[] cVarArr2 = this.f33093e;
                        i10 -= cVarArr2[length].f33086c;
                        this.f33096h -= cVarArr2[length].f33086c;
                        this.f33095g--;
                        i12++;
                    }
                }
                c[] cVarArr3 = this.f33093e;
                System.arraycopy(cVarArr3, i11 + 1, cVarArr3, i11 + 1 + i12, this.f33095g);
                this.f33094f += i12;
            }
            return i12;
        }

        private f f(int i10) throws IOException {
            if (h(i10)) {
                return d.f33087a[i10].f33084a;
            }
            int c10 = c(i10 - d.f33087a.length);
            if (c10 >= 0) {
                c[] cVarArr = this.f33093e;
                if (c10 < cVarArr.length) {
                    return cVarArr[c10].f33084a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10, c cVar) {
            this.f33089a.add(cVar);
            int i11 = cVar.f33086c;
            if (i10 != -1) {
                i11 -= this.f33093e[c(i10)].f33086c;
            }
            int i12 = this.f33092d;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f33096h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f33095g + 1;
                c[] cVarArr = this.f33093e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f33094f = this.f33093e.length - 1;
                    this.f33093e = cVarArr2;
                }
                int i14 = this.f33094f;
                this.f33094f = i14 - 1;
                this.f33093e[i14] = cVar;
                this.f33095g++;
            } else {
                this.f33093e[i10 + c(i10) + d10] = cVar;
            }
            this.f33096h += i11;
        }

        private boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f33087a.length - 1;
        }

        private int i() throws IOException {
            return this.f33090b.readByte() & 255;
        }

        private void l(int i10) throws IOException {
            if (h(i10)) {
                this.f33089a.add(d.f33087a[i10]);
                return;
            }
            int c10 = c(i10 - d.f33087a.length);
            if (c10 >= 0) {
                c[] cVarArr = this.f33093e;
                if (c10 < cVarArr.length) {
                    this.f33089a.add(cVarArr[c10]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void n(int i10) throws IOException {
            g(-1, new c(f(i10), j()));
        }

        private void o() throws IOException {
            g(-1, new c(d.a(j()), j()));
        }

        private void p(int i10) throws IOException {
            this.f33089a.add(new c(f(i10), j()));
        }

        private void q() throws IOException {
            this.f33089a.add(new c(d.a(j()), j()));
        }

        public List<c> e() {
            ArrayList arrayList = new ArrayList(this.f33089a);
            this.f33089a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public f j() throws IOException {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            int m10 = m(i10, 127);
            if (z10) {
                return f.k(k.f().c(this.f33090b.p0((long) m10)));
            }
            return this.f33090b.r((long) m10);
        }

        /* access modifiers changed from: package-private */
        public void k() throws IOException {
            while (!this.f33090b.F()) {
                byte readByte = this.f33090b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    l(m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    o();
                } else if ((readByte & 64) == 64) {
                    n(m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m10 = m(readByte, 31);
                    this.f33092d = m10;
                    if (m10 < 0 || m10 > this.f33091c) {
                        throw new IOException("Invalid dynamic table size update " + this.f33092d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    q();
                } else {
                    p(m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int m(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        a(int i10, int i11, s sVar) {
            this.f33089a = new ArrayList();
            c[] cVarArr = new c[8];
            this.f33093e = cVarArr;
            this.f33094f = cVarArr.length - 1;
            this.f33095g = 0;
            this.f33096h = 0;
            this.f33091c = i10;
            this.f33092d = i11;
            this.f33090b = l.b(sVar);
        }
    }

    /* compiled from: Hpack */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f33097a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f33098b;

        /* renamed from: c  reason: collision with root package name */
        private int f33099c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f33100d;

        /* renamed from: e  reason: collision with root package name */
        int f33101e;

        /* renamed from: f  reason: collision with root package name */
        int f33102f;

        /* renamed from: g  reason: collision with root package name */
        c[] f33103g;

        /* renamed from: h  reason: collision with root package name */
        int f33104h;

        /* renamed from: i  reason: collision with root package name */
        int f33105i;

        /* renamed from: j  reason: collision with root package name */
        int f33106j;

        b(c cVar) {
            this(4096, true, cVar);
        }

        private void a() {
            int i10 = this.f33102f;
            int i11 = this.f33106j;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                c(i11 - i10);
            }
        }

        private void b() {
            Arrays.fill(this.f33103g, (Object) null);
            this.f33104h = this.f33103g.length - 1;
            this.f33105i = 0;
            this.f33106j = 0;
        }

        private int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f33103g.length;
                while (true) {
                    length--;
                    i11 = this.f33104h;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f33103g;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f33105i);
                        c[] cVarArr2 = this.f33103g;
                        int i13 = this.f33104h;
                        Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i12, (Object) null);
                        this.f33104h += i12;
                    } else {
                        c[] cVarArr3 = this.f33103g;
                        i10 -= cVarArr3[length].f33086c;
                        this.f33106j -= cVarArr3[length].f33086c;
                        this.f33105i--;
                        i12++;
                    }
                }
                c[] cVarArr4 = this.f33103g;
                System.arraycopy(cVarArr4, i11 + 1, cVarArr4, i11 + 1 + i12, this.f33105i);
                c[] cVarArr22 = this.f33103g;
                int i132 = this.f33104h;
                Arrays.fill(cVarArr22, i132 + 1, i132 + 1 + i12, (Object) null);
                this.f33104h += i12;
            }
            return i12;
        }

        private void d(c cVar) {
            int i10 = cVar.f33086c;
            int i11 = this.f33102f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f33106j + i10) - i11);
            int i12 = this.f33105i + 1;
            c[] cVarArr = this.f33103g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f33104h = this.f33103g.length - 1;
                this.f33103g = cVarArr2;
            }
            int i13 = this.f33104h;
            this.f33104h = i13 - 1;
            this.f33103g[i13] = cVar;
            this.f33105i++;
            this.f33106j += i10;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10) {
            this.f33101e = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f33102f;
            if (i11 != min) {
                if (min < i11) {
                    this.f33099c = Math.min(this.f33099c, min);
                }
                this.f33100d = true;
                this.f33102f = min;
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void f(f fVar) throws IOException {
            if (!this.f33098b || k.f().e(fVar) >= fVar.p()) {
                h(fVar.p(), 127, 0);
                this.f33097a.E0(fVar);
                return;
            }
            c cVar = new c();
            k.f().d(fVar, cVar);
            f h02 = cVar.h0();
            h(h02.p(), 127, 128);
            this.f33097a.E0(h02);
        }

        /* access modifiers changed from: package-private */
        public void g(List<c> list) throws IOException {
            int i10;
            int i11;
            if (this.f33100d) {
                int i12 = this.f33099c;
                if (i12 < this.f33102f) {
                    h(i12, 31, 32);
                }
                this.f33100d = false;
                this.f33099c = a.e.API_PRIORITY_OTHER;
                h(this.f33102f, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = list.get(i13);
                f s10 = cVar.f33084a.s();
                f fVar = cVar.f33085b;
                Integer num = d.f33088b.get(s10);
                if (num != null) {
                    i11 = num.intValue() + 1;
                    if (i11 > 1 && i11 < 8) {
                        c[] cVarArr = d.f33087a;
                        if (cf.c.q(cVarArr[i11 - 1].f33085b, fVar)) {
                            i10 = i11;
                        } else if (cf.c.q(cVarArr[i11].f33085b, fVar)) {
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
                    int i14 = this.f33104h + 1;
                    int length = this.f33103g.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        if (cf.c.q(this.f33103g[i14].f33084a, s10)) {
                            if (cf.c.q(this.f33103g[i14].f33085b, fVar)) {
                                i11 = d.f33087a.length + (i14 - this.f33104h);
                                break;
                            } else if (i10 == -1) {
                                i10 = (i14 - this.f33104h) + d.f33087a.length;
                            }
                        }
                        i14++;
                    }
                }
                if (i11 != -1) {
                    h(i11, 127, 128);
                } else if (i10 == -1) {
                    this.f33097a.G(64);
                    f(s10);
                    f(fVar);
                    d(cVar);
                } else if (!s10.q(c.f33078d) || c.f33083i.equals(s10)) {
                    h(i10, 63, 64);
                    f(fVar);
                    d(cVar);
                } else {
                    h(i10, 15, 0);
                    f(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f33097a.G(i10 | i12);
                return;
            }
            this.f33097a.G(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f33097a.G(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f33097a.G(i13);
        }

        b(int i10, boolean z10, c cVar) {
            this.f33099c = a.e.API_PRIORITY_OTHER;
            c[] cVarArr = new c[8];
            this.f33103g = cVarArr;
            this.f33104h = cVarArr.length - 1;
            this.f33105i = 0;
            this.f33106j = 0;
            this.f33101e = i10;
            this.f33102f = i10;
            this.f33098b = z10;
            this.f33097a = cVar;
        }
    }

    static {
        f fVar = c.f33080f;
        f fVar2 = c.f33081g;
        f fVar3 = c.f33082h;
        f fVar4 = c.f33079e;
        f33087a = new c[]{new c(c.f33083i, (String) MaxReward.DEFAULT_LABEL), new c(fVar, "GET"), new c(fVar, "POST"), new c(fVar2, (String) UnityAdsConstants.DefaultUrls.AD_ASSET_PATH), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, (String) HttpRequest.DEFAULT_SCHEME), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", (String) MaxReward.DEFAULT_LABEL), new c("accept-encoding", "gzip, deflate"), new c("accept-language", (String) MaxReward.DEFAULT_LABEL), new c("accept-ranges", (String) MaxReward.DEFAULT_LABEL), new c("accept", (String) MaxReward.DEFAULT_LABEL), new c("access-control-allow-origin", (String) MaxReward.DEFAULT_LABEL), new c("age", (String) MaxReward.DEFAULT_LABEL), new c("allow", (String) MaxReward.DEFAULT_LABEL), new c("authorization", (String) MaxReward.DEFAULT_LABEL), new c("cache-control", (String) MaxReward.DEFAULT_LABEL), new c("content-disposition", (String) MaxReward.DEFAULT_LABEL), new c("content-encoding", (String) MaxReward.DEFAULT_LABEL), new c("content-language", (String) MaxReward.DEFAULT_LABEL), new c("content-length", (String) MaxReward.DEFAULT_LABEL), new c("content-location", (String) MaxReward.DEFAULT_LABEL), new c("content-range", (String) MaxReward.DEFAULT_LABEL), new c("content-type", (String) MaxReward.DEFAULT_LABEL), new c("cookie", (String) MaxReward.DEFAULT_LABEL), new c("date", (String) MaxReward.DEFAULT_LABEL), new c("etag", (String) MaxReward.DEFAULT_LABEL), new c("expect", (String) MaxReward.DEFAULT_LABEL), new c("expires", (String) MaxReward.DEFAULT_LABEL), new c("from", (String) MaxReward.DEFAULT_LABEL), new c((String) URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, (String) MaxReward.DEFAULT_LABEL), new c("if-match", (String) MaxReward.DEFAULT_LABEL), new c("if-modified-since", (String) MaxReward.DEFAULT_LABEL), new c("if-none-match", (String) MaxReward.DEFAULT_LABEL), new c("if-range", (String) MaxReward.DEFAULT_LABEL), new c("if-unmodified-since", (String) MaxReward.DEFAULT_LABEL), new c("last-modified", (String) MaxReward.DEFAULT_LABEL), new c("link", (String) MaxReward.DEFAULT_LABEL), new c("location", (String) MaxReward.DEFAULT_LABEL), new c("max-forwards", (String) MaxReward.DEFAULT_LABEL), new c("proxy-authenticate", (String) MaxReward.DEFAULT_LABEL), new c("proxy-authorization", (String) MaxReward.DEFAULT_LABEL), new c("range", (String) MaxReward.DEFAULT_LABEL), new c("referer", (String) MaxReward.DEFAULT_LABEL), new c("refresh", (String) MaxReward.DEFAULT_LABEL), new c("retry-after", (String) MaxReward.DEFAULT_LABEL), new c("server", (String) MaxReward.DEFAULT_LABEL), new c("set-cookie", (String) MaxReward.DEFAULT_LABEL), new c("strict-transport-security", (String) MaxReward.DEFAULT_LABEL), new c("transfer-encoding", (String) MaxReward.DEFAULT_LABEL), new c("user-agent", (String) MaxReward.DEFAULT_LABEL), new c("vary", (String) MaxReward.DEFAULT_LABEL), new c("via", (String) MaxReward.DEFAULT_LABEL), new c("www-authenticate", (String) MaxReward.DEFAULT_LABEL)};
    }

    static f a(f fVar) throws IOException {
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

    private static Map<f, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f33087a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f33087a;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f33084a)) {
                linkedHashMap.put(cVarArr[i10].f33084a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
