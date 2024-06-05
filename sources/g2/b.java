package g2;

/* compiled from: Retries */
public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i10, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) throws Throwable {
        TResult apply;
        if (i10 < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            if (tinput == null || i10 - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            break;
        } while (i10 - 1 < 1);
        return apply;
    }
}
