package y9;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f31426a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f31427b;

    /* renamed from: c  reason: collision with root package name */
    private final a f31428c;

    /* renamed from: d  reason: collision with root package name */
    private final c f31429d;

    /* renamed from: e  reason: collision with root package name */
    private float f31430e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f31426a = context;
        this.f31427b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f31428c = aVar;
        this.f31429d = cVar;
    }

    private float a() {
        return this.f31428c.a(this.f31427b.getStreamVolume(3), this.f31427b.getStreamMaxVolume(3));
    }

    private boolean b(float f10) {
        return f10 != this.f31430e;
    }

    private void c() {
        this.f31429d.a(this.f31430e);
    }

    public void d() {
        this.f31430e = a();
        c();
        this.f31426a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.f31426a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (b(a10)) {
            this.f31430e = a10;
            c();
        }
    }
}
