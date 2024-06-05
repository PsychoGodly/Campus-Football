package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;

/* compiled from: AudioFocusRequestCompat */
public class a {

    /* renamed from: g  reason: collision with root package name */
    static final AudioAttributesCompat f4002g = new AudioAttributesCompat.a().e(1).a();

    /* renamed from: a  reason: collision with root package name */
    private final int f4003a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f4004b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f4005c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioAttributesCompat f4006d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4007e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f4008f;

    /* renamed from: androidx.media.a$a  reason: collision with other inner class name */
    /* compiled from: AudioFocusRequestCompat */
    private static class C0065a {
        static AudioFocusRequest a(int i10, AudioAttributes audioAttributes, boolean z10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i10).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* compiled from: AudioFocusRequestCompat */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f4009a;

        /* renamed from: b  reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f4010b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f4011c;

        /* renamed from: d  reason: collision with root package name */
        private AudioAttributesCompat f4012d = a.f4002g;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4013e;

        public b(int i10) {
            d(i10);
        }

        private static boolean b(int i10) {
            return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }

        public a a() {
            if (this.f4010b != null) {
                return new a(this.f4009a, this.f4010b, this.f4011c, this.f4012d, this.f4013e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            Objects.requireNonNull(audioAttributesCompat, "Illegal null AudioAttributes");
            this.f4012d = audioAttributesCompat;
            return this;
        }

        public b d(int i10) {
            if (b(i10)) {
                if (Build.VERSION.SDK_INT < 19 && i10 == 4) {
                    i10 = 2;
                }
                this.f4009a = i10;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i10);
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            } else if (handler != null) {
                this.f4010b = onAudioFocusChangeListener;
                this.f4011c = handler;
                return this;
            } else {
                throw new IllegalArgumentException("Handler must not be null");
            }
        }

        public b g(boolean z10) {
            this.f4013e = z10;
            return this;
        }
    }

    /* compiled from: AudioFocusRequestCompat */
    private static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f4014a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f4015b;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f4015b = onAudioFocusChangeListener;
            this.f4014a = new Handler(handler.getLooper(), this);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.f4015b.onAudioFocusChange(message.arg1);
            return true;
        }

        public void onAudioFocusChange(int i10) {
            Handler handler = this.f4014a;
            handler.sendMessage(Message.obtain(handler, 2782386, i10, 0));
        }
    }

    a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z10) {
        this.f4003a = i10;
        this.f4005c = handler;
        this.f4006d = audioAttributesCompat;
        this.f4007e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f4004b = onAudioFocusChangeListener;
        } else {
            this.f4004b = new c(onAudioFocusChangeListener, handler);
        }
        if (i11 >= 26) {
            this.f4008f = C0065a.a(i10, a(), z10, this.f4004b, handler);
        } else {
            this.f4008f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f4006d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.d();
        }
        return null;
    }

    public AudioAttributesCompat b() {
        return this.f4006d;
    }

    /* access modifiers changed from: package-private */
    public AudioFocusRequest c() {
        return (AudioFocusRequest) this.f4008f;
    }

    public int d() {
        return this.f4003a;
    }

    public AudioManager.OnAudioFocusChangeListener e() {
        return this.f4004b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4003a != aVar.f4003a || this.f4007e != aVar.f4007e || !androidx.core.util.c.a(this.f4004b, aVar.f4004b) || !androidx.core.util.c.a(this.f4005c, aVar.f4005c) || !androidx.core.util.c.a(this.f4006d, aVar.f4006d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return androidx.core.util.c.b(Integer.valueOf(this.f4003a), this.f4004b, this.f4005c, this.f4006d, Boolean.valueOf(this.f4007e));
    }
}
