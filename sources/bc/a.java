package bc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ApplicationInfoLoader */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f31613a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f31614b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f31615c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f31616d;

    static {
        Class<f> cls = f.class;
        f31613a = cls.getName() + '.' + "aot-shared-library-name";
        f31614b = cls.getName() + '.' + "vm-snapshot-data";
        f31615c = cls.getName() + '.' + "isolate-snapshot-data";
        f31616d = cls.getName() + '.' + "flutter-assets-dir";
    }

    private static ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean b(Bundle bundle, String str, boolean z10) {
        return bundle == null ? z10 : bundle.getBoolean(str, z10);
    }

    private static String c(ApplicationInfo applicationInfo, Context context) {
        int i10;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i10 = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2 && xml.getName().equals("domain-config")) {
                    g(xml, jSONArray, false);
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    private static String d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, (String) null);
    }

    public static b e(Context context) {
        ApplicationInfo a10 = a(context);
        return new b(d(a10.metaData, f31613a), d(a10.metaData, f31614b), d(a10.metaData, f31615c), d(a10.metaData, f31616d), c(a10, context), a10.nativeLibraryDir, b(a10.metaData, "io.flutter.automatically-register-plugins", true));
    }

    private static void f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z10) throws IOException, XmlPullParserException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() == 4) {
            String trim = xmlResourceParser.getText().trim();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(trim);
            jSONArray2.put(attributeBooleanValue);
            jSONArray2.put(z10);
            jSONArray.put(jSONArray2);
            xmlResourceParser.next();
            if (xmlResourceParser.getEventType() != 3) {
                throw new IllegalStateException("Expected end of domain tag");
            }
            return;
        }
        throw new IllegalStateException("Expected text");
    }

    private static void g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z10) throws IOException, XmlPullParserException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "cleartextTrafficPermitted", z10);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    private static void h(XmlResourceParser xmlResourceParser) throws IOException, XmlPullParserException {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType != 3 || xmlResourceParser.getName() != name) {
                eventType = xmlResourceParser.next();
            } else {
                return;
            }
        }
    }
}
