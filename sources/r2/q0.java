package r2;

import android.util.Pair;
import java.util.Map;

/* compiled from: WidevineUtil */
public final class q0 {
    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> b(o oVar) {
        Map<String, String> d10 = oVar.d();
        if (d10 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(d10, "LicenseDurationRemaining")), Long.valueOf(a(d10, "PlaybackDurationRemaining")));
    }
}
