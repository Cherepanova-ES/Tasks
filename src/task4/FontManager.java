package task4;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.*;


public class FontManager extends JFrame {
    private TextRenderer renderer;

    public FontManager(TextRenderer renderer) {
        this.renderer = renderer;
        initUI();
    }

    private void initUI() {
        FontTextRenderer fontRenderer = new FontTextRenderer(new Font("Arial", Font.BOLD, 20));

        // Создаем контекст рендеринга
        FontRenderContext frc = new FontRenderContext(null, true, true);

        // Получаем границы текста
        Rectangle2D bounds = fontRenderer.font.getStringBounds("Пример текста", frc);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                // Передаем текст в `renderText()`
                renderText(g2d, "Пример текста", (int) bounds.getX(), (int) bounds.getY());
            }
        };
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    public void renderText(Graphics2D g2d, String text, int x, int y) {
        renderer.renderText(g2d, text, x, y);
    }

    public static void main(String[] args) {
        FontTextRenderer fontRenderer = new FontTextRenderer(new Font("Arial", Font.BOLD, 20));
        FontManager manager = new FontManager(fontRenderer);
    }
}