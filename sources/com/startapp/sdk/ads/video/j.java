package com.startapp.sdk.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* compiled from: Sta */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public Context f16679a;

    /* renamed from: b  reason: collision with root package name */
    public URL f16680b;

    /* renamed from: c  reason: collision with root package name */
    public String f16681c;

    /* renamed from: d  reason: collision with root package name */
    public b f16682d;

    /* renamed from: e  reason: collision with root package name */
    public d.a f16683e;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16684a;

        public a(String str) {
            this.f16684a = str;
        }

        public void run() {
            b bVar = j.this.f16682d;
            if (bVar != null) {
                bVar.a(this.f16684a);
            }
        }
    }

    /* compiled from: Sta */
    public interface b {
        void a(String str);
    }

    public j(Context context, URL url, String str, b bVar, d.a aVar) {
        this.f16679a = context;
        this.f16680b = url;
        this.f16681c = str;
        this.f16682d = bVar;
        this.f16683e = aVar;
    }

    public void a() {
        String str;
        try {
            str = AdsCommonMetaData.f16770h.G().p() ? d.b.f16664a.a(this.f16679a, this.f16680b, this.f16681c, this.f16683e) : VideoUtil.a(this.f16679a, this.f16680b, this.f16681c);
        } catch (Exception unused) {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new a(str));
    }
}
