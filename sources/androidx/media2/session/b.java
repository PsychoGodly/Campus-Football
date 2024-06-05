package androidx.media2.session;

import android.os.Bundle;
import androidx.media.d;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: MediaUtils */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d.e f4261a = new d.e("androidx.media2.session.MediaLibraryService", (Bundle) null);

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f4262b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f4263c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, String> f4264d = new HashMap();

    /* compiled from: MediaUtils */
    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f4263c = hashMap;
        hashMap.put("android.media.metadata.ADVERTISEMENT", "androidx.media2.metadata.ADVERTISEMENT");
        hashMap.put("android.media.metadata.BT_FOLDER_TYPE", "androidx.media2.metadata.BROWSABLE");
        hashMap.put("android.media.metadata.DOWNLOAD_STATUS", "androidx.media2.metadata.DOWNLOAD_STATUS");
        for (Map.Entry entry : hashMap.entrySet()) {
            Map<String, String> map = f4264d;
            if (!map.containsKey(entry.getValue())) {
                map.put((String) entry.getValue(), (String) entry.getKey());
            } else {
                throw new RuntimeException("Shouldn't map to the same value");
            }
        }
    }

    public static ParcelImplListSlice a(List<MediaItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            MediaItem mediaItem = list.get(i10);
            if (mediaItem != null) {
                arrayList.add(MediaParcelUtils.b(mediaItem));
            }
        }
        return new ParcelImplListSlice((List<ParcelImpl>) arrayList);
    }

    public static List<MediaItem> b(ParcelImplListSlice parcelImplListSlice) {
        if (parcelImplListSlice == null) {
            return null;
        }
        List<ParcelImpl> c10 = parcelImplListSlice.c();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c10.size(); i10++) {
            ParcelImpl parcelImpl = c10.get(i10);
            if (parcelImpl != null) {
                arrayList.add((MediaItem) MediaParcelUtils.a(parcelImpl));
            }
        }
        return arrayList;
    }

    public static MediaItem c(MediaItem mediaItem) {
        return (mediaItem == null || mediaItem.getClass() == MediaItem.class) ? mediaItem : new MediaItem.a().d(mediaItem.h()).b(mediaItem.e()).c(mediaItem.g()).a();
    }
}
