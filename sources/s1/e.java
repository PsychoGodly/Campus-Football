package s1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import c1.b;
import r1.d;

/* compiled from: PreferenceUtils */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f22301a;

    public e(WorkDatabase workDatabase) {
        this.f22301a = workDatabase;
    }

    public static void b(Context context, b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j10 = 1;
            }
            bVar.k();
            try {
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                bVar.O();
            } finally {
                bVar.a0();
            }
        }
    }

    public boolean a() {
        Long b10 = this.f22301a.x().b("reschedule_needed");
        return b10 != null && b10.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f22301a.x().a(new d("reschedule_needed", z10));
    }
}
