public class Warmup {
    public String stringTimes(String str, int n) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result = result.append(str);
        }
        return String.valueOf(result);
    }
}
