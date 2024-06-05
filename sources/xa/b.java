package xa;

import com.applovin.mediation.MaxReward;
import java.util.List;
import va.d0;

/* compiled from: BaseReadOperation */
public abstract class b implements e {
    private Boolean i(String str) {
        Object a10 = a(str);
        if (a10 instanceof Boolean) {
            return (Boolean) a10;
        }
        return null;
    }

    private String k() {
        return (String) a("sql");
    }

    private List<Object> l() {
        return (List) a("arguments");
    }

    public d0 b() {
        return new d0(k(), l());
    }

    public boolean c() {
        return Boolean.TRUE.equals(a("noResult"));
    }

    public Integer d() {
        return (Integer) a("transactionId");
    }

    public boolean e() {
        return g("transactionId") && d() == null;
    }

    public Boolean h() {
        return i("inTransaction");
    }

    public boolean j() {
        return Boolean.TRUE.equals(a("continueOnError"));
    }

    public String toString() {
        return MaxReward.DEFAULT_LABEL + f() + " " + k() + " " + l();
    }
}
