package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzaix;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaiv<T extends zzaix<T>> {
    private static final zzaiv zzb = new zzaiv(true);
    final zzalg<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzaiv() {
        this.zza = zzalg.zza(16);
    }

    static int zza(zzamr zzamr, int i10, Object obj) {
        int zzi = zzaik.zzi(i10);
        if (zzamr == zzamr.GROUP) {
            zzajf.zza((zzakn) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzamr, obj);
    }

    public static <T extends zzaix<T>> zzaiv<T> zzb() {
        return zzb;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzaiv zzaiv = new zzaiv();
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
            zzaiv.zzb((zzaix) zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry next : this.zza.zzb()) {
            zzaiv.zzb((zzaix) next.getKey(), next.getValue());
        }
        zzaiv.zzd = this.zzd;
        return zzaiv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaiv)) {
            return false;
        }
        return this.zza.equals(((zzaiv) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zzd) {
            return new zzajo(this.zza.zzc().iterator());
        }
        return this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzd) {
            return new zzajo(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zza(); i10++) {
                Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
                if (zzb2.getValue() instanceof zzajc) {
                    ((zzajc) zzb2.getValue()).zzs();
                }
            }
            this.zza.zzd();
            this.zzc = true;
        }
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            if (!zzc(this.zza.zzb(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzc2 : this.zza.zzb()) {
            if (!zzc(zzc2)) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        Object obj;
        zzaix zzaix = (zzaix) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzajn;
        if (zzaix.zze()) {
            if (!z10) {
                Object zza2 = zza(zzaix);
                if (zza2 == null) {
                    zza2 = new ArrayList();
                }
                for (Object zza3 : (List) value) {
                    ((List) zza2).add(zza(zza3));
                }
                this.zza.put(zzaix, zza2);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (zzaix.zzc() == zzanb.MESSAGE) {
            Object zza4 = zza(zzaix);
            if (zza4 == null) {
                this.zza.put(zzaix, zza(value));
                if (z10) {
                    this.zzd = true;
                    return;
                }
                return;
            }
            if (z10) {
                zzajn zzajn = (zzajn) value;
                value = zzajn.zza();
            }
            if (zza4 instanceof zzaks) {
                obj = zzaix.zza((zzaks) zza4, (zzaks) value);
            } else {
                obj = zzaix.zza(((zzakn) zza4).zzr(), (zzakn) value).zzf();
            }
            this.zza.put(zzaix, obj);
        } else if (!z10) {
            this.zza.put(zzaix, zza(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private zzaiv(zzalg<T, Object> zzalg) {
        this.zza = zzalg;
        zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzaje) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r6 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r5.zza()), r5.zzb().zzb(), r6.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzajn) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzamr r0 = r5.zzb()
            com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza(r6)
            int[] r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaiu.zza
            com.google.android.gms.internal.firebase-auth-api.zzanb r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                case 3: goto L_0x003f;
                case 4: goto L_0x003c;
                case 5: goto L_0x0039;
                case 6: goto L_0x0036;
                case 7: goto L_0x002c;
                case 8: goto L_0x0023;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = 0
            goto L_0x0047
        L_0x001a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzakn
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzajn
            if (r0 == 0) goto L_0x0018
            goto L_0x0034
        L_0x0023:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzaje
            if (r0 == 0) goto L_0x0018
            goto L_0x0034
        L_0x002c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzahp
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L_0x0018
        L_0x0034:
            r0 = 1
            goto L_0x0047
        L_0x0036:
            boolean r0 = r6 instanceof java.lang.String
            goto L_0x0047
        L_0x0039:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L_0x0047
        L_0x003c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L_0x0047
        L_0x003f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L_0x0047
        L_0x0042:
            boolean r0 = r6 instanceof java.lang.Long
            goto L_0x0047
        L_0x0045:
            boolean r0 = r6 instanceof java.lang.Integer
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            return
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.firebase-auth-api.zzamr r5 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzanb r5 = r5.zzb()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaiv.zzc(com.google.android.gms.internal.firebase-auth-api.zzaix, java.lang.Object):void");
    }

    private static int zza(zzamr zzamr, Object obj) {
        switch (zzaiu.zzb[zzamr.ordinal()]) {
            case 1:
                return zzaik.zza(((Double) obj).doubleValue());
            case 2:
                return zzaik.zza(((Float) obj).floatValue());
            case 3:
                return zzaik.zzd(((Long) obj).longValue());
            case 4:
                return zzaik.zzg(((Long) obj).longValue());
            case 5:
                return zzaik.zze(((Integer) obj).intValue());
            case 6:
                return zzaik.zzc(((Long) obj).longValue());
            case 7:
                return zzaik.zzd(((Integer) obj).intValue());
            case 8:
                return zzaik.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzaik.zza((zzakn) obj);
            case 10:
                if (obj instanceof zzajn) {
                    return zzaik.zza((zzajr) (zzajn) obj);
                }
                return zzaik.zzb((zzakn) obj);
            case 11:
                if (obj instanceof zzahp) {
                    return zzaik.zza((zzahp) obj);
                }
                return zzaik.zza((String) obj);
            case 12:
                if (obj instanceof zzahp) {
                    return zzaik.zza((zzahp) obj);
                }
                return zzaik.zza((byte[]) obj);
            case 13:
                return zzaik.zzj(((Integer) obj).intValue());
            case 14:
                return zzaik.zzg(((Integer) obj).intValue());
            case 15:
                return zzaik.zze(((Long) obj).longValue());
            case 16:
                return zzaik.zzh(((Integer) obj).intValue());
            case 17:
                return zzaik.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzaje) {
                    return zzaik.zzc(((zzaje) obj).zza());
                }
                return zzaik.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private zzaiv(boolean z10) {
        this(zzalg.zza(0));
        zze();
    }

    private static <T extends zzaix<T>> boolean zzc(Map.Entry<T, Object> entry) {
        zzaix zzaix = (zzaix) entry.getKey();
        if (zzaix.zzc() != zzanb.MESSAGE) {
            return true;
        }
        if (!zzaix.zze()) {
            return zzb(entry.getValue());
        }
        for (Object zzb2 : (List) entry.getValue()) {
            if (!zzb(zzb2)) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(T t10, Object obj) {
        if (!t10.zze()) {
            zzc(t10, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                zzc(t10, obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzajn) {
            this.zzd = true;
        }
        this.zza.put(t10, obj);
    }

    public static int zza(zzaix<?> zzaix, Object obj) {
        zzamr zzb2 = zzaix.zzb();
        int zza2 = zzaix.zza();
        if (!zzaix.zze()) {
            return zza(zzb2, zza2, obj);
        }
        List<Object> list = (List) obj;
        int i10 = 0;
        if (!zzaix.zzd()) {
            for (Object zza3 : list) {
                i10 += zza(zzb2, zza2, zza3);
            }
            return i10;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            for (Object zza4 : list) {
                i10 += zza(zzb2, zza4);
            }
            return zzaik.zzi(zza2) + i10 + zzaik.zzj(i10);
        }
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzakp) {
            return ((zzakp) obj).zzk();
        }
        if (obj instanceof zzajn) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            i10 += zza(this.zza.zzb(i11));
        }
        for (Map.Entry<T, Object> zza2 : this.zza.zzb()) {
            i10 += zza(zza2);
        }
        return i10;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        zzaix zzaix = (zzaix) entry.getKey();
        Object value = entry.getValue();
        if (zzaix.zzc() != zzanb.MESSAGE || zzaix.zze() || zzaix.zzd()) {
            return zza((zzaix<?>) zzaix, value);
        }
        if (value instanceof zzajn) {
            return zzaik.zza(((zzaix) entry.getKey()).zza(), (zzajr) (zzajn) value);
        }
        return zzaik.zza(((zzaix) entry.getKey()).zza(), (zzakn) value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzaks) {
            return ((zzaks) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (!(obj instanceof zzajn)) {
            return obj;
        }
        zzajn zzajn = (zzajn) obj;
        return zzajn.zza();
    }

    public final void zza(zzaiv<T> zzaiv) {
        for (int i10 = 0; i10 < zzaiv.zza.zza(); i10++) {
            zzb(zzaiv.zza.zzb(i10));
        }
        for (Map.Entry<T, Object> zzb2 : zzaiv.zza.zzb()) {
            zzb(zzb2);
        }
    }

    static void zza(zzaik zzaik, zzamr zzamr, int i10, Object obj) throws IOException {
        if (zzamr == zzamr.GROUP) {
            zzakn zzakn = (zzakn) obj;
            zzajf.zza(zzakn);
            zzaik.zzk(i10, 3);
            zzakn.zza(zzaik);
            zzaik.zzk(i10, 4);
            return;
        }
        zzaik.zzk(i10, zzamr.zza());
        switch (zzaiu.zzb[zzamr.ordinal()]) {
            case 1:
                zzaik.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzaik.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzaik.zzj(((Long) obj).longValue());
                return;
            case 4:
                zzaik.zzj(((Long) obj).longValue());
                return;
            case 5:
                zzaik.zzl(((Integer) obj).intValue());
                return;
            case 6:
                zzaik.zzh(((Long) obj).longValue());
                return;
            case 7:
                zzaik.zzk(((Integer) obj).intValue());
                return;
            case 8:
                zzaik.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzakn) obj).zza(zzaik);
                return;
            case 10:
                zzaik.zzc((zzakn) obj);
                return;
            case 11:
                if (obj instanceof zzahp) {
                    zzaik.zzb((zzahp) obj);
                    return;
                } else {
                    zzaik.zzb((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzahp) {
                    zzaik.zzb((zzahp) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzaik.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzaik.zzn(((Integer) obj).intValue());
                return;
            case 14:
                zzaik.zzk(((Integer) obj).intValue());
                return;
            case 15:
                zzaik.zzh(((Long) obj).longValue());
                return;
            case 16:
                zzaik.zzm(((Integer) obj).intValue());
                return;
            case 17:
                zzaik.zzi(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzaje) {
                    zzaik.zzl(((zzaje) obj).zza());
                    return;
                } else {
                    zzaik.zzl(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
