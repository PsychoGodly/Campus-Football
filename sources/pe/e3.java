package pe;

import com.applovin.mediation.MaxReward;
import java.util.concurrent.CancellationException;

/* compiled from: Timeout.kt */
public final class e3 extends CancellationException implements i0<e3> {

    /* renamed from: a  reason: collision with root package name */
    public final transient c2 f37299a;

    public e3(String str, c2 c2Var) {
        super(str);
        this.f37299a = c2Var;
    }

    /* renamed from: b */
    public e3 a() {
        String message = getMessage();
        if (message == null) {
            message = MaxReward.DEFAULT_LABEL;
        }
        e3 e3Var = new e3(message, this.f37299a);
        e3Var.initCause(this);
        return e3Var;
    }

    public e3(String str) {
        this(str, (c2) null);
    }
}
