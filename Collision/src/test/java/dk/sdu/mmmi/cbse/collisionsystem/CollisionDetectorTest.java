package dk.sdu.mmmi.cbse.collisionsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;

import static org.junit.jupiter.api.Assertions.*;
class CollisionDetectorTest {

    private CollisionDetector collisionDetector;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        collisionDetector = new CollisionDetector();


        PositionPart positionPart1 = new PositionPart(0,5,0);
        PositionPart positionPart2 = new PositionPart(5,10,0);
        entity1.setRadius(100);
        entity2.setRadius(100);
        entity1.add(positionPart1);
        entity2.add(positionPart2);
    }
    Entity entity1 = new Entity();
    Entity entity2 = new Entity();
    @org.junit.jupiter.api.Test
    void collides() {
        assertEquals(true, collisionDetector.collides(entity1,entity2));
    }
}