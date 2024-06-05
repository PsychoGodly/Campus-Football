package p2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import k4.n0;
import n2.r1;
import s6.d1;
import s6.u;
import s6.v;
import v6.e;

/* compiled from: AudioCapabilities */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f21256c = new f(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final f f21257d = new f(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final v<Integer, Integer> f21258e = new v.a().f(5, 6).f(17, 6).f(7, 6).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f21259a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21260b;

    /* compiled from: AudioCapabilities */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final AudioAttributes f21261a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int[] a() {
            u.a p10 = u.p();
            d1 m10 = f.f21258e.keySet().iterator();
            while (m10.hasNext()) {
                int intValue = ((Integer) m10.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f21261a)) {
                    p10.a(Integer.valueOf(intValue));
                }
            }
            p10.a(2);
            return e.l(p10.k());
        }

        public static int b(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(n0.G(i12)).build(), f21261a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public f(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f21259a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f21259a = new int[0];
        }
        this.f21260b = i10;
    }

    private static boolean b() {
        if (n0.f19738a >= 17) {
            String str = n0.f19740c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static f c(Context context) {
        return d(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static f d(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f21257d;
        }
        if (n0.f19738a >= 29 && (n0.x0(context) || n0.s0(context))) {
            return new f(a.a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f21256c;
        }
        return new f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    private static int e(int i10) {
        int i11 = n0.f19738a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(n0.f19739b) && i10 == 1) {
            i10 = 2;
        }
        return n0.G(i10);
    }

    private static int g(int i10, int i11) {
        if (n0.f19738a >= 29) {
            return a.b(i10, i11);
        }
        return ((Integer) k4.a.e(f21258e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Arrays.equals(this.f21259a, fVar.f21259a) || this.f21260b != fVar.f21260b) {
            return false;
        }
        return true;
    }

    public Pair<Integer, Integer> f(r1 r1Var) {
        int f10 = k4.v.f((String) k4.a.e(r1Var.f20654m), r1Var.f20651j);
        if (!f21258e.containsKey(Integer.valueOf(f10))) {
            return null;
        }
        if (f10 == 18 && !i(18)) {
            f10 = 6;
        } else if (f10 == 8 && !i(8)) {
            f10 = 7;
        }
        if (!i(f10)) {
            return null;
        }
        int i10 = r1Var.f20667z;
        if (i10 == -1 || f10 == 18) {
            int i11 = r1Var.A;
            if (i11 == -1) {
                i11 = 48000;
            }
            i10 = g(f10, i11);
        } else if (i10 > this.f21260b) {
            return null;
        }
        int e10 = e(i10);
        if (e10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f10), Integer.valueOf(e10));
    }

    public boolean h(r1 r1Var) {
        return f(r1Var) != null;
    }

    public int hashCode() {
        return this.f21260b + (Arrays.hashCode(this.f21259a) * 31);
    }

    public boolean i(int i10) {
        return Arrays.binarySearch(this.f21259a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f21260b + ", supportedEncodings=" + Arrays.toString(this.f21259a) + "]";
    }
}
