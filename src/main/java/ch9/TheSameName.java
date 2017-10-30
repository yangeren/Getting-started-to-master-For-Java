package ch9;

public class TheSameName {
    private int x;
    private class inner {
        private int x = 9;

        public void doit(int x) {
            x++;
            this.x++;
            TheSameName.this.x++;
        }
    }
}
