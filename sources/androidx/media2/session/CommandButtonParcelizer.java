package androidx.media2.session;

import androidx.versionedparcelable.a;

public final class CommandButtonParcelizer {
    public static MediaSession$CommandButton read(a aVar) {
        MediaSession$CommandButton mediaSession$CommandButton = new MediaSession$CommandButton();
        mediaSession$CommandButton.f4221a = (SessionCommand) aVar.I(mediaSession$CommandButton.f4221a, 1);
        mediaSession$CommandButton.f4222b = aVar.v(mediaSession$CommandButton.f4222b, 2);
        mediaSession$CommandButton.f4223c = aVar.o(mediaSession$CommandButton.f4223c, 3);
        mediaSession$CommandButton.f4224d = aVar.k(mediaSession$CommandButton.f4224d, 4);
        mediaSession$CommandButton.f4225e = aVar.i(mediaSession$CommandButton.f4225e, 5);
        return mediaSession$CommandButton;
    }

    public static void write(MediaSession$CommandButton mediaSession$CommandButton, a aVar) {
        aVar.K(false, false);
        aVar.m0(mediaSession$CommandButton.f4221a, 1);
        aVar.Y(mediaSession$CommandButton.f4222b, 2);
        aVar.S(mediaSession$CommandButton.f4223c, 3);
        aVar.O(mediaSession$CommandButton.f4224d, 4);
        aVar.M(mediaSession$CommandButton.f4225e, 5);
    }
}
