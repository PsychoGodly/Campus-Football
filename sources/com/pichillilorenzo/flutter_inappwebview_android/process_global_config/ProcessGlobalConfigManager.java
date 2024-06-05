package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import androidx.webkit.ProcessGlobalConfig;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.util.Map;
import lc.j;
import lc.k;

public class ProcessGlobalConfigManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProcessGlobalConfigM";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_processglobalconfig";
    public InAppWebViewFlutterPlugin plugin;

    public ProcessGlobalConfigManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        if (!str.equals("apply")) {
            dVar.notImplemented();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
            dVar.success(Boolean.FALSE);
            return;
        }
        try {
            ProcessGlobalConfig.a(new ProcessGlobalConfigSettings().parse((Map) jVar.a("settings")).toProcessGlobalConfig(this.plugin.activity));
            dVar.success(Boolean.TRUE);
        } catch (Exception e10) {
            dVar.error(LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
        }
    }
}
