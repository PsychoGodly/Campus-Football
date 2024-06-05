package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzby;
import o5.b;
import o5.c;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class g5 {

    /* renamed from: a  reason: collision with root package name */
    final w5 f24597a;

    g5(va vaVar) {
        this.f24597a = vaVar.d0();
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, zzby zzby) {
        this.f24597a.zzl().i();
        if (zzby == null) {
            this.f24597a.zzj().G().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle zza = zzby.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.f24597a.zzj().B().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e10) {
            this.f24597a.zzj().B().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        try {
            b a10 = c.a(this.f24597a.zza());
            if (a10 == null) {
                this.f24597a.zzj().F().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a10.f("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e10) {
            this.f24597a.zzj().F().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
