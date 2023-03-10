import java.awt.*;

public class Arc extends Shape{
    private int startAngle;
    private int arcAngle;

    public Arc(){
        super();
        startAngle = 60;
        arcAngle = 40;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
