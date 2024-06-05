package u3;

import android.net.Uri;
import j4.l;
import j4.n;
import j4.p;
import j4.p0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Aes128DataSource */
class a implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f22840a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f22841b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f22842c;

    /* renamed from: d  reason: collision with root package name */
    private CipherInputStream f22843d;

    public a(l lVar, byte[] bArr, byte[] bArr2) {
        this.f22840a = lVar;
        this.f22841b = bArr;
        this.f22842c = bArr2;
    }

    public void close() throws IOException {
        if (this.f22843d != null) {
            this.f22843d = null;
            this.f22840a.close();
        }
    }

    public final void e(p0 p0Var) {
        k4.a.e(p0Var);
        this.f22840a.e(p0Var);
    }

    public final long f(p pVar) throws IOException {
        try {
            Cipher q10 = q();
            try {
                q10.init(2, new SecretKeySpec(this.f22841b, "AES"), new IvParameterSpec(this.f22842c));
                n nVar = new n(this.f22840a, pVar);
                this.f22843d = new CipherInputStream(nVar, q10);
                nVar.i();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final Map<String, List<String>> k() {
        return this.f22840a.k();
    }

    public final Uri o() {
        return this.f22840a.o();
    }

    /* access modifiers changed from: protected */
    public Cipher q() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        k4.a.e(this.f22843d);
        int read = this.f22843d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
