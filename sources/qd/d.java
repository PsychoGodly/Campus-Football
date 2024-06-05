package qd;

import com.applovin.mediation.MaxReward;
import java.util.UUID;
import kotlin.jvm.internal.m;
import ne.e;

/* compiled from: Random.kt */
public final class d {
    public static final String a() {
        return new e("-").a(b(), MaxReward.DEFAULT_LABEL);
    }

    public static final String b() {
        String uuid = UUID.randomUUID().toString();
        m.d(uuid, "randomUUID().toString()");
        return uuid;
    }
}
