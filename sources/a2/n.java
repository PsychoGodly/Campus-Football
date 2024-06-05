package a2;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* compiled from: LogResponse */
public abstract class n {
    static n a(long j10) {
        return new h(j10);
    }

    public static n b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return a(Long.parseLong(jsonReader.nextString()));
                } else {
                    n a10 = a(jsonReader.nextLong());
                    jsonReader.close();
                    return a10;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long c();
}
