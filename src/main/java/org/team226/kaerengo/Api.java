package org.team226.kaerengo;

import static spark.Spark.*;

import org.team226.kaerengo.data.hbn.HbnFormationDAO;
import org.team226.kaerengo.domain.formation.Formation;
import org.team226.kaerengo.domain.formation.FormationDAO;
import org.team226.kaerengo.domain.formation.SimpleFormation;

import com.google.gson.Gson;

public class Api {

	private static final String DATA_FORMAT = "application/json";

	public static void main(String[] args) {
		Gson gson = new Gson();
		FormationDAO formationDAO = new HbnFormationDAO();
		post("/formations", DATA_FORMAT, (req, res) -> {
			Formation formation = gson.fromJson(req.body(), SimpleFormation.class);
			formationDAO.addFormation(formation);
			res.status(201);
			res.type(DATA_FORMAT);
			return formation;
		} , gson::toJson);
	}
}
