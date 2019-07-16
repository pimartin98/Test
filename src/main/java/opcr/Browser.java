package opcr;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

@SuppressWarnings("restriction")
public class Browser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFXPanel fxPanel = new JFXPanel();
	// Les composants JavaFX
	Group group;
	Scene scene;
	WebView webView;
	WebEngine webEngine;
	FXRunnable fxRun;
	final int WIDTH = 900, HEIGHT = 600;

	public Browser(String title, final String content) {
		// On initialise notre fen�tre
		setSize(new Dimension(WIDTH, HEIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle(title);
		add(new JScrollPane(fxPanel));
		setVisible(true);

		// pour m�langer des composants JavaFX et Swing
		// les composants JavaFX doivent s'ex�cuter dans leur propre thread
		// Ils ne s'ex�cutent pas dans l'EDT swing !
		fxRun = new FXRunnable(content);
		// Lance le thread dans un thread d�di� � JavaFX
		Platform.runLater(fxRun);

	}

	/**
	 * M�thode permettant de mettre � jour le JFXPanel
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		// pour la mise � jour de ce composant,
		// vu qu'il cohabite avec Swing
		// celle-ci DOIT se faire dans un thread JavaFX
		fxRun = new FXRunnable(content);
		Platform.runLater(fxRun);
	}

	/**
	 * une classe interne qui permet de travailler conjointement avec JavaFX et
	 * Swing
	 * 
	 * @author CHerby
	 */
	private class FXRunnable implements Runnable {
		String content;

		public FXRunnable(String pContent) {
			content = pContent;
		}

		@Override
		public void run() {
			initFX(fxPanel);
			setContent(content);
		}

		/**
		 * initialise les composants JavaFX
		 * 
		 * @param fxPanel
		 */
		private void initFX(JFXPanel fxPanel) {
			group = new Group();
			scene = new Scene(group);
			fxPanel.setScene(scene);

			webView = new WebView();
			webEngine = webView.getEngine();

			group.getChildren().add(webView);

			webView.setMinSize(WIDTH, HEIGHT);
			webView.setMaxSize(WIDTH, HEIGHT);
		}

		public void setContent(String content) {
			webEngine.loadContent(content);
			webEngine.reload();
		}
	}
}