void main() {
    System.out.println(CountSmile.countSmileys(new String[]{":)", ";(", ";}", ":-D"}));       // 2
    System.out.println(CountSmile.countSmileys(new String[]{";D", ":-(", ":-)", ";~)"}));     // 3
    System.out.println(CountSmile.countSmileys(new String[]{";]", ":[", ";*", ":$", ";-D"}));// 1
    System.out.println(CountSmile.countSmileys(new String[]{}));
}