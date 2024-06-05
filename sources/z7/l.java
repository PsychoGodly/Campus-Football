package z7;

import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
/* compiled from: HeartBeatResult */
public abstract class l {
    public static l a(String str, List<String> list) {
        return new a(str, list);
    }

    public abstract List<String> b();

    public abstract String c();
}
