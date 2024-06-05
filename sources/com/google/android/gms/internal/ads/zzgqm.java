package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqm;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgqm<MessageType extends zzgqm<MessageType, BuilderType>, BuilderType extends zzgqi<MessageType, BuilderType>> extends zzgon<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgth zzc = zzgth.zzc();
    private int zzd = -1;

    private final int zza(zzgsp zzgsp) {
        if (zzgsp != null) {
            return zzgsp.zza(this);
        }
        return zzgse.zza().zzb(getClass()).zza(this);
    }

    static zzgqm zzaC(Class cls) {
        Map map = zzb;
        zzgqm zzgqm = (zzgqm) map.get(cls);
        if (zzgqm == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgqm = (zzgqm) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzgqm == null) {
            zzgqm = (zzgqm) ((zzgqm) zzgtq.zzg(cls)).zzb(6, (Object) null, (Object) null);
            if (zzgqm != null) {
                map.put(cls, zzgqm);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgqm;
    }

    protected static zzgqm zzaE(zzgqm zzgqm, zzgpe zzgpe) throws zzgqy {
        zzgpy zzgpy = zzgpy.zza;
        zzgpm zzl = zzgpe.zzl();
        zzgqm zzaD = zzgqm.zzaD();
        try {
            zzgsp zzb2 = zzgse.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgpn.zzq(zzl), zzgpy);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                zzc(zzaD);
                return zzaD;
            } catch (zzgqy e10) {
                e10.zzh(zzaD);
                throw e10;
            }
        } catch (zzgqy e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzgqy((IOException) e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgtf e12) {
            zzgqy zza = e12.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgqy) {
                throw ((zzgqy) e13.getCause());
            }
            zzgqy zzgqy = new zzgqy(e13);
            zzgqy.zzh(zzaD);
            throw zzgqy;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgqy) {
                throw ((zzgqy) e14.getCause());
            }
            throw e14;
        }
    }

    protected static zzgqm zzaF(zzgqm zzgqm, byte[] bArr) throws zzgqy {
        zzgqm zzd2 = zzd(zzgqm, bArr, 0, bArr.length, zzgpy.zza);
        zzc(zzd2);
        return zzd2;
    }

    protected static zzgqm zzaG(zzgqm zzgqm, zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        zzgpm zzl = zzgpe.zzl();
        zzgqm zzaD = zzgqm.zzaD();
        try {
            zzgsp zzb2 = zzgse.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgpn.zzq(zzl), zzgpy);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                return zzaD;
            } catch (zzgqy e10) {
                e10.zzh(zzaD);
                throw e10;
            }
        } catch (zzgqy e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzgqy((IOException) e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgtf e12) {
            zzgqy zza = e12.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgqy) {
                throw ((zzgqy) e13.getCause());
            }
            zzgqy zzgqy = new zzgqy(e13);
            zzgqy.zzh(zzaD);
            throw zzgqy;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgqy) {
                throw ((zzgqy) e14.getCause());
            }
            throw e14;
        }
    }

    protected static zzgqm zzaH(zzgqm zzgqm, InputStream inputStream, zzgpy zzgpy) throws zzgqy {
        zzgpm zzH = zzgpm.zzH(inputStream, 4096);
        zzgqm zzaD = zzgqm.zzaD();
        try {
            zzgsp zzb2 = zzgse.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgpn.zzq(zzH), zzgpy);
            zzb2.zzf(zzaD);
            zzc(zzaD);
            return zzaD;
        } catch (zzgqy e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgqy((IOException) e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgtf e11) {
            zzgqy zza = e11.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgqy) {
                throw ((zzgqy) e12.getCause());
            }
            zzgqy zzgqy = new zzgqy(e12);
            zzgqy.zzh(zzaD);
            throw zzgqy;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgqy) {
                throw ((zzgqy) e13.getCause());
            }
            throw e13;
        }
    }

    protected static zzgqm zzaI(zzgqm zzgqm, byte[] bArr, zzgpy zzgpy) throws zzgqy {
        zzgqm zzd2 = zzd(zzgqm, bArr, 0, bArr.length, zzgpy);
        zzc(zzd2);
        return zzd2;
    }

    protected static zzgqr zzaJ() {
        return zzgqn.zzf();
    }

    protected static zzgqr zzaK(zzgqr zzgqr) {
        int size = zzgqr.size();
        return zzgqr.zzg(size == 0 ? 10 : size + size);
    }

    protected static zzgqu zzaL() {
        return zzgrl.zzf();
    }

    protected static zzgqv zzaM() {
        return zzgsf.zze();
    }

    protected static zzgqv zzaN(zzgqv zzgqv) {
        int size = zzgqv.size();
        return zzgqv.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzaQ(zzgrw zzgrw, String str, Object[] objArr) {
        return new zzgsg(zzgrw, str, objArr);
    }

    protected static void zzaT(Class cls, zzgqm zzgqm) {
        zzgqm.zzaS();
        zzb.put(cls, zzgqm);
    }

    private static zzgqm zzc(zzgqm zzgqm) throws zzgqy {
        if (zzgqm == null || zzgqm.zzaW()) {
            return zzgqm;
        }
        zzgqy zza = new zzgtf(zzgqm).zza();
        zza.zzh(zzgqm);
        throw zza;
    }

    private static zzgqm zzd(zzgqm zzgqm, byte[] bArr, int i10, int i11, zzgpy zzgpy) throws zzgqy {
        zzgqm zzaD = zzgqm.zzaD();
        try {
            zzgsp zzb2 = zzgse.zza().zzb(zzaD.getClass());
            zzb2.zzi(zzaD, bArr, 0, i11, new zzgoq(zzgpy));
            zzb2.zzf(zzaD);
            return zzaD;
        } catch (zzgqy e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgqy((IOException) e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgtf e11) {
            zzgqy zza = e11.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgqy) {
                throw ((zzgqy) e12.getCause());
            }
            zzgqy zzgqy = new zzgqy(e12);
            zzgqy.zzh(zzaD);
            throw zzgqy;
        } catch (IndexOutOfBoundsException unused) {
            zzgqy zzj = zzgqy.zzj();
            zzj.zzh(zzaD);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgse.zza().zzb(getClass()).zzj(this, (zzgqm) obj);
    }

    public final int hashCode() {
        if (zzaX()) {
            return zzay();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzay = zzay();
        this.zza = zzay;
        return zzay;
    }

    public final String toString() {
        return zzgry.zza(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final zzgqi zzaA() {
        return (zzgqi) zzb(5, (Object) null, (Object) null);
    }

    public final zzgqi zzaB() {
        zzgqi zzgqi = (zzgqi) zzb(5, (Object) null, (Object) null);
        zzgqi.zzaj(this);
        return zzgqi;
    }

    /* access modifiers changed from: package-private */
    public final zzgqm zzaD() {
        return (zzgqm) zzb(4, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzgrv zzaO() {
        return (zzgqi) zzb(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void zzaR() {
        zzgse.zza().zzb(getClass()).zzf(this);
        zzaS();
    }

    /* access modifiers changed from: package-private */
    public final void zzaS() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public final void zzaU(int i10) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | a.e.API_PRIORITY_OTHER;
    }

    public final void zzaV(zzgpt zzgpt) throws IOException {
        zzgse.zza().zzb(getClass()).zzm(this, zzgpu.zza(zzgpt));
    }

    public final boolean zzaW() {
        byte byteValue = ((Byte) zzb(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgse.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, (Object) null);
        return zzk;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaX() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzat(zzgsp zzgsp) {
        if (zzaX()) {
            int zza = zza(zzgsp);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zza(zzgsp);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    /* access modifiers changed from: package-private */
    public final int zzay() {
        return zzgse.zza().zzb(getClass()).zzb(this);
    }

    public final int zzaz() {
        int i10;
        if (zzaX()) {
            i10 = zza((zzgsp) null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & a.e.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zza((zzgsp) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i10;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public abstract Object zzb(int i10, Object obj, Object obj2);

    public final /* synthetic */ zzgrw zzbf() {
        return (zzgqm) zzb(6, (Object) null, (Object) null);
    }
}
