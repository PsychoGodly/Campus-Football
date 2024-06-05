package kc;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.Map;
import lc.j;
import lc.k;
import lc.s;

/* compiled from: RestorationChannel */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f35927a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public byte[] f35928b;

    /* renamed from: c  reason: collision with root package name */
    private k f35929c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public k.d f35930d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f35931e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f35932f;

    /* renamed from: g  reason: collision with root package name */
    private final k.c f35933g;

    /* compiled from: RestorationChannel */
    class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f35934a;

        a(byte[] bArr) {
            this.f35934a = bArr;
        }

        public void error(String str, String str2, Object obj) {
            xb.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        public void notImplemented() {
        }

        public void success(Object obj) {
            byte[] unused = m.this.f35928b = this.f35934a;
        }
    }

    /* compiled from: RestorationChannel */
    class b implements k.c {
        b() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            String str = jVar.f36116a;
            Object obj = jVar.f36117b;
            str.hashCode();
            if (str.equals("get")) {
                boolean unused = m.this.f35932f = true;
                if (!m.this.f35931e) {
                    m mVar = m.this;
                    if (mVar.f35927a) {
                        k.d unused2 = mVar.f35930d = dVar;
                        return;
                    }
                }
                m mVar2 = m.this;
                dVar.success(mVar2.i(mVar2.f35928b));
            } else if (!str.equals("put")) {
                dVar.notImplemented();
            } else {
                byte[] unused3 = m.this.f35928b = (byte[]) obj;
                dVar.success((Object) null);
            }
        }
    }

    public m(zb.a aVar, boolean z10) {
        this(new k(aVar, "flutter/restoration", s.f36131b), z10);
    }

    /* access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put(JsonStorageKeyNames.DATA_KEY, bArr);
        return hashMap;
    }

    public void g() {
        this.f35928b = null;
    }

    public byte[] h() {
        return this.f35928b;
    }

    public void j(byte[] bArr) {
        this.f35931e = true;
        k.d dVar = this.f35930d;
        if (dVar != null) {
            dVar.success(i(bArr));
            this.f35930d = null;
            this.f35928b = bArr;
        } else if (this.f35932f) {
            this.f35929c.d("push", i(bArr), new a(bArr));
        } else {
            this.f35928b = bArr;
        }
    }

    m(k kVar, boolean z10) {
        this.f35931e = false;
        this.f35932f = false;
        b bVar = new b();
        this.f35933g = bVar;
        this.f35929c = kVar;
        this.f35927a = z10;
        kVar.e(bVar);
    }
}
