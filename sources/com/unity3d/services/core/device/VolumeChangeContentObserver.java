package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: VolumeChangeContentObserver.kt */
public final class VolumeChangeContentObserver implements VolumeChange {
    private ContentObserver contentObserver;
    private List<VolumeChangeListener> listeners = new ArrayList();

    /* access modifiers changed from: private */
    public final synchronized void triggerListeners() {
        for (VolumeChangeListener next : this.listeners) {
            next.onVolumeChanged(Device.getStreamVolume(next.getStreamType()));
        }
    }

    public synchronized void clearAllListeners() {
        this.listeners.clear();
        stopObserving();
    }

    public synchronized void registerListener(VolumeChangeListener volumeChangeListener) {
        m.e(volumeChangeListener, "volumeChangeListener");
        if (!this.listeners.contains(volumeChangeListener)) {
            startObserving();
            this.listeners.add(volumeChangeListener);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void startObserving() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.database.ContentObserver r0 = r5.contentObserver     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0032 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0032 }
            r0.<init>(r1)     // Catch:{ all -> 0x0032 }
            com.unity3d.services.core.device.VolumeChangeContentObserver$startObserving$1 r1 = new com.unity3d.services.core.device.VolumeChangeContentObserver$startObserving$1     // Catch:{ all -> 0x0032 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x0032 }
            r5.contentObserver = r1     // Catch:{ all -> 0x0032 }
            android.content.Context r0 = com.unity3d.services.core.properties.ClientProperties.getApplicationContext()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            android.net.Uri r1 = android.provider.Settings.System.CONTENT_URI     // Catch:{ all -> 0x0032 }
            r2 = 1
            android.database.ContentObserver r3 = r5.contentObserver     // Catch:{ all -> 0x0032 }
            java.lang.String r4 = "null cannot be cast to non-null type android.database.ContentObserver"
            kotlin.jvm.internal.m.c(r3, r4)     // Catch:{ all -> 0x0032 }
            r0.registerContentObserver(r1, r2, r3)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r5)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.VolumeChangeContentObserver.startObserving():void");
    }

    public synchronized void stopObserving() {
        ContentResolver contentResolver;
        if (this.contentObserver != null) {
            Context applicationContext = ClientProperties.getApplicationContext();
            if (!(applicationContext == null || (contentResolver = applicationContext.getContentResolver()) == null)) {
                ContentObserver contentObserver2 = this.contentObserver;
                m.b(contentObserver2);
                contentResolver.unregisterContentObserver(contentObserver2);
            }
            this.contentObserver = null;
        }
    }

    public synchronized void unregisterListener(VolumeChangeListener volumeChangeListener) {
        m.e(volumeChangeListener, "volumeChangeListener");
        this.listeners.remove(volumeChangeListener);
        if (this.listeners.isEmpty()) {
            stopObserving();
        }
    }
}
