public class Q04_PrefixPostfixCounter {
    public static void main(String[] args) {
        int visitors = 10;
        System.out.println("Visitors before entry: " + visitors);
        System.out.println("Visitor entering (prefix ++): " + (++visitors));
        System.out.println("Visitor leaving (postfix --): " + (visitors--));
        System.out.println("Visitors after leaving: " + visitors);
    }
}
