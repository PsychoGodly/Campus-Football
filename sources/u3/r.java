package u3;

import java.io.IOException;

/* compiled from: SampleQueueMappingException */
public final class r extends IOException {
    public r(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}
