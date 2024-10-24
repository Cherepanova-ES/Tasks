package task4;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;


public class FontTextRenderer implements TextRenderer {
    public Font font;

    public FontTextRenderer(Font font) {
        this.font = font;
    }

    @Override
    public void renderText(Graphics2D g2d, String text, int x, int y) {
        Font oldFont = g2d.getFont();
        g2d.setFont(font);
        g2d.drawString(text, x, y);
        g2d.setFont(oldFont);
    }
}
