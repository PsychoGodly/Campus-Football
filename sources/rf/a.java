package rf;

import android.media.MediaPlayer;
import kotlin.jvm.internal.m;
import pf.o;

/* compiled from: BytesSource.kt */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final o f38024a;

    public a(o oVar) {
        m.e(oVar, "dataSource");
        this.f38024a = oVar;
    }

    public void a(MediaPlayer mediaPlayer) {
        m.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f38024a);
    }

    public void b(qf.m mVar) {
        m.e(mVar, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && m.a(this.f38024a, ((a) obj).f38024a);
    }

    public int hashCode() {
        return this.f38024a.hashCode();
    }

    public String toString() {
        return "BytesSource(dataSource=" + this.f38024a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(byte[] bArr) {
        this(new o(bArr));
        m.e(bArr, "bytes");
    }
}
