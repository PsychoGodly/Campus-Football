package zc;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import lc.r;

/* compiled from: Messages */
public class a {

    /* renamed from: zc.a$a  reason: collision with other inner class name */
    /* compiled from: Messages */
    public static final class C0470a {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f39527a;

        C0470a() {
        }

        static C0470a a(ArrayList<Object> arrayList) {
            C0470a aVar = new C0470a();
            aVar.c((Boolean) arrayList.get(0));
            return aVar;
        }

        public Boolean b() {
            return this.f39527a;
        }

        public void c(Boolean bool) {
            if (bool != null) {
                this.f39527a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f39527a);
            return arrayList;
        }
    }

    /* compiled from: Messages */
    public static class b extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        public final String f39528a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f39529b;

        public b(String str, String str2, Object obj) {
            super(str2);
            this.f39528a = str;
            this.f39529b = obj;
        }
    }

    /* compiled from: Messages */
    public interface c {
        Boolean a(String str);

        Boolean b();

        void c();

        Boolean d(String str, Map<String, String> map);

        Boolean e(String str, Boolean bool, e eVar, C0470a aVar);
    }

    /* compiled from: Messages */
    private static class d extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final d f39530d = new d();

        private d() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            if (b10 == Byte.MIN_VALUE) {
                return C0470a.a((ArrayList) f(byteBuffer));
            }
            if (b10 != -127) {
                return super.g(b10, byteBuffer);
            }
            return e.a((ArrayList) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C0470a) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((C0470a) obj).d());
            } else if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((e) obj).h());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: Messages */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f39531a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f39532b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, String> f39533c;

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.f((Boolean) arrayList.get(0));
            eVar.e((Boolean) arrayList.get(1));
            eVar.g((Map) arrayList.get(2));
            return eVar;
        }

        public Boolean b() {
            return this.f39532b;
        }

        public Boolean c() {
            return this.f39531a;
        }

        public Map<String, String> d() {
            return this.f39533c;
        }

        public void e(Boolean bool) {
            if (bool != null) {
                this.f39532b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }

        public void f(Boolean bool) {
            if (bool != null) {
                this.f39531a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }

        public void g(Map<String, String> map) {
            if (map != null) {
                this.f39533c = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f39531a);
            arrayList.add(this.f39532b);
            arrayList.add(this.f39533c);
            return arrayList;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof b) {
            b bVar = (b) th;
            arrayList.add(bVar.f39528a);
            arrayList.add(bVar.getMessage());
            arrayList.add(bVar.f39529b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
