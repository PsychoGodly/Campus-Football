package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import io.flutter.plugins.googlemobileads.d0;
import io.flutter.plugins.googlemobileads.e;
import io.flutter.plugins.googlemobileads.i;
import io.flutter.plugins.googlemobileads.l;
import io.flutter.plugins.googlemobileads.m;
import io.flutter.plugins.googlemobileads.o;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import lc.r;
import n4.x;
import uc.c;
import uc.d;

/* compiled from: AdMessageCodec */
class b extends r {

    /* renamed from: d  reason: collision with root package name */
    Context f33935d;

    /* renamed from: e  reason: collision with root package name */
    final m.a f33936e = new m.a();

    /* renamed from: f  reason: collision with root package name */
    private j0 f33937f;

    /* renamed from: g  reason: collision with root package name */
    private final c0 f33938g;

    /* compiled from: AdMessageCodec */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33939a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.plugins.googlemobileads.o$b[] r0 = io.flutter.plugins.googlemobileads.o.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33939a = r0
                io.flutter.plugins.googlemobileads.o$b r1 = io.flutter.plugins.googlemobileads.o.b.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33939a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.googlemobileads.o$b r1 = io.flutter.plugins.googlemobileads.o.b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemobileads.b.a.<clinit>():void");
        }
    }

    b(Context context, c0 c0Var) {
        this.f33935d = context;
        this.f33938g = c0Var;
    }

    private static Boolean q(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    /* access modifiers changed from: protected */
    public Object g(byte b10, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        switch (b10) {
            case Byte.MIN_VALUE:
                try {
                    return new m(((Integer) g(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer2)).intValue());
                } catch (Throwable th) {
                    throw th;
                }
            case -127:
                return new l.a().n((List) g(byteBuffer.get(), byteBuffer2)).l((String) g(byteBuffer.get(), byteBuffer2)).r(q(g(byteBuffer.get(), byteBuffer2))).q((List) g(byteBuffer.get(), byteBuffer2)).m((Integer) g(byteBuffer.get(), byteBuffer2)).o((String) g(byteBuffer.get(), byteBuffer2)).p(this.f33937f).k((Map) g(byteBuffer.get(), byteBuffer2)).s(this.f33938g.a()).a();
            case -126:
                return new m.c();
            case -124:
                return new d0.b((Integer) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2));
            case -123:
                return new e.c(((Integer) g(byteBuffer.get(), byteBuffer2)).intValue(), (String) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2), (e.C0388e) g(byteBuffer.get(), byteBuffer2));
            case -122:
                i.b bVar = new i.b();
                bVar.n((List) g(byteBuffer.get(), byteBuffer2));
                bVar.l((String) g(byteBuffer.get(), byteBuffer2));
                bVar.u((Map) g(byteBuffer.get(), byteBuffer2));
                bVar.v((Map) g(byteBuffer.get(), byteBuffer2));
                bVar.r((Boolean) g(byteBuffer.get(), byteBuffer2));
                bVar.q((List) g(byteBuffer.get(), byteBuffer2));
                bVar.m((Integer) g(byteBuffer.get(), byteBuffer2));
                bVar.w((String) g(byteBuffer.get(), byteBuffer2));
                bVar.o((String) g(byteBuffer.get(), byteBuffer2));
                bVar.p(this.f33937f);
                bVar.k((Map) g(byteBuffer.get(), byteBuffer2));
                bVar.s(this.f33938g.a());
                return bVar.a();
            case -121:
                String str = (String) g(byteBuffer.get(), byteBuffer2);
                str.hashCode();
                if (str.equals("ready")) {
                    return o.b.READY;
                }
                if (str.equals("notReady")) {
                    return o.b.NOT_READY;
                }
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{str}));
            case -120:
                return new o((o.b) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2), (Number) g(byteBuffer.get(), byteBuffer2));
            case -119:
                return new t((Map<String, o>) (Map) g(byteBuffer.get(), byteBuffer2));
            case -118:
                return new f0((String) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2));
            case -117:
                return new e.a(((Integer) g(byteBuffer.get(), byteBuffer2)).intValue(), (String) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2));
            case -116:
                return new e.C0388e((String) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2), (List) g(byteBuffer.get(), byteBuffer2), (e.b) g(byteBuffer.get(), byteBuffer2), (Map) g(byteBuffer.get(), byteBuffer2));
            case -115:
                return new e.b((String) g(byteBuffer.get(), byteBuffer2), ((Long) g(byteBuffer.get(), byteBuffer2)).longValue(), (String) g(byteBuffer.get(), byteBuffer2), (Map) g(byteBuffer.get(), byteBuffer2), (e.a) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2), (String) g(byteBuffer.get(), byteBuffer2));
            case -114:
                return new m.b(this.f33935d, this.f33936e, (String) g(byteBuffer.get(), byteBuffer2), ((Integer) g(byteBuffer.get(), byteBuffer2)).intValue());
            case -113:
                return new m.e();
            case -112:
                return new z((Integer) g(byteBuffer.get(), byteBuffer2), (Integer) g(byteBuffer.get(), byteBuffer2), (g0) g(byteBuffer.get(), byteBuffer2), (Boolean) g(byteBuffer.get(), byteBuffer2), (Boolean) g(byteBuffer.get(), byteBuffer2), (Boolean) g(byteBuffer.get(), byteBuffer2));
            case -111:
                return new g0((Boolean) g(byteBuffer.get(), byteBuffer2), (Boolean) g(byteBuffer.get(), byteBuffer2), (Boolean) g(byteBuffer.get(), byteBuffer2));
            case -110:
                Integer num = (Integer) g(byteBuffer.get(), byteBuffer2);
                return new m.d(this.f33936e, this.f33935d, ((Integer) g(byteBuffer.get(), byteBuffer2)).intValue(), num, (Integer) g(byteBuffer.get(), byteBuffer2));
            case -108:
                x.a aVar = new x.a();
                aVar.b((String) g(byteBuffer.get(), byteBuffer2));
                aVar.c(((Integer) g(byteBuffer.get(), byteBuffer2)).intValue());
                aVar.d(((Integer) g(byteBuffer.get(), byteBuffer2)).intValue());
                aVar.e((List) g(byteBuffer.get(), byteBuffer2));
                return aVar.a();
            case -107:
                return new uc.b((d) g(byteBuffer.get(), byteBuffer2), (ColorDrawable) g(byteBuffer.get(), byteBuffer2), (c) g(byteBuffer.get(), byteBuffer2), (c) g(byteBuffer.get(), byteBuffer2), (c) g(byteBuffer.get(), byteBuffer2), (c) g(byteBuffer.get(), byteBuffer2));
            case -106:
                return new c((ColorDrawable) g(byteBuffer.get(), byteBuffer2), (ColorDrawable) g(byteBuffer.get(), byteBuffer2), (uc.a) g(byteBuffer.get(), byteBuffer2), (Double) g(byteBuffer.get(), byteBuffer2));
            case -105:
                return uc.a.a(((Integer) g(byteBuffer.get(), byteBuffer2)).intValue());
            case -104:
                return d.a(((Integer) g(byteBuffer.get(), byteBuffer2)).intValue());
            case -103:
                return new ColorDrawable(Color.argb(((Integer) g(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer2)).intValue(), ((Integer) g(byteBuffer.get(), byteBuffer2)).intValue()));
            default:
                return super.g(b10, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof m) {
            t(byteArrayOutputStream, (m) obj);
        } else if (obj instanceof i) {
            byteArrayOutputStream.write(-122);
            i iVar = (i) obj;
            p(byteArrayOutputStream, iVar.f());
            p(byteArrayOutputStream, iVar.d());
            p(byteArrayOutputStream, iVar.l());
            p(byteArrayOutputStream, iVar.m());
            p(byteArrayOutputStream, iVar.i());
            p(byteArrayOutputStream, iVar.h());
            p(byteArrayOutputStream, iVar.e());
            p(byteArrayOutputStream, iVar.n());
            p(byteArrayOutputStream, iVar.g());
            p(byteArrayOutputStream, iVar.c());
        } else if (obj instanceof l) {
            byteArrayOutputStream.write(-127);
            l lVar = (l) obj;
            p(byteArrayOutputStream, lVar.f());
            p(byteArrayOutputStream, lVar.d());
            p(byteArrayOutputStream, lVar.i());
            p(byteArrayOutputStream, lVar.h());
            p(byteArrayOutputStream, lVar.e());
            p(byteArrayOutputStream, lVar.g());
            p(byteArrayOutputStream, lVar.c());
        } else if (obj instanceof d0.b) {
            byteArrayOutputStream.write(-124);
            d0.b bVar = (d0.b) obj;
            p(byteArrayOutputStream, bVar.f33954a);
            p(byteArrayOutputStream, bVar.f33955b);
        } else if (obj instanceof e.b) {
            byteArrayOutputStream.write(-115);
            e.b bVar2 = (e.b) obj;
            p(byteArrayOutputStream, bVar2.f());
            p(byteArrayOutputStream, Long.valueOf(bVar2.i()));
            p(byteArrayOutputStream, bVar2.g());
            p(byteArrayOutputStream, bVar2.e());
            p(byteArrayOutputStream, bVar2.h());
            p(byteArrayOutputStream, bVar2.d());
            p(byteArrayOutputStream, bVar2.a());
            p(byteArrayOutputStream, bVar2.c());
            p(byteArrayOutputStream, bVar2.b());
        } else if (obj instanceof e.C0388e) {
            byteArrayOutputStream.write(-116);
            e.C0388e eVar = (e.C0388e) obj;
            p(byteArrayOutputStream, eVar.e());
            p(byteArrayOutputStream, eVar.c());
            p(byteArrayOutputStream, eVar.a());
            p(byteArrayOutputStream, eVar.b());
            p(byteArrayOutputStream, eVar.d());
        } else if (obj instanceof e.c) {
            byteArrayOutputStream.write(-123);
            e.c cVar = (e.c) obj;
            p(byteArrayOutputStream, Integer.valueOf(cVar.f33969a));
            p(byteArrayOutputStream, cVar.f33970b);
            p(byteArrayOutputStream, cVar.f33971c);
            p(byteArrayOutputStream, cVar.f33972d);
        } else if (obj instanceof e.a) {
            byteArrayOutputStream.write(-117);
            e.a aVar = (e.a) obj;
            p(byteArrayOutputStream, Integer.valueOf(aVar.f33957a));
            p(byteArrayOutputStream, aVar.f33958b);
            p(byteArrayOutputStream, aVar.f33959c);
        } else if (obj instanceof o.b) {
            byteArrayOutputStream.write(-121);
            o.b bVar3 = (o.b) obj;
            int i10 = a.f33939a[bVar3.ordinal()];
            if (i10 == 1) {
                p(byteArrayOutputStream, "notReady");
            } else if (i10 == 2) {
                p(byteArrayOutputStream, "ready");
            } else {
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{bVar3}));
            }
        } else if (obj instanceof o) {
            byteArrayOutputStream.write(-120);
            o oVar = (o) obj;
            p(byteArrayOutputStream, oVar.f34106a);
            p(byteArrayOutputStream, oVar.f34107b);
            p(byteArrayOutputStream, oVar.f34108c);
        } else if (obj instanceof t) {
            byteArrayOutputStream.write(-119);
            p(byteArrayOutputStream, ((t) obj).f34130a);
        } else if (obj instanceof f0) {
            byteArrayOutputStream.write(-118);
            f0 f0Var = (f0) obj;
            p(byteArrayOutputStream, f0Var.c());
            p(byteArrayOutputStream, f0Var.b());
        } else if (obj instanceof z) {
            byteArrayOutputStream.write(-112);
            z zVar = (z) obj;
            p(byteArrayOutputStream, zVar.f34161a);
            p(byteArrayOutputStream, zVar.f34162b);
            p(byteArrayOutputStream, zVar.f34163c);
            p(byteArrayOutputStream, zVar.f34164d);
            p(byteArrayOutputStream, zVar.f34165e);
            p(byteArrayOutputStream, zVar.f34166f);
        } else if (obj instanceof x) {
            byteArrayOutputStream.write(-108);
            x xVar = (x) obj;
            p(byteArrayOutputStream, xVar.a());
            p(byteArrayOutputStream, Integer.valueOf(xVar.b()));
            p(byteArrayOutputStream, Integer.valueOf(xVar.c()));
            p(byteArrayOutputStream, xVar.d());
        } else if (obj instanceof g0) {
            byteArrayOutputStream.write(-111);
            g0 g0Var = (g0) obj;
            p(byteArrayOutputStream, g0Var.f33989a);
            p(byteArrayOutputStream, g0Var.f33990b);
            p(byteArrayOutputStream, g0Var.f33991c);
        } else if (obj instanceof uc.b) {
            byteArrayOutputStream.write(-107);
            uc.b bVar4 = (uc.b) obj;
            p(byteArrayOutputStream, bVar4.g());
            p(byteArrayOutputStream, bVar4.d());
            p(byteArrayOutputStream, bVar4.c());
            p(byteArrayOutputStream, bVar4.e());
            p(byteArrayOutputStream, bVar4.f());
            p(byteArrayOutputStream, bVar4.h());
        } else if (obj instanceof uc.a) {
            byteArrayOutputStream.write(-105);
            p(byteArrayOutputStream, Integer.valueOf(((uc.a) obj).ordinal()));
        } else if (obj instanceof d) {
            byteArrayOutputStream.write(-104);
            p(byteArrayOutputStream, Integer.valueOf(((d) obj).ordinal()));
        } else if (obj instanceof c) {
            byteArrayOutputStream.write(-106);
            c cVar2 = (c) obj;
            p(byteArrayOutputStream, cVar2.d());
            p(byteArrayOutputStream, cVar2.a());
            p(byteArrayOutputStream, cVar2.b());
            p(byteArrayOutputStream, cVar2.c());
        } else if (obj instanceof ColorDrawable) {
            byteArrayOutputStream.write(-103);
            int color = ((ColorDrawable) obj).getColor();
            p(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
            p(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
            p(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
            p(byteArrayOutputStream, Integer.valueOf(Color.blue(color)));
        } else {
            super.p(byteArrayOutputStream, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(Context context) {
        this.f33935d = context;
    }

    /* access modifiers changed from: package-private */
    public void s(j0 j0Var) {
        this.f33937f = j0Var;
    }

    /* access modifiers changed from: protected */
    public void t(ByteArrayOutputStream byteArrayOutputStream, m mVar) {
        if (mVar instanceof m.d) {
            m.d dVar = (m.d) mVar;
            byteArrayOutputStream.write(-110);
            p(byteArrayOutputStream, Integer.valueOf(dVar.f34046b));
            p(byteArrayOutputStream, dVar.f34050e);
            p(byteArrayOutputStream, dVar.f34049d);
        } else if (mVar instanceof m.b) {
            byteArrayOutputStream.write(-114);
            m.b bVar = (m.b) mVar;
            p(byteArrayOutputStream, bVar.f34048d);
            p(byteArrayOutputStream, Integer.valueOf(bVar.f34046b));
        } else if (mVar instanceof m.e) {
            byteArrayOutputStream.write(-113);
        } else if (mVar instanceof m.c) {
            byteArrayOutputStream.write(-126);
        } else {
            byteArrayOutputStream.write(-128);
            p(byteArrayOutputStream, Integer.valueOf(mVar.f34046b));
            p(byteArrayOutputStream, Integer.valueOf(mVar.f34047c));
        }
    }
}
