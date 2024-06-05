package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import java.util.Map;
import lc.j;
import lc.k;

public class PrintJobChannelDelegate extends ChannelDelegateImpl {
    private PrintJobController printJobController;

    public PrintJobChannelDelegate(PrintJobController printJobController2, k kVar) {
        super(kVar);
        this.printJobController = printJobController2;
    }

    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    c10 = 0;
                    break;
                }
                break;
            case -75444956:
                if (str.equals("getInfo")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1097506319:
                if (str.equals("restart")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                PrintJobController printJobController2 = this.printJobController;
                if (printJobController2 != null) {
                    printJobController2.cancel();
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 1:
                PrintJobController printJobController3 = this.printJobController;
                Map<String, Object> map = null;
                if (printJobController3 != null) {
                    PrintJobInfoExt info = printJobController3.getInfo();
                    if (info != null) {
                        map = info.toMap();
                    }
                    dVar.success(map);
                    return;
                }
                dVar.success((Object) null);
                return;
            case 2:
                PrintJobController printJobController4 = this.printJobController;
                if (printJobController4 != null) {
                    printJobController4.restart();
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 3:
                PrintJobController printJobController5 = this.printJobController;
                if (printJobController5 != null) {
                    printJobController5.dispose();
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
