package com.onesignal;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.onesignal.k3;

/* compiled from: HMSLocationController */
class b0 extends g0 {

    /* renamed from: j  reason: collision with root package name */
    private static FusedLocationProviderClient f27557j;

    /* renamed from: k  reason: collision with root package name */
    static c f27558k;

    /* compiled from: HMSLocationController */
    class a implements OnFailureListener {
        a() {
        }
    }

    /* compiled from: HMSLocationController */
    class b implements OnSuccessListener<Location> {
        b() {
        }
    }

    /* compiled from: HMSLocationController */
    static class c extends LocationCallback {

        /* renamed from: a  reason: collision with root package name */
        private FusedLocationProviderClient f27559a;

        c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.f27559a = fusedLocationProviderClient;
            a();
        }

        private void a() {
            long j10 = k3.h1() ? 270000 : 570000;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j10).setInterval(j10).setMaxWaitTime((long) (((double) j10) * 1.5d)).setPriority(102);
            k3.a(k3.r0.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            this.f27559a.requestLocationUpdates(priority, this, g0.h().getLooper());
        }
    }

    static void e() {
        synchronized (g0.f27800d) {
            f27557j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void l() {
        /*
            java.lang.Object r0 = com.onesignal.g0.f27800d
            monitor-enter(r0)
            com.onesignal.k3$r0 r1 = com.onesignal.k3.r0.DEBUG     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "HMSLocationController onFocusChange!"
            com.onesignal.k3.a(r1, r2)     // Catch:{ all -> 0x002c }
            boolean r1 = com.onesignal.g0.k()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0016
            com.huawei.hms.location.FusedLocationProviderClient r1 = f27557j     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x0016:
            com.huawei.hms.location.FusedLocationProviderClient r1 = f27557j     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            com.onesignal.b0$c r2 = f27558k     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x0021
            r1.removeLocationUpdates(r2)     // Catch:{ all -> 0x002c }
        L_0x0021:
            com.onesignal.b0$c r1 = new com.onesignal.b0$c     // Catch:{ all -> 0x002c }
            com.huawei.hms.location.FusedLocationProviderClient r2 = f27557j     // Catch:{ all -> 0x002c }
            r1.<init>(r2)     // Catch:{ all -> 0x002c }
            f27558k = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.b0.l():void");
    }

    static void p() {
        q();
    }

    private static void q() {
        synchronized (g0.f27800d) {
            if (f27557j == null) {
                try {
                    f27557j = LocationServices.getFusedLocationProviderClient(g0.f27803g);
                } catch (Exception e10) {
                    k3.r0 r0Var = k3.r0.ERROR;
                    k3.a(r0Var, "Huawei LocationServices getFusedLocationProviderClient failed! " + e10);
                    e();
                    return;
                }
            }
            Location location = g0.f27804h;
            if (location != null) {
                g0.d(location);
            } else {
                f27557j.getLastLocation().addOnSuccessListener(new b()).addOnFailureListener(new a());
            }
        }
    }
}
