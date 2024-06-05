package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class f extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: i  reason: collision with root package name */
    public static int f11593i = -1;

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f11594a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11595b;

    /* renamed from: c  reason: collision with root package name */
    private final k f11596c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f11597d = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f11598f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f11599g;

    /* renamed from: h  reason: collision with root package name */
    private int f11600h;

    public interface a {
        void a(int i10);
    }

    f(k kVar) {
        this.f11596c = kVar;
        Context k10 = k.k();
        this.f11595b = k10;
        this.f11594a = (AudioManager) k10.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void c() {
        this.f11596c.L();
        if (t.a()) {
            this.f11596c.L().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f11595b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int a() {
        return this.f11594a.getRingerMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.applovin.impl.sdk.f.a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11598f
            monitor-enter(r0)
            java.util.Set r1 = r2.f11597d     // Catch:{ all -> 0x001f }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x000d:
            java.util.Set r1 = r2.f11597d     // Catch:{ all -> 0x001f }
            r1.remove(r3)     // Catch:{ all -> 0x001f }
            java.util.Set r3 = r2.f11597d     // Catch:{ all -> 0x001f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001d
            r2.c()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.f.b(com.applovin.impl.sdk.f$a):void");
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f11594a.getRingerMode());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.impl.sdk.f.a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11598f
            monitor-enter(r0)
            java.util.Set r1 = r2.f11597d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.Set r1 = r2.f11597d     // Catch:{ all -> 0x0020 }
            r1.add(r3)     // Catch:{ all -> 0x0020 }
            java.util.Set r3 = r2.f11597d     // Catch:{ all -> 0x0020 }
            int r3 = r3.size()     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r3 != r1) goto L_0x001e
            r2.b()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.f.a(com.applovin.impl.sdk.f$a):void");
    }

    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f11599g = true;
            this.f11600h = this.f11594a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f11599g = false;
            if (this.f11600h != this.f11594a.getRingerMode()) {
                this.f11600h = f11593i;
                b(this.f11594a.getRingerMode());
            }
        }
    }

    private void b() {
        this.f11596c.L();
        if (t.a()) {
            this.f11596c.L().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f11600h = f11593i;
        this.f11595b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(int i10) {
        if (!this.f11599g) {
            this.f11596c.L();
            if (t.a()) {
                t L = this.f11596c.L();
                L.a("AudioSessionManager", "Ringer mode is " + i10);
            }
            synchronized (this.f11598f) {
                for (a g0Var : this.f11597d) {
                    AppLovinSdkUtils.runOnUiThread(new g0(g0Var, i10));
                }
            }
        }
    }
}
