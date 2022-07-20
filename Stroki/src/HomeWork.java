public class HomeWork {
    public static void main(String[] args) {

        String j = "I like Java!!!";
        System.out.println(j.charAt(13));
        System.out.println(j.endsWith("!!!"));
        System.out.println(j.startsWith("I like"));
        System.out.println(j.contains("Java"));
        System.out.println(j.indexOf("Java"));//индекс вхождения
        System.out.println(j.replace("a", "o"));
        System.out.println(j.toUpperCase());
        System.out.println(j.toLowerCase());
        System.out.println(j.substring(7));


        StringBuilder st = new StringBuilder("3");
        System.out.println(st.append("+").append("56").append("=").append("59"));

        StringBuilder st1 = new StringBuilder("3");
        System.out.println(st1.append("-").append("56").append("=").append("-53"));

        StringBuilder st2 = new StringBuilder("3");
        System.out.println(st2.append("*").append("56").append("=").append("168"));

        String m = "parusnik";
        String n = "vozduh";
        System.out.println(m.substring(m.length() / 2) + n.substring(0, n.length() / 2));

    }
}
