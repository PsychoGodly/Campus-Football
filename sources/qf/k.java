package qf;

import android.media.SoundPool;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f37746a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f37747b;

    public /* synthetic */ k(l lVar, n nVar) {
        this.f37746a = lVar;
        this.f37747b = nVar;
    }

    public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
        l.c(this.f37746a, this.f37747b, soundPool, i10, i11);
    }
}
