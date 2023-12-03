package StructuralDesignPattern.WhyweNeedFlyweight;

public class Robot
{
    int coordinateX;
    int coordinateY;
    String type;
    Sprites body; //Small 2d bitmap (Graphic Element);

    Robot(int x,int y, String type, Sprites body)
    {
        this.coordinateX=x;
        this.coordinateY=y;
        this.type = type;
        this.body=body;
    }
}
