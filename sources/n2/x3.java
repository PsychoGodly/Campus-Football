package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import k4.n0;
import k4.r;

/* compiled from: StreamVolumeManager */
final class x3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20766a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f20767b;

    /* renamed from: c  reason: collision with root package name */
    private final b f20768c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f20769d;

    /* renamed from: e  reason: collision with root package name */
    private c f20770e;

    /* renamed from: f  reason: collision with root package name */
    private int f20771f = 3;

    /* renamed from: g  reason: collision with root package name */
    private int f20772g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20773h;

    /* compiled from: StreamVolumeManager */
    public interface b {
        void E(int i10, boolean z10);

        void d(int i10);
    }

    /* compiled from: StreamVolumeManager */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            x3.this.f20767b.post(new y3(x3.this));
        }
    }

    public x3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20766a = applicationContext;
        this.f20767b = handler;
        this.f20768c = bVar;
        AudioManager audioManager = (AudioManager) k4.a.h((AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f20769d = audioManager;
        this.f20772g = f(audioManager, 3);
        this.f20773h = e(audioManager, this.f20771f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f20770e = cVar;
        } catch (RuntimeException e10) {
            r.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static boolean e(AudioManager audioManager, int i10) {
        if (n0.f19738a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            r.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        int f10 = f(this.f20769d, this.f20771f);
        boolean e10 = e(this.f20769d, this.f20771f);
        if (this.f20772g != f10 || this.f20773h != e10) {
            this.f20772g = f10;
            this.f20773h = e10;
            this.f20768c.E(f10, e10);
        }
    }

    public int c() {
        return this.f20769d.getStreamMaxVolume(this.f20771f);
    }

    public int d() {
        if (n0.f19738a >= 28) {
            return this.f20769d.getStreamMinVolume(this.f20771f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f20770e;
        if (cVar != null) {
            try {
                this.f20766a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                r.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f20770e = null;
        }
    }

    public void h(int i10) {
        if (this.f20771f != i10) {
            this.f20771f = i10;
            i();
            this.f20768c.d(i10);
        }
    }
}
