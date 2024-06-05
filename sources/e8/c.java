package e8;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import y6.f;

/* compiled from: PersistedInstallation */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private File f28818a;

    /* renamed from: b  reason: collision with root package name */
    private final f f28819b;

    /* compiled from: PersistedInstallation */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(f fVar) {
        this.f28819b = fVar;
    }

    private File a() {
        if (this.f28818a == null) {
            synchronized (this) {
                if (this.f28818a == null) {
                    File filesDir = this.f28819b.m().getFilesDir();
                    this.f28818a = new File(filesDir, "PersistedInstallation." + this.f28819b.s() + ".json");
                }
            }
        }
        return this.f28818a;
    }

    private JSONObject c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public d b(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f28819b.m().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public d d() {
        JSONObject c10 = c();
        String optString = c10.optString("Fid", (String) null);
        int optInt = c10.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c10.optString("AuthToken", (String) null);
        String optString3 = c10.optString("RefreshToken", (String) null);
        long optLong = c10.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c10.optLong("ExpiresInSecs", 0);
        return d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c10.optString("FisError", (String) null)).a();
    }
}
