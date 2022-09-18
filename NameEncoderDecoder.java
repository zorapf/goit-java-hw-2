public class NameEncoderDecoder {

    public String encode(String name) {
        String encode = name.replaceAll("a", "5")
                .replaceAll("o", "4")
                .replaceAll("i", "3")
                .replaceAll("u", "2")
                .replaceAll("e", "1");
        return "NOTFORYOU" + encode + "YESNOTFORYOU";

    }

    public String decode(String name) {
        String decode = name.replaceAll("5", "a")
                .replaceAll("4", "o")
                .replaceAll("3", "i")
                .replaceAll("2", "u")
                .replaceAll("1", "e")
                .replaceAll("NOTFORYOU", "")
                .replaceAll("YES", "");
        return decode;
    }
}
