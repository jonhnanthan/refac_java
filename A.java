public class A {

    public void b() {
        int[] a = m();
    }

    public void c() {
        int[] a = m();
    }

    private int[] m() {
        int[] a = new int[]{19, 99};
        return a;
    }
}
