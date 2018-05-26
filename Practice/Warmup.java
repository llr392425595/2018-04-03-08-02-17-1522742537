import java.util.Arrays;

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

    boolean doubleX(String str) {
        int indexOfFirstX = str.indexOf("x");
        if (indexOfFirstX == -1) return false;
        if (indexOfFirstX + 1 >= str.length()) return false;
        return str.substring(indexOfFirstX + 1, indexOfFirstX + 2).equals("x");
    }

    String stringBits(String str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return String.valueOf(result);
    }

    String stringSplosion(String str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            result.append(str, 0, i + 1);
        }
        return String.valueOf(result);
    }

    int last2(String str) {
        if (str.length() < 2) return 0;
        String last2Str = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(last2Str)) count++;
        }
        return count;
    }

    int arrayCount9(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num == 9) {
                result++;
            }
        }
        return result;
    }

    boolean arrayFront9(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                index = i;
                break;
            }
        }
        return index != -1 && index < 4;
    }

    boolean array123(int[] nums) {
        return Arrays.binarySearch(nums, 1) > -1
                && Arrays.binarySearch(nums, 2) > -1
                && Arrays.binarySearch(nums, 3) > -1;
    }

    int stringMatch(String a, String b) {
        int result = 0;
        int len = a.length() < b.length() ? a.length() : b.length();
        for (int i = 0; i < len - 1; i++) {
            String suba = a.substring(i, i + 2);
            String subb = b.substring(i, i + 2);
            if (suba.equals(subb)) {
                result++;
            }
        }
        return result;
    }

    String stringX(String str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            result.append(ch.equals("x") && i != 0 && i != str.length() - 1 ? "" : ch);
        }
        return String.valueOf(result);
    }

    String altPairs(String str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2 > str.length() ? str.length() : i + 2;
            result.append(str, i, end);
        }
        return String.valueOf(result);
    }

    String stringYak(String str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return String.valueOf(result);
    }

    int array667(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                result++;
            }
        }
        return result;
    }

    boolean noTriples(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                result = false;
                break;
            }
        }
        return result;
    }

    boolean differLessThan2(int a,int b) {
        return a >= b - 2 && a <= b + 2;
    }

    boolean has271(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i + 1] == nums[i] + 5 && (differLessThan2(nums[i + 2], nums[i] - 1))) {
                result = true;
                break;
            }
        }
        return result;
    }


}




