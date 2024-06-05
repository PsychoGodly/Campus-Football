package h0;

import java.io.InputStream;
import java.io.OutputStream;
import sd.w;
import xd.d;

/* compiled from: Serializer.kt */
public interface k<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, d<? super T> dVar);

    Object writeTo(T t10, OutputStream outputStream, d<? super w> dVar);
}
