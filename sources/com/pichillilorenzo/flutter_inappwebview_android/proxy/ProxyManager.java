package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import j1.c;
import j1.d;
import j1.s;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import lc.j;
import lc.k;

public class ProxyManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static d proxyController;
    public InAppWebViewFlutterPlugin plugin;

    public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    private void clearProxyOverride(final k.d dVar) {
        d dVar2 = proxyController;
        if (dVar2 != null) {
            dVar2.a(new Executor() {
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() {
                public void run() {
                    dVar.success(Boolean.TRUE);
                }
            });
        }
    }

    public static void init() {
        if (proxyController == null && s.a("PROXY_OVERRIDE")) {
            proxyController = d.b();
        }
    }

    private void setProxyOverride(ProxySettings proxySettings, final k.d dVar) {
        if (proxyController != null) {
            c.a aVar = new c.a();
            for (String a10 : proxySettings.bypassRules) {
                aVar.a(a10);
            }
            for (String b10 : proxySettings.directs) {
                aVar.b(b10);
            }
            for (ProxyRuleExt next : proxySettings.proxyRules) {
                if (next.getSchemeFilter() != null) {
                    aVar.d(next.getUrl(), next.getSchemeFilter());
                } else {
                    aVar.c(next.getUrl());
                }
            }
            Boolean bool = proxySettings.bypassSimpleHostnames;
            if (bool != null && bool.booleanValue()) {
                aVar.g();
            }
            Boolean bool2 = proxySettings.removeImplicitRules;
            if (bool2 != null && bool2.booleanValue()) {
                aVar.i();
            }
            if (proxySettings.reverseBypassEnabled != null && s.a("PROXY_OVERRIDE_REVERSE_BYPASS")) {
                aVar.k(proxySettings.reverseBypassEnabled.booleanValue());
            }
            proxyController.c(aVar.e(), new Executor() {
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() {
                public void run() {
                    dVar.success(Boolean.TRUE);
                }
            });
        }
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        init();
        String str = jVar.f36116a;
        str.hashCode();
        if (!str.equals("clearProxyOverride")) {
            if (!str.equals("setProxyOverride")) {
                dVar.notImplemented();
            } else if (proxyController != null) {
                HashMap hashMap = (HashMap) jVar.a("settings");
                ProxySettings proxySettings = new ProxySettings();
                if (hashMap != null) {
                    proxySettings.parse((Map) hashMap);
                }
                setProxyOverride(proxySettings, dVar);
            } else {
                dVar.success(Boolean.FALSE);
            }
        } else if (proxyController != null) {
            clearProxyOverride(dVar);
        } else {
            dVar.success(Boolean.FALSE);
        }
    }
}
