package com.onesignal;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.i;
import java.util.List;

/* compiled from: OneSignalChromeTab */
class p3 {

    /* compiled from: OneSignalChromeTab */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private String f28086a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f28087b;

        a(String str, boolean z10) {
            this.f28086a = str;
            this.f28087b = z10;
        }

        public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            cVar.g(0);
            i e10 = cVar.e((b) null);
            if (e10 != null) {
                Uri parse = Uri.parse(this.f28086a);
                e10.i(parse, (Bundle) null, (List<Bundle>) null);
                if (this.f28087b) {
                    d b10 = new d.b(e10).b();
                    b10.f1921a.setData(parse);
                    b10.f1921a.addFlags(268435456);
                    if (Build.VERSION.SDK_INT >= 16) {
                        k3.f27912f.startActivity(b10.f1921a, b10.f1922b);
                    } else {
                        k3.f27912f.startActivity(b10.f1921a);
                    }
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static boolean a() {
        Class<e> cls = e.class;
        return true;
    }

    protected static boolean b(String str, boolean z10) {
        if (!a()) {
            return false;
        }
        return c.a(k3.f27912f, "com.android.chrome", new a(str, z10));
    }
}
