package androidx.media;

import androidx.versionedparcelable.a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3989a = (AudioAttributesImpl) aVar.I(audioAttributesCompat.f3989a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.K(false, false);
        aVar.m0(audioAttributesCompat.f3989a, 1);
    }
}
