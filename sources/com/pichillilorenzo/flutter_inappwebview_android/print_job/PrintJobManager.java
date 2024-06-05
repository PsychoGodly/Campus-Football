package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import java.util.HashMap;
import java.util.Map;

public class PrintJobManager implements Disposable {
    protected static final String LOG_TAG = "PrintJobManager";
    public final Map<String, PrintJobController> jobs = new HashMap();
    public InAppWebViewFlutterPlugin plugin;

    public PrintJobManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void dispose() {
        for (PrintJobController next : this.jobs.values()) {
            if (next != null) {
                next.dispose();
            }
        }
        this.jobs.clear();
        this.plugin = null;
    }
}
