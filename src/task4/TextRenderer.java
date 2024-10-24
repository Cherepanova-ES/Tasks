package task4;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

public interface TextRenderer {
    void renderText(Graphics2D g2d, String text, int x, int y);
}
