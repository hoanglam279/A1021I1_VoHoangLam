package s6_inheritance.exercise.point_moveablepoint;
public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(5,2,3,1);
        point.move();
        System.out.println(point.toString());
    }
}
