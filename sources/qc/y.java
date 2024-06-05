package qc;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: GeneratedAndroidFirebaseFirestore */
public class y {

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private d f37622a;

        /* renamed from: b  reason: collision with root package name */
        private String f37623b;

        a() {
        }

        static a a(ArrayList<Object> arrayList) {
            a aVar = new a();
            aVar.e(d.values()[((Integer) arrayList.get(0)).intValue()]);
            aVar.d((String) arrayList.get(1));
            return aVar;
        }

        public String b() {
            return this.f37623b;
        }

        public d c() {
            return this.f37622a;
        }

        public void d(String str) {
            this.f37623b = str;
        }

        public void e(d dVar) {
            if (dVar != null) {
                this.f37622a = dVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            d dVar = this.f37622a;
            arrayList.add(dVar == null ? null : Integer.valueOf(dVar.f37637a));
            arrayList.add(this.f37623b);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f37624a;

        /* renamed from: b  reason: collision with root package name */
        private String f37625b;

        /* renamed from: c  reason: collision with root package name */
        private Double f37626c;

        /* compiled from: GeneratedAndroidFirebaseFirestore */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private d f37627a;

            /* renamed from: b  reason: collision with root package name */
            private String f37628b;

            /* renamed from: c  reason: collision with root package name */
            private Double f37629c;

            public b a() {
                b bVar = new b();
                bVar.c(this.f37627a);
                bVar.b(this.f37628b);
                bVar.d(this.f37629c);
                return bVar;
            }

            public a b(String str) {
                this.f37628b = str;
                return this;
            }

            public a c(d dVar) {
                this.f37627a = dVar;
                return this;
            }

            public a d(Double d10) {
                this.f37629c = d10;
                return this;
            }
        }

        b() {
        }

        static b a(ArrayList<Object> arrayList) {
            b bVar = new b();
            bVar.c(d.values()[((Integer) arrayList.get(0)).intValue()]);
            bVar.b((String) arrayList.get(1));
            bVar.d((Double) arrayList.get(2));
            return bVar;
        }

        public void b(String str) {
            this.f37625b = str;
        }

        public void c(d dVar) {
            if (dVar != null) {
                this.f37624a = dVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        public void d(Double d10) {
            if (d10 != null) {
                this.f37626c = d10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"value\" is null.");
        }

        public ArrayList<Object> e() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            d dVar = this.f37624a;
            arrayList.add(dVar == null ? null : Integer.valueOf(dVar.f37637a));
            arrayList.add(this.f37625b);
            arrayList.add(this.f37626c);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public enum c {
        SERVER(0);
        

        /* renamed from: a  reason: collision with root package name */
        final int f37632a;

        private c(int i10) {
            this.f37632a = i10;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public enum d {
        COUNT(0),
        SUM(1),
        AVERAGE(2);
        

        /* renamed from: a  reason: collision with root package name */
        final int f37637a;

        private d(int i10) {
            this.f37637a = i10;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public enum e {
        ADDED(0),
        MODIFIED(1),
        REMOVED(2);
        

        /* renamed from: a  reason: collision with root package name */
        final int f37642a;

        private e(int i10) {
            this.f37642a = i10;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private String f37643a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Object, Object> f37644b;

        /* renamed from: c  reason: collision with root package name */
        private l f37645c;

        /* renamed from: d  reason: collision with root package name */
        private x f37646d;

        /* renamed from: e  reason: collision with root package name */
        private w f37647e;

        f() {
        }

        static f a(ArrayList<Object> arrayList) {
            l lVar;
            x xVar;
            f fVar = new f();
            fVar.i((String) arrayList.get(0));
            fVar.g((Map) arrayList.get(1));
            Object obj = arrayList.get(2);
            w wVar = null;
            if (obj == null) {
                lVar = null;
            } else {
                lVar = l.a((ArrayList) obj);
            }
            fVar.h(lVar);
            Object obj2 = arrayList.get(3);
            if (obj2 == null) {
                xVar = null;
            } else {
                xVar = x.values()[((Integer) obj2).intValue()];
            }
            fVar.k(xVar);
            Object obj3 = arrayList.get(4);
            if (obj3 != null) {
                wVar = w.values()[((Integer) obj3).intValue()];
            }
            fVar.j(wVar);
            return fVar;
        }

        public Map<Object, Object> b() {
            return this.f37644b;
        }

        public l c() {
            return this.f37645c;
        }

        public String d() {
            return this.f37643a;
        }

        public w e() {
            return this.f37647e;
        }

        public x f() {
            return this.f37646d;
        }

        public void g(Map<Object, Object> map) {
            this.f37644b = map;
        }

        public void h(l lVar) {
            this.f37645c = lVar;
        }

        public void i(String str) {
            if (str != null) {
                this.f37643a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }

        public void j(w wVar) {
            this.f37647e = wVar;
        }

        public void k(x xVar) {
            this.f37646d = xVar;
        }

        public ArrayList<Object> l() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f37643a);
            arrayList.add(this.f37644b);
            l lVar = this.f37645c;
            Integer num = null;
            arrayList.add(lVar == null ? null : lVar.f());
            x xVar = this.f37646d;
            arrayList.add(xVar == null ? null : Integer.valueOf(xVar.f37719a));
            w wVar = this.f37647e;
            if (wVar != null) {
                num = Integer.valueOf(wVar.f37714a);
            }
            arrayList.add(num);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public interface g {
        void a(i iVar, List<s> list, v<Void> vVar);

        void b(String str, t tVar, List<s> list, v<Void> vVar);

        void c(i iVar, String str, v<Void> vVar);

        void d(i iVar, String str, o oVar, v<q> vVar);

        void e(i iVar, v<String> vVar);

        void f(i iVar, v<Void> vVar);

        void g(i iVar, String str, String str2, v<m> vVar);

        void h(i iVar, v<Void> vVar);

        void i(i iVar, f fVar, v<Void> vVar);

        void j(i iVar, v<Void> vVar);

        void k(Boolean bool, v<Void> vVar);

        void l(i iVar, f fVar, v<Void> vVar);

        void m(i iVar, f fVar, v<Void> vVar);

        void n(i iVar, String str, Boolean bool, p pVar, o oVar, v<q> vVar);

        void o(i iVar, v<Void> vVar);

        void p(i iVar, byte[] bArr, v<String> vVar);

        void q(i iVar, v<Void> vVar);

        void r(i iVar, f fVar, Boolean bool, v<String> vVar);

        void s(i iVar, Long l10, Long l11, v<String> vVar);

        void t(i iVar, f fVar, v<m> vVar);

        void u(i iVar, String str, p pVar, c cVar, List<a> list, Boolean bool, v<List<b>> vVar);

        void v(i iVar, String str, Boolean bool, p pVar, o oVar, Boolean bool2, v<String> vVar);
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    private static class h extends c {

        /* renamed from: e  reason: collision with root package name */
        public static final h f37648e = new h();

        private h() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return a.a((ArrayList) f(byteBuffer));
                case -127:
                    return b.a((ArrayList) f(byteBuffer));
                case -126:
                    return f.a((ArrayList) f(byteBuffer));
                case -125:
                    return i.a((ArrayList) f(byteBuffer));
                case -124:
                    return k.a((ArrayList) f(byteBuffer));
                case -123:
                    return l.a((ArrayList) f(byteBuffer));
                case -122:
                    return m.a((ArrayList) f(byteBuffer));
                case -121:
                    return n.a((ArrayList) f(byteBuffer));
                case -120:
                    return o.a((ArrayList) f(byteBuffer));
                case -119:
                    return p.a((ArrayList) f(byteBuffer));
                case -118:
                    return q.a((ArrayList) f(byteBuffer));
                case -117:
                    return r.a((ArrayList) f(byteBuffer));
                case -116:
                    return s.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof a) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((a) obj).f());
            } else if (obj instanceof b) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((b) obj).e());
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((f) obj).l());
            } else if (obj instanceof i) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((i) obj).h());
            } else if (obj instanceof k) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((k) obj).f());
            } else if (obj instanceof l) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((l) obj).f());
            } else if (obj instanceof m) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((m) obj).e());
            } else if (obj instanceof n) {
                byteArrayOutputStream.write(135);
                p(byteArrayOutputStream, ((n) obj).k());
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(136);
                p(byteArrayOutputStream, ((o) obj).f());
            } else if (obj instanceof p) {
                byteArrayOutputStream.write(137);
                p(byteArrayOutputStream, ((p) obj).t());
            } else if (obj instanceof q) {
                byteArrayOutputStream.write(138);
                p(byteArrayOutputStream, ((q) obj).e());
            } else if (obj instanceof r) {
                byteArrayOutputStream.write(139);
                p(byteArrayOutputStream, ((r) obj).d());
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(140);
                p(byteArrayOutputStream, ((s) obj).j());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        private String f37649a;

        /* renamed from: b  reason: collision with root package name */
        private n f37650b;

        /* renamed from: c  reason: collision with root package name */
        private String f37651c;

        i() {
        }

        static i a(ArrayList<Object> arrayList) {
            n nVar;
            i iVar = new i();
            iVar.e((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            if (obj == null) {
                nVar = null;
            } else {
                nVar = n.a((ArrayList) obj);
            }
            iVar.g(nVar);
            iVar.f((String) arrayList.get(2));
            return iVar;
        }

        public String b() {
            return this.f37649a;
        }

        public String c() {
            return this.f37651c;
        }

        public n d() {
            return this.f37650b;
        }

        public void e(String str) {
            if (str != null) {
                this.f37649a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appName\" is null.");
        }

        public void f(String str) {
            if (str != null) {
                this.f37651c = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
        }

        public void g(n nVar) {
            if (nVar != null) {
                this.f37650b = nVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"settings\" is null.");
        }

        public ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f37649a);
            n nVar = this.f37650b;
            arrayList.add(nVar == null ? null : nVar.k());
            arrayList.add(this.f37651c);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static class j extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        public final String f37652a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f37653b;

        public j(String str, String str2, Object obj) {
            super(str2);
            this.f37652a = str;
            this.f37653b = obj;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        private e f37654a;

        /* renamed from: b  reason: collision with root package name */
        private m f37655b;

        /* renamed from: c  reason: collision with root package name */
        private Long f37656c;

        /* renamed from: d  reason: collision with root package name */
        private Long f37657d;

        /* compiled from: GeneratedAndroidFirebaseFirestore */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private e f37658a;

            /* renamed from: b  reason: collision with root package name */
            private m f37659b;

            /* renamed from: c  reason: collision with root package name */
            private Long f37660c;

            /* renamed from: d  reason: collision with root package name */
            private Long f37661d;

            public k a() {
                k kVar = new k();
                kVar.e(this.f37658a);
                kVar.b(this.f37659b);
                kVar.d(this.f37660c);
                kVar.c(this.f37661d);
                return kVar;
            }

            public a b(m mVar) {
                this.f37659b = mVar;
                return this;
            }

            public a c(Long l10) {
                this.f37661d = l10;
                return this;
            }

            public a d(Long l10) {
                this.f37660c = l10;
                return this;
            }

            public a e(e eVar) {
                this.f37658a = eVar;
                return this;
            }
        }

        k() {
        }

        static k a(ArrayList<Object> arrayList) {
            m mVar;
            Long l10;
            k kVar = new k();
            kVar.e(e.values()[((Integer) arrayList.get(0)).intValue()]);
            Object obj = arrayList.get(1);
            Long l11 = null;
            if (obj == null) {
                mVar = null;
            } else {
                mVar = m.a((ArrayList) obj);
            }
            kVar.b(mVar);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            kVar.d(l10);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                l11 = Long.valueOf(obj3 instanceof Integer ? (long) ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            kVar.c(l11);
            return kVar;
        }

        public void b(m mVar) {
            if (mVar != null) {
                this.f37655b = mVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"document\" is null.");
        }

        public void c(Long l10) {
            if (l10 != null) {
                this.f37657d = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
        }

        public void d(Long l10) {
            if (l10 != null) {
                this.f37656c = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
        }

        public void e(e eVar) {
            if (eVar != null) {
                this.f37654a = eVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            e eVar = this.f37654a;
            ArrayList<Object> arrayList2 = null;
            arrayList.add(eVar == null ? null : Integer.valueOf(eVar.f37642a));
            m mVar = this.f37655b;
            if (mVar != null) {
                arrayList2 = mVar.e();
            }
            arrayList.add(arrayList2);
            arrayList.add(this.f37656c);
            arrayList.add(this.f37657d);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f37662a;

        /* renamed from: b  reason: collision with root package name */
        private List<List<String>> f37663b;

        static l a(ArrayList<Object> arrayList) {
            l lVar = new l();
            lVar.d((Boolean) arrayList.get(0));
            lVar.e((List) arrayList.get(1));
            return lVar;
        }

        public Boolean b() {
            return this.f37662a;
        }

        public List<List<String>> c() {
            return this.f37663b;
        }

        public void d(Boolean bool) {
            this.f37662a = bool;
        }

        public void e(List<List<String>> list) {
            this.f37663b = list;
        }

        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f37662a);
            arrayList.add(this.f37663b);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class m {

        /* renamed from: a  reason: collision with root package name */
        private String f37664a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Object> f37665b;

        /* renamed from: c  reason: collision with root package name */
        private r f37666c;

        /* compiled from: GeneratedAndroidFirebaseFirestore */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f37667a;

            /* renamed from: b  reason: collision with root package name */
            private Map<String, Object> f37668b;

            /* renamed from: c  reason: collision with root package name */
            private r f37669c;

            public m a() {
                m mVar = new m();
                mVar.d(this.f37667a);
                mVar.b(this.f37668b);
                mVar.c(this.f37669c);
                return mVar;
            }

            public a b(Map<String, Object> map) {
                this.f37668b = map;
                return this;
            }

            public a c(r rVar) {
                this.f37669c = rVar;
                return this;
            }

            public a d(String str) {
                this.f37667a = str;
                return this;
            }
        }

        m() {
        }

        static m a(ArrayList<Object> arrayList) {
            r rVar;
            m mVar = new m();
            mVar.d((String) arrayList.get(0));
            mVar.b((Map) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                rVar = null;
            } else {
                rVar = r.a((ArrayList) obj);
            }
            mVar.c(rVar);
            return mVar;
        }

        public void b(Map<String, Object> map) {
            this.f37665b = map;
        }

        public void c(r rVar) {
            if (rVar != null) {
                this.f37666c = rVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"metadata\" is null.");
        }

        public void d(String str) {
            if (str != null) {
                this.f37664a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }

        public ArrayList<Object> e() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f37664a);
            arrayList.add(this.f37665b);
            r rVar = this.f37666c;
            arrayList.add(rVar == null ? null : rVar.d());
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class n {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f37670a;

        /* renamed from: b  reason: collision with root package name */
        private String f37671b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f37672c;

        /* renamed from: d  reason: collision with root package name */
        private Long f37673d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f37674e;

        n() {
        }

        static n a(ArrayList<Object> arrayList) {
            Long l10;
            long j10;
            n nVar = new n();
            nVar.i((Boolean) arrayList.get(0));
            nVar.g((String) arrayList.get(1));
            nVar.j((Boolean) arrayList.get(2));
            Object obj = arrayList.get(3);
            if (obj == null) {
                l10 = null;
            } else {
                if (obj instanceof Integer) {
                    j10 = (long) ((Integer) obj).intValue();
                } else {
                    j10 = ((Long) obj).longValue();
                }
                l10 = Long.valueOf(j10);
            }
            nVar.f(l10);
            nVar.h((Boolean) arrayList.get(4));
            return nVar;
        }

        public Long b() {
            return this.f37673d;
        }

        public String c() {
            return this.f37671b;
        }

        public Boolean d() {
            return this.f37670a;
        }

        public Boolean e() {
            return this.f37672c;
        }

        public void f(Long l10) {
            this.f37673d = l10;
        }

        public void g(String str) {
            this.f37671b = str;
        }

        public void h(Boolean bool) {
            if (bool != null) {
                this.f37674e = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
        }

        public void i(Boolean bool) {
            this.f37670a = bool;
        }

        public void j(Boolean bool) {
            this.f37672c = bool;
        }

        public ArrayList<Object> k() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f37670a);
            arrayList.add(this.f37671b);
            arrayList.add(this.f37672c);
            arrayList.add(this.f37673d);
            arrayList.add(this.f37674e);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class o {

        /* renamed from: a  reason: collision with root package name */
        private x f37675a;

        /* renamed from: b  reason: collision with root package name */
        private w f37676b;

        o() {
        }

        static o a(ArrayList<Object> arrayList) {
            o oVar = new o();
            oVar.e(x.values()[((Integer) arrayList.get(0)).intValue()]);
            oVar.d(w.values()[((Integer) arrayList.get(1)).intValue()]);
            return oVar;
        }

        public w b() {
            return this.f37676b;
        }

        public x c() {
            return this.f37675a;
        }

        public void d(w wVar) {
            if (wVar != null) {
                this.f37676b = wVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"serverTimestampBehavior\" is null.");
        }

        public void e(x xVar) {
            if (xVar != null) {
                this.f37675a = xVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"source\" is null.");
        }

        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            x xVar = this.f37675a;
            Integer num = null;
            arrayList.add(xVar == null ? null : Integer.valueOf(xVar.f37719a));
            w wVar = this.f37676b;
            if (wVar != null) {
                num = Integer.valueOf(wVar.f37714a);
            }
            arrayList.add(num);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class p {

        /* renamed from: a  reason: collision with root package name */
        private List<List<Object>> f37677a;

        /* renamed from: b  reason: collision with root package name */
        private List<List<Object>> f37678b;

        /* renamed from: c  reason: collision with root package name */
        private Long f37679c;

        /* renamed from: d  reason: collision with root package name */
        private Long f37680d;

        /* renamed from: e  reason: collision with root package name */
        private List<Object> f37681e;

        /* renamed from: f  reason: collision with root package name */
        private List<Object> f37682f;

        /* renamed from: g  reason: collision with root package name */
        private List<Object> f37683g;

        /* renamed from: h  reason: collision with root package name */
        private List<Object> f37684h;

        /* renamed from: i  reason: collision with root package name */
        private Map<String, Object> f37685i;

        static p a(ArrayList<Object> arrayList) {
            Long l10;
            p pVar = new p();
            pVar.s((List) arrayList.get(0));
            pVar.p((List) arrayList.get(1));
            Object obj = arrayList.get(2);
            Long l11 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            pVar.n(l10);
            Object obj2 = arrayList.get(3);
            if (obj2 != null) {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            pVar.o(l11);
            pVar.r((List) arrayList.get(4));
            pVar.q((List) arrayList.get(5));
            pVar.k((List) arrayList.get(6));
            pVar.l((List) arrayList.get(7));
            pVar.m((Map) arrayList.get(8));
            return pVar;
        }

        public List<Object> b() {
            return this.f37683g;
        }

        public List<Object> c() {
            return this.f37684h;
        }

        public Map<String, Object> d() {
            return this.f37685i;
        }

        public Long e() {
            return this.f37679c;
        }

        public Long f() {
            return this.f37680d;
        }

        public List<List<Object>> g() {
            return this.f37678b;
        }

        public List<Object> h() {
            return this.f37682f;
        }

        public List<Object> i() {
            return this.f37681e;
        }

        public List<List<Object>> j() {
            return this.f37677a;
        }

        public void k(List<Object> list) {
            this.f37683g = list;
        }

        public void l(List<Object> list) {
            this.f37684h = list;
        }

        public void m(Map<String, Object> map) {
            this.f37685i = map;
        }

        public void n(Long l10) {
            this.f37679c = l10;
        }

        public void o(Long l10) {
            this.f37680d = l10;
        }

        public void p(List<List<Object>> list) {
            this.f37678b = list;
        }

        public void q(List<Object> list) {
            this.f37682f = list;
        }

        public void r(List<Object> list) {
            this.f37681e = list;
        }

        public void s(List<List<Object>> list) {
            this.f37677a = list;
        }

        public ArrayList<Object> t() {
            ArrayList<Object> arrayList = new ArrayList<>(9);
            arrayList.add(this.f37677a);
            arrayList.add(this.f37678b);
            arrayList.add(this.f37679c);
            arrayList.add(this.f37680d);
            arrayList.add(this.f37681e);
            arrayList.add(this.f37682f);
            arrayList.add(this.f37683g);
            arrayList.add(this.f37684h);
            arrayList.add(this.f37685i);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class q {

        /* renamed from: a  reason: collision with root package name */
        private List<m> f37686a;

        /* renamed from: b  reason: collision with root package name */
        private List<k> f37687b;

        /* renamed from: c  reason: collision with root package name */
        private r f37688c;

        /* compiled from: GeneratedAndroidFirebaseFirestore */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private List<m> f37689a;

            /* renamed from: b  reason: collision with root package name */
            private List<k> f37690b;

            /* renamed from: c  reason: collision with root package name */
            private r f37691c;

            public q a() {
                q qVar = new q();
                qVar.c(this.f37689a);
                qVar.b(this.f37690b);
                qVar.d(this.f37691c);
                return qVar;
            }

            public a b(List<k> list) {
                this.f37690b = list;
                return this;
            }

            public a c(List<m> list) {
                this.f37689a = list;
                return this;
            }

            public a d(r rVar) {
                this.f37691c = rVar;
                return this;
            }
        }

        q() {
        }

        static q a(ArrayList<Object> arrayList) {
            r rVar;
            q qVar = new q();
            qVar.c((List) arrayList.get(0));
            qVar.b((List) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                rVar = null;
            } else {
                rVar = r.a((ArrayList) obj);
            }
            qVar.d(rVar);
            return qVar;
        }

        public void b(List<k> list) {
            if (list != null) {
                this.f37687b = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
        }

        public void c(List<m> list) {
            if (list != null) {
                this.f37686a = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"documents\" is null.");
        }

        public void d(r rVar) {
            if (rVar != null) {
                this.f37688c = rVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"metadata\" is null.");
        }

        public ArrayList<Object> e() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f37686a);
            arrayList.add(this.f37687b);
            r rVar = this.f37688c;
            arrayList.add(rVar == null ? null : rVar.d());
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class r {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f37692a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f37693b;

        /* compiled from: GeneratedAndroidFirebaseFirestore */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Boolean f37694a;

            /* renamed from: b  reason: collision with root package name */
            private Boolean f37695b;

            public r a() {
                r rVar = new r();
                rVar.b(this.f37694a);
                rVar.c(this.f37695b);
                return rVar;
            }

            public a b(Boolean bool) {
                this.f37694a = bool;
                return this;
            }

            public a c(Boolean bool) {
                this.f37695b = bool;
                return this;
            }
        }

        r() {
        }

        static r a(ArrayList<Object> arrayList) {
            r rVar = new r();
            rVar.b((Boolean) arrayList.get(0));
            rVar.c((Boolean) arrayList.get(1));
            return rVar;
        }

        public void b(Boolean bool) {
            if (bool != null) {
                this.f37692a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
        }

        public void c(Boolean bool) {
            if (bool != null) {
                this.f37693b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
        }

        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f37692a);
            arrayList.add(this.f37693b);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public static final class s {

        /* renamed from: a  reason: collision with root package name */
        private u f37696a;

        /* renamed from: b  reason: collision with root package name */
        private String f37697b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, Object> f37698c;

        /* renamed from: d  reason: collision with root package name */
        private l f37699d;

        s() {
        }

        static s a(ArrayList<Object> arrayList) {
            l lVar;
            s sVar = new s();
            sVar.i(u.values()[((Integer) arrayList.get(0)).intValue()]);
            sVar.h((String) arrayList.get(1));
            sVar.f((Map) arrayList.get(2));
            Object obj = arrayList.get(3);
            if (obj == null) {
                lVar = null;
            } else {
                lVar = l.a((ArrayList) obj);
            }
            sVar.g(lVar);
            return sVar;
        }

        public Map<String, Object> b() {
            return this.f37698c;
        }

        public l c() {
            return this.f37699d;
        }

        public String d() {
            return this.f37697b;
        }

        public u e() {
            return this.f37696a;
        }

        public void f(Map<String, Object> map) {
            this.f37698c = map;
        }

        public void g(l lVar) {
            this.f37699d = lVar;
        }

        public void h(String str) {
            if (str != null) {
                this.f37697b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }

        public void i(u uVar) {
            if (uVar != null) {
                this.f37696a = uVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        public ArrayList<Object> j() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            u uVar = this.f37696a;
            ArrayList<Object> arrayList2 = null;
            arrayList.add(uVar == null ? null : Integer.valueOf(uVar.f37709a));
            arrayList.add(this.f37697b);
            arrayList.add(this.f37698c);
            l lVar = this.f37699d;
            if (lVar != null) {
                arrayList2 = lVar.f();
            }
            arrayList.add(arrayList2);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public enum t {
        SUCCESS(0),
        FAILURE(1);
        

        /* renamed from: a  reason: collision with root package name */
        final int f37703a;

        private t(int i10) {
            this.f37703a = i10;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public enum u {
        GET(0),
        UPDATE(1),
        SET(2),
        DELETE_TYPE(3);
        

        /* renamed from: a  reason: collision with root package name */
        final int f37709a;

        private u(int i10) {
            this.f37709a = i10;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public interface v<T> {
        void a(Throwable th);

        void success(T t10);
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public enum w {
        NONE(0),
        ESTIMATE(1),
        PREVIOUS(2);
        

        /* renamed from: a  reason: collision with root package name */
        final int f37714a;

        private w(int i10) {
            this.f37714a = i10;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseFirestore */
    public enum x {
        SERVER_AND_CACHE(0),
        SERVER(1),
        CACHE(2);
        

        /* renamed from: a  reason: collision with root package name */
        final int f37719a;

        private x(int i10) {
            this.f37719a = i10;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof j) {
            j jVar = (j) th;
            arrayList.add(jVar.f37652a);
            arrayList.add(jVar.getMessage());
            arrayList.add(jVar.f37653b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
