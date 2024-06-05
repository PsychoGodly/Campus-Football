package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import io.flutter.plugins.webviewflutter.n;
import java.util.Arrays;
import lc.c;

/* compiled from: FileChooserParamsFlutterApiImpl */
public class j extends n.i {

    /* renamed from: b  reason: collision with root package name */
    private final d4 f34278b;

    public j(c cVar, d4 d4Var) {
        super(cVar);
        this.f34278b = d4Var;
    }

    private static n.h f(int i10) {
        if (i10 == 0) {
            return n.h.OPEN;
        }
        if (i10 == 1) {
            return n.h.OPEN_MULTIPLE;
        }
        if (i10 == 3) {
            return n.h.SAVE;
        }
        throw new IllegalArgumentException(String.format("Unsupported FileChooserMode: %d", new Object[]{Integer.valueOf(i10)}));
    }

    public void e(WebChromeClient.FileChooserParams fileChooserParams, n.i.a<Void> aVar) {
        if (!this.f34278b.f(fileChooserParams)) {
            b(Long.valueOf(this.f34278b.c(fileChooserParams)), Boolean.valueOf(fileChooserParams.isCaptureEnabled()), Arrays.asList(fileChooserParams.getAcceptTypes()), f(fileChooserParams.getMode()), fileChooserParams.getFilenameHint(), aVar);
        }
    }
}
