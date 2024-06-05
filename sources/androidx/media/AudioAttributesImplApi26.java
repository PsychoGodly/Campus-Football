package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    static class a extends AudioAttributesImplApi21.a {
        a() {
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f3993a.build());
        }

        /* renamed from: i */
        public a h(int i10) {
            this.f3993a.setUsage(i10);
            return this;
        }
    }

    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
