package qb;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import lc.r;

/* compiled from: Messages */
public class a {

    /* renamed from: qb.a$a  reason: collision with other inner class name */
    /* compiled from: Messages */
    public static class C0425a {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f37476a;

        static C0425a a(Map<String, Object> map) {
            C0425a aVar = new C0425a();
            aVar.f37476a = (Boolean) map.get("enabled");
            return aVar;
        }

        public void b(Boolean bool) {
            this.f37476a = bool;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("enabled", this.f37476a);
            return hashMap;
        }
    }

    /* compiled from: Messages */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f37477a;

        static b a(Map<String, Object> map) {
            b bVar = new b();
            bVar.f37477a = (Boolean) map.get("enable");
            return bVar;
        }

        public Boolean b() {
            return this.f37477a;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("enable", this.f37477a);
            return hashMap;
        }
    }

    /* compiled from: Messages */
    public interface c {
        void a(b bVar);

        C0425a isEnabled();
    }

    /* compiled from: Messages */
    private static class d extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final d f37478d = new d();

        private d() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            if (b10 == Byte.MIN_VALUE) {
                return C0425a.a((Map) f(byteBuffer));
            }
            if (b10 != -127) {
                return super.g(b10, byteBuffer);
            }
            return b.a((Map) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C0425a) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((C0425a) obj).c());
            } else if (obj instanceof b) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((b) obj).c());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", (Object) null);
        return hashMap;
    }
}
