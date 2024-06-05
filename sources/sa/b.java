package sa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.c;
import lc.j;
import lc.k;

/* compiled from: AndroidAudioManager */
public class b implements k.c {

    /* renamed from: c  reason: collision with root package name */
    private static a f22504c;

    /* renamed from: a  reason: collision with root package name */
    private c f22505a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public k f22506b;

    /* compiled from: AndroidAudioManager */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f22507a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        private List<b> f22508b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private androidx.media.a f22509c;

        /* renamed from: d  reason: collision with root package name */
        private BroadcastReceiver f22510d;

        /* renamed from: e  reason: collision with root package name */
        private BroadcastReceiver f22511e;

        /* renamed from: f  reason: collision with root package name */
        private Context f22512f;

        /* renamed from: g  reason: collision with root package name */
        private AudioManager f22513g;

        /* renamed from: h  reason: collision with root package name */
        private Object f22514h;

        /* renamed from: i  reason: collision with root package name */
        private List<AudioDeviceInfo> f22515i = new ArrayList();

        /* renamed from: sa.b$a$a  reason: collision with other inner class name */
        /* compiled from: AndroidAudioManager */
        class C0234a extends AudioDeviceCallback {
            C0234a() {
            }

            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                a.this.v0("onAudioDevicesAdded", a.f0(audioDeviceInfoArr));
            }

            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                a.this.v0("onAudioDevicesRemoved", a.f0(audioDeviceInfoArr));
            }
        }

        /* renamed from: sa.b$a$b  reason: collision with other inner class name */
        /* compiled from: AndroidAudioManager */
        class C0235b extends BroadcastReceiver {
            C0235b() {
            }

            public void onReceive(Context context, Intent intent) {
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    a.this.v0("onBecomingNoisy", new Object[0]);
                }
            }
        }

        /* compiled from: AndroidAudioManager */
        class c extends BroadcastReceiver {
            c() {
            }

            public void onReceive(Context context, Intent intent) {
                a.this.v0("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
            }
        }

        public a(Context context) {
            this.f22512f = context;
            this.f22513g = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (Build.VERSION.SDK_INT >= 23) {
                u0();
            }
        }

        /* access modifiers changed from: private */
        public Object A0() {
            return Boolean.valueOf(this.f22513g.isMicrophoneMute());
        }

        /* access modifiers changed from: private */
        public Object B0() {
            return Boolean.valueOf(this.f22513g.isMusicActive());
        }

        /* access modifiers changed from: private */
        public Object C0() {
            return Boolean.valueOf(this.f22513g.isSpeakerphoneOn());
        }

        /* access modifiers changed from: private */
        public Object D0(int i10) {
            b.g(23);
            return Boolean.valueOf(this.f22513g.isStreamMute(i10));
        }

        /* access modifiers changed from: private */
        public Object E0() {
            b.g(21);
            return Boolean.valueOf(this.f22513g.isVolumeFixed());
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void F0(int i10) {
            if (i10 == -1) {
                b();
            }
            v0("onAudioFocusChanged", Integer.valueOf(i10));
        }

        /* access modifiers changed from: private */
        public Object G0() {
            this.f22513g.loadSoundEffects();
            return null;
        }

        /* access modifiers changed from: private */
        public Object H0(int i10, Double d10) {
            if (d10 != null) {
                this.f22513g.playSoundEffect(i10, (float) d10.doubleValue());
                return null;
            }
            this.f22513g.playSoundEffect(i10);
            return null;
        }

        private void I0() {
            if (this.f22510d == null) {
                C0235b bVar = new C0235b();
                this.f22510d = bVar;
                this.f22512f.registerReceiver(bVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }
        }

        private void J0() {
            if (this.f22511e == null) {
                c cVar = new c();
                this.f22511e = cVar;
                this.f22512f.registerReceiver(cVar, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            }
        }

        /* access modifiers changed from: private */
        public boolean L0(List<?> list) {
            boolean z10 = true;
            if (this.f22509c != null) {
                return true;
            }
            Map map = (Map) list.get(0);
            a.b bVar = new a.b(((Integer) map.get("gainType")).intValue());
            bVar.e(new a(this));
            if (map.get("audioAttributes") != null) {
                bVar.c(a0((Map) map.get("audioAttributes")));
            }
            if (map.get("willPauseWhenDucked") != null) {
                bVar.g(((Boolean) map.get("willPauseWhenDucked")).booleanValue());
            }
            androidx.media.a a10 = bVar.a();
            this.f22509c = a10;
            if (androidx.media.b.b(this.f22513g, a10) != 1) {
                z10 = false;
            }
            if (z10) {
                I0();
                J0();
            }
            return z10;
        }

        /* access modifiers changed from: private */
        public Object M0(int i10) {
            b.g(29);
            this.f22513g.setAllowedCapturePolicy(i10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object N0(boolean z10) {
            this.f22513g.setBluetoothScoOn(z10);
            return null;
        }

        /* access modifiers changed from: private */
        public boolean O0(Integer num) {
            b.g(31);
            for (AudioDeviceInfo next : this.f22515i) {
                if (next.getId() == num.intValue()) {
                    return this.f22513g.setCommunicationDevice(next);
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public Object P0(boolean z10) {
            this.f22513g.setMicrophoneMute(z10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object Q0(int i10) {
            this.f22513g.setMode(i10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object R0(String str) {
            this.f22513g.setParameters(str);
            return null;
        }

        /* access modifiers changed from: private */
        public Object S0(int i10) {
            this.f22513g.setRingerMode(i10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object T0(boolean z10) {
            this.f22513g.setSpeakerphoneOn(z10);
            return null;
        }

        /* access modifiers changed from: private */
        public Object U0(int i10, int i11, int i12) {
            this.f22513g.setStreamVolume(i10, i11, i12);
            return null;
        }

        /* access modifiers changed from: private */
        public Object V0() {
            this.f22513g.startBluetoothSco();
            return null;
        }

        /* access modifiers changed from: private */
        public Object W(int i10, int i11, int i12) {
            this.f22513g.adjustStreamVolume(i10, i11, i12);
            return null;
        }

        /* access modifiers changed from: private */
        public Object W0() {
            this.f22513g.stopBluetoothSco();
            return null;
        }

        /* access modifiers changed from: private */
        public Object X(int i10, int i11, int i12) {
            this.f22513g.adjustSuggestedStreamVolume(i10, i11, i12);
            return null;
        }

        /* access modifiers changed from: private */
        public Object X0() {
            this.f22513g.unloadSoundEffects();
            return null;
        }

        /* access modifiers changed from: private */
        public Object Y(int i10, int i11) {
            this.f22513g.adjustVolume(i10, i11);
            return null;
        }

        private void Y0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f22510d;
            if (broadcastReceiver != null && (context = this.f22512f) != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.f22510d = null;
            }
        }

        /* access modifiers changed from: private */
        public Object Z() {
            b.g(31);
            this.f22513g.clearCommunicationDevice();
            return null;
        }

        private void Z0() {
            Context context;
            BroadcastReceiver broadcastReceiver = this.f22511e;
            if (broadcastReceiver != null && (context = this.f22512f) != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.f22511e = null;
            }
        }

        private AudioAttributesCompat a0(Map<?, ?> map) {
            AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
            if (map.get("contentType") != null) {
                aVar.b(((Integer) map.get("contentType")).intValue());
            }
            if (map.get("flags") != null) {
                aVar.c(((Integer) map.get("flags")).intValue());
            }
            if (map.get("usage") != null) {
                aVar.e(((Integer) map.get("usage")).intValue());
            }
            return aVar.a();
        }

        /* access modifiers changed from: private */
        public boolean b() {
            if (this.f22512f == null) {
                return false;
            }
            Y0();
            Z0();
            androidx.media.a aVar = this.f22509c;
            if (aVar == null) {
                return true;
            }
            int a10 = androidx.media.b.a(this.f22513g, aVar);
            this.f22509c = null;
            if (a10 == 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public Object b0(Map<?, ?> map) {
            b.g(19);
            this.f22513g.dispatchMediaKeyEvent(new KeyEvent(b.d(map.get("downTime")).longValue(), b.d(map.get("eventTime")).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("code")).intValue(), ((Integer) map.get("repeat")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scancode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
            return null;
        }

        private void d0() {
            this.f22513g.unregisterAudioDeviceCallback((AudioDeviceCallback) this.f22514h);
        }

        private static Map<String, Object> e0(AudioDeviceInfo audioDeviceInfo) {
            return b.f("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", audioDeviceInfo.getAddress(), "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", Integer.valueOf(audioDeviceInfo.getType()));
        }

        /* access modifiers changed from: private */
        public static List<?> f0(AudioDeviceInfo[] audioDeviceInfoArr) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo e02 : audioDeviceInfoArr) {
                arrayList.add(e0(e02));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public Object g0() {
            b.g(21);
            return Integer.valueOf(this.f22513g.generateAudioSessionId());
        }

        /* access modifiers changed from: private */
        public Object h0() {
            b.g(29);
            return Integer.valueOf(this.f22513g.getAllowedCapturePolicy());
        }

        /* access modifiers changed from: private */
        public List<Map<String, Object>> i0() {
            b.g(31);
            this.f22515i = this.f22513g.getAvailableCommunicationDevices();
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo e02 : this.f22515i) {
                arrayList.add(e0(e02));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public Map<String, Object> j0() {
            b.g(31);
            return e0(this.f22513g.getCommunicationDevice());
        }

        /* access modifiers changed from: private */
        public Object k0(int i10) {
            b.g(23);
            ArrayList arrayList = new ArrayList();
            AudioDeviceInfo[] devices = this.f22513g.getDevices(i10);
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                String str = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    str = audioDeviceInfo.getAddress();
                }
                arrayList.add(b.f("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", str, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", b.e(audioDeviceInfo.getSampleRates()), "channelMasks", b.e(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", b.e(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", b.e(audioDeviceInfo.getChannelCounts()), "encodings", b.e(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public Object l0() throws IOException {
            b.g(28);
            ArrayList arrayList = new ArrayList();
            for (MicrophoneInfo next : this.f22513g.getMicrophones()) {
                ArrayList arrayList2 = new ArrayList();
                for (Pair next2 : next.getFrequencyResponse()) {
                    arrayList2.add(new ArrayList(Arrays.asList(new Double[]{Double.valueOf((double) ((Float) next2.first).floatValue()), Double.valueOf((double) ((Float) next2.second).floatValue())})));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Pair next3 : next.getChannelMapping()) {
                    arrayList3.add(new ArrayList(Arrays.asList(new Integer[]{(Integer) next3.first, (Integer) next3.second})));
                }
                arrayList.add(b.f("description", next.getDescription(), "id", Integer.valueOf(next.getId()), "type", Integer.valueOf(next.getType()), "address", next.getAddress(), "location", Integer.valueOf(next.getLocation()), "group", Integer.valueOf(next.getGroup()), "indexInTheGroup", Integer.valueOf(next.getIndexInTheGroup()), "position", b.b(next.getPosition()), AdUnitActivity.EXTRA_ORIENTATION, b.b(next.getOrientation()), "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", Float.valueOf(next.getSensitivity()), "maxSpl", Float.valueOf(next.getMaxSpl()), "minSpl", Float.valueOf(next.getMinSpl()), "directionality", Integer.valueOf(next.getDirectionality())));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public Object m0() {
            return Integer.valueOf(this.f22513g.getMode());
        }

        /* access modifiers changed from: private */
        public Object n0(String str) {
            return this.f22513g.getParameters(str);
        }

        /* access modifiers changed from: private */
        public Object o0(String str) {
            b.g(17);
            return this.f22513g.getProperty(str);
        }

        /* access modifiers changed from: private */
        public Object p0() {
            return Integer.valueOf(this.f22513g.getRingerMode());
        }

        /* access modifiers changed from: private */
        public Object q0(int i10) {
            return Integer.valueOf(this.f22513g.getStreamMaxVolume(i10));
        }

        /* access modifiers changed from: private */
        public Object r0(int i10) {
            b.g(28);
            return Integer.valueOf(this.f22513g.getStreamMinVolume(i10));
        }

        /* access modifiers changed from: private */
        public Object s0(int i10) {
            return Integer.valueOf(this.f22513g.getStreamVolume(i10));
        }

        /* access modifiers changed from: private */
        public Object t0(int i10, int i11, int i12) {
            b.g(28);
            return Float.valueOf(this.f22513g.getStreamVolumeDb(i10, i11, i12));
        }

        private void u0() {
            C0234a aVar = new C0234a();
            this.f22514h = aVar;
            this.f22513g.registerAudioDeviceCallback(aVar, this.f22507a);
        }

        /* access modifiers changed from: private */
        public void v0(String str, Object... objArr) {
            for (b a10 : this.f22508b) {
                a10.f22506b.c(str, new ArrayList(Arrays.asList(objArr)));
            }
        }

        /* access modifiers changed from: private */
        public Object w0() {
            return Boolean.valueOf(this.f22513g.isBluetoothScoAvailableOffCall());
        }

        /* access modifiers changed from: private */
        public Object x0() {
            return Boolean.valueOf(this.f22513g.isBluetoothScoOn());
        }

        /* access modifiers changed from: private */
        public Object z0() {
            b.g(29);
            return Boolean.valueOf(AudioManager.isHapticPlaybackSupported());
        }

        public void K0(b bVar) {
            this.f22508b.remove(bVar);
        }

        public void V(b bVar) {
            this.f22508b.add(bVar);
        }

        public void c0() {
            b();
            if (Build.VERSION.SDK_INT >= 23) {
                d0();
            }
            this.f22512f = null;
            this.f22513g = null;
        }

        public boolean y0() {
            return this.f22508b.size() == 0;
        }
    }

    public b(Context context, c cVar) {
        if (f22504c == null) {
            f22504c = new a(context);
        }
        this.f22505a = cVar;
        this.f22506b = new k(cVar, "com.ryanheise.android_audio_manager");
        f22504c.V(this);
        this.f22506b.e(this);
    }

    static ArrayList<Double> b(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(Double.valueOf((double) coordinate3F.x));
        arrayList.add(Double.valueOf((double) coordinate3F.y));
        arrayList.add(Double.valueOf((double) coordinate3F.z));
        return arrayList;
    }

    static Long d(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf((long) ((Integer) obj).intValue());
    }

    static ArrayList<Integer> e(int[] iArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    static Map<String, Object> f(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            hashMap.put(objArr[i10], objArr[i10 + 1]);
        }
        return hashMap;
    }

    static void g(int i10) {
        if (Build.VERSION.SDK_INT < i10) {
            throw new RuntimeException("Requires API level " + i10);
        }
    }

    public void c() {
        this.f22506b.e((k.c) null);
        f22504c.K0(this);
        if (f22504c.y0()) {
            f22504c.c0();
            f22504c = null;
        }
        this.f22506b = null;
        this.f22505a = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        try {
            List list = (List) jVar.f36117b;
            String str = jVar.f36116a;
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1758921066:
                    if (str.equals("getCommunicationDevice")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case -1698305881:
                    if (str.equals("getDevices")) {
                        c10 = '(';
                        break;
                    }
                    break;
                case -1679670739:
                    if (str.equals("isMicrophoneMute")) {
                        c10 = 29;
                        break;
                    }
                    break;
                case -1582239800:
                    if (str.equals("getStreamMaxVolume")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case -1562927400:
                    if (str.equals("isSpeakerphoneOn")) {
                        c10 = 20;
                        break;
                    }
                    break;
                case -1524320654:
                    if (str.equals("isHapticPlaybackSupported")) {
                        c10 = '*';
                        break;
                    }
                    break;
                case -1504647535:
                    if (str.equals("requestAudioFocus")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1413157019:
                    if (str.equals("setMicrophoneMute")) {
                        c10 = 28;
                        break;
                    }
                    break;
                case -1296413680:
                    if (str.equals("setSpeakerphoneOn")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case -1285190630:
                    if (str.equals("isBluetoothScoOn")) {
                        c10 = 27;
                        break;
                    }
                    break;
                case -1197068311:
                    if (str.equals("adjustStreamVolume")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1091382445:
                    if (str.equals("getMicrophones")) {
                        c10 = ')';
                        break;
                    }
                    break;
                case -1079290158:
                    if (str.equals("setAllowedCapturePolicy")) {
                        c10 = 21;
                        break;
                    }
                    break;
                case -1018676910:
                    if (str.equals("setBluetoothScoOn")) {
                        c10 = 26;
                        break;
                    }
                    break;
                case -809761226:
                    if (str.equals("getStreamMinVolume")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case -763512583:
                    if (str.equals("loadSoundEffects")) {
                        c10 = '%';
                        break;
                    }
                    break;
                case -694417919:
                    if (str.equals("isMusicActive")) {
                        c10 = ' ';
                        break;
                    }
                    break;
                case -580980717:
                    if (str.equals("startBluetoothSco")) {
                        c10 = 24;
                        break;
                    }
                    break;
                case -445792758:
                    if (str.equals("setCommunicationDevice")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case -380792370:
                    if (str.equals("getStreamVolumeDb")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case -75324903:
                    if (str.equals("getMode")) {
                        c10 = 31;
                        break;
                    }
                    break;
                case 152385829:
                    if (str.equals("dispatchMediaKeyEvent")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 160987616:
                    if (str.equals("getParameters")) {
                        c10 = '#';
                        break;
                    }
                    break;
                case 186762163:
                    if (str.equals("stopBluetoothSco")) {
                        c10 = 25;
                        break;
                    }
                    break;
                case 276698416:
                    if (str.equals("getStreamVolume")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 469094495:
                    if (str.equals("isBluetoothScoAvailableOffCall")) {
                        c10 = 23;
                        break;
                    }
                    break;
                case 623794710:
                    if (str.equals("getRingerMode")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 935118828:
                    if (str.equals("setParameters")) {
                        c10 = '\"';
                        break;
                    }
                    break;
                case 954131337:
                    if (str.equals("adjustVolume")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 976310915:
                    if (str.equals("isStreamMute")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case 1084758859:
                    if (str.equals("getProperty")) {
                        c10 = '\'';
                        break;
                    }
                    break;
                case 1163405254:
                    if (str.equals("getAllowedCapturePolicy")) {
                        c10 = 22;
                        break;
                    }
                    break;
                case 1187450940:
                    if (str.equals("setStreamVolume")) {
                        c10 = 13;
                        break;
                    }
                    break;
                case 1241312831:
                    if (str.equals("clearCommunicationDevice")) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 1258134830:
                    if (str.equals("adjustSuggestedStreamVolume")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1357290231:
                    if (str.equals("abandonAudioFocus")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1378317714:
                    if (str.equals("unloadSoundEffects")) {
                        c10 = '&';
                        break;
                    }
                    break;
                case 1397925922:
                    if (str.equals("setRingerMode")) {
                        c10 = 12;
                        break;
                    }
                    break;
                case 1504508844:
                    if (str.equals("playSoundEffect")) {
                        c10 = '$';
                        break;
                    }
                    break;
                case 1570996442:
                    if (str.equals("getAvailableCommunicationDevices")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 1984784677:
                    if (str.equals("setMode")) {
                        c10 = 30;
                        break;
                    }
                    break;
                case 1986792688:
                    if (str.equals("isVolumeFixed")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2093966320:
                    if (str.equals("generateAudioSessionId")) {
                        c10 = '!';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    dVar.success(Boolean.valueOf(f22504c.L0(list)));
                    return;
                case 1:
                    dVar.success(Boolean.valueOf(f22504c.b()));
                    return;
                case 2:
                    dVar.success(f22504c.b0((Map) list.get(0)));
                    return;
                case 3:
                    dVar.success(f22504c.E0());
                    return;
                case 4:
                    dVar.success(f22504c.W(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 5:
                    dVar.success(f22504c.Y(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue()));
                    return;
                case 6:
                    dVar.success(f22504c.X(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 7:
                    dVar.success(f22504c.p0());
                    return;
                case 8:
                    dVar.success(f22504c.q0(((Integer) list.get(0)).intValue()));
                    return;
                case 9:
                    dVar.success(f22504c.r0(((Integer) list.get(0)).intValue()));
                    return;
                case 10:
                    dVar.success(f22504c.s0(((Integer) list.get(0)).intValue()));
                    return;
                case 11:
                    dVar.success(f22504c.t0(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 12:
                    dVar.success(f22504c.S0(((Integer) list.get(0)).intValue()));
                    return;
                case 13:
                    dVar.success(f22504c.U0(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue()));
                    return;
                case 14:
                    dVar.success(f22504c.D0(((Integer) list.get(0)).intValue()));
                    return;
                case 15:
                    dVar.success(f22504c.i0());
                    return;
                case 16:
                    dVar.success(Boolean.valueOf(f22504c.O0((Integer) list.get(0))));
                    return;
                case 17:
                    dVar.success(f22504c.j0());
                    return;
                case 18:
                    dVar.success(f22504c.Z());
                    return;
                case 19:
                    dVar.success(f22504c.T0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 20:
                    dVar.success(f22504c.C0());
                    return;
                case 21:
                    dVar.success(f22504c.M0(((Integer) list.get(0)).intValue()));
                    return;
                case 22:
                    dVar.success(f22504c.h0());
                    return;
                case 23:
                    dVar.success(f22504c.w0());
                    return;
                case 24:
                    dVar.success(f22504c.V0());
                    return;
                case 25:
                    dVar.success(f22504c.W0());
                    return;
                case 26:
                    dVar.success(f22504c.N0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 27:
                    dVar.success(f22504c.x0());
                    return;
                case 28:
                    dVar.success(f22504c.P0(((Boolean) list.get(0)).booleanValue()));
                    return;
                case 29:
                    dVar.success(f22504c.A0());
                    return;
                case 30:
                    dVar.success(f22504c.Q0(((Integer) list.get(0)).intValue()));
                    return;
                case 31:
                    dVar.success(f22504c.m0());
                    return;
                case ' ':
                    dVar.success(f22504c.B0());
                    return;
                case '!':
                    dVar.success(f22504c.g0());
                    return;
                case '\"':
                    dVar.success(f22504c.R0((String) list.get(0)));
                    return;
                case '#':
                    dVar.success(f22504c.n0((String) list.get(0)));
                    return;
                case '$':
                    dVar.success(f22504c.H0(((Integer) list.get(0)).intValue(), (Double) list.get(1)));
                    return;
                case '%':
                    dVar.success(f22504c.G0());
                    return;
                case '&':
                    dVar.success(f22504c.X0());
                    return;
                case '\'':
                    dVar.success(f22504c.o0((String) list.get(0)));
                    return;
                case '(':
                    dVar.success(f22504c.k0(((Integer) list.get(0)).intValue()));
                    return;
                case ')':
                    dVar.success(f22504c.l0());
                    return;
                case '*':
                    dVar.success(f22504c.z0());
                    return;
                default:
                    dVar.notImplemented();
                    return;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            dVar.error("Error: " + e10, (String) null, (Object) null);
        }
    }
}
