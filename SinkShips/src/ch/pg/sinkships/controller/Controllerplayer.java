package ch.pg.sinkships.controller;

import ch.pg.sinkships.model.Game;
import ch.pg.sinkships.view.StartSinkShips;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * Controller class for set player name.
 * 
 * @author Patrick
 */
public class Controllerplayer {

	@FXML
	protected GridPane griden, gridyou;

	@FXML
	protected ImageView box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14, box15,
			box16, box17, box18, box19, box20, box21, box22, box23, box24, box25, box26, box27, box28, box29, box30,
			box31, box32, box33, box34, box35, box36, box37, box38, box39, box40, box41, box42, box43, box44, box45,
			box46, box47, box48, box49, box50, box51, box52, box53, box54, box55, box56, box57, box58, box59, box60,
			box61, box62, box63, box64, box65, box66, box67, box68, box69, box70, box71, box72, box73, box74, box75,
			box76, box77, box78, box79, box80, box81, box82, box83, box84, box85, box86, box87, box88, box89, box90,
			box91, box92, box93, box94, box95, box96, box97, box98, box99, box100;

	/**
	 * 
	 * 
	 * @param e
	 */
	@FXML
	protected void Play(ActionEvent e) {
		StartSinkShips.loadScene("/ch/pg/sinkships/view/Playground");

	}

	/**
	 * Returns to the main Controller.
	 * 
	 * @param e
	 */
	@FXML
	protected void Back(ActionEvent e) {
		StartSinkShips.loadScene("/ch/pg/sinkships/view/Main");
	}
}
