package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzma  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzma {
    /* access modifiers changed from: private */
    public static final Object zza = new Object();
    /* access modifiers changed from: private */
    public static final String zzb = "zzma";
    private final zzcd zzc;
    private final zzbg zzd;
    private zzcb zze;

    private zzma(zza zza2) {
        this.zzc = new zzmf(zza2.zza, zza2.zzb, zza2.zzc);
        this.zzd = zza2.zze;
        this.zze = zza2.zzi;
    }

    static /* synthetic */ boolean zzd() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public final synchronized zzbx zza() throws GeneralSecurityException {
        return this.zze.zza();
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzma$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        /* access modifiers changed from: private */
        public Context zza = null;
        /* access modifiers changed from: private */
        public String zzb = null;
        /* access modifiers changed from: private */
        public String zzc = null;
        private String zzd = null;
        /* access modifiers changed from: private */
        public zzbg zze = null;
        private boolean zzf = true;
        private zzbu zzg = null;
        private zzvb zzh = null;
        /* access modifiers changed from: private */
        public zzcb zzi;

        private static zzcb zza(byte[] bArr) throws GeneralSecurityException, IOException {
            return zzcb.zza(zzbl.zza(zzbj.zza(bArr)));
        }

        private final zzbg zzb() throws GeneralSecurityException {
            if (!zzma.zzd()) {
                Log.w(zzma.zzb, "Android Keystore requires at least Android M");
                return null;
            }
            zzmd zzmd = new zzmd();
            try {
                boolean zzc2 = zzmd.zzc(this.zzd);
                try {
                    return zzmd.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (zzc2) {
                        Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e10);
                        return null;
                    }
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.zzd}), e10);
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public final zza zza(zzvb zzvb) {
            this.zzh = zzvb;
            return this;
        }

        public final zza zza(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.zzf) {
                this.zzd = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        public final zza zza(Context context, String str, String str2) throws IOException {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        private final zzcb zzb(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.zze = new zzmd().zza(this.zzd);
                try {
                    return zzcb.zza(zzbx.zza(zzbj.zza(bArr), this.zze));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    zzcb zza2 = zza(bArr);
                    Log.w(zzma.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                    return zza2;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        public final synchronized zzma zza() throws GeneralSecurityException, IOException {
            zzma zzma;
            if (this.zzb != null) {
                zzvb zzvb = this.zzh;
                if (zzvb != null && this.zzg == null) {
                    this.zzg = zzbu.zza(zzcu.zza(zzvb.zzj()));
                }
                synchronized (zzma.zza) {
                    byte[] zzb2 = zzb(this.zza, this.zzb, this.zzc);
                    if (zzb2 == null) {
                        if (this.zzd != null) {
                            this.zze = zzb();
                        }
                        if (this.zzg != null) {
                            zzcb zza2 = zzcb.zzb().zza(this.zzg);
                            zzcb zza3 = zza2.zza(zza2.zza().zzc().zza(0).zza());
                            zzma.zza(zza3.zza(), new zzmf(this.zza, this.zzb, this.zzc), this.zze);
                            this.zzi = zza3;
                        } else {
                            throw new GeneralSecurityException("cannot read or generate keyset");
                        }
                    } else {
                        if (this.zzd != null) {
                            if (zzma.zzd()) {
                                this.zzi = zzb(zzb2);
                            }
                        }
                        this.zzi = zza(zzb2);
                    }
                    zzma = new zzma(this);
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            return zzma;
        }

        private static byte[] zzb(Context context, String str, String str2) throws IOException {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, (String) null);
                    if (string == null) {
                        return null;
                    }
                    if (string.length() % 2 == 0) {
                        int length = string.length() / 2;
                        byte[] bArr = new byte[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            int i11 = i10 * 2;
                            int digit = Character.digit(string.charAt(i11), 16);
                            int digit2 = Character.digit(string.charAt(i11 + 1), 16);
                            if (digit == -1 || digit2 == -1) {
                                throw new IllegalArgumentException("input is not hexadecimal");
                            }
                            bArr[i10] = (byte) ((digit << 4) + digit2);
                        }
                        return bArr;
                    }
                    throw new IllegalArgumentException("Expected a string of even length");
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{str}));
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        }
    }

    static /* synthetic */ void zza(zzbx zzbx, zzcd zzcd, zzbg zzbg) {
        if (zzbg != null) {
            try {
                zzbx.zza(zzcd, zzbg);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        } else {
            zzbl.zza(zzbx, zzcd);
        }
    }
}
