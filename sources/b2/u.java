package b2;

import android.content.Context;
import j2.d;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: TransportRuntimeComponent */
abstract class u implements Closeable {

    /* compiled from: TransportRuntimeComponent */
    interface a {
        a a(Context context);

        u build();
    }

    u() {
    }

    public void close() throws IOException {
        h().close();
    }

    /* access modifiers changed from: package-private */
    public abstract d h();

    /* access modifiers changed from: package-private */
    public abstract t i();
}
