package l4;

import android.view.Surface;
import e3.m;
import e3.n;

/* compiled from: MediaCodecVideoDecoderException */
public class g extends m {

    /* renamed from: c  reason: collision with root package name */
    public final int f19936c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19937d;

    public g(Throwable th, n nVar, Surface surface) {
        super(th, nVar);
        this.f19936c = System.identityHashCode(surface);
        this.f19937d = surface == null || surface.isValid();
    }
}
