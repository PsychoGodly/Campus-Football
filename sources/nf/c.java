package nf;

import kotlin.jvm.internal.m;

/* compiled from: DownloadTask.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private int f36545a;

    /* renamed from: b  reason: collision with root package name */
    private String f36546b;

    /* renamed from: c  reason: collision with root package name */
    private a f36547c;

    /* renamed from: d  reason: collision with root package name */
    private int f36548d;

    /* renamed from: e  reason: collision with root package name */
    private String f36549e;

    /* renamed from: f  reason: collision with root package name */
    private String f36550f;

    /* renamed from: g  reason: collision with root package name */
    private String f36551g;

    /* renamed from: h  reason: collision with root package name */
    private String f36552h;

    /* renamed from: i  reason: collision with root package name */
    private String f36553i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f36554j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f36555k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f36556l;

    /* renamed from: m  reason: collision with root package name */
    private long f36557m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36558n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f36559o;

    public c(int i10, String str, a aVar, int i11, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, boolean z12, long j10, boolean z13, boolean z14) {
        String str7 = str5;
        String str8 = str6;
        m.e(str, "taskId");
        m.e(aVar, "status");
        m.e(str2, "url");
        m.e(str4, "savedDir");
        m.e(str7, "headers");
        m.e(str8, "mimeType");
        this.f36545a = i10;
        this.f36546b = str;
        this.f36547c = aVar;
        this.f36548d = i11;
        this.f36549e = str2;
        this.f36550f = str3;
        this.f36551g = str4;
        this.f36552h = str7;
        this.f36553i = str8;
        this.f36554j = z10;
        this.f36555k = z11;
        this.f36556l = z12;
        this.f36557m = j10;
        this.f36558n = z13;
        this.f36559o = z14;
    }

    public final boolean a() {
        return this.f36559o;
    }

    public final String b() {
        return this.f36550f;
    }

    public final String c() {
        return this.f36552h;
    }

    public final String d() {
        return this.f36553i;
    }

    public final boolean e() {
        return this.f36556l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f36545a == cVar.f36545a && m.a(this.f36546b, cVar.f36546b) && this.f36547c == cVar.f36547c && this.f36548d == cVar.f36548d && m.a(this.f36549e, cVar.f36549e) && m.a(this.f36550f, cVar.f36550f) && m.a(this.f36551g, cVar.f36551g) && m.a(this.f36552h, cVar.f36552h) && m.a(this.f36553i, cVar.f36553i) && this.f36554j == cVar.f36554j && this.f36555k == cVar.f36555k && this.f36556l == cVar.f36556l && this.f36557m == cVar.f36557m && this.f36558n == cVar.f36558n && this.f36559o == cVar.f36559o;
    }

    public final int f() {
        return this.f36545a;
    }

    public final int g() {
        return this.f36548d;
    }

    public final boolean h() {
        return this.f36554j;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f36545a * 31) + this.f36546b.hashCode()) * 31) + this.f36547c.hashCode()) * 31) + this.f36548d) * 31) + this.f36549e.hashCode()) * 31;
        String str = this.f36550f;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f36551g.hashCode()) * 31) + this.f36552h.hashCode()) * 31) + this.f36553i.hashCode()) * 31;
        boolean z10 = this.f36554j;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode2 + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.f36555k;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f36556l;
        if (z13) {
            z13 = true;
        }
        int a10 = (((i11 + (z13 ? 1 : 0)) * 31) + b.a(this.f36557m)) * 31;
        boolean z14 = this.f36558n;
        if (z14) {
            z14 = true;
        }
        int i12 = (a10 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.f36559o;
        if (!z15) {
            z11 = z15;
        }
        return i12 + (z11 ? 1 : 0);
    }

    public final boolean i() {
        return this.f36558n;
    }

    public final String j() {
        return this.f36551g;
    }

    public final boolean k() {
        return this.f36555k;
    }

    public final a l() {
        return this.f36547c;
    }

    public final String m() {
        return this.f36546b;
    }

    public final long n() {
        return this.f36557m;
    }

    public final String o() {
        return this.f36549e;
    }

    public String toString() {
        return "DownloadTask(primaryId=" + this.f36545a + ", taskId=" + this.f36546b + ", status=" + this.f36547c + ", progress=" + this.f36548d + ", url=" + this.f36549e + ", filename=" + this.f36550f + ", savedDir=" + this.f36551g + ", headers=" + this.f36552h + ", mimeType=" + this.f36553i + ", resumable=" + this.f36554j + ", showNotification=" + this.f36555k + ", openFileFromNotification=" + this.f36556l + ", timeCreated=" + this.f36557m + ", saveInPublicStorage=" + this.f36558n + ", allowCellular=" + this.f36559o + ')';
    }
}
