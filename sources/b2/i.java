package b2;

import b2.b;
import com.applovin.mediation.MaxReward;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
/* compiled from: EventInternal */
public abstract class i {

    @AutoValue.Builder
    /* compiled from: EventInternal */
    public static abstract class a {
        public final a a(String str, int i10) {
            e().put(str, String.valueOf(i10));
            return this;
        }

        public final a b(String str, long j10) {
            e().put(str, String.valueOf(j10));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract i d();

        /* access modifiers changed from: protected */
        public abstract Map<String, String> e();

        /* access modifiers changed from: protected */
        public abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(h hVar);

        public abstract a i(long j10);

        public abstract a j(String str);

        public abstract a k(long j10);
    }

    public static a a() {
        return new b.C0098b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? MaxReward.DEFAULT_LABEL : str2;
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract String j();

    public abstract long k();

    public a l() {
        return new b.C0098b().j(j()).g(d()).h(e()).i(f()).k(k()).f(new HashMap(c()));
    }
}
