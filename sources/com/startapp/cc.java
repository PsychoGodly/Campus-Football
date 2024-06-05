package com.startapp;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;
import u9.a;

/* compiled from: Sta */
public final class cc extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15711a;

    /* renamed from: b  reason: collision with root package name */
    public final AudioManager f15712b;

    /* renamed from: c  reason: collision with root package name */
    public final lb f15713c;

    /* renamed from: d  reason: collision with root package name */
    public final yb f15714d;

    /* renamed from: e  reason: collision with root package name */
    public float f15715e;

    public cc(Handler handler, Context context, lb lbVar, yb ybVar) {
        super(handler);
        this.f15711a = context;
        this.f15712b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f15713c = lbVar;
        this.f15714d = ybVar;
    }

    public final float a() {
        int streamVolume = this.f15712b.getStreamVolume(3);
        int streamMaxVolume = this.f15712b.getStreamMaxVolume(3);
        this.f15713c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void b() {
        yb ybVar = this.f15714d;
        float f10 = this.f15715e;
        kc kcVar = (kc) ybVar;
        kcVar.f16070a = f10;
        if (kcVar.f16074e == null) {
            kcVar.f16074e = cb.f15708c;
        }
        for (T t10 : Collections.unmodifiableCollection(kcVar.f16074e.f15710b)) {
            a aVar = t10.f15795e;
            ec.f15801a.a(aVar.c(), "setDeviceVolume", Float.valueOf(f10));
        }
    }

    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a10 != this.f15715e) {
            this.f15715e = a10;
            b();
        }
    }
}
