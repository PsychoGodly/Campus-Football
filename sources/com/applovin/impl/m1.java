package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.impl.ab;
import java.util.Arrays;
import java.util.Collection;

public final class m1 {

    /* renamed from: c  reason: collision with root package name */
    public static final m1 f9303c = new m1(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final m1 f9304d = new m1(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f9305e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f9306a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9307b;

    private static final class a {
        public static int[] a() {
            ab.a f10 = ab.f();
            for (int i10 : m1.f9305e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    f10.b(Integer.valueOf(i10));
                }
            }
            f10.b(2);
            return pb.a((Collection) f10.a());
        }
    }

    public m1(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f9306a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f9306a = new int[0];
        }
        this.f9307b = i10;
    }

    public static m1 a(Context context) {
        return a(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    private static boolean b() {
        if (yp.f13662a >= 17) {
            String str = yp.f13664c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int c() {
        return this.f9307b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (!Arrays.equals(this.f9306a, m1Var.f9306a) || this.f9307b != m1Var.f9307b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f9307b + (Arrays.hashCode(this.f9306a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f9307b + ", supportedEncodings=" + Arrays.toString(this.f9306a) + "]";
    }

    public boolean a(int i10) {
        return Arrays.binarySearch(this.f9306a, i10) >= 0;
    }

    static m1 a(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f9304d;
        }
        if (yp.f13662a >= 29 && yp.d(context)) {
            return new m1(a.a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f9303c;
        }
        return new m1(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }
}
