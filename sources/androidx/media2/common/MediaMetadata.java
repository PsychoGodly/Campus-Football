package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.versionedparcelable.ParcelImpl;
import i1.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class MediaMetadata extends CustomVersionedParcelable {

    /* renamed from: d  reason: collision with root package name */
    static final a<String, Integer> f4151d;

    /* renamed from: a  reason: collision with root package name */
    Bundle f4152a;

    /* renamed from: b  reason: collision with root package name */
    Bundle f4153b;

    /* renamed from: c  reason: collision with root package name */
    ParcelImplListSlice f4154c;

    static final class BitmapEntry implements b {

        /* renamed from: a  reason: collision with root package name */
        String f4155a;

        /* renamed from: b  reason: collision with root package name */
        Bitmap f4156b;

        BitmapEntry() {
        }

        private int d(Bitmap bitmap) {
            return androidx.core.graphics.a.a(bitmap);
        }

        /* access modifiers changed from: package-private */
        public Bitmap c() {
            return this.f4156b;
        }

        /* access modifiers changed from: package-private */
        public String e() {
            return this.f4155a;
        }

        BitmapEntry(String str, Bitmap bitmap) {
            this.f4155a = str;
            this.f4156b = bitmap;
            int d10 = d(bitmap);
            if (d10 > 262144) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                double sqrt = Math.sqrt(262144.0d / ((double) d10));
                int i10 = (int) (((double) width) * sqrt);
                int i11 = (int) (((double) height) * sqrt);
                Log.i("MediaMetadata", "Scaling large bitmap of " + width + "x" + height + " into " + i10 + "x" + i11);
                this.f4156b = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
            }
        }
    }

    static {
        a<String, Integer> aVar = new a<>();
        f4151d = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("androidx.media2.metadata.RADIO_FREQUENCY", 4);
        aVar.put("androidx.media2.metadata.RADIO_PROGRAM_NAME", 1);
        aVar.put("androidx.media2.metadata.BROWSABLE", 0);
        aVar.put("androidx.media2.metadata.PLAYABLE", 0);
        aVar.put("androidx.media2.metadata.ADVERTISEMENT", 0);
        aVar.put("androidx.media2.metadata.DOWNLOAD_STATUS", 0);
        aVar.put("androidx.media2.metadata.EXTRAS", 5);
    }

    MediaMetadata() {
    }

    public void c() {
        Bundle bundle = this.f4153b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f4152a = bundle;
        ParcelImplListSlice parcelImplListSlice = this.f4154c;
        if (parcelImplListSlice != null) {
            for (ParcelImpl a10 : parcelImplListSlice.c()) {
                BitmapEntry bitmapEntry = (BitmapEntry) MediaParcelUtils.a(a10);
                this.f4152a.putParcelable(bitmapEntry.e(), bitmapEntry.c());
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f4152a) {
            if (this.f4153b == null) {
                this.f4153b = new Bundle(this.f4152a);
                ArrayList arrayList = new ArrayList();
                for (String str : this.f4152a.keySet()) {
                    Object obj = this.f4152a.get(str);
                    if (obj instanceof Bitmap) {
                        arrayList.add(MediaParcelUtils.b(new BitmapEntry(str, (Bitmap) obj)));
                        this.f4153b.remove(str);
                    }
                }
                this.f4154c = new ParcelImplListSlice((List<ParcelImpl>) arrayList);
            }
        }
    }

    public boolean e(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        return this.f4152a.containsKey(str);
    }

    public long f(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        return this.f4152a.getLong(str, 0);
    }

    public String g(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        CharSequence charSequence = this.f4152a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public String toString() {
        return this.f4152a.toString();
    }
}
