package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.c;
import java.util.Calendar;

/* compiled from: TwilightManager */
class u {

    /* renamed from: d  reason: collision with root package name */
    private static u f970d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f971a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f972b;

    /* renamed from: c  reason: collision with root package name */
    private final a f973c = new a();

    /* compiled from: TwilightManager */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f974a;

        /* renamed from: b  reason: collision with root package name */
        long f975b;

        a() {
        }
    }

    u(Context context, LocationManager locationManager) {
        this.f971a = context;
        this.f972b = locationManager;
    }

    static u a(Context context) {
        if (f970d == null) {
            Context applicationContext = context.getApplicationContext();
            f970d = new u(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f970d;
    }

    private Location b() {
        Location location = null;
        Location c10 = c.b(this.f971a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (c.b(this.f971a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c10 == null) ? location != null ? location : c10 : location.getTime() > c10.getTime() ? location : c10;
    }

    private Location c(String str) {
        try {
            if (this.f972b.isProviderEnabled(str)) {
                return this.f972b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f973c.f975b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f973c;
        long currentTimeMillis = System.currentTimeMillis();
        t b10 = t.b();
        t tVar = b10;
        tVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        tVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f969c == 1;
        long j11 = b10.f968b;
        long j12 = b10.f967a;
        long j13 = j11;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j14 = b10.f968b;
        if (j13 == -1 || j12 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j12 ? j14 + 0 : currentTimeMillis > j13 ? j12 + 0 : j13 + 0) + 60000;
        }
        aVar.f974a = z10;
        aVar.f975b = j10;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f973c;
        if (e()) {
            return aVar.f974a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f974a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
