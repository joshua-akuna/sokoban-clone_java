package model;

public abstract class CollisionObject
        extends GameObject{
    public CollisionObject(int x, int y) {
        super(x, y);
    }

    abstract boolean isCollision (
            GameObject gameObject,
            Direction direction
    );
}
