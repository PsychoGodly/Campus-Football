package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.applovin.impl.oj;
import com.applovin.impl.x3;
import java.util.concurrent.TimeUnit;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final k f12029a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f12030b = ((LocationManager) k.k().getSystemService("location"));

    /* renamed from: c  reason: collision with root package name */
    private double f12031c;

    /* renamed from: d  reason: collision with root package name */
    private double f12032d;

    /* renamed from: e  reason: collision with root package name */
    private long f12033e;

    s(k kVar) {
        this.f12029a = kVar;
    }

    private boolean f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f12029a.a(oj.J4)).longValue());
        if (this.f12033e != 0 && System.currentTimeMillis() - this.f12033e < millis) {
            return false;
        }
        Location a10 = a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (a10 == null) {
            a10 = a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (a10 == null) {
            return false;
        }
        this.f12031c = a10.getLatitude();
        this.f12032d = a10.getLongitude();
        this.f12033e = System.currentTimeMillis();
        return true;
    }

    public double a() {
        return this.f12031c;
    }

    public double b() {
        return this.f12032d;
    }

    public boolean c() {
        return x3.a("android.permission.ACCESS_COARSE_LOCATION", k.k());
    }

    public boolean d() {
        if (!this.f12029a.g0().isLocationCollectionEnabled() || !((Boolean) this.f12029a.a(oj.I4)).booleanValue() || !c()) {
            return false;
        }
        if (f() || this.f12033e != 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (x3.j()) {
            return this.f12030b.isLocationEnabled();
        }
        if (!x3.e() || Settings.Secure.getInt(k.k().getContentResolver(), "location_mode", 0) != 0) {
            return true;
        }
        return false;
    }

    private Location a(String str, String str2) {
        if (!x3.a(str2, k.k())) {
            return null;
        }
        try {
            return this.f12030b.getLastKnownLocation(str);
        } catch (SecurityException e10) {
            this.f12029a.L();
            if (t.a()) {
                t L = this.f12029a.L();
                L.a("LocationManager", "Failed to retrieve location from " + str + ": access denied.", e10);
            }
            return null;
        } catch (IllegalArgumentException e11) {
            this.f12029a.L();
            if (t.a()) {
                t L2 = this.f12029a.L();
                L2.a("LocationManager", "Failed to retrieve location from " + str + ": device does not support this location provider.", e11);
            }
            return null;
        } catch (NullPointerException e12) {
            this.f12029a.L();
            if (t.a()) {
                t L3 = this.f12029a.L();
                L3.a("LocationManager", "Failed to retrieve location from " + str + ": location provider is not available.", e12);
            }
            return null;
        } catch (Throwable th) {
            this.f12029a.L();
            if (t.a()) {
                t L4 = this.f12029a.L();
                L4.a("LocationManager", "Failed to retrieve location from " + str + ".", th);
            }
            return null;
        }
    }
}
