package net.d4ruva.tutorial;

import net.d4ruva.tutorial.core.WindowManager;
import org.lwjgl.Version;

public class Launcher {

	public static void main(String[]  args) {
		System.out.println(Version.getVersion());

		WindowManager window = new WindowManager("Untitled Window ", 1600, 900, false);

		window.init();

		while(!window.windowShouldClose()){
			window.update();
		}

		window.cleanup();

	}
	
}
