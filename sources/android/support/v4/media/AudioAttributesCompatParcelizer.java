package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.a;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(aVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, aVar);
    }
}
