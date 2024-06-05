package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import y0.c;

/* compiled from: PreferenceDao_Impl */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final h f21900a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.a<d> f21901b;

    /* compiled from: PreferenceDao_Impl */
    class a extends y0.a<d> {
        a(h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void g(c1.f fVar, d dVar) {
            String str = dVar.f21898a;
            if (str == null) {
                fVar.j0(1);
            } else {
                fVar.t(1, str);
            }
            Long l10 = dVar.f21899b;
            if (l10 == null) {
                fVar.j0(2);
            } else {
                fVar.N(2, l10.longValue());
            }
        }
    }

    public f(h hVar) {
        this.f21900a = hVar;
        this.f21901b = new a(hVar);
    }

    public void a(d dVar) {
        this.f21900a.b();
        this.f21900a.c();
        try {
            this.f21901b.h(dVar);
            this.f21900a.r();
        } finally {
            this.f21900a.g();
        }
    }

    public Long b(String str) {
        c j10 = c.j("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21900a.b();
        Long l10 = null;
        Cursor b10 = a1.c.b(this.f21900a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (!b10.isNull(0)) {
                    l10 = Long.valueOf(b10.getLong(0));
                }
            }
            return l10;
        } finally {
            b10.close();
            j10.u();
        }
    }
}
