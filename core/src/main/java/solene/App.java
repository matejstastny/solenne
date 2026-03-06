package solene;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

// Main app class. Does not include main method
public class App extends ApplicationAdapter {
    private SpriteBatch batch;

    // Textures
    private Texture logo;
    private Texture player;
    private Texture tree;

    @Override
    public void create() {
        batch = new SpriteBatch();
        logo = new Texture("libgdx.png");
        player = new Texture("player.png");
        tree = new Texture("tree.png");
    }

    @Override
    public void render() {
        input();
        logic();
        draw();
    }

    @Override
    public void dispose() {
        batch.dispose();
        logo.dispose();
    }

    public void input() {
    }

    public void logic() {
    }

    public void draw() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(logo, 140, 210);
        batch.draw(player, 150, 220);
        batch.draw(tree, 160, 230);
        batch.end();
    }
}
