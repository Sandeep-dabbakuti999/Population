package Cells;
import java.awt.Color;
import processing.core.PApplet;

public class Rectangle  {
        private double x;
        private double y;
        private double w;
        private double h;

        public Rectangle(double x, double y, double w, double h)
        {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public void draw(Color col, PApplet app)
        {
            app.fill(col.getRGB());
            app.rect((float)this.x, (float)this.y, (float)this.w, (float)this.h);
        }
}
