package ch.pg.sinkships.controller;

import ch.pg.sinkships.view.StartSinkShips;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * The start controller class.
 * 
 * @author PatrickG07
 */
public class Controllerstart {

	/**
	 * Changes the stage to the Ships setter controller class.
	 * 
	 * @param e
	 */
	@FXML
	protected void Spielen(ActionEvent e) {
		StartSinkShips.loadScene("/ch/pg/sinkships/view/Playerchange");
	}

	/**
	 * Closes The Programm
	 * 
	 * @param e
	 */
	@FXML
	protected void Quit(ActionEvent e) {
		System.exit(0);
	}
}
