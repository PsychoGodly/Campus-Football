package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;

final class fl {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7821a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f7822b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7823c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f7824d;

    /* renamed from: e  reason: collision with root package name */
    private c f7825e;

    /* renamed from: f  reason: collision with root package name */
    private int f7826f = 3;

    /* renamed from: g  reason: collision with root package name */
    private int f7827g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7828h;

    public interface b {
        void a(int i10, boolean z10);

        void d(int i10);
    }

    private final class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            fl.this.f7822b.post(new cx(fl.this));
        }
    }

    public fl(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7821a = applicationContext;
        this.f7822b = handler;
        this.f7823c = bVar;
        AudioManager audioManager = (AudioManager) a1.b((Object) (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f7824d = audioManager;
        this.f7827g = b(audioManager, 3);
        this.f7828h = a(audioManager, this.f7826f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f7825e = cVar;
        } catch (RuntimeException e10) {
            kc.c("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        int b10 = b(this.f7824d, this.f7826f);
        boolean a10 = a(this.f7824d, this.f7826f);
        if (this.f7827g != b10 || this.f7828h != a10) {
            this.f7827g = b10;
            this.f7828h = a10;
            this.f7823c.a(b10, a10);
        }
    }

    public void c() {
        c cVar = this.f7825e;
        if (cVar != null) {
            try {
                this.f7821a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                kc.c("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f7825e = null;
        }
    }

    private static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            kc.c("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public int a() {
        return this.f7824d.getStreamMaxVolume(this.f7826f);
    }

    public void a(int i10) {
        if (this.f7826f != i10) {
            this.f7826f = i10;
            d();
            this.f7823c.d(i10);
        }
    }

    public int b() {
        if (yp.f13662a >= 28) {
            return this.f7824d.getStreamMinVolume(this.f7826f);
        }
        return 0;
    }

    private static boolean a(AudioManager audioManager, int i10) {
        if (yp.f13662a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return b(audioManager, i10) == 0;
    }
}
