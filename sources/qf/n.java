package qf;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import rf.c;

/* compiled from: SoundPoolPlayer.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final SoundPool f37758a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, m> f37759b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<c, List<m>> f37760c;

    public n(SoundPool soundPool) {
        m.e(soundPool, "soundPool");
        this.f37758a = soundPool;
        Map<Integer, m> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        m.d(synchronizedMap, "synchronizedMap(mutableM…<Int, SoundPoolPlayer>())");
        this.f37759b = synchronizedMap;
        Map<c, List<m>> synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        m.d(synchronizedMap2, "synchronizedMap(mutableM…List<SoundPoolPlayer>>())");
        this.f37760c = synchronizedMap2;
    }

    public final void a() {
        this.f37758a.release();
        this.f37759b.clear();
        this.f37760c.clear();
    }

    public final Map<Integer, m> b() {
        return this.f37759b;
    }

    public final SoundPool c() {
        return this.f37758a;
    }

    public final Map<c, List<m>> d() {
        return this.f37760c;
    }
}
