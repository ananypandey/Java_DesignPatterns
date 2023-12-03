package StructuralDesignPattern.WhyweNeedFlyweight;

public class Mains
{
    public static void main(String[] args)
    {
        // For Robot
        int x=0;
        int y=0;
        for(int i=0;i<10000;i++)
        {
            Sprites human = new Sprites();
            Robot humanRobot = new Robot(x+i,y+i,"human",human);
        }
        //There is issue with this code
    }
}
