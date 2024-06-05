package com.unity3d.services.core.device;

import com.unity3d.services.core.webview.WebViewEventCategory;

/* compiled from: VolumeChangeMonitor.kt */
public final class VolumeChangeMonitor$registerVolumeChangeListener$listener$1 implements VolumeChangeListener {
    final /* synthetic */ int $streamType;
    final /* synthetic */ VolumeChangeMonitor this$0;

    VolumeChangeMonitor$registerVolumeChangeListener$listener$1(VolumeChangeMonitor volumeChangeMonitor, int i10) {
        this.this$0 = volumeChangeMonitor;
        this.$streamType = i10;
    }

    public int getStreamType() {
        return this.$streamType;
    }

    public void onVolumeChanged(int i10) {
        this.this$0.eventSender.sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i10), Integer.valueOf(Device.getStreamMaxVolume(this.$streamType)));
    }
}
