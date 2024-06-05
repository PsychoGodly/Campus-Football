package com.google.android.gms.internal.p001firebaseauthapi;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc.zza;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzajc<MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzahf<MessageType, BuilderType> {
    private static Map<Object, zzajc<?, ?>> zzc = new ConcurrentHashMap();
    protected zzamd zzb = zzamd.zzc();
    private int zzd = -1;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajc$zzb */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzajc<MessageType, BuilderType> implements zzakp {
        protected zzaiv<zze> zzc = zzaiv.zzb();

        /* access modifiers changed from: package-private */
        public final zzaiv<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzaiv) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajc$zzc */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    protected static class zzc<T extends zzajc<T, ?>> extends zzahg<T> {
        private final T zza;

        public zzc(T t10) {
            this.zza = t10;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajc$zzd */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static class zzd<ContainingType extends zzakn, Type> extends zzaip<ContainingType, Type> {
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajc$zze */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    static final class zze implements zzaix<zze> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zzamr zzb() {
            throw new NoSuchMethodError();
        }

        public final zzanb zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzakm zza(zzakm zzakm, zzakn zzakn) {
            throw new NoSuchMethodError();
        }

        public final zzaks zza(zzaks zzaks, zzaks zzaks2) {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajc$zzf */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    private final int zza() {
        return zzalb.zza().zza(this).zzb(this);
    }

    private final int zzb(zzalf<?> zzalf) {
        if (zzalf == null) {
            return zzalb.zza().zza(this).zza(this);
        }
        return zzalf.zza(this);
    }

    protected static <E> zzajj<E> zzp() {
        return zzala.zzd();
    }

    /* access modifiers changed from: package-private */
    public final int a_() {
        return this.zzd & a.e.API_PRIORITY_OTHER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzalb.zza().zza(this).zzb(this, (zzajc) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzako.zza((zzakn) this, super.toString());
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i10, Object obj, Object obj2);

    public final /* synthetic */ zzakn zzh() {
        return (zzajc) zza(zzf.zzf, (Object) null, (Object) null);
    }

    public final boolean zzk() {
        return zza(this, true);
    }

    public final int zzl() {
        return zza((zzalf) null);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzm() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    /* access modifiers changed from: package-private */
    public final MessageType zzo() {
        return (zzajc) zza(zzf.zzd, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzakm zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzakm zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    /* access modifiers changed from: protected */
    public final void zzs() {
        zzalb.zza().zza(this).zzc(this);
        zzt();
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzu() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzalf zzalf) {
        if (zzu()) {
            int zzb2 = zzb((zzalf<?>) zzalf);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        } else if (a_() != Integer.MAX_VALUE) {
            return a_();
        } else {
            int zzb3 = zzb((zzalf<?>) zzalf);
            zzb(zzb3);
            return zzb3;
        }
    }

    private static <T extends zzajc<T, ?>> T zzb(T t10, zzahp zzahp, zzaio zzaio) throws zzaji {
        zzaia zzc2 = zzahp.zzc();
        T zza2 = zza(t10, zzc2, zzaio);
        try {
            zzc2.zzc(0);
            return zza2;
        } catch (zzaji e10) {
            throw e10.zza(zza2);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajc$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static abstract class zza<MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzahe<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        protected zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzu()) {
                this.zza = messagetype.zzo();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza2 = (zza) this.zzb.zza(zzf.zze, (Object) null, (Object) null);
            zza2.zza = (zzajc) zzg();
            return zza2;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzj();
            }
            zza(this.zza, messagetype);
            return this;
        }

        public final /* synthetic */ zzahe zzc() {
            return (zza) clone();
        }

        /* renamed from: zzd */
        public final MessageType zzf() {
            MessageType messagetype = (zzajc) zzg();
            if (messagetype.zzk()) {
                return messagetype;
            }
            throw new zzamc(messagetype);
        }

        /* renamed from: zze */
        public MessageType zzg() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        public final /* synthetic */ zzakn zzh() {
            return this.zzb;
        }

        /* access modifiers changed from: protected */
        public final void zzi() {
            if (!this.zza.zzu()) {
                zzj();
            }
        }

        /* access modifiers changed from: protected */
        public void zzj() {
            MessageType zzo = this.zzb.zzo();
            zza(zzo, this.zza);
            this.zza = zzo;
        }

        public final boolean zzk() {
            return zzajc.zza(this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzalb.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & a.e.API_PRIORITY_OTHER) | (this.zzd & RecyclerView.UNDEFINED_DURATION);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    private static <T extends zzajc<T, ?>> T zza(T t10) throws zzaji {
        if (t10 == null || t10.zzk()) {
            return t10;
        }
        throw new zzamc(t10).zza().zza(t10);
    }

    static <T extends zzajc<?, ?>> T zza(Class<T> cls) {
        T t10 = (zzajc) zzc.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (zzajc) zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (zzajc) ((zzajc) zzamk.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (t10 != null) {
                zzc.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    protected static <T extends zzajc<T, ?>> T zza(T t10, zzahp zzahp, zzaio zzaio) throws zzaji {
        return zza(zzb(t10, zzahp, zzaio));
    }

    protected static <T extends zzajc<T, ?>> T zza(T t10, InputStream inputStream, zzaio zzaio) throws zzaji {
        zzaia zzaia;
        if (inputStream == null) {
            byte[] bArr = zzajf.zzb;
            zzaia = zzaia.zza(bArr, 0, bArr.length, false);
        } else {
            zzaia = new zzaif(inputStream);
        }
        return zza(zza(t10, zzaia, zzaio));
    }

    protected static <T extends zzajc<T, ?>> T zza(T t10, byte[] bArr, zzaio zzaio) throws zzaji {
        return zza(zza(t10, bArr, 0, bArr.length, zzaio));
    }

    private static <T extends zzajc<T, ?>> T zza(T t10, zzaia zzaia, zzaio zzaio) throws zzaji {
        T zzo = t10.zzo();
        try {
            zzalf zza2 = zzalb.zza().zza(zzo);
            zza2.zza(zzo, zzaij.zza(zzaia), zzaio);
            zza2.zzc(zzo);
            return zzo;
        } catch (zzaji e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzaji((IOException) e);
            }
            throw e.zza(zzo);
        } catch (zzamc e11) {
            throw e11.zza().zza(zzo);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaji) {
                throw ((zzaji) e12.getCause());
            }
            throw new zzaji(e12).zza(zzo);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaji) {
                throw ((zzaji) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends zzajc<T, ?>> T zza(T t10, byte[] bArr, int i10, int i11, zzaio zzaio) throws zzaji {
        T zzo = t10.zzo();
        try {
            zzalf zza2 = zzalb.zza().zza(zzo);
            zza2.zza(zzo, bArr, 0, i11, new zzahk(zzaio));
            zza2.zzc(zzo);
            return zzo;
        } catch (zzaji e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzaji((IOException) e);
            }
            throw e.zza(zzo);
        } catch (zzamc e11) {
            throw e11.zza().zza(zzo);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaji) {
                throw ((zzaji) e12.getCause());
            }
            throw new zzaji(e12).zza(zzo);
        } catch (IndexOutOfBoundsException unused) {
            throw zzaji.zzi().zza(zzo);
        }
    }

    protected static <E> zzajj<E> zza(zzajj<E> zzajj) {
        int size = zzajj.size();
        return zzajj.zza(size == 0 ? 10 : size << 1);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
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

    protected static Object zza(zzakn zzakn, String str, Object[] objArr) {
        return new zzald(zzakn, str, objArr);
    }

    protected static <T extends zzajc<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzt();
        zzc.put(cls, t10);
    }

    public final void zza(zzaik zzaik) throws IOException {
        zzalb.zza().zza(this).zza(this, (zzana) zzain.zza(zzaik));
    }

    protected static final <T extends zzajc<T, ?>> boolean zza(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.zza(zzf.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzalb.zza().zza(t10).zzd(t10);
        if (z10) {
            t10.zza(zzf.zzb, (Object) zzd2 ? t10 : null, (Object) null);
        }
        return zzd2;
    }
}
