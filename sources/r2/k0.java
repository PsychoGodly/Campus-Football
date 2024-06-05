package r2;

import a3.l;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxReward;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k4.a0;
import k4.n0;
import k4.r;
import n2.i;
import o2.u1;
import r2.g0;
import r2.m;
import r6.e;

/* compiled from: FrameworkMediaDrm */
public final class k0 implements g0 {

    /* renamed from: d  reason: collision with root package name */
    public static final g0.c f22064d = j0.f37788a;

    /* renamed from: a  reason: collision with root package name */
    private final UUID f22065a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDrm f22066b;

    /* renamed from: c  reason: collision with root package name */
    private int f22067c = 1;

    /* compiled from: FrameworkMediaDrm */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, u1 u1Var) {
            LogSessionId a10 = u1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaDrm.PlaybackComponent) k4.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a10);
            }
        }
    }

    private k0(UUID uuid) throws UnsupportedSchemeException {
        k4.a.e(uuid);
        k4.a.b(!i.f20437b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f22065a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f22066b = mediaDrm;
        if (i.f20439d.equals(uuid) && B()) {
            w(mediaDrm);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ g0 A(UUID uuid) {
        try {
            return C(uuid);
        } catch (p0 unused) {
            r.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new d0();
        }
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(n0.f19741d);
    }

    public static k0 C(UUID uuid) throws p0 {
        try {
            return new k0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new p0(1, e10);
        } catch (Exception e11) {
            throw new p0(2, e11);
        }
    }

    private static byte[] p(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        int t10 = a0Var.t();
        short v10 = a0Var.v();
        short v11 = a0Var.v();
        if (v10 == 1 && v11 == 1) {
            short v12 = a0Var.v();
            Charset charset = e.f29805e;
            String E = a0Var.E(v12, charset);
            if (E.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = E.indexOf("</DATA>");
            if (indexOf == -1) {
                r.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = E.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + E.substring(indexOf);
            int i10 = t10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort((short) v10);
            allocate.putShort((short) v11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        r.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    private static String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (n0.f19738a != 33 || !"https://default.url".equals(str)) {
            return str;
        }
        return MaxReward.DEFAULT_LABEL;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return i.f20438c.equals(uuid) ? a.a(bArr) : bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = n2.i.f20440e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = a3.l.e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = p(r4)
            byte[] r4 = a3.l.a(r0, r4)
        L_0x0018:
            int r1 = k4.n0.f19738a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = n2.i.f20439d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = k4.n0.f19740c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = k4.n0.f19741d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = a3.l.e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.k0.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        return (n0.f19738a >= 26 || !i.f20438c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    private static UUID u(UUID uuid) {
        return (n0.f19738a >= 27 || !i.f20438c.equals(uuid)) ? uuid : i.f20437b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static m.b y(UUID uuid, List<m.b> list) {
        boolean z10;
        if (!i.f20439d.equals(uuid)) {
            return list.get(0);
        }
        if (n0.f19738a >= 28 && list.size() > 1) {
            m.b bVar = list.get(0);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    z10 = true;
                    break;
                }
                m.b bVar2 = list.get(i10);
                byte[] bArr = (byte[]) k4.a.e(bVar2.f22085f);
                if (!n0.c(bVar2.f22084d, bVar.f22084d) || !n0.c(bVar2.f22083c, bVar.f22083c) || !l.c(bArr)) {
                    z10 = false;
                } else {
                    i11 += bArr.length;
                    i10++;
                }
            }
            z10 = false;
            if (z10) {
                byte[] bArr2 = new byte[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    byte[] bArr3 = (byte[]) k4.a.e(list.get(i13).f22085f);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i12, length);
                    i12 += length;
                }
                return bVar.b(bArr2);
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            m.b bVar3 = list.get(i14);
            int g10 = l.g((byte[]) k4.a.e(bVar3.f22085f));
            int i15 = n0.f19738a;
            if (i15 < 23 && g10 == 0) {
                return bVar3;
            }
            if (i15 >= 23 && g10 == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(g0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    public Map<String, String> a(byte[] bArr) {
        return this.f22066b.queryKeyStatus(bArr);
    }

    public g0.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f22066b.getProvisionRequest();
        return new g0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public void d(g0.b bVar) {
        i0 i0Var;
        MediaDrm mediaDrm = this.f22066b;
        if (bVar == null) {
            i0Var = null;
        } else {
            i0Var = new i0(this, bVar);
        }
        mediaDrm.setOnEventListener(i0Var);
    }

    public byte[] e() throws MediaDrmException {
        return this.f22066b.openSession();
    }

    public void f(byte[] bArr, u1 u1Var) {
        if (n0.f19738a >= 31) {
            try {
                a.b(this.f22066b, bArr, u1Var);
            } catch (UnsupportedOperationException unused) {
                r.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    public boolean g(byte[] bArr, String str) {
        if (n0.f19738a >= 31) {
            return a.a(this.f22066b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f22065a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public void h(byte[] bArr, byte[] bArr2) {
        this.f22066b.restoreKeys(bArr, bArr2);
    }

    public void i(byte[] bArr) {
        this.f22066b.closeSession(bArr);
    }

    public byte[] j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (i.f20438c.equals(this.f22065a)) {
            bArr2 = a.b(bArr2);
        }
        return this.f22066b.provideKeyResponse(bArr, bArr2);
    }

    public void k(byte[] bArr) throws DeniedByServerException {
        this.f22066b.provideProvisionResponse(bArr);
    }

    public g0.a l(byte[] bArr, List<m.b> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        m.b bVar = null;
        if (list != null) {
            bVar = y(this.f22065a, list);
            bArr2 = s(this.f22065a, (byte[]) k4.a.e(bVar.f22085f));
            str = t(this.f22065a, bVar.f22084d);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f22066b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f22065a, keyRequest.getData());
        String q10 = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q10) && bVar != null && !TextUtils.isEmpty(bVar.f22083c)) {
            q10 = bVar.f22083c;
        }
        return new g0.a(r10, q10, n0.f19738a >= 23 ? keyRequest.getRequestType() : RecyclerView.UNDEFINED_DURATION);
    }

    public int m() {
        return 2;
    }

    public synchronized void release() {
        int i10 = this.f22067c - 1;
        this.f22067c = i10;
        if (i10 == 0) {
            this.f22066b.release();
        }
    }

    /* renamed from: v */
    public h0 c(byte[] bArr) throws MediaCryptoException {
        return new h0(u(this.f22065a), bArr, n0.f19738a < 21 && i.f20439d.equals(this.f22065a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f22066b.getPropertyString(str);
    }
}
