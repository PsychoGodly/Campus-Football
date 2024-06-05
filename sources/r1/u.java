package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import c1.f;
import java.util.ArrayList;
import java.util.List;
import y0.c;

/* compiled from: WorkTagDao_Impl */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final h f21973a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.a<s> f21974b;

    /* compiled from: WorkTagDao_Impl */
    class a extends y0.a<s> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, s sVar) {
            String str = sVar.f21971a;
            if (str == null) {
                fVar.j0(1);
            } else {
                fVar.t(1, str);
            }
            String str2 = sVar.f21972b;
            if (str2 == null) {
                fVar.j0(2);
            } else {
                fVar.t(2, str2);
            }
        }
    }

    public u(h hVar) {
        this.f21973a = hVar;
        this.f21974b = new a(hVar);
    }

    public List<String> a(String str) {
        c j10 = c.j("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21973a.b();
        Cursor b10 = a1.c.b(this.f21973a, j10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            j10.u();
        }
    }

    public void b(s sVar) {
        this.f21973a.b();
        this.f21973a.c();
        try {
            this.f21974b.h(sVar);
            this.f21973a.r();
        } finally {
            this.f21973a.g();
        }
    }
}
