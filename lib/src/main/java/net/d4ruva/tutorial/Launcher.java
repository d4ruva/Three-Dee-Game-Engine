package net.d4ruva.tutorial;

import net.d4ruva.tutorial.core.EngineManager;
import net.d4ruva.tutorial.core.WindowManager;
import net.d4ruva.tutorial.core.utils.Consts;
import org.lwjgl.Version;

public class Launcher {

	private static WindowManager window;
	private static EngineManager engine;

	public static void main(String[]  args) {
		System.out.println(Version.getVersion());

		window = new WindowManager(Consts.TITLE, 1600, 900, false);
		engine = new EngineManager();

		try{
			engine.start();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public static WindowManager getWindow() {
		return window;
	}
}
