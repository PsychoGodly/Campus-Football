package de.mintware.barcode_scan;

import android.hardware.Camera;
import androidx.annotation.Keep;
import com.google.protobuf.z;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.m;
import lc.c;
import lc.d;
import lc.j;
import lc.k;
import rb.a;
import rb.f;
import sd.s;

/* compiled from: ChannelHandler.kt */
public final class ChannelHandler implements k.c, d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    private final a f32430a;

    /* renamed from: b  reason: collision with root package name */
    private k f32431b;

    /* renamed from: c  reason: collision with root package name */
    private d f32432c;

    /* renamed from: d  reason: collision with root package name */
    private d.b f32433d;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, Method> f32434f = new HashMap<>();

    public ChannelHandler(a aVar) {
        m.e(aVar, "activityHelper");
        this.f32430a = aVar;
    }

    private final void a() {
        Method[] declaredMethods = ChannelHandler.class.getDeclaredMethods();
        m.d(declaredMethods, "m");
        int length = declaredMethods.length;
        int i10 = 0;
        while (i10 < length) {
            Method method = declaredMethods[i10];
            i10++;
            HashMap<String, Method> hashMap = this.f32434f;
            String name = method.getName();
            m.d(name, "method.name");
            m.d(method, "method");
            hashMap.put(name, method);
        }
    }

    public final void b(c cVar) {
        m.e(cVar, "messenger");
        if (this.f32431b != null) {
            c();
        }
        k kVar = new k(cVar, "de.mintware.barcode_scan");
        kVar.e(this);
        this.f32431b = kVar;
        if (this.f32432c != null) {
            c();
        }
        d dVar = new d(cVar, "de.mintware.barcode_scan/events");
        dVar.d(this);
        this.f32432c = dVar;
    }

    public final void c() {
        k kVar = this.f32431b;
        if (kVar != null) {
            m.b(kVar);
            kVar.e((k.c) null);
            this.f32431b = null;
        }
        d dVar = this.f32432c;
        if (dVar != null) {
            m.b(dVar);
            dVar.d((d.C0413d) null);
            this.f32432c = null;
        }
    }

    public void g(Object obj) {
        this.f32433d = null;
    }

    public void h(Object obj, d.b bVar) {
        this.f32433d = bVar;
    }

    @Keep
    public final void numberOfCameras(j jVar, k.d dVar) {
        m.e(jVar, "call");
        m.e(dVar, "result");
        dVar.success(Integer.valueOf(Camera.getNumberOfCameras()));
    }

    public void onMethodCall(j jVar, k.d dVar) {
        m.e(jVar, "call");
        m.e(dVar, "result");
        if (this.f32434f.isEmpty()) {
            a();
        }
        Method method = this.f32434f.get(jVar.f36116a);
        if (method == null) {
            dVar.notImplemented();
            return;
        }
        try {
            method.invoke(this, Arrays.copyOf(new Object[]{jVar, dVar}, 2));
        } catch (Exception e10) {
            dVar.error(jVar.f36116a, e10.getMessage(), e10);
        }
    }

    @Keep
    public final void requestCameraPermission(j jVar, k.d dVar) {
        m.e(jVar, "call");
        m.e(dVar, "result");
        dVar.success(Boolean.valueOf(this.f32430a.a(this.f32433d)));
    }

    @Keep
    public final void scan(j jVar, k.d dVar) {
        m.e(jVar, "call");
        m.e(dVar, "result");
        z s10 = f.t0().G(k0.j(s.a("cancel", "Cancel"), s.a("flash_on", "Flash on"), s.a("flash_off", "Flash off"))).H(rb.d.k0().F(0.5d).G(true)).F(new ArrayList()).I(-1).build();
        m.d(s10, "newBuilder()\n           …\n                .build()");
        f fVar = (f) s10;
        Object obj = jVar.f36117b;
        if (obj instanceof byte[]) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            fVar = f.u0((byte[]) obj);
            m.d(fVar, "parseFrom(call.arguments as ByteArray)");
        }
        this.f32430a.c(dVar, fVar);
    }
}
