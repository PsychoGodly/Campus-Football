package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f624a;

    /* renamed from: b  reason: collision with root package name */
    final long f625b;

    /* renamed from: c  reason: collision with root package name */
    final long f626c;

    /* renamed from: d  reason: collision with root package name */
    final float f627d;

    /* renamed from: f  reason: collision with root package name */
    final long f628f;

    /* renamed from: g  reason: collision with root package name */
    final int f629g;

    /* renamed from: h  reason: collision with root package name */
    final CharSequence f630h;

    /* renamed from: i  reason: collision with root package name */
    final long f631i;

    /* renamed from: j  reason: collision with root package name */
    List<CustomAction> f632j;

    /* renamed from: k  reason: collision with root package name */
    final long f633k;

    /* renamed from: l  reason: collision with root package name */
    final Bundle f634l;

    /* renamed from: m  reason: collision with root package name */
    private PlaybackState f635m;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f624a = i10;
        this.f625b = j10;
        this.f626c = j11;
        this.f627d = f10;
        this.f628f = j12;
        this.f629g = i11;
        this.f630h = charSequence;
        this.f631i = j13;
        this.f632j = new ArrayList(list);
        this.f633k = j14;
        this.f634l = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            ArrayList arrayList2 = new ArrayList(j10.size());
            for (PlaybackState.CustomAction a10 : j10) {
                arrayList2.add(CustomAction.a(a10));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
        playbackStateCompat.f635m = playbackState;
        return playbackStateCompat;
    }

    public static int j(long j10) {
        if (j10 == 4) {
            return 126;
        }
        if (j10 == 2) {
            return 127;
        }
        if (j10 == 32) {
            return 87;
        }
        if (j10 == 16) {
            return 88;
        }
        if (j10 == 1) {
            return 86;
        }
        if (j10 == 64) {
            return 90;
        }
        if (j10 == 8) {
            return 89;
        }
        return j10 == 512 ? 85 : 0;
    }

    public long c() {
        return this.f628f;
    }

    public long d() {
        return this.f631i;
    }

    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.f627d;
    }

    public Object g() {
        if (this.f635m == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder d10 = b.d();
            b.x(d10, this.f624a, this.f625b, this.f627d, this.f631i);
            b.u(d10, this.f626c);
            b.s(d10, this.f628f);
            b.v(d10, this.f630h);
            for (CustomAction c10 : this.f632j) {
                b.a(d10, (PlaybackState.CustomAction) c10.c());
            }
            b.t(d10, this.f633k);
            if (Build.VERSION.SDK_INT >= 22) {
                c.b(d10, this.f634l);
            }
            this.f635m = b.c(d10);
        }
        return this.f635m;
    }

    public long h() {
        return this.f625b;
    }

    public int i() {
        return this.f624a;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f624a + ", position=" + this.f625b + ", buffered position=" + this.f626c + ", speed=" + this.f627d + ", updated=" + this.f631i + ", actions=" + this.f628f + ", error code=" + this.f629g + ", error message=" + this.f630h + ", custom actions=" + this.f632j + ", active item id=" + this.f633k + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f624a);
        parcel.writeLong(this.f625b);
        parcel.writeFloat(this.f627d);
        parcel.writeLong(this.f631i);
        parcel.writeLong(this.f626c);
        parcel.writeLong(this.f628f);
        TextUtils.writeToParcel(this.f630h, parcel, i10);
        parcel.writeTypedList(this.f632j);
        parcel.writeLong(this.f633k);
        parcel.writeBundle(this.f634l);
        parcel.writeInt(this.f629g);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final List<CustomAction> f645a;

        /* renamed from: b  reason: collision with root package name */
        private int f646b;

        /* renamed from: c  reason: collision with root package name */
        private long f647c;

        /* renamed from: d  reason: collision with root package name */
        private long f648d;

        /* renamed from: e  reason: collision with root package name */
        private float f649e;

        /* renamed from: f  reason: collision with root package name */
        private long f650f;

        /* renamed from: g  reason: collision with root package name */
        private int f651g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f652h;

        /* renamed from: i  reason: collision with root package name */
        private long f653i;

        /* renamed from: j  reason: collision with root package name */
        private long f654j;

        /* renamed from: k  reason: collision with root package name */
        private Bundle f655k;

        public d() {
            this.f645a = new ArrayList();
            this.f654j = -1;
        }

        public d a(CustomAction customAction) {
            if (customAction != null) {
                this.f645a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }

        public PlaybackStateCompat b() {
            return new PlaybackStateCompat(this.f646b, this.f647c, this.f648d, this.f649e, this.f650f, this.f651g, this.f652h, this.f653i, this.f645a, this.f654j, this.f655k);
        }

        public d c(long j10) {
            this.f650f = j10;
            return this;
        }

        public d d(long j10) {
            this.f654j = j10;
            return this;
        }

        public d e(long j10) {
            this.f648d = j10;
            return this;
        }

        public d f(int i10, CharSequence charSequence) {
            this.f651g = i10;
            this.f652h = charSequence;
            return this;
        }

        public d g(Bundle bundle) {
            this.f655k = bundle;
            return this;
        }

        public d h(int i10, long j10, float f10, long j11) {
            this.f646b = i10;
            this.f647c = j10;
            this.f653i = j11;
            this.f649e = f10;
            return this;
        }

        public d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f645a = arrayList;
            this.f654j = -1;
            this.f646b = playbackStateCompat.f624a;
            this.f647c = playbackStateCompat.f625b;
            this.f649e = playbackStateCompat.f627d;
            this.f653i = playbackStateCompat.f631i;
            this.f648d = playbackStateCompat.f626c;
            this.f650f = playbackStateCompat.f628f;
            this.f651g = playbackStateCompat.f629g;
            this.f652h = playbackStateCompat.f630h;
            List<CustomAction> list = playbackStateCompat.f632j;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f654j = playbackStateCompat.f633k;
            this.f655k = playbackStateCompat.f634l;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f636a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f637b;

        /* renamed from: c  reason: collision with root package name */
        private final int f638c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f639d;

        /* renamed from: f  reason: collision with root package name */
        private PlaybackState.CustomAction f640f;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final String f641a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f642b;

            /* renamed from: c  reason: collision with root package name */
            private final int f643c;

            /* renamed from: d  reason: collision with root package name */
            private Bundle f644d;

            public b(String str, CharSequence charSequence, int i10) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                } else if (i10 != 0) {
                    this.f641a = str;
                    this.f642b = charSequence;
                    this.f643c = i10;
                } else {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
            }

            public CustomAction a() {
                return new CustomAction(this.f641a, this.f642b, this.f643c, this.f644d);
            }

            public b b(Bundle bundle) {
                this.f644d = bundle;
                return this;
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f636a = str;
            this.f637b = charSequence;
            this.f638c = i10;
            this.f639d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l10 = b.l(customAction);
            MediaSessionCompat.a(l10);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l10);
            customAction2.f640f = customAction;
            return customAction2;
        }

        public Object c() {
            PlaybackState.CustomAction customAction = this.f640f;
            if (customAction != null || Build.VERSION.SDK_INT < 21) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder e10 = b.e(this.f636a, this.f637b, this.f638c);
            b.w(e10, this.f639d);
            return b.b(e10);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f637b + ", mIcon=" + this.f638c + ", mExtras=" + this.f639d;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f636a);
            TextUtils.writeToParcel(this.f637b, parcel, i10);
            parcel.writeInt(this.f638c);
            parcel.writeBundle(this.f639d);
        }

        CustomAction(Parcel parcel) {
            this.f636a = parcel.readString();
            this.f637b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f638c = parcel.readInt();
            this.f639d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f624a = parcel.readInt();
        this.f625b = parcel.readLong();
        this.f627d = parcel.readFloat();
        this.f631i = parcel.readLong();
        this.f626c = parcel.readLong();
        this.f628f = parcel.readLong();
        this.f630h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f632j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f633k = parcel.readLong();
        this.f634l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f629g = parcel.readInt();
    }
}
