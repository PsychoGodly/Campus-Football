package y6;

import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class l extends Exception {
    @Deprecated
    protected l() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(str);
        q.h(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, Throwable th) {
        super(str, th);
        q.h(str, "Detail message must not be empty");
    }
}
