package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class LibraryParamsParcelizer {
    public static MediaLibraryService$LibraryParams read(a aVar) {
        MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams = new MediaLibraryService$LibraryParams();
        mediaLibraryService$LibraryParams.f4217a = aVar.k(mediaLibraryService$LibraryParams.f4217a, 1);
        mediaLibraryService$LibraryParams.f4218b = aVar.v(mediaLibraryService$LibraryParams.f4218b, 2);
        mediaLibraryService$LibraryParams.f4219c = aVar.v(mediaLibraryService$LibraryParams.f4219c, 3);
        mediaLibraryService$LibraryParams.f4220d = aVar.v(mediaLibraryService$LibraryParams.f4220d, 4);
        return mediaLibraryService$LibraryParams;
    }

    public static void write(MediaLibraryService$LibraryParams mediaLibraryService$LibraryParams, a aVar) {
        aVar.K(false, false);
        aVar.O(mediaLibraryService$LibraryParams.f4217a, 1);
        aVar.Y(mediaLibraryService$LibraryParams.f4218b, 2);
        aVar.Y(mediaLibraryService$LibraryParams.f4219c, 3);
        aVar.Y(mediaLibraryService$LibraryParams.f4220d, 4);
    }
}
