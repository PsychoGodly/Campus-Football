package r2;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o2.u1;
import r2.m;

/* compiled from: ExoMediaDrm */
public interface g0 {

    /* compiled from: ExoMediaDrm */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f22014a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22015b;

        /* renamed from: c  reason: collision with root package name */
        private final int f22016c;

        public a(byte[] bArr, String str, int i10) {
            this.f22014a = bArr;
            this.f22015b = str;
            this.f22016c = i10;
        }

        public byte[] a() {
            return this.f22014a;
        }

        public String b() {
            return this.f22015b;
        }
    }

    /* compiled from: ExoMediaDrm */
    public interface b {
        void a(g0 g0Var, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* compiled from: ExoMediaDrm */
    public interface c {
        g0 a(UUID uuid);
    }

    /* compiled from: ExoMediaDrm */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f22017a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22018b;

        public d(byte[] bArr, String str) {
            this.f22017a = bArr;
            this.f22018b = str;
        }

        public byte[] a() {
            return this.f22017a;
        }

        public String b() {
            return this.f22018b;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    q2.b c(byte[] bArr) throws MediaCryptoException;

    void d(b bVar);

    byte[] e() throws MediaDrmException;

    void f(byte[] bArr, u1 u1Var);

    boolean g(byte[] bArr, String str);

    void h(byte[] bArr, byte[] bArr2);

    void i(byte[] bArr);

    byte[] j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void k(byte[] bArr) throws DeniedByServerException;

    a l(byte[] bArr, List<m.b> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException;

    int m();

    void release();
}
