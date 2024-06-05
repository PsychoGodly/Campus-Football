package b;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import dc.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import lc.c;
import lc.j;
import lc.k;

/* compiled from: RingtoneSetPlugin */
public class a implements dc.a, k.c {

    /* renamed from: a  reason: collision with root package name */
    private k f5360a;

    /* renamed from: b  reason: collision with root package name */
    private Context f5361b;

    private boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            return true;
        }
        boolean canWrite = Settings.System.canWrite(this.f5361b);
        if (canWrite || i10 < 23) {
            return canWrite;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + this.f5361b.getPackageName()));
        intent.addFlags(268435456);
        this.f5361b.startActivity(intent);
        return canWrite;
    }

    private void c(String str, boolean z10) {
        OutputStream openOutputStream;
        a();
        File file = new File(str);
        String type = this.f5361b.getContentResolver().getType(Uri.fromFile(file));
        if (type == null) {
            type = ".mp3";
        }
        Log.e("from set ringtone ", "mime : " + type);
        if (file.exists()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", file.getAbsolutePath());
            contentValues.put("title", "KolpacinoRingtone");
            contentValues.put("mime_type", "audio/mpeg");
            contentValues.put("_size", Long.valueOf(file.length()));
            contentValues.put("artist", "Kolpaçino Sesleri");
            contentValues.put("is_ringtone", Boolean.valueOf(!z10));
            contentValues.put("is_notification", Boolean.valueOf(z10));
            contentValues.put("is_alarm", Boolean.TRUE);
            contentValues.put("is_music", Boolean.FALSE);
            Uri insert = this.f5361b.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
            try {
                openOutputStream = this.f5361b.getContentResolver().openOutputStream(insert);
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    bufferedInputStream.read(bArr, 0, length);
                    bufferedInputStream.close();
                    openOutputStream.write(bArr);
                    openOutputStream.close();
                    openOutputStream.flush();
                } catch (IOException unused) {
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (z10) {
                RingtoneManager.setActualDefaultRingtoneUri(this.f5361b, 2, insert);
                return;
            } else {
                RingtoneManager.setActualDefaultRingtoneUri(this.f5361b, 1, insert);
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public void b(Context context, c cVar) {
        if (this.f5360a == null) {
            this.f5361b = context;
            k kVar = new k(cVar, "ringtone_set");
            this.f5360a = kVar;
            kVar.e(this);
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        b(bVar.a(), bVar.b());
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f5360a.e((k.c) null);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if (jVar.f36116a.equals("getPlatformVersion")) {
            dVar.success("Android " + Build.VERSION.RELEASE);
        }
        if (jVar.f36116a.equals("setRingtone")) {
            c((String) jVar.a("path"), false);
            dVar.success("success");
        } else if (jVar.f36116a.equals("setNotification")) {
            c((String) jVar.a("path"), true);
            dVar.success("success");
        } else {
            dVar.notImplemented();
        }
    }
}
