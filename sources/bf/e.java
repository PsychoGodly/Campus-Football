package bf;

import java.io.IOException;

/* compiled from: Callback */
public interface e {
    void onFailure(d dVar, IOException iOException);

    void onResponse(d dVar, z zVar) throws IOException;
}
