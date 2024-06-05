package androidx.room;

import c1.c;
import java.io.File;

/* compiled from: SQLiteCopyOpenHelperFactory */
class k implements c.C0106c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4786a;

    /* renamed from: b  reason: collision with root package name */
    private final File f4787b;

    /* renamed from: c  reason: collision with root package name */
    private final c.C0106c f4788c;

    k(String str, File file, c.C0106c cVar) {
        this.f4786a = str;
        this.f4787b = file;
        this.f4788c = cVar;
    }

    public c a(c.b bVar) {
        return new j(bVar.f5576a, this.f4786a, this.f4787b, bVar.f5578c.f5575a, this.f4788c.a(bVar));
    }
}
