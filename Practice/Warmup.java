public class Warmup {
    String stringTimes(String str, int n) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result = result.append(str);
        }
        return String.valueOf(result);
    }

    String frontTimes(String str, int n) {
        String frontStr = str.length() > 3 ? str.substring(0, 3) : str;
        return stringTimes(frontStr, n);
    }

    int countXX(String str) {
        int xCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) xCount++;
        }
        return xCount;
    }

}
