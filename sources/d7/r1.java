package d7;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzbi;
import com.google.android.gms.internal.p001firebaseauthapi.zzbo;
import com.google.android.gms.internal.p001firebaseauthapi.zzcd;
import com.google.android.gms.internal.p001firebaseauthapi.zzkm;
import com.google.android.gms.internal.p001firebaseauthapi.zzkt;
import com.google.android.gms.internal.p001firebaseauthapi.zzma;
import com.google.android.gms.internal.p001firebaseauthapi.zzw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class r1 {

    /* renamed from: c  reason: collision with root package name */
    private static r1 f28607c;

    /* renamed from: a  reason: collision with root package name */
    private final String f28608a;

    /* renamed from: b  reason: collision with root package name */
    private final zzma f28609b;

    private r1(Context context, String str, boolean z10) {
        zzma zzma;
        this.f28608a = str;
        try {
            zzkm.zza();
            zzma.zza zza = new zzma.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str})).zza(zzkt.zza);
            zza.zza(String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str}));
            zzma = zza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            String message = e10.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + message);
            zzma = null;
        }
        this.f28609b = zzma;
    }

    public static r1 a(Context context, String str) {
        r1 r1Var = f28607c;
        if (r1Var == null || !zzw.zza(r1Var.f28608a, str)) {
            f28607c = new r1(context, str, true);
        }
        return f28607c;
    }

    public final String b() {
        if (this.f28609b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzcd zza = zzbi.zza((OutputStream) byteArrayOutputStream);
        try {
            synchronized (this.f28609b) {
                this.f28609b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            String message = e10.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + message);
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzma zzma = this.f28609b;
        if (zzma == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzma) {
                str2 = new String(((zzbo) this.f28609b.zza().zza(zzbo.class)).zza(Base64.decode(str, 8), (byte[]) null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            String message = e10.getMessage();
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
            return null;
        }
    }
}
