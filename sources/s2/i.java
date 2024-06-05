package s2;

import a3.g;
import a3.k;
import android.net.Uri;
import c3.a0;
import c3.b;
import c3.e;
import c3.h;
import c3.h0;
import c3.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.j0;
import n2.r1;
import s6.u;
import v2.d;
import w2.c;
import z2.f;

/* compiled from: DefaultExtractorsFactory */
public final class i implements r {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f22443o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: p  reason: collision with root package name */
    private static final a f22444p = new a(h.f38028a);

    /* renamed from: q  reason: collision with root package name */
    private static final a f22445q = new a(g.f38027a);

    /* renamed from: b  reason: collision with root package name */
    private boolean f22446b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22447c;

    /* renamed from: d  reason: collision with root package name */
    private int f22448d;

    /* renamed from: e  reason: collision with root package name */
    private int f22449e;

    /* renamed from: f  reason: collision with root package name */
    private int f22450f;

    /* renamed from: g  reason: collision with root package name */
    private int f22451g;

    /* renamed from: h  reason: collision with root package name */
    private int f22452h;

    /* renamed from: i  reason: collision with root package name */
    private int f22453i;

    /* renamed from: j  reason: collision with root package name */
    private int f22454j;

    /* renamed from: k  reason: collision with root package name */
    private int f22455k = 1;

    /* renamed from: l  reason: collision with root package name */
    private int f22456l;

    /* renamed from: m  reason: collision with root package name */
    private u<r1> f22457m = u.y();

    /* renamed from: n  reason: collision with root package name */
    private int f22458n = 112800;

    /* compiled from: DefaultExtractorsFactory */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C0233a f22459a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f22460b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        private Constructor<? extends l> f22461c;

        /* renamed from: s2.i$a$a  reason: collision with other inner class name */
        /* compiled from: DefaultExtractorsFactory */
        public interface C0233a {
            Constructor<? extends l> a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public a(C0233a aVar) {
            this.f22459a = aVar;
        }

        private Constructor<? extends l> b() {
            synchronized (this.f22460b) {
                if (this.f22460b.get()) {
                    Constructor<? extends l> constructor = this.f22461c;
                    return constructor;
                }
                try {
                    Constructor<? extends l> a10 = this.f22459a.a();
                    return a10;
                } catch (ClassNotFoundException unused) {
                    this.f22460b.set(true);
                    return this.f22461c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public l a(Object... objArr) {
            Constructor<? extends l> b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return (l) b10.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void e(int i10, List<l> list) {
        int i11 = 2;
        switch (i10) {
            case 0:
                list.add(new b());
                return;
            case 1:
                list.add(new e());
                return;
            case 2:
                boolean z10 = this.f22448d | this.f22446b;
                if (!this.f22447c) {
                    i11 = 0;
                }
                list.add(new h(i11 | z10 ? 1 : 0));
                return;
            case 3:
                boolean z11 = this.f22449e | this.f22446b;
                if (!this.f22447c) {
                    i11 = 0;
                }
                list.add(new t2.b(i11 | z11 ? 1 : 0));
                return;
            case 4:
                l a10 = f22444p.a(Integer.valueOf(this.f22450f));
                if (a10 != null) {
                    list.add(a10);
                    return;
                } else {
                    list.add(new d(this.f22450f));
                    return;
                }
            case 5:
                list.add(new c());
                return;
            case 6:
                list.add(new y2.e(this.f22451g));
                return;
            case 7:
                boolean z12 = this.f22454j | this.f22446b;
                if (!this.f22447c) {
                    i11 = 0;
                }
                list.add(new f(i11 | z12 ? 1 : 0));
                return;
            case 8:
                list.add(new g(this.f22453i));
                list.add(new k(this.f22452h));
                return;
            case 9:
                list.add(new b3.d());
                return;
            case 10:
                list.add(new a0());
                return;
            case 11:
                list.add(new h0(this.f22455k, new j0(0), new j(this.f22456l, this.f22457m), this.f22458n));
                return;
            case 12:
                list.add(new d3.b());
                return;
            case 14:
                list.add(new x2.a());
                return;
            case 15:
                l a11 = f22445q.a(new Object[0]);
                if (a11 != null) {
                    list.add(a11);
                    return;
                }
                return;
            case 16:
                list.add(new u2.b());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    public static Constructor<? extends l> f() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
            return null;
        }
        return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(l.class).getConstructor(new Class[]{Integer.TYPE});
    }

    /* access modifiers changed from: private */
    public static Constructor<? extends l> g() throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(l.class).getConstructor(new Class[0]);
    }

    public synchronized l[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    public synchronized l[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f22443o;
        arrayList = new ArrayList(iArr.length);
        int b10 = k4.k.b(map);
        if (b10 != -1) {
            e(b10, arrayList);
        }
        int c10 = k4.k.c(uri);
        if (!(c10 == -1 || c10 == b10)) {
            e(c10, arrayList);
        }
        for (int i10 : iArr) {
            if (!(i10 == b10 || i10 == c10)) {
                e(i10, arrayList);
            }
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }

    public synchronized i h(boolean z10) {
        this.f22447c = z10;
        return this;
    }

    public synchronized i i(boolean z10) {
        this.f22446b = z10;
        return this;
    }

    public synchronized i j(int i10) {
        this.f22454j = i10;
        return this;
    }
}
