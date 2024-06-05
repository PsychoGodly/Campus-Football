package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import c1.f;
import java.util.ArrayList;
import java.util.List;
import y0.c;

/* compiled from: WorkNameDao_Impl */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final h f21912a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.a<j> f21913b;

    /* compiled from: WorkNameDao_Impl */
    class a extends y0.a<j> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, j jVar) {
            String str = jVar.f21910a;
            if (str == null) {
                fVar.j0(1);
            } else {
                fVar.t(1, str);
            }
            String str2 = jVar.f21911b;
            if (str2 == null) {
                fVar.j0(2);
            } else {
                fVar.t(2, str2);
            }
        }
    }

    public l(h hVar) {
        this.f21912a = hVar;
        this.f21913b = new a(hVar);
    }

    public void a(j jVar) {
        this.f21912a.b();
        this.f21912a.c();
        try {
            this.f21913b.h(jVar);
            this.f21912a.r();
        } finally {
            this.f21912a.g();
        }
    }

    public List<String> b(String str) {
        c j10 = c.j("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21912a.b();
        Cursor b10 = a1.c.b(this.f21912a, j10, false, (CancellationSignal) null);
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
}
