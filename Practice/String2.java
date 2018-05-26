class String2 {
    String doubleChar(String str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            result.append(String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i)));
        }
        return String.valueOf(result);
    }

}
