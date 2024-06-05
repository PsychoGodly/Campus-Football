package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import j1.j;
import j1.k;
import j1.s;

public class TracingControllerManager implements Disposable {
    protected static final String LOG_TAG = "TracingControllerMan";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
    public static k tracingController;
    public TracingControllerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public TracingControllerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new TracingControllerChannelDelegate(this, new lc.k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    public static j buildTracingConfig(TracingSettings tracingSettings) {
        j.a aVar = new j.a();
        for (Object next : tracingSettings.categories) {
            if (next instanceof String) {
                aVar.b((String) next);
            }
            if (next instanceof Integer) {
                aVar.a(((Integer) next).intValue());
            }
        }
        Integer num = tracingSettings.tracingMode;
        if (num != null) {
            aVar.d(num.intValue());
        }
        return aVar.c();
    }

    public static void init() {
        if (tracingController == null && s.a("TRACING_CONTROLLER_BASIC_USAGE")) {
            tracingController = k.a();
        }
    }

    public void dispose() {
        TracingControllerChannelDelegate tracingControllerChannelDelegate = this.channelDelegate;
        if (tracingControllerChannelDelegate != null) {
            tracingControllerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
}
