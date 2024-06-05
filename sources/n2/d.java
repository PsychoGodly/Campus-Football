package n2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import k4.n0;
import k4.r;
import p2.e;

/* compiled from: AudioFocusManager */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f20252a;

    /* renamed from: b  reason: collision with root package name */
    private final a f20253b;

    /* renamed from: c  reason: collision with root package name */
    private b f20254c;

    /* renamed from: d  reason: collision with root package name */
    private e f20255d;

    /* renamed from: e  reason: collision with root package name */
    private int f20256e;

    /* renamed from: f  reason: collision with root package name */
    private int f20257f;

    /* renamed from: g  reason: collision with root package name */
    private float f20258g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f20259h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20260i;

    /* compiled from: AudioFocusManager */
    private class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f20261a;

        public a(Handler handler) {
            this.f20261a = handler;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            d.this.h(i10);
        }

        public void onAudioFocusChange(int i10) {
            this.f20261a.post(new c(this, i10));
        }
    }

    /* compiled from: AudioFocusManager */
    public interface b {
        void B(float f10);

        void C(int i10);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f20252a = (AudioManager) k4.a.e((AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f20254c = bVar;
        this.f20253b = new a(handler);
        this.f20256e = 0;
    }

    private void a() {
        this.f20252a.abandonAudioFocus(this.f20253b);
    }

    private void b() {
        if (this.f20256e != 0) {
            if (n0.f19738a >= 26) {
                c();
            } else {
                a();
            }
            n(0);
        }
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f20259h;
        if (audioFocusRequest != null) {
            this.f20252a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f21243c) {
            case 0:
                r.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (eVar.f21241a == 1) {
                    return 2;
                }
                break;
            case 16:
                if (n0.f19738a >= 19) {
                    return 4;
                }
                return 2;
            default:
                r.i("AudioFocusManager", "Unidentified audio usage: " + eVar.f21243c);
                return 0;
        }
        return 3;
    }

    private void f(int i10) {
        b bVar = this.f20254c;
        if (bVar != null) {
            bVar.C(i10);
        }
    }

    /* access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || q()) {
                f(0);
                n(2);
                return;
            }
            n(3);
        } else if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 != 1) {
            r.i("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            n(1);
            f(1);
        }
    }

    private int j() {
        if (this.f20256e == 1) {
            return 1;
        }
        if ((n0.f19738a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f20252a.requestAudioFocus(this.f20253b, n0.f0(((e) k4.a.e(this.f20255d)).f21243c), this.f20257f);
    }

    private int l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f20259h;
        if (audioFocusRequest == null || this.f20260i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f20257f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f20259h);
            }
            this.f20259h = builder.setAudioAttributes(((e) k4.a.e(this.f20255d)).b().f21247a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f20253b).build();
            this.f20260i = false;
        }
        return this.f20252a.requestAudioFocus(this.f20259h);
    }

    private void n(int i10) {
        if (this.f20256e != i10) {
            this.f20256e = i10;
            float f10 = i10 == 3 ? 0.2f : 1.0f;
            if (this.f20258g != f10) {
                this.f20258g = f10;
                b bVar = this.f20254c;
                if (bVar != null) {
                    bVar.B(f10);
                }
            }
        }
    }

    private boolean o(int i10) {
        return i10 == 1 || this.f20257f != 1;
    }

    private boolean q() {
        e eVar = this.f20255d;
        return eVar != null && eVar.f21241a == 1;
    }

    public float g() {
        return this.f20258g;
    }

    public void i() {
        this.f20254c = null;
        b();
    }

    public void m(e eVar) {
        if (!n0.c(this.f20255d, eVar)) {
            this.f20255d = eVar;
            int e10 = e(eVar);
            this.f20257f = e10;
            boolean z10 = true;
            if (!(e10 == 1 || e10 == 0)) {
                z10 = false;
            }
            k4.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            if (z10) {
                return 1;
            }
            return -1;
        } else if (z10) {
            return j();
        } else {
            return -1;
        }
    }
}
