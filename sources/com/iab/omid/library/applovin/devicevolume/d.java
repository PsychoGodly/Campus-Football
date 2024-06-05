package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27371a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f27372b;

    /* renamed from: c  reason: collision with root package name */
    private final a f27373c;

    /* renamed from: d  reason: collision with root package name */
    private final c f27374d;

    /* renamed from: e  reason: collision with root package name */
    private float f27375e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f27371a = context;
        this.f27372b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f27373c = aVar;
        this.f27374d = cVar;
    }

    private float a() {
        return this.f27373c.a(this.f27372b.getStreamVolume(3), this.f27372b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f27374d.a(this.f27375e);
    }

    public void c() {
        this.f27375e = a();
        b();
        this.f27371a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f27371a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a(a10)) {
            this.f27375e = a10;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f27375e;
    }
}
