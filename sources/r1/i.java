package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import c1.f;
import java.util.ArrayList;
import java.util.List;
import y0.c;
import y0.d;

/* compiled from: SystemIdInfoDao_Impl */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final h f21905a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.a<g> f21906b;

    /* renamed from: c  reason: collision with root package name */
    private final d f21907c;

    /* compiled from: SystemIdInfoDao_Impl */
    class a extends y0.a<g> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, g gVar) {
            String str = gVar.f21903a;
            if (str == null) {
                fVar.j0(1);
            } else {
                fVar.t(1, str);
            }
            fVar.N(2, (long) gVar.f21904b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    class b extends d {
        b(h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(h hVar) {
        this.f21905a = hVar;
        this.f21906b = new a(hVar);
        this.f21907c = new b(hVar);
    }

    public List<String> a() {
        c j10 = c.j("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f21905a.b();
        Cursor b10 = a1.c.b(this.f21905a, j10, false, (CancellationSignal) null);
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

    public void b(g gVar) {
        this.f21905a.b();
        this.f21905a.c();
        try {
            this.f21906b.h(gVar);
            this.f21905a.r();
        } finally {
            this.f21905a.g();
        }
    }

    public g c(String str) {
        c j10 = c.j("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21905a.b();
        g gVar = null;
        Cursor b10 = a1.c.b(this.f21905a, j10, false, (CancellationSignal) null);
        try {
            int b11 = a1.b.b(b10, "work_spec_id");
            int b12 = a1.b.b(b10, "system_id");
            if (b10.moveToFirst()) {
                gVar = new g(b10.getString(b11), b10.getInt(b12));
            }
            return gVar;
        } finally {
            b10.close();
            j10.u();
        }
    }

    public void d(String str) {
        this.f21905a.b();
        f a10 = this.f21907c.a();
        if (str == null) {
            a10.j0(1);
        } else {
            a10.t(1, str);
        }
        this.f21905a.c();
        try {
            a10.w();
            this.f21905a.r();
        } finally {
            this.f21905a.g();
            this.f21907c.f(a10);
        }
    }
}
