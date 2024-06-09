public class Point {
    int x, y;

    public Point(int x, int y) throws InvalidNumberException {
        if (x < 0 || x > 24 || y < 0 || y > 24) {
            throw new InvalidNumberException("0 이상 24 이하로 입력해주세요.");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
