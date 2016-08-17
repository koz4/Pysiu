package com.koz4dev.pysiu.states;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.koz4dev.pysiu.Pysiu;

/**
 * Created by Marek on 8/16/2016.
 */
public class MenuState extends State{
    Texture background;
    Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
       // if(Gdx.input.justTouched()){
         //   gsm.set(new PlayState(gsm));
        //}
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, Pysiu.WIDTH, Pysiu.HEIGHT);
        sb.draw(playBtn, (Pysiu.WIDTH / 2) - (playBtn.getWidth() / 2), Pysiu.HEIGHT / 2);
        sb.end();

    }
}