package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
class zzlg<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    /* access modifiers changed from: private */
    public List<zzln> zzb;
    /* access modifiers changed from: private */
    public Map<K, V> zzc;
    private boolean zzd;
    private volatile zzls zze;
    /* access modifiers changed from: private */
    public Map<K, V> zzf;
    private volatile zzlk zzg;

    private zzlg(int i10) {
        this.zza = i10;
        this.zzb = Collections.emptyList();
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    private final int zza(K k10) {
        int size = this.zzb.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo((Comparable) this.zzb.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo((Comparable) this.zzb.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            TreeMap treeMap2 = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        zzg();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzls(this);
        }
        return this.zze;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlg)) {
            return super.equals(obj);
        }
        zzlg zzlg = (zzlg) obj;
        int size = size();
        if (size != zzlg.size()) {
            return false;
        }
        int zzb2 = zzb();
        if (zzb2 != zzlg.zzb()) {
            return entrySet().equals(zzlg.entrySet());
        }
        for (int i10 = 0; i10 < zzb2; i10++) {
            if (!zzb(i10).equals(zzlg.zzb(i10))) {
                return false;
            }
        }
        if (zzb2 != size) {
            return this.zzc.equals(zzlg.zzc);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        if (zza2 >= 0) {
            return this.zzb.get(zza2).getValue();
        }
        return this.zzc.get(comparable);
    }

    public int hashCode() {
        int zzb2 = zzb();
        int i10 = 0;
        for (int i11 = 0; i11 < zzb2; i11++) {
            i10 += this.zzb.get(i11).hashCode();
        }
        return this.zzc.size() > 0 ? i10 + this.zzc.hashCode() : i10;
    }

    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        if (zza2 >= 0) {
            return zzc(zza2);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        if (this.zzc.isEmpty()) {
            return zzlm.zza();
        }
        return this.zzc.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzd() {
        if (this.zzg == null) {
            this.zzg = new zzlk(this);
        }
        return this.zzg;
    }

    public final boolean zze() {
        return this.zzd;
    }

    public final Map.Entry<K, V> zzb(int i10) {
        return this.zzb.get(i10);
    }

    /* access modifiers changed from: private */
    public final V zzc(int i10) {
        zzg();
        V value = this.zzb.remove(i10).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzf().entrySet().iterator();
            this.zzb.add(new zzln(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    static <FieldDescriptorType extends zzis<FieldDescriptorType>> zzlg<FieldDescriptorType, Object> zza(int i10) {
        return new zzlf(i10);
    }

    /* renamed from: zza */
    public final V put(K k10, V v10) {
        zzg();
        int zza2 = zza(k10);
        if (zza2 >= 0) {
            return this.zzb.get(zza2).setValue(v10);
        }
        zzg();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i10 = -(zza2 + 1);
        if (i10 >= this.zza) {
            return zzf().put(k10, v10);
        }
        int size = this.zzb.size();
        int i11 = this.zza;
        if (size == i11) {
            zzln remove = this.zzb.remove(i11 - 1);
            zzf().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzb.add(i10, new zzln(this, k10, v10));
        return null;
    }

    public void zza() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = map;
            if (this.zzf.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = map2;
            this.zzd = true;
        }
    }
}
