package uc;

import android.util.Log;
import io.flutter.plugins.googlemobileads.l0;

/* compiled from: FlutterNativeTemplateType */
public enum d {
    SMALL(l0.small_template_view_layout),
    MEDIUM(l0.medium_template_view_layout);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f38764a;

    private d(int i10) {
        this.f38764a = i10;
    }

    public static d a(int i10) {
        if (i10 >= 0 && i10 < values().length) {
            return values()[i10];
        }
        Log.w("NativeTemplateType", "Invalid template type index: " + i10);
        return MEDIUM;
    }

    public int c() {
        return this.f38764a;
    }
}
