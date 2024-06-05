package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzawe {
    private final zzawk zza;
    private final zzaxt zzb;
    private final boolean zzc;

    private zzawe() {
        this.zzb = zzaxu.zzd();
        this.zzc = false;
        this.zza = new zzawk();
    }

    public static zzawe zza() {
        return new zzawe();
    }

    private final synchronized String zzd(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.zzb.zzk(), Long.valueOf(t.b().b()), Integer.valueOf(i10 - 1), Base64.encodeToString(((zzaxu) this.zzb.zzal()).zzax(), 3)});
    }

    private final synchronized void zze(int i10) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(zzd(i10).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        n1.a("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    n1.a("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        n1.a("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                n1.a("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    n1.a("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized void zzf(int i10) {
        zzaxt zzaxt = this.zzb;
        zzaxt.zzd();
        List<String> zzb2 = zzbar.zzb();
        ArrayList arrayList = new ArrayList();
        for (String split : zzb2) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    n1.a("Experiment ID is not a number");
                }
            }
        }
        zzaxt.zzc(arrayList);
        zzawj zzawj = new zzawj(this.zza, ((zzaxu) this.zzb.zzal()).zzax(), (zzawi) null);
        int i11 = i10 - 1;
        zzawj.zza(i11);
        zzawj.zzc();
        n1.a("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void zzb(zzawd zzawd) {
        if (this.zzc) {
            try {
                zzawd.zza(this.zzb);
            } catch (NullPointerException e10) {
                t.q().zzu(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) a0.c().zzb(zzbar.zzex)).booleanValue()) {
                zze(i10);
            } else {
                zzf(i10);
            }
        }
    }

    public zzawe(zzawk zzawk) {
        this.zzb = zzaxu.zzd();
        this.zza = zzawk;
        this.zzc = ((Boolean) a0.c().zzb(zzbar.zzew)).booleanValue();
    }
}
