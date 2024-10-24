package task4;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;


public class ShadowTextRenderer implements TextRenderer {
    @Override
    public void renderText(Graphics2D g2d, String text, int x, int y) {
        g2d.setColor(g2d.getColor().darker());
        g2d.drawString(text, x + 2, y + 2);
        g2d.setColor(g2d.getColor().brighter());
        g2d.drawString(text, x, y);
    }
}
