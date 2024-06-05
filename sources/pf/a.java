package pf;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import java.util.Objects;
import kotlin.jvm.internal.m;

/* compiled from: AudioContextAndroid.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37417a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37418b;

    /* renamed from: c  reason: collision with root package name */
    private final int f37419c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37420d;

    /* renamed from: e  reason: collision with root package name */
    private final int f37421e;

    /* renamed from: f  reason: collision with root package name */
    private final int f37422f;

    public a(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        this.f37417a = z10;
        this.f37418b = z11;
        this.f37419c = i10;
        this.f37420d = i11;
        this.f37421e = i12;
        this.f37422f = i13;
    }

    public static /* synthetic */ a c(a aVar, boolean z10, boolean z11, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z10 = aVar.f37417a;
        }
        if ((i14 & 2) != 0) {
            z11 = aVar.f37418b;
        }
        boolean z12 = z11;
        if ((i14 & 4) != 0) {
            i10 = aVar.f37419c;
        }
        int i15 = i10;
        if ((i14 & 8) != 0) {
            i11 = aVar.f37420d;
        }
        int i16 = i11;
        if ((i14 & 16) != 0) {
            i12 = aVar.f37421e;
        }
        int i17 = i12;
        if ((i14 & 32) != 0) {
            i13 = aVar.f37422f;
        }
        return aVar.b(z10, z12, i15, i16, i17, i13);
    }

    private final int g() {
        int i10 = this.f37420d;
        if (i10 != 2) {
            return i10 != 6 ? 3 : 2;
        }
        return 0;
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f37420d).setContentType(this.f37419c).build();
        m.d(build, "Builder()\n            .s…ype)\n            .build()");
        return build;
    }

    public final a b(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        return new a(z10, z11, i10, i11, i12, i13);
    }

    public final int d() {
        return this.f37421e;
    }

    public final int e() {
        return this.f37422f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f37417a == aVar.f37417a && this.f37418b == aVar.f37418b && this.f37419c == aVar.f37419c && this.f37420d == aVar.f37420d && this.f37421e == aVar.f37421e && this.f37422f == aVar.f37422f;
        }
    }

    public final boolean f() {
        return this.f37418b;
    }

    public final boolean h() {
        return this.f37417a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f37417a), Boolean.valueOf(this.f37418b), Integer.valueOf(this.f37419c), Integer.valueOf(this.f37420d), Integer.valueOf(this.f37421e), Integer.valueOf(this.f37422f)});
    }

    public final void i(MediaPlayer mediaPlayer) {
        m.e(mediaPlayer, "player");
        if (Build.VERSION.SDK_INT >= 21) {
            mediaPlayer.setAudioAttributes(a());
        } else {
            mediaPlayer.setAudioStreamType(g());
        }
    }

    public String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f37417a + ", stayAwake=" + this.f37418b + ", contentType=" + this.f37419c + ", usageType=" + this.f37420d + ", audioFocus=" + this.f37421e + ", audioMode=" + this.f37422f + ')';
    }

    public a() {
        this(false, false, 2, 1, 1, 0);
    }
}
