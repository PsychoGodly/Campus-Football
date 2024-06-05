package io.flutter.plugin.platform;

import android.content.Context;
import lc.i;

/* compiled from: PlatformViewFactory */
public abstract class g {
    private final i<Object> createArgsCodec;

    public g(i<Object> iVar) {
        this.createArgsCodec = iVar;
    }

    public abstract f create(Context context, int i10, Object obj);

    public final i<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
