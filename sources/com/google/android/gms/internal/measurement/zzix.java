package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzix.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public abstract class zzix<MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhd<MessageType, BuilderType> {
    private static Map<Object, zzix<?, ?>> zzc = new ConcurrentHashMap();
    protected zzlz zzb = zzlz.zzc();
    private int zzd = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    protected static class zza<T extends zzix<T, ?>> extends zzhh<T> {
        private final T zza;

        public zza(T t10) {
            this.zza = t10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    public static abstract class zzb<MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhf<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        protected zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzcj()) {
                this.zza = messagetype.zzbz();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private final BuilderType zzb(byte[] bArr, int i10, int i11, zzik zzik) throws zzji {
            if (!this.zza.zzcj()) {
                zzae();
            }
            try {
                zzkx.zza().zza(this.zza).zza(this.zza, bArr, 0, i11, new zzhl(zzik));
                return this;
            } catch (zzji e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw zzji.zzh();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: zzc */
        public final BuilderType zzb(zzib zzib, zzik zzik) throws IOException {
            if (!this.zza.zzcj()) {
                zzae();
            }
            try {
                zzkx.zza().zza(this.zza).zza(this.zza, zzif.zza(zzib), zzik);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzb2 = (zzb) this.zzb.zza(zze.zze, (Object) null, (Object) null);
            zzb2.zza = (zzix) zzac();
            return zzb2;
        }

        public final /* synthetic */ zzhf zza(zzib zzib, zzik zzik) throws IOException {
            return (zzb) zzb(zzib, zzik);
        }

        /* renamed from: zzaa */
        public MessageType zzac() {
            if (!this.zza.zzcj()) {
                return this.zza;
            }
            this.zza.zzcg();
            return this.zza;
        }

        /* access modifiers changed from: protected */
        public final void zzad() {
            if (!this.zza.zzcj()) {
                zzae();
            }
        }

        /* access modifiers changed from: protected */
        public void zzae() {
            MessageType zzbz = this.zzb.zzbz();
            zza(zzbz, this.zza);
            this.zza = zzbz;
        }

        public final /* synthetic */ zzkj zzcf() {
            return this.zzb;
        }

        public final boolean zzci() {
            return zzix.zza(this.zza, false);
        }

        public final /* synthetic */ zzhf zzy() {
            return (zzb) clone();
        }

        /* renamed from: zzz */
        public final MessageType zzab() {
            MessageType messagetype = (zzix) zzac();
            if (messagetype.zzci()) {
                return messagetype;
            }
            throw new zzlx(messagetype);
        }

        public final /* synthetic */ zzhf zza(byte[] bArr, int i10, int i11) throws zzji {
            return zzb(bArr, 0, i11, zzik.zza);
        }

        public final /* synthetic */ zzhf zza(byte[] bArr, int i10, int i11, zzik zzik) throws zzji {
            return zzb(bArr, 0, i11, zzik);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzcj()) {
                zzae();
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzkx.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    static final class zzc implements zzis<zzc> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zzmn zzb() {
            throw new NoSuchMethodError();
        }

        public final zzmx zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzkm zza(zzkm zzkm, zzkj zzkj) {
            throw new NoSuchMethodError();
        }

        public final zzks zza(zzks zzks, zzks zzks2) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzix<MessageType, BuilderType> implements zzkl {
        protected zziq<zzc> zzc = zziq.zzb();

        /* access modifiers changed from: package-private */
        public final zziq<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zziq) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    public static final class zze {
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

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
    public static class zzf<ContainingType extends zzkj, Type> extends zzil<ContainingType, Type> {
    }

    private final int zza() {
        return zzkx.zza().zza(this).zzb(this);
    }

    private final int zzb(zzlb<?> zzlb) {
        if (zzlb == null) {
            return zzkx.zza().zza(this).zza(this);
        }
        return zzlb.zza(this);
    }

    protected static zzjd zzca() {
        return zzja.zzd();
    }

    protected static zzjg zzcb() {
        return zzjy.zzd();
    }

    protected static <E> zzjf<E> zzcc() {
        return zzla.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzkx.zza().zza(this).zzb(this, (zzix) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzcj()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzko.zza((zzkj) this, super.toString());
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i10, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zzbt() {
        return this.zzd & a.e.API_PRIORITY_OTHER;
    }

    public final int zzbw() {
        return zza((zzlb) null);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzix<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbx() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzby() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    /* access modifiers changed from: package-private */
    public final MessageType zzbz() {
        return (zzix) zza(zze.zzd, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & a.e.API_PRIORITY_OTHER) | (this.zzd & RecyclerView.UNDEFINED_DURATION);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    public final /* synthetic */ zzkm zzcd() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzkm zzce() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final /* synthetic */ zzkj zzcf() {
        return (zzix) zza(zze.zzf, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void zzcg() {
        zzkx.zza().zza(this).zzc(this);
        zzch();
    }

    /* access modifiers changed from: package-private */
    public final void zzch() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzci() {
        return zza(this, true);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzcj() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzlb zzlb) {
        if (zzcj()) {
            int zzb2 = zzb(zzlb);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        } else if (zzbt() != Integer.MAX_VALUE) {
            return zzbt();
        } else {
            int zzb3 = zzb(zzlb);
            zzc(zzb3);
            return zzb3;
        }
    }

    static <T extends zzix<?, ?>> T zza(Class<T> cls) {
        T t10 = (zzix) zzc.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (zzix) zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (zzix) ((zzix) zzmg.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (t10 != null) {
                zzc.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    protected static zzjg zza(zzjg zzjg) {
        int size = zzjg.size();
        return zzjg.zzc(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzjf<E> zza(zzjf<E> zzjf) {
        int size = zzjf.size();
        return zzjf.zza(size == 0 ? 10 : size << 1);
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

    protected static Object zza(zzkj zzkj, String str, Object[] objArr) {
        return new zzkz(zzkj, str, objArr);
    }

    protected static <T extends zzix<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzch();
        zzc.put(cls, t10);
    }

    public final void zza(zzig zzig) throws IOException {
        zzkx.zza().zza(this).zza(this, (zzmw) zzij.zza(zzig));
    }

    protected static final <T extends zzix<T, ?>> boolean zza(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.zza(zze.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzkx.zza().zza(t10).zzd(t10);
        if (z10) {
            t10.zza(zze.zzb, (Object) zzd2 ? t10 : null, (Object) null);
        }
        return zzd2;
    }
}
