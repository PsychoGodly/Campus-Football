package com.applovin.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;

final class n1 {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f9876a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9877b;

    /* renamed from: c  reason: collision with root package name */
    private b f9878c;

    /* renamed from: d  reason: collision with root package name */
    private k1 f9879d;

    /* renamed from: e  reason: collision with root package name */
    private int f9880e;

    /* renamed from: f  reason: collision with root package name */
    private int f9881f;

    /* renamed from: g  reason: collision with root package name */
    private float f9882g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f9883h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9884i;

    private class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f9885a;

        public a(Handler handler) {
            this.f9885a = handler;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            n1.this.b(i10);
        }

        public void onAudioFocusChange(int i10) {
            this.f9885a.post(new jz(this, i10));
        }
    }

    public interface b {
        void b(float f10);

        void f(int i10);
    }

    public n1(Context context, Handler handler, b bVar) {
        this.f9876a = (AudioManager) a1.a((Object) (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f9878c = bVar;
        this.f9877b = new a(handler);
        this.f9880e = 0;
    }

    private void a() {
        this.f9876a.abandonAudioFocus(this.f9877b);
    }

    private void b() {
        if (this.f9880e != 0) {
            if (yp.f13662a >= 26) {
                c();
            } else {
                a();
            }
            c(0);
        }
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f9883h;
        if (audioFocusRequest != null) {
            this.f9876a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private int f() {
        if (this.f9880e == 1) {
            return 1;
        }
        if ((yp.f13662a >= 26 ? h() : g()) == 1) {
            c(1);
            return 1;
        }
        c(0);
        return -1;
    }

    private int g() {
        return this.f9876a.requestAudioFocus(this.f9877b, yp.e(((k1) a1.a((Object) this.f9879d)).f8855c), this.f9881f);
    }

    private int h() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f9883h;
        if (audioFocusRequest == null || this.f9884i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f9881f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f9883h);
            }
            this.f9883h = builder.setAudioAttributes(((k1) a1.a((Object) this.f9879d)).a()).setWillPauseWhenDucked(i()).setOnAudioFocusChangeListener(this.f9877b).build();
            this.f9884i = false;
        }
        return this.f9876a.requestAudioFocus(this.f9883h);
    }

    private boolean i() {
        k1 k1Var = this.f9879d;
        return k1Var != null && k1Var.f8853a == 1;
    }

    public float d() {
        return this.f9882g;
    }

    public void e() {
        this.f9878c = null;
        b();
    }

    private boolean d(int i10) {
        return i10 == 1 || this.f9881f != 1;
    }

    private static int a(k1 k1Var) {
        if (k1Var == null) {
            return 0;
        }
        switch (k1Var.f8855c) {
            case 0:
                kc.d("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                if (k1Var.f8853a == 1) {
                    return 2;
                }
                break;
            case 16:
                if (yp.f13662a >= 19) {
                    return 4;
                }
                return 2;
            default:
                kc.d("AudioFocusManager", "Unidentified audio usage: " + k1Var.f8855c);
                return 0;
        }
        return 3;
    }

    private void c(int i10) {
        if (this.f9880e != i10) {
            this.f9880e = i10;
            float f10 = i10 == 3 ? 0.2f : 1.0f;
            if (this.f9882g != f10) {
                this.f9882g = f10;
                b bVar = this.f9878c;
                if (bVar != null) {
                    bVar.b(f10);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || i()) {
                a(0);
                c(2);
                return;
            }
            c(3);
        } else if (i10 == -1) {
            a(-1);
            b();
        } else if (i10 != 1) {
            kc.d("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            c(1);
            a(1);
        }
    }

    private void a(int i10) {
        b bVar = this.f9878c;
        if (bVar != null) {
            bVar.f(i10);
        }
    }

    public int a(boolean z10, int i10) {
        if (d(i10)) {
            b();
            if (z10) {
                return 1;
            }
            return -1;
        } else if (z10) {
            return f();
        } else {
            return -1;
        }
    }

    public void b(k1 k1Var) {
        if (!yp.a((Object) this.f9879d, (Object) k1Var)) {
            this.f9879d = k1Var;
            int a10 = a(k1Var);
            this.f9881f = a10;
            boolean z10 = true;
            if (!(a10 == 1 || a10 == 0)) {
                z10 = false;
            }
            a1.a(z10, (Object) "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }
}
