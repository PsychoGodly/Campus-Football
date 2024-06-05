package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.y;
import java.util.ArrayList;
import java.util.List;
import r1.p;

/* compiled from: WorkSpecDao_Impl */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f21952a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.a<p> f21953b;

    /* renamed from: c  reason: collision with root package name */
    private final y0.d f21954c;

    /* renamed from: d  reason: collision with root package name */
    private final y0.d f21955d;

    /* renamed from: e  reason: collision with root package name */
    private final y0.d f21956e;

    /* renamed from: f  reason: collision with root package name */
    private final y0.d f21957f;

    /* renamed from: g  reason: collision with root package name */
    private final y0.d f21958g;

    /* renamed from: h  reason: collision with root package name */
    private final y0.d f21959h;

    /* renamed from: i  reason: collision with root package name */
    private final y0.d f21960i;

    /* renamed from: j  reason: collision with root package name */
    private final y0.d f21961j;

    /* compiled from: WorkSpecDao_Impl */
    class a extends y0.a<p> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i */
        public void g(c1.f fVar, p pVar) {
            String str = pVar.f21926a;
            if (str == null) {
                fVar.j0(1);
            } else {
                fVar.t(1, str);
            }
            fVar.N(2, (long) v.j(pVar.f21927b));
            String str2 = pVar.f21928c;
            if (str2 == null) {
                fVar.j0(3);
            } else {
                fVar.t(3, str2);
            }
            String str3 = pVar.f21929d;
            if (str3 == null) {
                fVar.j0(4);
            } else {
                fVar.t(4, str3);
            }
            byte[] n10 = androidx.work.e.n(pVar.f21930e);
            if (n10 == null) {
                fVar.j0(5);
            } else {
                fVar.S(5, n10);
            }
            byte[] n11 = androidx.work.e.n(pVar.f21931f);
            if (n11 == null) {
                fVar.j0(6);
            } else {
                fVar.S(6, n11);
            }
            fVar.N(7, pVar.f21932g);
            fVar.N(8, pVar.f21933h);
            fVar.N(9, pVar.f21934i);
            fVar.N(10, (long) pVar.f21936k);
            fVar.N(11, (long) v.a(pVar.f21937l));
            fVar.N(12, pVar.f21938m);
            fVar.N(13, pVar.f21939n);
            fVar.N(14, pVar.f21940o);
            fVar.N(15, pVar.f21941p);
            fVar.N(16, pVar.f21942q ? 1 : 0);
            fVar.N(17, (long) v.i(pVar.f21943r));
            androidx.work.c cVar = pVar.f21935j;
            if (cVar != null) {
                fVar.N(18, (long) v.h(cVar.b()));
                fVar.N(19, cVar.g() ? 1 : 0);
                fVar.N(20, cVar.h() ? 1 : 0);
                fVar.N(21, cVar.f() ? 1 : 0);
                fVar.N(22, cVar.i() ? 1 : 0);
                fVar.N(23, cVar.c());
                fVar.N(24, cVar.d());
                byte[] c10 = v.c(cVar.a());
                if (c10 == null) {
                    fVar.j0(25);
                } else {
                    fVar.S(25, c10);
                }
            } else {
                fVar.j0(18);
                fVar.j0(19);
                fVar.j0(20);
                fVar.j0(21);
                fVar.j0(22);
                fVar.j0(23);
                fVar.j0(24);
                fVar.j0(25);
            }
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class b extends y0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class c extends y0.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class d extends y0.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class e extends y0.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class f extends y0.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class g extends y0.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class h extends y0.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    class i extends y0.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f21952a = hVar;
        this.f21953b = new a(hVar);
        this.f21954c = new b(hVar);
        this.f21955d = new c(hVar);
        this.f21956e = new d(hVar);
        this.f21957f = new e(hVar);
        this.f21958g = new f(hVar);
        this.f21959h = new g(hVar);
        this.f21960i = new h(hVar);
        this.f21961j = new i(hVar);
    }

    public void a(String str) {
        this.f21952a.b();
        c1.f a10 = this.f21954c.a();
        if (str == null) {
            a10.j0(1);
        } else {
            a10.t(1, str);
        }
        this.f21952a.c();
        try {
            a10.w();
            this.f21952a.r();
        } finally {
            this.f21952a.g();
            this.f21954c.f(a10);
        }
    }

    public int b(y.a aVar, String... strArr) {
        this.f21952a.b();
        StringBuilder b10 = a1.e.b();
        b10.append("UPDATE workspec SET state=");
        b10.append("?");
        b10.append(" WHERE id IN (");
        a1.e.a(b10, strArr.length);
        b10.append(")");
        c1.f d10 = this.f21952a.d(b10.toString());
        d10.N(1, (long) v.j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                d10.j0(i10);
            } else {
                d10.t(i10, str);
            }
            i10++;
        }
        this.f21952a.c();
        try {
            int w10 = d10.w();
            this.f21952a.r();
            return w10;
        } finally {
            this.f21952a.g();
        }
    }

    public int c(String str, long j10) {
        this.f21952a.b();
        c1.f a10 = this.f21959h.a();
        a10.N(1, j10);
        if (str == null) {
            a10.j0(2);
        } else {
            a10.t(2, str);
        }
        this.f21952a.c();
        try {
            int w10 = a10.w();
            this.f21952a.r();
            return w10;
        } finally {
            this.f21952a.g();
            this.f21959h.f(a10);
        }
    }

    public List<p.b> d(String str) {
        y0.c j10 = y0.c.j("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            int b11 = a1.b.b(b10, "id");
            int b12 = a1.b.b(b10, "state");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f21944a = b10.getString(b11);
                bVar.f21945b = v.g(b10.getInt(b12));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b10.close();
            j10.u();
        }
    }

    public List<p> e(long j10) {
        y0.c cVar;
        y0.c j11 = y0.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        j11.N(1, j10);
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j11, false, (CancellationSignal) null);
        try {
            int b11 = a1.b.b(b10, "required_network_type");
            int b12 = a1.b.b(b10, "requires_charging");
            int b13 = a1.b.b(b10, "requires_device_idle");
            int b14 = a1.b.b(b10, "requires_battery_not_low");
            int b15 = a1.b.b(b10, "requires_storage_not_low");
            int b16 = a1.b.b(b10, "trigger_content_update_delay");
            int b17 = a1.b.b(b10, "trigger_max_content_delay");
            int b18 = a1.b.b(b10, "content_uri_triggers");
            int b19 = a1.b.b(b10, "id");
            int b20 = a1.b.b(b10, "state");
            int b21 = a1.b.b(b10, "worker_class_name");
            int b22 = a1.b.b(b10, "input_merger_class_name");
            int b23 = a1.b.b(b10, "input");
            int b24 = a1.b.b(b10, "output");
            cVar = j11;
            try {
                int b25 = a1.b.b(b10, "initial_delay");
                int b26 = a1.b.b(b10, "interval_duration");
                int b27 = a1.b.b(b10, "flex_duration");
                int b28 = a1.b.b(b10, "run_attempt_count");
                int b29 = a1.b.b(b10, "backoff_policy");
                int b30 = a1.b.b(b10, "backoff_delay_duration");
                int b31 = a1.b.b(b10, "period_start_time");
                int b32 = a1.b.b(b10, "minimum_retention_duration");
                int b33 = a1.b.b(b10, "schedule_requested_at");
                int b34 = a1.b.b(b10, "run_in_foreground");
                int b35 = a1.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f21927b = v.g(b10.getInt(b20));
                    pVar.f21929d = b10.getString(b22);
                    pVar.f21930e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f21931f = androidx.work.e.g(b10.getBlob(i16));
                    int i17 = b25;
                    int i18 = i14;
                    i10 = i16;
                    pVar.f21932g = b10.getLong(i17);
                    int i19 = b22;
                    int i20 = b26;
                    pVar.f21933h = b10.getLong(i20);
                    int i21 = i17;
                    int i22 = b14;
                    int i23 = b27;
                    pVar.f21934i = b10.getLong(i23);
                    int i24 = b28;
                    pVar.f21936k = b10.getInt(i24);
                    int i25 = b29;
                    int i26 = i20;
                    pVar.f21937l = v.d(b10.getInt(i25));
                    b27 = i23;
                    int i27 = i22;
                    int i28 = b30;
                    pVar.f21938m = b10.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = b31;
                    pVar.f21939n = b10.getLong(i31);
                    int i32 = i28;
                    b31 = i31;
                    int i33 = b32;
                    pVar.f21940o = b10.getLong(i33);
                    int i34 = i29;
                    int i35 = b33;
                    pVar.f21941p = b10.getLong(i35);
                    int i36 = b34;
                    pVar.f21942q = b10.getInt(i36) != 0;
                    int i37 = b35;
                    int i38 = i35;
                    pVar.f21943r = v.f(b10.getInt(i37));
                    pVar.f21935j = cVar2;
                    arrayList.add(pVar);
                    b12 = i18;
                    b35 = i37;
                    b22 = i19;
                    b25 = i21;
                    b26 = i26;
                    b28 = i34;
                    b33 = i38;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i36;
                    b32 = i33;
                    b13 = i15;
                    int i39 = i30;
                    b30 = i32;
                    b14 = i27;
                    b29 = i39;
                }
                b10.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j11;
            b10.close();
            cVar.u();
            throw th;
        }
    }

    public List<p> f(int i10) {
        y0.c cVar;
        y0.c j10 = y0.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        j10.N(1, (long) i10);
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            int b11 = a1.b.b(b10, "required_network_type");
            int b12 = a1.b.b(b10, "requires_charging");
            int b13 = a1.b.b(b10, "requires_device_idle");
            int b14 = a1.b.b(b10, "requires_battery_not_low");
            int b15 = a1.b.b(b10, "requires_storage_not_low");
            int b16 = a1.b.b(b10, "trigger_content_update_delay");
            int b17 = a1.b.b(b10, "trigger_max_content_delay");
            int b18 = a1.b.b(b10, "content_uri_triggers");
            int b19 = a1.b.b(b10, "id");
            int b20 = a1.b.b(b10, "state");
            int b21 = a1.b.b(b10, "worker_class_name");
            int b22 = a1.b.b(b10, "input_merger_class_name");
            int b23 = a1.b.b(b10, "input");
            int b24 = a1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = a1.b.b(b10, "initial_delay");
                int b26 = a1.b.b(b10, "interval_duration");
                int b27 = a1.b.b(b10, "flex_duration");
                int b28 = a1.b.b(b10, "run_attempt_count");
                int b29 = a1.b.b(b10, "backoff_policy");
                int b30 = a1.b.b(b10, "backoff_delay_duration");
                int b31 = a1.b.b(b10, "period_start_time");
                int b32 = a1.b.b(b10, "minimum_retention_duration");
                int b33 = a1.b.b(b10, "schedule_requested_at");
                int b34 = a1.b.b(b10, "run_in_foreground");
                int b35 = a1.b.b(b10, "out_of_quota_policy");
                int i11 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i12 = b19;
                    String string2 = b10.getString(b21);
                    int i13 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i14 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i15 = b12;
                    int i16 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f21927b = v.g(b10.getInt(b20));
                    pVar.f21929d = b10.getString(b22);
                    pVar.f21930e = androidx.work.e.g(b10.getBlob(b23));
                    int i17 = i11;
                    pVar.f21931f = androidx.work.e.g(b10.getBlob(i17));
                    int i18 = i15;
                    i11 = i17;
                    int i19 = b25;
                    pVar.f21932g = b10.getLong(i19);
                    int i20 = b22;
                    int i21 = b26;
                    pVar.f21933h = b10.getLong(i21);
                    int i22 = i19;
                    int i23 = b14;
                    int i24 = b27;
                    pVar.f21934i = b10.getLong(i24);
                    int i25 = b28;
                    pVar.f21936k = b10.getInt(i25);
                    int i26 = b29;
                    int i27 = i21;
                    pVar.f21937l = v.d(b10.getInt(i26));
                    b27 = i24;
                    int i28 = i23;
                    int i29 = b30;
                    pVar.f21938m = b10.getLong(i29);
                    int i30 = i25;
                    int i31 = i26;
                    int i32 = b31;
                    pVar.f21939n = b10.getLong(i32);
                    int i33 = i29;
                    b31 = i32;
                    int i34 = b32;
                    pVar.f21940o = b10.getLong(i34);
                    int i35 = i30;
                    int i36 = b33;
                    pVar.f21941p = b10.getLong(i36);
                    int i37 = b34;
                    pVar.f21942q = b10.getInt(i37) != 0;
                    int i38 = b35;
                    int i39 = i36;
                    pVar.f21943r = v.f(b10.getInt(i38));
                    pVar.f21935j = cVar2;
                    arrayList.add(pVar);
                    b35 = i38;
                    b12 = i18;
                    b22 = i20;
                    b25 = i22;
                    b26 = i27;
                    b28 = i35;
                    b33 = i39;
                    b19 = i12;
                    b21 = i13;
                    b11 = i14;
                    b34 = i37;
                    b32 = i34;
                    b13 = i16;
                    int i40 = i31;
                    b30 = i33;
                    b14 = i28;
                    b29 = i40;
                }
                b10.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.u();
            throw th;
        }
    }

    public List<p> g() {
        y0.c cVar;
        y0.c j10 = y0.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            int b11 = a1.b.b(b10, "required_network_type");
            int b12 = a1.b.b(b10, "requires_charging");
            int b13 = a1.b.b(b10, "requires_device_idle");
            int b14 = a1.b.b(b10, "requires_battery_not_low");
            int b15 = a1.b.b(b10, "requires_storage_not_low");
            int b16 = a1.b.b(b10, "trigger_content_update_delay");
            int b17 = a1.b.b(b10, "trigger_max_content_delay");
            int b18 = a1.b.b(b10, "content_uri_triggers");
            int b19 = a1.b.b(b10, "id");
            int b20 = a1.b.b(b10, "state");
            int b21 = a1.b.b(b10, "worker_class_name");
            int b22 = a1.b.b(b10, "input_merger_class_name");
            int b23 = a1.b.b(b10, "input");
            int b24 = a1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = a1.b.b(b10, "initial_delay");
                int b26 = a1.b.b(b10, "interval_duration");
                int b27 = a1.b.b(b10, "flex_duration");
                int b28 = a1.b.b(b10, "run_attempt_count");
                int b29 = a1.b.b(b10, "backoff_policy");
                int b30 = a1.b.b(b10, "backoff_delay_duration");
                int b31 = a1.b.b(b10, "period_start_time");
                int b32 = a1.b.b(b10, "minimum_retention_duration");
                int b33 = a1.b.b(b10, "schedule_requested_at");
                int b34 = a1.b.b(b10, "run_in_foreground");
                int b35 = a1.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f21927b = v.g(b10.getInt(b20));
                    pVar.f21929d = b10.getString(b22);
                    pVar.f21930e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f21931f = androidx.work.e.g(b10.getBlob(i16));
                    int i17 = i14;
                    i10 = i16;
                    int i18 = b25;
                    pVar.f21932g = b10.getLong(i18);
                    int i19 = b23;
                    int i20 = b26;
                    pVar.f21933h = b10.getLong(i20);
                    int i21 = i18;
                    int i22 = b14;
                    int i23 = b27;
                    pVar.f21934i = b10.getLong(i23);
                    int i24 = b28;
                    pVar.f21936k = b10.getInt(i24);
                    int i25 = b29;
                    int i26 = i20;
                    pVar.f21937l = v.d(b10.getInt(i25));
                    b27 = i23;
                    int i27 = i22;
                    int i28 = b30;
                    pVar.f21938m = b10.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = b31;
                    pVar.f21939n = b10.getLong(i31);
                    int i32 = i28;
                    b31 = i31;
                    int i33 = b32;
                    pVar.f21940o = b10.getLong(i33);
                    int i34 = i29;
                    int i35 = b33;
                    pVar.f21941p = b10.getLong(i35);
                    int i36 = b34;
                    pVar.f21942q = b10.getInt(i36) != 0;
                    int i37 = b35;
                    int i38 = i35;
                    pVar.f21943r = v.f(b10.getInt(i37));
                    pVar.f21935j = cVar2;
                    arrayList.add(pVar);
                    b35 = i37;
                    b12 = i17;
                    b23 = i19;
                    b25 = i21;
                    b26 = i26;
                    b28 = i34;
                    b33 = i38;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i36;
                    b32 = i33;
                    b13 = i15;
                    int i39 = i30;
                    b30 = i32;
                    b14 = i27;
                    b29 = i39;
                }
                b10.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.u();
            throw th;
        }
    }

    public void h(String str, androidx.work.e eVar) {
        this.f21952a.b();
        c1.f a10 = this.f21955d.a();
        byte[] n10 = androidx.work.e.n(eVar);
        if (n10 == null) {
            a10.j0(1);
        } else {
            a10.S(1, n10);
        }
        if (str == null) {
            a10.j0(2);
        } else {
            a10.t(2, str);
        }
        this.f21952a.c();
        try {
            a10.w();
            this.f21952a.r();
        } finally {
            this.f21952a.g();
            this.f21955d.f(a10);
        }
    }

    public List<p> i() {
        y0.c cVar;
        y0.c j10 = y0.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            int b11 = a1.b.b(b10, "required_network_type");
            int b12 = a1.b.b(b10, "requires_charging");
            int b13 = a1.b.b(b10, "requires_device_idle");
            int b14 = a1.b.b(b10, "requires_battery_not_low");
            int b15 = a1.b.b(b10, "requires_storage_not_low");
            int b16 = a1.b.b(b10, "trigger_content_update_delay");
            int b17 = a1.b.b(b10, "trigger_max_content_delay");
            int b18 = a1.b.b(b10, "content_uri_triggers");
            int b19 = a1.b.b(b10, "id");
            int b20 = a1.b.b(b10, "state");
            int b21 = a1.b.b(b10, "worker_class_name");
            int b22 = a1.b.b(b10, "input_merger_class_name");
            int b23 = a1.b.b(b10, "input");
            int b24 = a1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = a1.b.b(b10, "initial_delay");
                int b26 = a1.b.b(b10, "interval_duration");
                int b27 = a1.b.b(b10, "flex_duration");
                int b28 = a1.b.b(b10, "run_attempt_count");
                int b29 = a1.b.b(b10, "backoff_policy");
                int b30 = a1.b.b(b10, "backoff_delay_duration");
                int b31 = a1.b.b(b10, "period_start_time");
                int b32 = a1.b.b(b10, "minimum_retention_duration");
                int b33 = a1.b.b(b10, "schedule_requested_at");
                int b34 = a1.b.b(b10, "run_in_foreground");
                int b35 = a1.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f21927b = v.g(b10.getInt(b20));
                    pVar.f21929d = b10.getString(b22);
                    pVar.f21930e = androidx.work.e.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f21931f = androidx.work.e.g(b10.getBlob(i16));
                    int i17 = i14;
                    i10 = i16;
                    int i18 = b25;
                    pVar.f21932g = b10.getLong(i18);
                    int i19 = b23;
                    int i20 = b26;
                    pVar.f21933h = b10.getLong(i20);
                    int i21 = i18;
                    int i22 = b14;
                    int i23 = b27;
                    pVar.f21934i = b10.getLong(i23);
                    int i24 = b28;
                    pVar.f21936k = b10.getInt(i24);
                    int i25 = b29;
                    int i26 = i20;
                    pVar.f21937l = v.d(b10.getInt(i25));
                    b27 = i23;
                    int i27 = i22;
                    int i28 = b30;
                    pVar.f21938m = b10.getLong(i28);
                    int i29 = i24;
                    int i30 = i25;
                    int i31 = b31;
                    pVar.f21939n = b10.getLong(i31);
                    int i32 = i28;
                    b31 = i31;
                    int i33 = b32;
                    pVar.f21940o = b10.getLong(i33);
                    int i34 = i29;
                    int i35 = b33;
                    pVar.f21941p = b10.getLong(i35);
                    int i36 = b34;
                    pVar.f21942q = b10.getInt(i36) != 0;
                    int i37 = b35;
                    int i38 = i35;
                    pVar.f21943r = v.f(b10.getInt(i37));
                    pVar.f21935j = cVar2;
                    arrayList.add(pVar);
                    b35 = i37;
                    b12 = i17;
                    b23 = i19;
                    b25 = i21;
                    b26 = i26;
                    b28 = i34;
                    b33 = i38;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i36;
                    b32 = i33;
                    b13 = i15;
                    int i39 = i30;
                    b30 = i32;
                    b14 = i27;
                    b29 = i39;
                }
                b10.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.u();
            throw th;
        }
    }

    public boolean j() {
        boolean z10 = false;
        y0.c j10 = y0.c.j("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst() && b10.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            b10.close();
            j10.u();
        }
    }

    public List<String> k(String str) {
        y0.c j10 = y0.c.j("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
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

    public y.a l(String str) {
        y0.c j10 = y0.c.j("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21952a.b();
        y.a aVar = null;
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                aVar = v.g(b10.getInt(0));
            }
            return aVar;
        } finally {
            b10.close();
            j10.u();
        }
    }

    public p m(String str) {
        y0.c cVar;
        p pVar;
        String str2 = str;
        y0.c j10 = y0.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            j10.j0(1);
        } else {
            j10.t(1, str2);
        }
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            int b11 = a1.b.b(b10, "required_network_type");
            int b12 = a1.b.b(b10, "requires_charging");
            int b13 = a1.b.b(b10, "requires_device_idle");
            int b14 = a1.b.b(b10, "requires_battery_not_low");
            int b15 = a1.b.b(b10, "requires_storage_not_low");
            int b16 = a1.b.b(b10, "trigger_content_update_delay");
            int b17 = a1.b.b(b10, "trigger_max_content_delay");
            int b18 = a1.b.b(b10, "content_uri_triggers");
            int b19 = a1.b.b(b10, "id");
            int b20 = a1.b.b(b10, "state");
            int b21 = a1.b.b(b10, "worker_class_name");
            int b22 = a1.b.b(b10, "input_merger_class_name");
            int b23 = a1.b.b(b10, "input");
            int b24 = a1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = a1.b.b(b10, "initial_delay");
                int b26 = a1.b.b(b10, "interval_duration");
                int b27 = a1.b.b(b10, "flex_duration");
                int b28 = a1.b.b(b10, "run_attempt_count");
                int b29 = a1.b.b(b10, "backoff_policy");
                int b30 = a1.b.b(b10, "backoff_delay_duration");
                int b31 = a1.b.b(b10, "period_start_time");
                int b32 = a1.b.b(b10, "minimum_retention_duration");
                int b33 = a1.b.b(b10, "schedule_requested_at");
                int b34 = a1.b.b(b10, "run_in_foreground");
                int b35 = a1.b.b(b10, "out_of_quota_policy");
                if (b10.moveToFirst()) {
                    String string = b10.getString(b19);
                    String string2 = b10.getString(b21);
                    int i10 = b35;
                    androidx.work.c cVar2 = new androidx.work.c();
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar2 = new p(string, string2);
                    pVar2.f21927b = v.g(b10.getInt(b20));
                    pVar2.f21929d = b10.getString(b22);
                    pVar2.f21930e = androidx.work.e.g(b10.getBlob(b23));
                    pVar2.f21931f = androidx.work.e.g(b10.getBlob(b24));
                    pVar2.f21932g = b10.getLong(b25);
                    pVar2.f21933h = b10.getLong(b26);
                    pVar2.f21934i = b10.getLong(b27);
                    pVar2.f21936k = b10.getInt(b28);
                    pVar2.f21937l = v.d(b10.getInt(b29));
                    pVar2.f21938m = b10.getLong(b30);
                    pVar2.f21939n = b10.getLong(b31);
                    pVar2.f21940o = b10.getLong(b32);
                    pVar2.f21941p = b10.getLong(b33);
                    pVar2.f21942q = b10.getInt(b34) != 0;
                    pVar2.f21943r = v.f(b10.getInt(i10));
                    pVar2.f21935j = cVar2;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b10.close();
                cVar.u();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.u();
            throw th;
        }
    }

    public int n(String str) {
        this.f21952a.b();
        c1.f a10 = this.f21958g.a();
        if (str == null) {
            a10.j0(1);
        } else {
            a10.t(1, str);
        }
        this.f21952a.c();
        try {
            int w10 = a10.w();
            this.f21952a.r();
            return w10;
        } finally {
            this.f21952a.g();
            this.f21958g.f(a10);
        }
    }

    public List<String> o(String str) {
        y0.c j10 = y0.c.j("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
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

    public List<androidx.work.e> p(String str) {
        y0.c j10 = y0.c.j("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            j10.j0(1);
        } else {
            j10.t(1, str);
        }
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.e.g(b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            j10.u();
        }
    }

    public int q(String str) {
        this.f21952a.b();
        c1.f a10 = this.f21957f.a();
        if (str == null) {
            a10.j0(1);
        } else {
            a10.t(1, str);
        }
        this.f21952a.c();
        try {
            int w10 = a10.w();
            this.f21952a.r();
            return w10;
        } finally {
            this.f21952a.g();
            this.f21957f.f(a10);
        }
    }

    public void r(String str, long j10) {
        this.f21952a.b();
        c1.f a10 = this.f21956e.a();
        a10.N(1, j10);
        if (str == null) {
            a10.j0(2);
        } else {
            a10.t(2, str);
        }
        this.f21952a.c();
        try {
            a10.w();
            this.f21952a.r();
        } finally {
            this.f21952a.g();
            this.f21956e.f(a10);
        }
    }

    public void s(p pVar) {
        this.f21952a.b();
        this.f21952a.c();
        try {
            this.f21953b.h(pVar);
            this.f21952a.r();
        } finally {
            this.f21952a.g();
        }
    }

    public List<p> t(int i10) {
        y0.c cVar;
        y0.c j10 = y0.c.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        j10.N(1, (long) i10);
        this.f21952a.b();
        Cursor b10 = a1.c.b(this.f21952a, j10, false, (CancellationSignal) null);
        try {
            int b11 = a1.b.b(b10, "required_network_type");
            int b12 = a1.b.b(b10, "requires_charging");
            int b13 = a1.b.b(b10, "requires_device_idle");
            int b14 = a1.b.b(b10, "requires_battery_not_low");
            int b15 = a1.b.b(b10, "requires_storage_not_low");
            int b16 = a1.b.b(b10, "trigger_content_update_delay");
            int b17 = a1.b.b(b10, "trigger_max_content_delay");
            int b18 = a1.b.b(b10, "content_uri_triggers");
            int b19 = a1.b.b(b10, "id");
            int b20 = a1.b.b(b10, "state");
            int b21 = a1.b.b(b10, "worker_class_name");
            int b22 = a1.b.b(b10, "input_merger_class_name");
            int b23 = a1.b.b(b10, "input");
            int b24 = a1.b.b(b10, "output");
            cVar = j10;
            try {
                int b25 = a1.b.b(b10, "initial_delay");
                int b26 = a1.b.b(b10, "interval_duration");
                int b27 = a1.b.b(b10, "flex_duration");
                int b28 = a1.b.b(b10, "run_attempt_count");
                int b29 = a1.b.b(b10, "backoff_policy");
                int b30 = a1.b.b(b10, "backoff_delay_duration");
                int b31 = a1.b.b(b10, "period_start_time");
                int b32 = a1.b.b(b10, "minimum_retention_duration");
                int b33 = a1.b.b(b10, "schedule_requested_at");
                int b34 = a1.b.b(b10, "run_in_foreground");
                int b35 = a1.b.b(b10, "out_of_quota_policy");
                int i11 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i12 = b19;
                    String string2 = b10.getString(b21);
                    int i13 = b21;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i14 = b11;
                    cVar2.k(v.e(b10.getInt(b11)));
                    cVar2.m(b10.getInt(b12) != 0);
                    cVar2.n(b10.getInt(b13) != 0);
                    cVar2.l(b10.getInt(b14) != 0);
                    cVar2.o(b10.getInt(b15) != 0);
                    int i15 = b12;
                    int i16 = b13;
                    cVar2.p(b10.getLong(b16));
                    cVar2.q(b10.getLong(b17));
                    cVar2.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f21927b = v.g(b10.getInt(b20));
                    pVar.f21929d = b10.getString(b22);
                    pVar.f21930e = androidx.work.e.g(b10.getBlob(b23));
                    int i17 = i11;
                    pVar.f21931f = androidx.work.e.g(b10.getBlob(i17));
                    int i18 = i15;
                    i11 = i17;
                    int i19 = b25;
                    pVar.f21932g = b10.getLong(i19);
                    int i20 = b22;
                    int i21 = b26;
                    pVar.f21933h = b10.getLong(i21);
                    int i22 = i19;
                    int i23 = b14;
                    int i24 = b27;
                    pVar.f21934i = b10.getLong(i24);
                    int i25 = b28;
                    pVar.f21936k = b10.getInt(i25);
                    int i26 = b29;
                    int i27 = i21;
                    pVar.f21937l = v.d(b10.getInt(i26));
                    b27 = i24;
                    int i28 = i23;
                    int i29 = b30;
                    pVar.f21938m = b10.getLong(i29);
                    int i30 = i25;
                    int i31 = i26;
                    int i32 = b31;
                    pVar.f21939n = b10.getLong(i32);
                    int i33 = i29;
                    b31 = i32;
                    int i34 = b32;
                    pVar.f21940o = b10.getLong(i34);
                    int i35 = i30;
                    int i36 = b33;
                    pVar.f21941p = b10.getLong(i36);
                    int i37 = b34;
                    pVar.f21942q = b10.getInt(i37) != 0;
                    int i38 = b35;
                    int i39 = i36;
                    pVar.f21943r = v.f(b10.getInt(i38));
                    pVar.f21935j = cVar2;
                    arrayList.add(pVar);
                    b35 = i38;
                    b12 = i18;
                    b22 = i20;
                    b25 = i22;
                    b26 = i27;
                    b28 = i35;
                    b33 = i39;
                    b19 = i12;
                    b21 = i13;
                    b11 = i14;
                    b34 = i37;
                    b32 = i34;
                    b13 = i16;
                    int i40 = i31;
                    b30 = i33;
                    b14 = i28;
                    b29 = i40;
                }
                b10.close();
                cVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = j10;
            b10.close();
            cVar.u();
            throw th;
        }
    }

    public int u() {
        this.f21952a.b();
        c1.f a10 = this.f21960i.a();
        this.f21952a.c();
        try {
            int w10 = a10.w();
            this.f21952a.r();
            return w10;
        } finally {
            this.f21952a.g();
            this.f21960i.f(a10);
        }
    }
}
