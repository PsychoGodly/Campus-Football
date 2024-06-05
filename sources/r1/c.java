package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import c1.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f21895a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.a<a> f21896b;

    /* compiled from: DependencyDao_Impl */
    class a extends y0.a<a> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(f fVar, a aVar) {
            String str = aVar.f21893a;
            if (str == null) {
                fVar.j0(1);
            } else {
                fVar.t(1, str);
            }
            String str2 = aVar.f21894b;
            if (str2 == null) {
                fVar.j0(2);
            } else {
                fVar.t(2, str2);
            }
        }
    }

    public c(h hVar) {
        this.f21895a = hVar;
        this.f21896b = new a(hVar);
    }

    public void a(a aVar) {
        this.f21895a.b();
        this.f21895a.c();
        try {
            this.f21896b.h(aVar);
            this.f21895a.r();
        } finally {
            this.f21895a.g();
        }
    }

    public List<String> b(String str) {
        y0.c j10 = y0.c.j("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21895a.b();
        Cursor b10 = a1.c.b(this.f21895a, j10, false, (CancellationSignal) null);
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

    public boolean c(String str) {
        boolean z10 = true;
        y0.c j10 = y0.c.j("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21895a.b();
        boolean z11 = false;
        Cursor b10 = a1.c.b(this.f21895a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            j10.u();
        }
    }

    public boolean d(String str) {
        boolean z10 = true;
        y0.c j10 = y0.c.j("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21895a.b();
        boolean z11 = false;
        Cursor b10 = a1.c.b(this.f21895a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            j10.u();
        }
    }
}
