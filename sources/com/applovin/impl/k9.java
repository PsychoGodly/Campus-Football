package com.applovin.impl;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.w6;
import com.applovin.impl.x7;
import com.applovin.mediation.MaxReward;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class k9 implements x7 {

    /* renamed from: d  reason: collision with root package name */
    public static final x7.c f8930d = sy.f12195a;

    /* renamed from: a  reason: collision with root package name */
    private final UUID f8931a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDrm f8932b;

    /* renamed from: c  reason: collision with root package name */
    private int f8933c = 1;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    private k9(UUID uuid) {
        a1.a((Object) uuid);
        a1.a(!r2.f11114b.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f8931a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f8932b = mediaDrm;
        if (r2.f11116d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(yp.f13665d);
    }

    public x7.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f8932b.getProvisionRequest();
        return new x7.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public int c() {
        return 2;
    }

    public void c(byte[] bArr) {
        this.f8932b.closeSession(bArr);
    }

    /* renamed from: f */
    public j9 d(byte[] bArr) {
        return new j9(a(this.f8931a), bArr, yp.f13662a < 21 && r2.f11116d.equals(this.f8931a) && "L3".equals(a("securityLevel")));
    }

    public static k9 c(UUID uuid) {
        try {
            return new k9(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new tp(1, e10);
        } catch (Exception e11) {
            throw new tp(2, e11);
        }
    }

    private static byte[] e(byte[] bArr) {
        yg ygVar = new yg(bArr);
        int m10 = ygVar.m();
        short o10 = ygVar.o();
        short o11 = ygVar.o();
        if (o10 == 1 && o11 == 1) {
            short o12 = ygVar.o();
            Charset charset = Charsets.UTF_16LE;
            String a10 = ygVar.a((int) o12, charset);
            if (a10.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = a10.indexOf("</DATA>");
            if (indexOf == -1) {
                kc.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = a10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a10.substring(indexOf);
            int i10 = m10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort((short) o10);
            allocate.putShort((short) o11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        kc.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    public x7.a a(byte[] bArr, List list, int i10, HashMap hashMap) {
        String str;
        byte[] bArr2;
        w6.b bVar = null;
        if (list != null) {
            bVar = a(this.f8931a, list);
            bArr2 = b(this.f8931a, (byte[]) a1.a((Object) bVar.f13016f));
            str = a(this.f8931a, bVar.f13015d);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f8932b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] a10 = a(this.f8931a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = MaxReward.DEFAULT_LABEL;
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f13014c)) {
            defaultUrl = bVar.f13014c;
        }
        return new x7.a(a10, defaultUrl, yp.f13662a >= 23 ? keyRequest.getRequestType() : RecyclerView.UNDEFINED_DURATION);
    }

    public byte[] d() {
        return this.f8932b.openSession();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ x7 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (tp unused) {
            kc.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new e7();
        }
    }

    public Map b(byte[] bArr) {
        return this.f8932b.queryKeyStatus(bArr);
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (r2.f11115c.equals(this.f8931a)) {
            bArr2 = g3.b(bArr2);
        }
        return this.f8932b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] b(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = com.applovin.impl.r2.f11117e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = com.applovin.impl.fi.a((byte[]) r4, (java.util.UUID) r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = e(r4)
            byte[] r4 = com.applovin.impl.fi.a((java.util.UUID) r0, (byte[]) r4)
        L_0x0018:
            int r1 = com.applovin.impl.yp.f13662a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = com.applovin.impl.r2.f11116d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = com.applovin.impl.yp.f13664c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = com.applovin.impl.yp.f13665d
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
            byte[] r3 = com.applovin.impl.fi.a((byte[]) r4, (java.util.UUID) r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k9.b(java.util.UUID, byte[]):byte[]");
    }

    public String a(String str) {
        return this.f8932b.getPropertyString(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(x7.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    public void a(byte[] bArr) {
        this.f8932b.provideProvisionResponse(bArr);
    }

    public synchronized void a() {
        int i10 = this.f8933c - 1;
        this.f8933c = i10;
        if (i10 == 0) {
            this.f8932b.release();
        }
    }

    public void a(byte[] bArr, byte[] bArr2) {
        this.f8932b.restoreKeys(bArr, bArr2);
    }

    public void a(x7.b bVar) {
        ry ryVar;
        MediaDrm mediaDrm = this.f8932b;
        if (bVar == null) {
            ryVar = null;
        } else {
            ryVar = new ry(this, bVar);
        }
        mediaDrm.setOnEventListener(ryVar);
    }

    public boolean a(byte[] bArr, String str) {
        if (yp.f13662a >= 31) {
            return a.a(this.f8932b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f8931a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private static w6.b a(UUID uuid, List list) {
        if (!r2.f11116d.equals(uuid)) {
            return (w6.b) list.get(0);
        }
        if (yp.f13662a >= 28 && list.size() > 1) {
            w6.b bVar = (w6.b) list.get(0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < list.size()) {
                w6.b bVar2 = (w6.b) list.get(i10);
                byte[] bArr = (byte[]) a1.a((Object) bVar2.f13016f);
                if (yp.a((Object) bVar2.f13015d, (Object) bVar.f13015d) && yp.a((Object) bVar2.f13014c, (Object) bVar.f13014c) && fi.a(bArr)) {
                    i11 += bArr.length;
                    i10++;
                }
            }
            byte[] bArr2 = new byte[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                byte[] bArr3 = (byte[]) a1.a((Object) ((w6.b) list.get(i13)).f13016f);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i12, length);
                i12 += length;
            }
            return bVar.a(bArr2);
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            w6.b bVar3 = (w6.b) list.get(i14);
            int d10 = fi.d((byte[]) a1.a((Object) bVar3.f13016f));
            int i15 = yp.f13662a;
            if (i15 < 23 && d10 == 0) {
                return bVar3;
            }
            if (i15 >= 23 && d10 == 1) {
                return bVar3;
            }
        }
        return (w6.b) list.get(0);
    }

    private static UUID a(UUID uuid) {
        return (yp.f13662a >= 27 || !r2.f11115c.equals(uuid)) ? uuid : r2.f11114b;
    }

    private static String a(UUID uuid, String str) {
        return (yp.f13662a >= 26 || !r2.f11115c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        return r2.f11115c.equals(uuid) ? g3.a(bArr) : bArr;
    }
}
