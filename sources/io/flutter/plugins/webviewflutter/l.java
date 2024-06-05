package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: FlutterAssetManagerHostApiImpl */
public class l implements n.j {

    /* renamed from: a  reason: collision with root package name */
    final k f34299a;

    public l(k kVar) {
        this.f34299a = kVar;
    }

    public String a(String str) {
        return this.f34299a.a(str);
    }

    public List<String> b(String str) {
        try {
            String[] b10 = this.f34299a.b(str);
            if (b10 == null) {
                return new ArrayList();
            }
            return Arrays.asList(b10);
        } catch (IOException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }
}
