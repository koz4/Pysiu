package com.koz4dev.pysiu.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.koz4dev.pysiu.Pysiu;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=Pysiu.WIDTH;
		config.height=Pysiu.HEIGHT;
		config.title=Pysiu.TITLE;
		new LwjglApplication(new Pysiu(), config);
	}
}
