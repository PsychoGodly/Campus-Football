package p2;

import android.media.AudioTrack;
import k4.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AudioTrack f36816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f36817b;

    public /* synthetic */ b0(AudioTrack audioTrack, g gVar) {
        this.f36816a = audioTrack;
        this.f36817b = gVar;
    }

    public final void run() {
        c0.Z(this.f36816a, this.f36817b);
    }
}
