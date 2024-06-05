package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import j1.s;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.Executors;
import lc.j;
import lc.k;

public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager2, k kVar) {
        super(kVar);
        this.tracingControllerManager = tracingControllerManager2;
    }

    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        FileOutputStream fileOutputStream;
        TracingControllerManager.init();
        j1.k kVar = TracingControllerManager.tracingController;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1647175624:
                if (str.equals("isTracing")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c10 = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (kVar != null) {
                    dVar.success(Boolean.valueOf(kVar.b()));
                    return;
                } else {
                    dVar.success(Boolean.FALSE);
                    return;
                }
            case 1:
                if (kVar == null || !s.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    dVar.success(Boolean.FALSE);
                    return;
                }
                String str2 = (String) jVar.a("filePath");
                if (str2 != null) {
                    try {
                        fileOutputStream = new FileOutputStream(str2);
                    } catch (FileNotFoundException e10) {
                        e10.printStackTrace();
                        dVar.success(Boolean.FALSE);
                        return;
                    }
                } else {
                    fileOutputStream = null;
                }
                dVar.success(Boolean.valueOf(kVar.d(fileOutputStream, Executors.newSingleThreadExecutor())));
                return;
            case 2:
                if (kVar == null || !s.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    dVar.success(Boolean.FALSE);
                    return;
                }
                TracingSettings tracingSettings = new TracingSettings();
                tracingSettings.parse((Map) jVar.a("settings"));
                kVar.c(TracingControllerManager.buildTracingConfig(tracingSettings));
                dVar.success(Boolean.TRUE);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
