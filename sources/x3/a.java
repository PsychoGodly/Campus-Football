package x3;

import a3.p;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.l0;
import k4.n0;
import n2.r1;
import o3.c;

/* compiled from: SsManifest */
public class a implements o3.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f23620a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23621b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23622c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23623d;

    /* renamed from: e  reason: collision with root package name */
    public final C0246a f23624e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f23625f;

    /* renamed from: g  reason: collision with root package name */
    public final long f23626g;

    /* renamed from: h  reason: collision with root package name */
    public final long f23627h;

    /* renamed from: x3.a$a  reason: collision with other inner class name */
    /* compiled from: SsManifest */
    public static class C0246a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f23628a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f23629b;

        /* renamed from: c  reason: collision with root package name */
        public final p[] f23630c;

        public C0246a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f23628a = uuid;
            this.f23629b = bArr;
            this.f23630c = pVarArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0246a aVar, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : n0.O0(j11, 1000000, j10), j12 != 0 ? n0.O0(j12, 1000000, j10) : -9223372036854775807L, i12, z10, aVar, bVarArr);
    }

    /* renamed from: b */
    public final a a(List<c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            b bVar2 = this.f23625f[cVar.f21072b];
            if (!(bVar2 == bVar || bVar == null)) {
                arrayList2.add(bVar.b((r1[]) arrayList3.toArray(new r1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f23640j[cVar.f21073c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((r1[]) arrayList3.toArray(new r1[0])));
        }
        return new a(this.f23620a, this.f23621b, this.f23626g, this.f23627h, this.f23622c, this.f23623d, this.f23624e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* compiled from: SsManifest */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f23631a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23632b;

        /* renamed from: c  reason: collision with root package name */
        public final long f23633c;

        /* renamed from: d  reason: collision with root package name */
        public final String f23634d;

        /* renamed from: e  reason: collision with root package name */
        public final int f23635e;

        /* renamed from: f  reason: collision with root package name */
        public final int f23636f;

        /* renamed from: g  reason: collision with root package name */
        public final int f23637g;

        /* renamed from: h  reason: collision with root package name */
        public final int f23638h;

        /* renamed from: i  reason: collision with root package name */
        public final String f23639i;

        /* renamed from: j  reason: collision with root package name */
        public final r1[] f23640j;

        /* renamed from: k  reason: collision with root package name */
        public final int f23641k;

        /* renamed from: l  reason: collision with root package name */
        private final String f23642l;

        /* renamed from: m  reason: collision with root package name */
        private final String f23643m;

        /* renamed from: n  reason: collision with root package name */
        private final List<Long> f23644n;

        /* renamed from: o  reason: collision with root package name */
        private final long[] f23645o;

        /* renamed from: p  reason: collision with root package name */
        private final long f23646p;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, r1[] r1VarArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, r1VarArr, list, n0.P0(list, 1000000, j10), n0.O0(j11, 1000000, j10));
            String str6 = str;
            String str7 = str2;
            int i15 = i10;
        }

        public Uri a(int i10, int i11) {
            boolean z10 = true;
            k4.a.f(this.f23640j != null);
            k4.a.f(this.f23644n != null);
            if (i11 >= this.f23644n.size()) {
                z10 = false;
            }
            k4.a.f(z10);
            String num = Integer.toString(this.f23640j[i10].f20650i);
            String l10 = this.f23644n.get(i11).toString();
            return l0.e(this.f23642l, this.f23643m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        public b b(r1[] r1VarArr) {
            String str = this.f23642l;
            return new b(str, this.f23643m, this.f23631a, this.f23632b, this.f23633c, this.f23634d, this.f23635e, this.f23636f, this.f23637g, this.f23638h, this.f23639i, r1VarArr, this.f23644n, this.f23645o, this.f23646p);
        }

        public long c(int i10) {
            if (i10 == this.f23641k - 1) {
                return this.f23646p;
            }
            long[] jArr = this.f23645o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return n0.i(this.f23645o, j10, true, true);
        }

        public long e(int i10) {
            return this.f23645o[i10];
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, r1[] r1VarArr, List<Long> list, long[] jArr, long j11) {
            this.f23642l = str;
            this.f23643m = str2;
            this.f23631a = i10;
            this.f23632b = str3;
            this.f23633c = j10;
            this.f23634d = str4;
            this.f23635e = i11;
            this.f23636f = i12;
            this.f23637g = i13;
            this.f23638h = i14;
            this.f23639i = str5;
            this.f23640j = r1VarArr;
            this.f23644n = list;
            this.f23645o = jArr;
            this.f23646p = j11;
            this.f23641k = list.size();
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0246a aVar, b[] bVarArr) {
        this.f23620a = i10;
        this.f23621b = i11;
        this.f23626g = j10;
        this.f23627h = j11;
        this.f23622c = i12;
        this.f23623d = z10;
        this.f23624e = aVar;
        this.f23625f = bVarArr;
    }
}
