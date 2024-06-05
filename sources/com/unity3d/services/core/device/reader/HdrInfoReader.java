package com.unity3d.services.core.device.reader;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class HdrInfoReader implements IHdrInfoReader {
    private static final AtomicBoolean _hdrMetricsCaptured = new AtomicBoolean(false);
    private static volatile HdrInfoReader _instance;
    private final SDKMetricsSender _sdkMetricsSender = ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class));

    private HdrInfoReader() {
    }

    public static HdrInfoReader getInstance() {
        if (_instance == null) {
            synchronized (HdrInfoReader.class) {
                if (_instance == null) {
                    _instance = new HdrInfoReader();
                }
            }
        }
        return _instance;
    }

    public void captureHDRCapabilityMetrics(Activity activity, ExperimentsReader experimentsReader) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (activity != null && experimentsReader.getCurrentlyActiveExperiments().isCaptureHDRCapabilitiesEnabled()) {
            boolean z14 = false;
            if (_hdrMetricsCaptured.compareAndSet(false, true)) {
                ArrayList arrayList = new ArrayList(5);
                if (Build.VERSION.SDK_INT >= 24) {
                    Display.HdrCapabilities hdrCapabilities = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getHdrCapabilities();
                    boolean z15 = false;
                    z13 = false;
                    z12 = false;
                    z11 = false;
                    for (int i10 : hdrCapabilities.getSupportedHdrTypes()) {
                        if (i10 == 1) {
                            z15 = true;
                        } else if (i10 == 2) {
                            z13 = true;
                        } else if (i10 == 3) {
                            z11 = true;
                        } else if (i10 == 4) {
                            z12 = true;
                        }
                    }
                    long round = (long) Math.round(hdrCapabilities.getDesiredMaxAverageLuminance());
                    long round2 = (long) Math.round(hdrCapabilities.getDesiredMaxLuminance());
                    arrayList.add(new Metric("native_device_hdr_lum_max_average", Long.valueOf(round)));
                    arrayList.add(new Metric("native_device_hdr_lum_max", Long.valueOf(round2)));
                    arrayList.add(new Metric("native_device_hdr_lum_min", Long.valueOf((long) Math.round(hdrCapabilities.getDesiredMinLuminance()))));
                    if (Build.VERSION.SDK_INT >= 26) {
                        z10 = activity.getResources().getConfiguration().isScreenHdr();
                        z14 = z15;
                    } else {
                        z14 = z15;
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                    z12 = false;
                    z11 = false;
                }
                if (z14) {
                    arrayList.add(new Metric("native_device_hdr_dolby_vision_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_dolby_vision_failure"));
                }
                if (z13) {
                    arrayList.add(new Metric("native_device_hdr_hdr10_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hdr10_failure"));
                }
                if (z12) {
                    arrayList.add(new Metric("native_device_hdr_hdr10_plus_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hdr10_plus_failure"));
                }
                if (z11) {
                    arrayList.add(new Metric("native_device_hdr_hlg_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_hlg_failure"));
                }
                if (z10) {
                    arrayList.add(new Metric("native_device_hdr_screen_hdr_success"));
                } else {
                    arrayList.add(new Metric("native_device_hdr_screen_hdr_failure"));
                }
                this._sdkMetricsSender.sendMetrics(arrayList);
            }
        }
    }
}
