package com.ryanheise.audioservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.d;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import com.ryanheise.audioservice.AudioService;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import dc.a;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import lc.j;
import lc.k;
import lc.n;
import ta.f;
import ta.g;
import zb.a;

/* compiled from: AudioServicePlugin */
public class a implements dc.a, ec.a {

    /* renamed from: h  reason: collision with root package name */
    private static String f15540h = "audio_service_engine";

    /* renamed from: i  reason: collision with root package name */
    private static final Set<d> f15541i = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static d f15542j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static c f15543k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final long f15544l = (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static k.d f15545m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static boolean f15546n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static MediaBrowserCompat f15547o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static MediaControllerCompat f15548p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final MediaControllerCompat.a f15549q = new C0160a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f15550a;

    /* renamed from: b  reason: collision with root package name */
    private a.b f15551b;

    /* renamed from: c  reason: collision with root package name */
    private ec.c f15552c;

    /* renamed from: d  reason: collision with root package name */
    private n f15553d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public d f15554f;

    /* renamed from: g  reason: collision with root package name */
    private final MediaBrowserCompat.c f15555g = new b();

    /* renamed from: com.ryanheise.audioservice.a$a  reason: collision with other inner class name */
    /* compiled from: AudioServicePlugin */
    class C0160a extends MediaControllerCompat.a {
        C0160a() {
        }
    }

    /* compiled from: AudioServicePlugin */
    class b extends MediaBrowserCompat.c {
        b() {
        }

        public void a() {
            if (a.this.f15550a != null) {
                try {
                    MediaControllerCompat unused = a.f15548p = new MediaControllerCompat(a.this.f15550a, a.f15547o.c());
                    Activity a10 = a.f15542j != null ? a.f15542j.f15569b : null;
                    if (a10 != null) {
                        MediaControllerCompat.f(a10, a.f15548p);
                    }
                    a.f15548p.d(a.f15549q);
                    if (a.f15545m != null) {
                        a.f15545m.success(a.F(new Object[0]));
                        k.d unused2 = a.f15545m = null;
                    }
                } catch (Exception e10) {
                    PrintStream printStream = System.out;
                    printStream.println("onConnected error: " + e10.getMessage());
                    e10.printStackTrace();
                    if (a.f15545m != null) {
                        k.d s10 = a.f15545m;
                        s10.error("onConnected error: " + e10.getMessage(), (String) null, (Object) null);
                        return;
                    }
                    a.this.f15554f.f(true);
                }
            }
        }

        public void b() {
            if (a.f15545m != null) {
                a.f15545m.error("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", (String) null, (Object) null);
            } else {
                a.this.f15554f.f(true);
            }
        }

        public void c() {
            System.out.println("### UNHANDLED: onConnectionSuspended");
        }
    }

    /* compiled from: AudioServicePlugin */
    private static class c implements k.c, AudioService.e {

        /* renamed from: a  reason: collision with root package name */
        public lc.c f15557a;

        /* renamed from: b  reason: collision with root package name */
        public k f15558b;

        /* renamed from: c  reason: collision with root package name */
        private AudioTrack f15559c;

        /* renamed from: d  reason: collision with root package name */
        private final Handler f15560d = new Handler(Looper.getMainLooper());

        /* renamed from: f  reason: collision with root package name */
        private List<e> f15561f = new LinkedList();

        /* renamed from: com.ryanheise.audioservice.a$c$a  reason: collision with other inner class name */
        /* compiled from: AudioServicePlugin */
        class C0161a implements k.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d.m f15562a;

            C0161a(d.m mVar) {
                this.f15562a = mVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f15562a.f(new Bundle());
            }

            public void notImplemented() {
                this.f15562a.f(new Bundle());
            }

            public void success(Object obj) {
                ArrayList arrayList = new ArrayList();
                for (Map g10 : (List) ((Map) obj).get("children")) {
                    arrayList.add(a.M(g10));
                }
                this.f15562a.g(arrayList);
            }
        }

        /* compiled from: AudioServicePlugin */
        class b implements k.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d.m f15564a;

            b(d.m mVar) {
                this.f15564a = mVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f15564a.f(new Bundle());
            }

            public void notImplemented() {
                this.f15564a.f(new Bundle());
            }

            public void success(Object obj) {
                Map map = (Map) ((Map) obj).get("mediaItem");
                if (map != null) {
                    this.f15564a.g(a.M(map));
                    return;
                }
                this.f15564a.g(null);
            }
        }

        /* renamed from: com.ryanheise.audioservice.a$c$c  reason: collision with other inner class name */
        /* compiled from: AudioServicePlugin */
        class C0162c implements k.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d.m f15566a;

            C0162c(d.m mVar) {
                this.f15566a = mVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f15566a.f(new Bundle());
            }

            public void notImplemented() {
                this.f15566a.f(new Bundle());
            }

            public void success(Object obj) {
                ArrayList arrayList = new ArrayList();
                for (Map g10 : (List) ((Map) obj).get("mediaItems")) {
                    arrayList.add(a.M(g10));
                }
                this.f15566a.g(arrayList);
            }
        }

        public c(lc.c cVar) {
            this.f15557a = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.handler.methods");
            this.f15558b = kVar;
            kVar.e(this);
        }

        /* access modifiers changed from: private */
        public void M() {
            AudioTrack audioTrack = this.f15559c;
            if (audioTrack != null) {
                audioTrack.release();
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void S(Map map, k.d dVar) {
            try {
                AudioService.D.X(a.y((Map) map.get("mediaItem")));
                this.f15560d.post(new e(dVar));
            } catch (Exception e10) {
                this.f15560d.post(new f(dVar, e10));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void V(Map map, k.d dVar) {
            try {
                AudioService.D.Z(a.K((List) map.get("queue")));
                this.f15560d.post(new d(dVar));
            } catch (Exception e10) {
                this.f15560d.post(new g(dVar, e10));
            }
        }

        public void A(long j10) {
            N("seek", a.F("position", Long.valueOf(j10 * 1000)));
        }

        public void B(String str, Bundle bundle) {
            N("customAction", a.F(MediationMetaData.KEY_NAME, str, "extras", a.w(bundle)));
        }

        public void C(String str, Bundle bundle) {
            N("prepareFromSearch", a.F(AppLovinEventParameters.SEARCH_QUERY, str, "extras", a.w(bundle)));
        }

        public void D(int i10) {
            N("androidAdjustRemoteVolume", a.F("direction", Integer.valueOf(i10)));
        }

        public void E(Uri uri, Bundle bundle) {
            N("playFromUri", a.F("uri", uri.toString(), "extras", a.w(bundle)));
        }

        public void N(String str, Object obj) {
            O(str, obj, (k.d) null);
        }

        public void O(String str, Object obj, k.d dVar) {
            if (a.f15546n) {
                this.f15558b.d(str, obj, dVar);
            } else {
                this.f15561f.add(new e(str, obj, dVar));
            }
        }

        public void P() {
            for (e next : this.f15561f) {
                this.f15558b.d(next.f15574a, next.f15575b, next.f15576c);
            }
            this.f15561f.clear();
        }

        public void W(lc.c cVar) {
            this.f15558b.e((k.c) null);
            this.f15557a = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.handler.methods");
            this.f15558b = kVar;
            kVar.e(this);
        }

        public void a(int i10) {
            N("setRepeatMode", a.F("repeatMode", Integer.valueOf(i10)));
        }

        public void b(int i10) {
            N("setShuffleMode", a.F("shuffleMode", Integer.valueOf(i10)));
        }

        public void c(String str, Bundle bundle, d.m<List<MediaBrowserCompat.MediaItem>> mVar) {
            if (a.f15543k != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(AppLovinEventParameters.SEARCH_QUERY, str);
                hashMap.put("extras", a.w(bundle));
                a.f15543k.O(AppLovinEventTypes.USER_EXECUTED_SEARCH, hashMap, new C0162c(mVar));
            }
            mVar.a();
        }

        public void d(String str, d.m<MediaBrowserCompat.MediaItem> mVar) {
            if (a.f15543k != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("mediaId", str);
                a.f15543k.O("getMediaItem", hashMap, new b(mVar));
            }
            mVar.a();
        }

        public void e(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
            if (a.f15543k != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("parentMediaId", str);
                hashMap.put("options", a.w(bundle));
                a.f15543k.O("getChildren", hashMap, new C0161a(mVar));
            }
            mVar.a();
        }

        public void f() {
            N("skipToNext", a.F(new Object[0]));
        }

        public void g(float f10) {
            N("setSpeed", a.F("speed", Float.valueOf(f10)));
        }

        public void h() {
            N("rewind", a.F(new Object[0]));
        }

        public void i(int i10) {
            N("androidSetRemoteVolume", a.F("volumeIndex", Integer.valueOf(i10)));
        }

        public void j() {
            N("onTaskRemoved", a.F(new Object[0]));
        }

        public void k(MediaMetadataCompat mediaMetadataCompat) {
            N("addQueueItem", a.F("mediaItem", a.H(mediaMetadataCompat)));
        }

        public void l(long j10) {
            N("skipToQueueItem", a.F("index", Long.valueOf(j10)));
        }

        public void m(RatingCompat ratingCompat, Bundle bundle) {
            N("setRating", a.F("rating", a.J(ratingCompat), "extras", a.w(bundle)));
        }

        public void n() {
            N("play", a.F(new Object[0]));
        }

        public void o(boolean z10) {
            N("setCaptioningEnabled", a.F("enabled", Boolean.valueOf(z10)));
        }

        public void onClose() {
            N("onNotificationDeleted", a.F(new Object[0]));
        }

        public void onDestroy() {
            a.A();
        }

        public void onMethodCall(j jVar, k.d dVar) {
            int[] iArr;
            j jVar2 = jVar;
            k.d dVar2 = dVar;
            try {
                Map map = (Map) jVar2.f36117b;
                String str = jVar2.f36116a;
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -615448875:
                        if (str.equals("setMediaItem")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -3300612:
                        if (str.equals("androidForceEnableMediaButtons")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 534585782:
                        if (str.equals("setAndroidPlaybackInfo")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 699379795:
                        if (str.equals("stopService")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1402657231:
                        if (str.equals("setQueue")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1404470607:
                        if (str.equals("setState")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1742026028:
                        if (str.equals("notifyChildrenChanged")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        Executors.newSingleThreadExecutor().execute(new b(this, map, dVar2));
                        return;
                    case 1:
                        Executors.newSingleThreadExecutor().execute(new c(this, map, dVar2));
                        return;
                    case 2:
                        Map map2 = (Map) map.get("state");
                        ta.a aVar = ta.a.values()[((Integer) map2.get("processingState")).intValue()];
                        boolean booleanValue = ((Boolean) map2.get("playing")).booleanValue();
                        List<Map> list = (List) map2.get("controls");
                        List list2 = (List) map2.get("androidCompactActionIndices");
                        List<Integer> list3 = (List) map2.get("systemActions");
                        long longValue = a.D(map2.get("updatePosition")).longValue();
                        long longValue2 = a.D(map2.get("bufferedPosition")).longValue();
                        float doubleValue = (float) ((Double) map2.get("speed")).doubleValue();
                        long currentTimeMillis = map2.get("updateTime") == null ? System.currentTimeMillis() : a.D(map2.get("updateTime")).longValue();
                        Integer num = (Integer) map2.get("errorCode");
                        String str2 = (String) map2.get("errorMessage");
                        int intValue = ((Integer) map2.get("repeatMode")).intValue();
                        int intValue2 = ((Integer) map2.get("shuffleMode")).intValue();
                        Long D = a.D(map2.get("queueIndex"));
                        boolean booleanValue2 = ((Boolean) map2.get("captioningEnabled")).booleanValue();
                        long j10 = currentTimeMillis - a.f15544l;
                        ArrayList arrayList = new ArrayList();
                        long j11 = 0;
                        for (Map map3 : list) {
                            String str3 = (String) map3.get("androidIcon");
                            String str4 = (String) map3.get("label");
                            long intValue3 = (long) (1 << ((Integer) map3.get("action")).intValue());
                            j11 |= intValue3;
                            Map map4 = (Map) map3.get("customAction");
                            arrayList.add(new g(str3, str4, intValue3, map4 != null ? new ta.e((String) map4.get(MediationMetaData.KEY_NAME), (Map) map4.get("extras")) : null));
                        }
                        for (Integer intValue4 : list3) {
                            j11 |= (long) (1 << intValue4.intValue());
                        }
                        if (list2 != null) {
                            int min = Math.min(3, list2.size());
                            iArr = new int[min];
                            for (int i10 = 0; i10 < min; i10++) {
                                iArr[i10] = ((Integer) list2.get(i10)).intValue();
                            }
                        } else {
                            iArr = null;
                        }
                        AudioService.D.a0(arrayList, j11, iArr, aVar, booleanValue, longValue, longValue2, doubleValue, j10, num, str2, intValue, intValue2, booleanValue2, D);
                        dVar2.success((Object) null);
                        return;
                    case 3:
                        Map map5 = (Map) map.get("playbackInfo");
                        AudioService.D.Y(((Integer) map5.get("playbackType")).intValue(), (Integer) map5.get("volumeControlType"), (Integer) map5.get("maxVolume"), (Integer) map5.get("volume"));
                        dVar2.success((Object) null);
                        return;
                    case 4:
                        AudioService.D.d((String) map.get("parentMediaId"), a.G((Map) map.get("options")));
                        dVar2.success((Object) null);
                        return;
                    case 5:
                        if (this.f15559c == null) {
                            AudioTrack audioTrack = new AudioTrack(3, 44100, 2, 3, 2048, 0);
                            this.f15559c = audioTrack;
                            audioTrack.write(new byte[2048], 0, 2048);
                        }
                        this.f15559c.reloadStaticData();
                        this.f15559c.play();
                        dVar2.success((Object) null);
                        return;
                    case 6:
                        AudioService audioService = AudioService.D;
                        if (audioService != null) {
                            audioService.b0();
                        }
                        dVar2.success((Object) null);
                        return;
                    default:
                        return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                dVar2.error(e10.getMessage(), (String) null, (Object) null);
            }
        }

        public void onPause() {
            N("pause", a.F(new Object[0]));
        }

        public void onStop() {
            N("stop", a.F(new Object[0]));
        }

        public void p(String str, Bundle bundle) {
            N("prepareFromMediaId", a.F("mediaId", str, "extras", a.w(bundle)));
        }

        public void q() {
            N("skipToPrevious", a.F(new Object[0]));
        }

        public void r(MediaMetadataCompat mediaMetadataCompat) {
            N("removeQueueItem", a.F("mediaItem", a.H(mediaMetadataCompat)));
        }

        public void s() {
            N("prepare", a.F(new Object[0]));
        }

        public void t(Uri uri, Bundle bundle) {
            N("prepareFromUri", a.F("uri", uri.toString(), "extras", a.w(bundle)));
        }

        public void u(f fVar) {
            N("click", a.F("button", Integer.valueOf(fVar.ordinal())));
        }

        public void v(RatingCompat ratingCompat) {
            N("setRating", a.F("rating", a.J(ratingCompat), "extras", null));
        }

        public void w(String str, Bundle bundle) {
            N("playFromSearch", a.F(AppLovinEventParameters.SEARCH_QUERY, str, "extras", a.w(bundle)));
        }

        public void x(MediaMetadataCompat mediaMetadataCompat, int i10) {
            N("insertQueueItem", a.F("mediaItem", a.H(mediaMetadataCompat), "index", Integer.valueOf(i10)));
        }

        public void y(String str, Bundle bundle) {
            N("playFromMediaId", a.F("mediaId", str, "extras", a.w(bundle)));
        }

        public void z() {
            N("fastForward", a.F(new Object[0]));
        }
    }

    /* compiled from: AudioServicePlugin */
    private static class d implements k.c {

        /* renamed from: a  reason: collision with root package name */
        private Context f15568a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Activity f15569b;

        /* renamed from: c  reason: collision with root package name */
        public final lc.c f15570c;

        /* renamed from: d  reason: collision with root package name */
        private final k f15571d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15572f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f15573g;

        public d(lc.c cVar) {
            this.f15570c = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.client.methods");
            this.f15571d = kVar;
            kVar.e(this);
        }

        /* access modifiers changed from: private */
        public void d(Activity activity) {
            this.f15569b = activity;
        }

        /* access modifiers changed from: private */
        public void e(Context context) {
            this.f15568a = context;
        }

        public void f(boolean z10) {
            this.f15573g = z10;
        }

        public void g(boolean z10) {
            this.f15572f = z10;
        }

        /* access modifiers changed from: protected */
        public boolean h() {
            return (this.f15569b.getIntent().getFlags() & 1048576) == 1048576;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[Catch:{ Exception -> 0x016c }] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x016c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(lc.j r9, lc.k.d r10) {
            /*
                r8 = this;
                java.lang.String r0 = "artDownscaleHeight"
                java.lang.String r1 = "artDownscaleWidth"
                java.lang.String r2 = "notificationColor"
                boolean r3 = r8.f15572f     // Catch:{ Exception -> 0x016c }
                if (r3 != 0) goto L_0x0164
                java.lang.String r3 = r9.f36116a     // Catch:{ Exception -> 0x016c }
                int r4 = r3.hashCode()     // Catch:{ Exception -> 0x016c }
                r5 = -804429082(0xffffffffd00d62e6, float:-9.4882755E9)
                r6 = 0
                r7 = -1
                if (r4 == r5) goto L_0x0018
                goto L_0x0022
            L_0x0018:
                java.lang.String r4 = "configure"
                boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x016c }
                if (r3 == 0) goto L_0x0022
                r3 = 0
                goto L_0x0023
            L_0x0022:
                r3 = -1
            L_0x0023:
                if (r3 == 0) goto L_0x0027
                goto L_0x0178
            L_0x0027:
                boolean r3 = r8.f15573g     // Catch:{ Exception -> 0x016c }
                if (r3 != 0) goto L_0x015c
                r3 = 1
                boolean unused = com.ryanheise.audioservice.a.f15546n = r3     // Catch:{ Exception -> 0x016c }
                java.lang.Object r9 = r9.f36117b     // Catch:{ Exception -> 0x016c }
                java.util.Map r9 = (java.util.Map) r9     // Catch:{ Exception -> 0x016c }
                java.lang.String r3 = "config"
                java.lang.Object r9 = r9.get(r3)     // Catch:{ Exception -> 0x016c }
                java.util.Map r9 = (java.util.Map) r9     // Catch:{ Exception -> 0x016c }
                ta.c r3 = new ta.c     // Catch:{ Exception -> 0x016c }
                android.content.Context r4 = r8.f15568a     // Catch:{ Exception -> 0x016c }
                android.content.Context r4 = r4.getApplicationContext()     // Catch:{ Exception -> 0x016c }
                r3.<init>(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationClickStartsActivity"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x016c }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f22756i = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationOngoing"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x016c }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f22757j = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidResumeOnClick"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x016c }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f22749b = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationChannelId"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x016c }
                r3.f22750c = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationChannelName"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x016c }
                r3.f22751d = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationChannelDescription"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x016c }
                r3.f22752e = r4     // Catch:{ Exception -> 0x016c }
                java.lang.Object r4 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                if (r4 != 0) goto L_0x0096
                r2 = -1
                goto L_0x00a2
            L_0x0096:
                java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                java.lang.Integer r2 = com.ryanheise.audioservice.a.C(r2)     // Catch:{ Exception -> 0x016c }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x016c }
            L_0x00a2:
                r3.f22753f = r2     // Catch:{ Exception -> 0x016c }
                java.lang.String r2 = "androidNotificationIcon"
                java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x016c }
                r3.f22754g = r2     // Catch:{ Exception -> 0x016c }
                java.lang.String r2 = "androidShowNotificationBadge"
                java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x016c }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f22755h = r2     // Catch:{ Exception -> 0x016c }
                java.lang.String r2 = "androidStopForegroundOnPause"
                java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x016c }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f22758k = r2     // Catch:{ Exception -> 0x016c }
                java.lang.Object r2 = r9.get(r1)     // Catch:{ Exception -> 0x016c }
                if (r2 == 0) goto L_0x00db
                java.lang.Object r1 = r9.get(r1)     // Catch:{ Exception -> 0x016c }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x016c }
                int r1 = r1.intValue()     // Catch:{ Exception -> 0x016c }
                goto L_0x00dc
            L_0x00db:
                r1 = -1
            L_0x00dc:
                r3.f22759l = r1     // Catch:{ Exception -> 0x016c }
                java.lang.Object r1 = r9.get(r0)     // Catch:{ Exception -> 0x016c }
                if (r1 == 0) goto L_0x00ee
                java.lang.Object r0 = r9.get(r0)     // Catch:{ Exception -> 0x016c }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x016c }
                int r7 = r0.intValue()     // Catch:{ Exception -> 0x016c }
            L_0x00ee:
                r3.f22760m = r7     // Catch:{ Exception -> 0x016c }
                java.lang.String r0 = "androidBrowsableRootExtras"
                java.lang.Object r9 = r9.get(r0)     // Catch:{ Exception -> 0x016c }
                java.util.Map r9 = (java.util.Map) r9     // Catch:{ Exception -> 0x016c }
                r3.c(r9)     // Catch:{ Exception -> 0x016c }
                android.app.Activity r9 = r8.f15569b     // Catch:{ Exception -> 0x016c }
                if (r9 == 0) goto L_0x0109
                java.lang.Class r9 = r9.getClass()     // Catch:{ Exception -> 0x016c }
                java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x016c }
                r3.f22761n = r9     // Catch:{ Exception -> 0x016c }
            L_0x0109:
                r3.b()     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.AudioService r9 = com.ryanheise.audioservice.AudioService.D     // Catch:{ Exception -> 0x016c }
                if (r9 == 0) goto L_0x0113
                r9.A(r3)     // Catch:{ Exception -> 0x016c }
            L_0x0113:
                com.ryanheise.audioservice.a.d unused = com.ryanheise.audioservice.a.f15542j = r8     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.a.f15543k     // Catch:{ Exception -> 0x016c }
                if (r9 != 0) goto L_0x012e
                com.ryanheise.audioservice.a$c r9 = new com.ryanheise.audioservice.a$c     // Catch:{ Exception -> 0x016c }
                lc.c r0 = r8.f15570c     // Catch:{ Exception -> 0x016c }
                r9.<init>(r0)     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.a.c unused = com.ryanheise.audioservice.a.f15543k = r9     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.a.f15543k     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.AudioService.P(r9)     // Catch:{ Exception -> 0x016c }
                goto L_0x0148
            L_0x012e:
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.a.f15543k     // Catch:{ Exception -> 0x016c }
                lc.c r9 = r9.f15557a     // Catch:{ Exception -> 0x016c }
                lc.c r0 = r8.f15570c     // Catch:{ Exception -> 0x016c }
                if (r9 == r0) goto L_0x0141
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.a.f15543k     // Catch:{ Exception -> 0x016c }
                lc.c r0 = r8.f15570c     // Catch:{ Exception -> 0x016c }
                r9.W(r0)     // Catch:{ Exception -> 0x016c }
            L_0x0141:
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.a.f15543k     // Catch:{ Exception -> 0x016c }
                r9.P()     // Catch:{ Exception -> 0x016c }
            L_0x0148:
                android.support.v4.media.session.MediaControllerCompat r9 = com.ryanheise.audioservice.a.f15548p     // Catch:{ Exception -> 0x016c }
                if (r9 == 0) goto L_0x0158
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x016c }
                java.util.Map r9 = com.ryanheise.audioservice.a.F(r9)     // Catch:{ Exception -> 0x016c }
                r10.success(r9)     // Catch:{ Exception -> 0x016c }
                goto L_0x0178
            L_0x0158:
                lc.k.d unused = com.ryanheise.audioservice.a.f15545m = r10     // Catch:{ Exception -> 0x016c }
                goto L_0x0178
            L_0x015c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x016c }
                java.lang.String r0 = "Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README."
                r9.<init>(r0)     // Catch:{ Exception -> 0x016c }
                throw r9     // Catch:{ Exception -> 0x016c }
            L_0x0164:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x016c }
                java.lang.String r0 = "The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions."
                r9.<init>(r0)     // Catch:{ Exception -> 0x016c }
                throw r9     // Catch:{ Exception -> 0x016c }
            L_0x016c:
                r9 = move-exception
                r9.printStackTrace()
                java.lang.String r9 = r9.getMessage()
                r0 = 0
                r10.error(r9, r0, r0)
            L_0x0178:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.a.d.onMethodCall(lc.j, lc.k$d):void");
        }
    }

    /* compiled from: AudioServicePlugin */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f15574a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f15575b;

        /* renamed from: c  reason: collision with root package name */
        public final k.d f15576c;

        public e(String str, Object obj, k.d dVar) {
            this.f15574a = str;
            this.f15575b = obj;
            this.f15576c = dVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A() {
        /*
            java.lang.Class<com.ryanheise.audioservice.a> r0 = com.ryanheise.audioservice.a.class
            monitor-enter(r0)
            java.util.Set<com.ryanheise.audioservice.a$d> r1 = f15541i     // Catch:{ all -> 0x0037 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x001d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0037 }
            com.ryanheise.audioservice.a$d r2 = (com.ryanheise.audioservice.a.d) r2     // Catch:{ all -> 0x0037 }
            android.app.Activity r2 = r2.f15569b     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x001d:
            io.flutter.embedding.engine.b r1 = io.flutter.embedding.engine.b.b()     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = f15540h     // Catch:{ all -> 0x0037 }
            io.flutter.embedding.engine.a r1 = r1.a(r2)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0035
            r1.g()     // Catch:{ all -> 0x0037 }
            io.flutter.embedding.engine.b r1 = io.flutter.embedding.engine.b.b()     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = f15540h     // Catch:{ all -> 0x0037 }
            r1.d(r2)     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r0)
            return
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.a.A():void");
    }

    public static synchronized io.flutter.embedding.engine.a B(Context context) {
        io.flutter.embedding.engine.a a10;
        io.flutter.embedding.android.d dVar;
        Uri data;
        synchronized (a.class) {
            a10 = io.flutter.embedding.engine.b.b().a(f15540h);
            if (a10 == null) {
                a10 = new io.flutter.embedding.engine.a(context.getApplicationContext());
                String str = null;
                if ((context instanceof io.flutter.embedding.android.d) && (str = dVar.p()) == null && (dVar = (io.flutter.embedding.android.d) context).k() && (data = dVar.getIntent().getData()) != null) {
                    str = data.getPath();
                    if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                        str = str + "?" + data.getQuery();
                    }
                }
                if (str == null) {
                    str = UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
                }
                a10.n().c(str);
                a10.j().k(a.c.a());
                io.flutter.embedding.engine.b.b().c(f15540h, a10);
            }
        }
        return a10;
    }

    public static Integer C(Object obj) {
        return (obj == null || (obj instanceof Integer)) ? (Integer) obj : Integer.valueOf((int) ((Long) obj).longValue());
    }

    public static Long D(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf((long) ((Integer) obj).intValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean E(Intent intent) {
        this.f15554f.f15569b.setIntent(intent);
        O();
        return true;
    }

    static Map<String, Object> F(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            hashMap.put(objArr[i10], objArr[i10 + 1]);
        }
        return hashMap;
    }

    static Bundle G(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Iterator<?> it = map.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            }
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    public static Map<?, ?> H(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat e10 = mediaMetadataCompat.e();
        HashMap hashMap = new HashMap();
        hashMap.put("id", e10.i());
        hashMap.put("title", I(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", I(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        if (e10.g() != null) {
            hashMap.put("artUri", e10.g().toString());
        }
        hashMap.put("artist", I(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", I(mediaMetadataCompat, "android.media.metadata.GENRE"));
        if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            hashMap.put("duration", Long.valueOf(mediaMetadataCompat.g("android.media.metadata.DURATION")));
        }
        hashMap.put("playable", Boolean.valueOf(mediaMetadataCompat.g("playable_long") != 0));
        hashMap.put("displayTitle", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (mediaMetadataCompat.a("android.media.metadata.RATING")) {
            hashMap.put("rating", J(mediaMetadataCompat.i("android.media.metadata.RATING")));
        }
        Map<String, Object> w10 = w(mediaMetadataCompat.d());
        if (w10.size() > 0) {
            hashMap.put("extras", w10);
        }
        return hashMap;
    }

    private static String I(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence k10 = mediaMetadataCompat.k(str);
        if (k10 != null) {
            return k10.toString();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static HashMap<String, Object> J(RatingCompat ratingCompat) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("type", Integer.valueOf(ratingCompat.e()));
        if (ratingCompat.i()) {
            switch (ratingCompat.e()) {
                case 0:
                    hashMap.put("value", (Object) null);
                    break;
                case 1:
                    hashMap.put("value", Boolean.valueOf(ratingCompat.h()));
                    break;
                case 2:
                    hashMap.put("value", Boolean.valueOf(ratingCompat.j()));
                    break;
                case 3:
                case 4:
                case 5:
                    hashMap.put("value", Float.valueOf(ratingCompat.g()));
                    break;
                case 6:
                    hashMap.put("value", Float.valueOf(ratingCompat.c()));
                    break;
            }
        } else {
            hashMap.put("value", (Object) null);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static List<MediaSessionCompat.QueueItem> K(List<Map<?, ?>> list) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Map next : list) {
            arrayList.add(new MediaSessionCompat.QueueItem(v(y(next).e(), (Map) next.get("extras")), (long) i10));
            i10++;
        }
        return arrayList;
    }

    private static RatingCompat L(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Integer num = (Integer) map.get("type");
        Object obj = map.get("value");
        if (obj == null) {
            return RatingCompat.p(num.intValue());
        }
        switch (num.intValue()) {
            case 1:
                return RatingCompat.k(((Boolean) obj).booleanValue());
            case 2:
                return RatingCompat.n(((Boolean) obj).booleanValue());
            case 3:
            case 4:
            case 5:
                return RatingCompat.m(num.intValue(), (float) ((Integer) obj).intValue());
            case 6:
                return RatingCompat.l(((Double) obj).floatValue());
            default:
                return RatingCompat.p(num.intValue());
        }
    }

    /* access modifiers changed from: private */
    public static MediaBrowserCompat.MediaItem M(Map<?, ?> map) {
        return new MediaBrowserCompat.MediaItem(v(y(map).e(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    private void N() {
        ec.c cVar = this.f15552c;
        ta.d dVar = new ta.d(this);
        this.f15553d = dVar;
        cVar.f(dVar);
    }

    private void O() {
        Activity a10 = this.f15554f.f15569b;
        if (f15543k != null && a10.getIntent().getAction() != null) {
            boolean equals = a10.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            f15543k.N("onNotificationClicked", F("clicked", Boolean.valueOf(equals)));
        }
    }

    private static MediaDescriptionCompat v(MediaDescriptionCompat mediaDescriptionCompat, Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        if (mediaDescriptionCompat.d() != null) {
            bundle.putAll(mediaDescriptionCompat.d());
        }
        bundle.putAll(G(map));
        return new MediaDescriptionCompat.d().i(mediaDescriptionCompat.l()).h(mediaDescriptionCompat.k()).b(mediaDescriptionCompat.c()).d(mediaDescriptionCompat.e()).e(mediaDescriptionCompat.g()).f(mediaDescriptionCompat.i()).g(mediaDescriptionCompat.j()).c(bundle).a();
    }

    static Map<String, Object> w(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                hashMap.put(str, serializable);
            }
        }
        return hashMap;
    }

    private void x() {
        if (f15547o == null) {
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(this.f15550a, new ComponentName(this.f15550a, AudioService.class), this.f15555g, (Bundle) null);
            f15547o = mediaBrowserCompat;
            mediaBrowserCompat.a();
        }
    }

    /* access modifiers changed from: private */
    public static MediaMetadataCompat y(Map<?, ?> map) {
        return AudioService.D.E((String) map.get("id"), (String) map.get("title"), (String) map.get("album"), (String) map.get("artist"), (String) map.get("genre"), D(map.get("duration")), (String) map.get("artUri"), (Boolean) map.get("playable"), (String) map.get("displayTitle"), (String) map.get("displaySubtitle"), (String) map.get("displayDescription"), L((Map) map.get("rating")), (Map) map.get("extras"));
    }

    private void z() {
        d dVar = f15542j;
        Activity a10 = dVar != null ? dVar.f15569b : null;
        if (a10 != null) {
            a10.setIntent(new Intent("android.intent.action.MAIN"));
        }
        MediaControllerCompat mediaControllerCompat = f15548p;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.g(f15549q);
            f15548p = null;
        }
        MediaBrowserCompat mediaBrowserCompat = f15547o;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.b();
            f15547o = null;
        }
    }

    public void onAttachedToActivity(ec.c cVar) {
        this.f15552c = cVar;
        this.f15554f.d(cVar.getActivity());
        this.f15554f.e(cVar.getActivity());
        this.f15554f.g(this.f15551b.b() != B(cVar.getActivity()).j());
        f15542j = this.f15554f;
        N();
        if (f15548p != null) {
            MediaControllerCompat.f(f15542j.f15569b, f15548p);
        }
        if (f15547o == null) {
            x();
        }
        Activity a10 = f15542j.f15569b;
        if (this.f15554f.h()) {
            a10.setIntent(new Intent("android.intent.action.MAIN"));
        }
        O();
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f15551b = bVar;
        d dVar = new d(bVar.b());
        this.f15554f = dVar;
        dVar.e(this.f15551b.a());
        f15541i.add(this.f15554f);
        if (this.f15550a == null) {
            this.f15550a = this.f15551b.a();
        }
        if (f15543k == null) {
            c cVar = new c(this.f15551b.b());
            f15543k = cVar;
            AudioService.P(cVar);
        }
        if (f15547o == null) {
            x();
        }
    }

    public void onDetachedFromActivity() {
        this.f15552c.d(this.f15553d);
        this.f15552c = null;
        this.f15553d = null;
        this.f15554f.d((Activity) null);
        this.f15554f.e(this.f15551b.a());
        if (f15541i.size() == 1) {
            z();
        }
        if (this.f15554f == f15542j) {
            f15542j = null;
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f15552c.d(this.f15553d);
        this.f15552c = null;
        this.f15554f.d((Activity) null);
        this.f15554f.e(this.f15551b.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        Set<d> set = f15541i;
        if (set.size() == 1) {
            z();
        }
        set.remove(this.f15554f);
        this.f15554f.e((Context) null);
        this.f15554f = null;
        this.f15550a = null;
        c cVar = f15543k;
        if (cVar != null && cVar.f15557a == this.f15551b.b()) {
            System.out.println("### destroying audio handler interface");
            f15543k.M();
            f15543k = null;
        }
        this.f15551b = null;
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
        this.f15552c = cVar;
        this.f15554f.d(cVar.getActivity());
        this.f15554f.e(cVar.getActivity());
        N();
    }
}
