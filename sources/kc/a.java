package kc;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.c;
import java.util.HashMap;
import lc.a;
import lc.r;

/* compiled from: AccessibilityChannel */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final lc.a<Object> f35797a;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f35798b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b f35799c;

    /* renamed from: d  reason: collision with root package name */
    public final a.d<Object> f35800d;

    /* renamed from: kc.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityChannel */
    class C0407a implements a.d<Object> {
        C0407a() {
        }

        public void a(Object obj, a.e<Object> eVar) {
            if (a.this.f35799c == null) {
                eVar.a(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get(JsonStorageKeyNames.DATA_KEY);
            xb.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f35799c.e(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f35799c.d(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f35799c.c(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f35799c.f(num2.intValue());
                        break;
                    }
                    break;
                case 4:
                    Integer num3 = (Integer) hashMap.get("nodeId");
                    if (num3 != null) {
                        a.this.f35799c.g(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    /* compiled from: AccessibilityChannel */
    public interface b extends FlutterJNI.a {
        void c(int i10);

        void d(String str);

        void e(String str);

        void f(int i10);

        void g(int i10);
    }

    public a(zb.a aVar, FlutterJNI flutterJNI) {
        C0407a aVar2 = new C0407a();
        this.f35800d = aVar2;
        lc.a<Object> aVar3 = new lc.a<>(aVar, "flutter/accessibility", r.f36128a);
        this.f35797a = aVar3;
        aVar3.e(aVar2);
        this.f35798b = flutterJNI;
    }

    public void b(int i10, c.g gVar) {
        this.f35798b.dispatchSemanticsAction(i10, gVar);
    }

    public void c(int i10, c.g gVar, Object obj) {
        this.f35798b.dispatchSemanticsAction(i10, gVar, obj);
    }

    public void d() {
        this.f35798b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f35798b.setSemanticsEnabled(true);
    }

    public void f(int i10) {
        this.f35798b.setAccessibilityFeatures(i10);
    }

    public void g(b bVar) {
        this.f35799c = bVar;
        this.f35798b.setAccessibilityDelegate(bVar);
    }
}
