public class Domino {
    private int top;
    private int bottom;

    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle() {
        if (top > bottom) {
            flip();
        }
    }

    public String toString() {
        return top + "/" + bottom;
    }

    public int compareTo(Domino other) {
        if (top > other.getTop()) {
            return 1;
        } else if (top < other.getTop()) {
            return -1;
        } else {
            if (bottom < other.getBottom()) {
                return -1;
            } else if (bottom > other.getBottom()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other) {
        int thisWeight = top + bottom;
        int otherWeight = other.getTop() + other.getBottom();
        if (thisWeight < otherWeight) {
            return -1;
        } else if (thisWeight > otherWeight) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean canConnect(Domino other) {
        return top == other.getTop()
                || top == other.getBottom()
                || bottom == other.getTop()
                || bottom == other.getBottom();
    }
}