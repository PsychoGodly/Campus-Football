package r7;

import u7.f;

/* compiled from: DatabaseInfo */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final f f29939a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29940b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29941c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f29942d;

    public l(f fVar, String str, String str2, boolean z10) {
        this.f29939a = fVar;
        this.f29940b = str;
        this.f29941c = str2;
        this.f29942d = z10;
    }

    public f a() {
        return this.f29939a;
    }

    public String b() {
        return this.f29941c;
    }

    public String c() {
        return this.f29940b;
    }

    public boolean d() {
        return this.f29942d;
    }

    public String toString() {
        return "DatabaseInfo(databaseId:" + this.f29939a + " host:" + this.f29941c + ")";
    }
}
