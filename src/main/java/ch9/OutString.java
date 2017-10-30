package ch9;

public class OutString {
    public static void main(String[] args) {
        final String sourceStr = "吉林省 明日 科技有限公司--编程 词典！";
        IStringDeal s = new IStringDeal() {
            @Override
            public String filterBlankChar() {
                String convertStr = sourceStr;
                convertStr = convertStr.replaceAll(" ", "");
                return convertStr;
            }
        };
        System.out.println("源字符串： \n" + sourceStr);
        System.out.println("转换后的字符串： \n" + s.filterBlankChar());
    }
}
