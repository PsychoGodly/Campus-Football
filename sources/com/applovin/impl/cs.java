package com.applovin.impl;

import android.util.Pair;
import java.util.Map;

public abstract class cs {
    private static long a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair a(x6 x6Var) {
        Map d10 = x6Var.d();
        if (d10 == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(d10, "LicenseDurationRemaining")), Long.valueOf(a(d10, "PlaybackDurationRemaining")));
    }
}
