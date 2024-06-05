package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: FlutterRequestAgentProvider */
class c0 {

    /* renamed from: a  reason: collision with root package name */
    private String f33942a;

    /* renamed from: b  reason: collision with root package name */
    private String f33943b;

    c0(Context context) {
        b(context);
    }

    private void b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.f33943b = bundle.getString("io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION");
                this.f33942a = applicationInfo.metaData.getString("io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION");
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Flutter-GMA-3.1.0");
        if (this.f33942a != null) {
            sb2.append("_");
            sb2.append("News");
            sb2.append("-");
            sb2.append(this.f33942a);
        }
        if (this.f33943b != null) {
            sb2.append("_");
            sb2.append("Game");
            sb2.append("-");
            sb2.append(this.f33943b);
        }
        return sb2.toString();
    }
}
