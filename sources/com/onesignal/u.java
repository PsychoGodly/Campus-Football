package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.onesignal.k3;

/* compiled from: GMSLocationController */
class u extends g0 {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static z f28211j;

    /* renamed from: k  reason: collision with root package name */
    static d f28212k;

    /* compiled from: GMSLocationController */
    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Thread.sleep((long) u.s());
                k3.a(k3.r0.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                g0.e();
                g0.m(g0.f27803g);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* compiled from: GMSLocationController */
    static class b {
        static Location a(GoogleApiClient googleApiClient) {
            synchronized (g0.f27800d) {
                if (!googleApiClient.g()) {
                    return null;
                }
                Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
                return lastLocation;
            }
        }

        static void b(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            try {
                synchronized (g0.f27800d) {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if (googleApiClient.g()) {
                        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
                    }
                }
            } catch (Throwable th) {
                k3.b(k3.r0.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }
    }

    /* compiled from: GMSLocationController */
    private static class c implements GoogleApiClient.b, GoogleApiClient.c {
        private c() {
        }

        public void onConnected(Bundle bundle) {
            synchronized (g0.f27800d) {
                if (u.f28211j != null) {
                    if (u.f28211j.c() != null) {
                        k3.r0 r0Var = k3.r0.DEBUG;
                        k3.a(r0Var, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + g0.f27804h);
                        if (g0.f27804h == null) {
                            g0.f27804h = b.a(u.f28211j.c());
                            k3.a(r0Var, "GMSLocationController GoogleApiClientListener lastLocation: " + g0.f27804h);
                            Location location = g0.f27804h;
                            if (location != null) {
                                g0.d(location);
                            }
                        }
                        u.f28212k = new d(u.f28211j.c());
                        return;
                    }
                }
                k3.a(k3.r0.DEBUG, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
            }
        }

        public void onConnectionFailed(h5.b bVar) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + bVar);
            u.e();
        }

        public void onConnectionSuspended(int i10) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i10);
            u.e();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: GMSLocationController */
    static class d implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        private GoogleApiClient f28213a;

        d(GoogleApiClient googleApiClient) {
            this.f28213a = googleApiClient;
            a();
        }

        private void a() {
            long j10 = k3.h1() ? 270000 : 570000;
            if (this.f28213a != null) {
                LocationRequest priority = LocationRequest.create().setFastestInterval(j10).setInterval(j10).setMaxWaitTime((long) (((double) j10) * 1.5d)).setPriority(102);
                k3.a(k3.r0.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                b.b(this.f28213a, priority, this);
            }
        }
    }

    static void e() {
        synchronized (g0.f27800d) {
            z zVar = f28211j;
            if (zVar != null) {
                zVar.b();
            }
            f28211j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void l() {
        /*
            java.lang.Object r0 = com.onesignal.g0.f27800d
            monitor-enter(r0)
            com.onesignal.k3$r0 r1 = com.onesignal.k3.r0.DEBUG     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "GMSLocationController onFocusChange!"
            com.onesignal.k3.a(r1, r2)     // Catch:{ all -> 0x0037 }
            com.onesignal.z r1 = f28211j     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.c()     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.g()     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0019
            goto L_0x0035
        L_0x0019:
            com.onesignal.z r1 = f28211j     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.c()     // Catch:{ all -> 0x0037 }
            com.onesignal.u$d r2 = f28212k     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.location.FusedLocationProviderApi r2 = com.google.android.gms.location.LocationServices.FusedLocationApi     // Catch:{ all -> 0x0037 }
            com.onesignal.u$d r3 = f28212k     // Catch:{ all -> 0x0037 }
            r2.removeLocationUpdates(r1, r3)     // Catch:{ all -> 0x0037 }
        L_0x002c:
            com.onesignal.u$d r2 = new com.onesignal.u$d     // Catch:{ all -> 0x0037 }
            r2.<init>(r1)     // Catch:{ all -> 0x0037 }
            f28212k = r2     // Catch:{ all -> 0x0037 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.u.l():void");
    }

    static void p() {
        t();
    }

    /* access modifiers changed from: private */
    public static int s() {
        return 30000;
    }

    private static void t() {
        if (g0.f27802f == null) {
            synchronized (g0.f27800d) {
                u();
                if (f28211j != null) {
                    Location location = g0.f27804h;
                    if (location != null) {
                        g0.d(location);
                    }
                }
                c cVar = new c((a) null);
                z zVar = new z(new GoogleApiClient.a(g0.f27803g).a(LocationServices.API).b(cVar).c(cVar).e(g0.h().f27806a).d());
                f28211j = zVar;
                zVar.a();
            }
        }
    }

    private static void u() {
        Thread thread = new Thread(new a(), "OS_GMS_LOCATION_FALLBACK");
        g0.f27802f = thread;
        thread.start();
    }
}
