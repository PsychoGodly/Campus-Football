package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3991a = (AudioAttributes) aVar.A(audioAttributesImplApi21.f3991a, 1);
        audioAttributesImplApi21.f3992b = aVar.v(audioAttributesImplApi21.f3992b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.K(false, false);
        aVar.d0(audioAttributesImplApi21.f3991a, 1);
        aVar.Y(audioAttributesImplApi21.f3992b, 2);
    }
}
