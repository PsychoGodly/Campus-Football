package com.unity3d.services.core.device;

import android.util.SparseArray;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.m;

/* compiled from: VolumeChangeMonitor.kt */
public final class VolumeChangeMonitor {
    /* access modifiers changed from: private */
    public final IEventSender eventSender;
    private final VolumeChange volumeChange;
    private final SparseArray<VolumeChangeListener> volumeChangeListeners = new SparseArray<>();

    public VolumeChangeMonitor(IEventSender iEventSender, VolumeChange volumeChange2) {
        m.e(iEventSender, "eventSender");
        m.e(volumeChange2, "volumeChange");
        this.eventSender = iEventSender;
        this.volumeChange = volumeChange2;
    }

    public final void registerVolumeChangeListener(int i10) {
        if (this.volumeChangeListeners.get(i10) == null) {
            VolumeChangeMonitor$registerVolumeChangeListener$listener$1 volumeChangeMonitor$registerVolumeChangeListener$listener$1 = new VolumeChangeMonitor$registerVolumeChangeListener$listener$1(this, i10);
            this.volumeChangeListeners.append(i10, volumeChangeMonitor$registerVolumeChangeListener$listener$1);
            this.volumeChange.registerListener(volumeChangeMonitor$registerVolumeChangeListener$listener$1);
        }
    }

    public final void unregisterVolumeChangeListener(int i10) {
        if (this.volumeChangeListeners.get(i10) != null) {
            VolumeChangeListener volumeChangeListener = this.volumeChangeListeners.get(i10);
            VolumeChange volumeChange2 = this.volumeChange;
            m.d(volumeChangeListener, "listener");
            volumeChange2.unregisterListener(volumeChangeListener);
            this.volumeChangeListeners.remove(i10);
        }
    }
}
