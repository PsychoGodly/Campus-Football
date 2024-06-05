package x9;

import android.webkit.WebView;
import ca.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final l f31226a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f31227b;

    /* renamed from: c  reason: collision with root package name */
    private final List<n> f31228c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, n> f31229d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final String f31230e;

    /* renamed from: f  reason: collision with root package name */
    private final String f31231f;

    /* renamed from: g  reason: collision with root package name */
    private final String f31232g;

    /* renamed from: h  reason: collision with root package name */
    private final e f31233h;

    private d(l lVar, WebView webView, String str, List<n> list, String str2, String str3, e eVar) {
        ArrayList arrayList = new ArrayList();
        this.f31228c = arrayList;
        this.f31226a = lVar;
        this.f31227b = webView;
        this.f31230e = str;
        this.f31233h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            for (n put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f31229d.put(uuid, put);
            }
        }
        this.f31232g = str2;
        this.f31231f = str3;
    }

    public static d a(l lVar, WebView webView, String str, String str2) {
        g.b(lVar, "Partner is null");
        g.b(webView, "WebView is null");
        if (str2 != null) {
            g.c(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(lVar, webView, (String) null, (List<n>) null, str, str2, e.HTML);
    }

    public static d b(l lVar, WebView webView, String str, String str2) {
        g.b(lVar, "Partner is null");
        g.b(webView, "WebView is null");
        if (str2 != null) {
            g.c(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(lVar, webView, (String) null, (List<n>) null, str, str2, e.JAVASCRIPT);
    }

    public e c() {
        return this.f31233h;
    }

    public String d() {
        return this.f31232g;
    }

    public String e() {
        return this.f31231f;
    }

    public Map<String, n> f() {
        return Collections.unmodifiableMap(this.f31229d);
    }

    public String g() {
        return this.f31230e;
    }

    public l h() {
        return this.f31226a;
    }

    public List<n> i() {
        return Collections.unmodifiableList(this.f31228c);
    }

    public WebView j() {
        return this.f31227b;
    }
}
