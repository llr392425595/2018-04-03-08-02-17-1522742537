public class Warmup {
    public String stringTimes(String str, int n) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result = result.append(str);
        }
        return String.valueOf(result);
    }

    public String frontTimes(String str, int n) {
        String frontStr = str.length() > 3 ? str.substring(0, 3) : str;
        return stringTimes(frontStr, n);
    }

}
