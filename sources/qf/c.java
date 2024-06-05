package qf;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import kotlin.jvm.internal.m;
import pf.a;
import sd.w;

/* compiled from: FocusManager.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final o f37736a;

    /* renamed from: b  reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f37737b;

    /* renamed from: c  reason: collision with root package name */
    private AudioFocusRequest f37738c;

    public c(o oVar) {
        m.e(oVar, "player");
        this.f37736a = oVar;
    }

    private final AudioManager c() {
        return this.f37736a.g();
    }

    private final a d() {
        return this.f37736a.h();
    }

    private final void e(int i10, fe.a<w> aVar) {
        if (i10 == 1) {
            aVar.invoke();
        }
    }

    private final void h(fe.a<w> aVar) {
        AudioFocusRequest build = new AudioFocusRequest.Builder(d().d()).setAudioAttributes(d().a()).setOnAudioFocusChangeListener(new b(this, aVar)).build();
        this.f37738c = build;
        e(c().requestAudioFocus(build), aVar);
    }

    /* access modifiers changed from: private */
    public static final void i(c cVar, fe.a aVar, int i10) {
        m.e(cVar, "this$0");
        m.e(aVar, "$andThen");
        cVar.e(i10, aVar);
    }

    private final void j(fe.a<w> aVar) {
        int d10 = d().d();
        this.f37737b = new a(this, aVar);
        e(c().requestAudioFocus(this.f37737b, 3, d10), aVar);
    }

    /* access modifiers changed from: private */
    public static final void k(c cVar, fe.a aVar, int i10) {
        m.e(cVar, "this$0");
        m.e(aVar, "$andThen");
        cVar.e(i10, aVar);
    }

    public final void f() {
        if (d().d() == 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.f37738c;
            if (audioFocusRequest != null) {
                c().abandonAudioFocusRequest(audioFocusRequest);
                return;
            }
            return;
        }
        c().abandonAudioFocus(this.f37737b);
    }

    public final void g(fe.a<w> aVar) {
        m.e(aVar, "andThen");
        if (d().d() == 0) {
            aVar.invoke();
        } else if (Build.VERSION.SDK_INT >= 26) {
            h(aVar);
        } else {
            j(aVar);
        }
    }
}
