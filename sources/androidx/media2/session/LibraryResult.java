package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

public class LibraryResult extends CustomVersionedParcelable {

    /* renamed from: a  reason: collision with root package name */
    int f4204a;

    /* renamed from: b  reason: collision with root package name */
    long f4205b;

    /* renamed from: c  reason: collision with root package name */
    MediaItem f4206c;

    /* renamed from: d  reason: collision with root package name */
    MediaItem f4207d;

    /* renamed from: e  reason: collision with root package name */
    MediaLibraryService$LibraryParams f4208e;

    /* renamed from: f  reason: collision with root package name */
    List<MediaItem> f4209f;

    /* renamed from: g  reason: collision with root package name */
    ParcelImplListSlice f4210g;

    LibraryResult() {
    }

    public void c() {
        this.f4206c = this.f4207d;
        this.f4209f = b.b(this.f4210g);
    }

    public void d(boolean z10) {
        MediaItem mediaItem = this.f4206c;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (this.f4207d == null) {
                    this.f4207d = b.c(this.f4206c);
                }
            }
        }
        List<MediaItem> list = this.f4209f;
        if (list != null) {
            synchronized (list) {
                if (this.f4210g == null) {
                    this.f4210g = b.a(this.f4209f);
                }
            }
        }
    }
}
