package androidx.media;

import androidx.versionedparcelable.a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3994a = aVar.v(audioAttributesImplBase.f3994a, 1);
        audioAttributesImplBase.f3995b = aVar.v(audioAttributesImplBase.f3995b, 2);
        audioAttributesImplBase.f3996c = aVar.v(audioAttributesImplBase.f3996c, 3);
        audioAttributesImplBase.f3997d = aVar.v(audioAttributesImplBase.f3997d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.K(false, false);
        aVar.Y(audioAttributesImplBase.f3994a, 1);
        aVar.Y(audioAttributesImplBase.f3995b, 2);
        aVar.Y(audioAttributesImplBase.f3996c, 3);
        aVar.Y(audioAttributesImplBase.f3997d, 4);
    }
}
