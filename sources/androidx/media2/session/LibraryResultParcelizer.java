package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.a;

public final class LibraryResultParcelizer {
    public static LibraryResult read(a aVar) {
        LibraryResult libraryResult = new LibraryResult();
        libraryResult.f4204a = aVar.v(libraryResult.f4204a, 1);
        libraryResult.f4205b = aVar.y(libraryResult.f4205b, 2);
        libraryResult.f4207d = (MediaItem) aVar.I(libraryResult.f4207d, 3);
        libraryResult.f4208e = (MediaLibraryService$LibraryParams) aVar.I(libraryResult.f4208e, 4);
        libraryResult.f4210g = (ParcelImplListSlice) aVar.A(libraryResult.f4210g, 5);
        libraryResult.c();
        return libraryResult;
    }

    public static void write(LibraryResult libraryResult, a aVar) {
        aVar.K(false, false);
        libraryResult.d(aVar.g());
        aVar.Y(libraryResult.f4204a, 1);
        aVar.b0(libraryResult.f4205b, 2);
        aVar.m0(libraryResult.f4207d, 3);
        aVar.m0(libraryResult.f4208e, 4);
        aVar.d0(libraryResult.f4210g, 5);
    }
}
