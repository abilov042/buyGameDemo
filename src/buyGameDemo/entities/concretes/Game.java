package buyGameDemo.entities.concretes;

import buyGameDemo.entities.abstracts.Entity;

public class Game implements Entity {
	private int gameId;
	private String gameName;
	private double gamePrice;
	public Game(int id, String gameName, double gamePrice) {
		super();
		this.gameId = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}
	public int getGameId() {
		return gameId;
	}
	public void setId(int id) {
		this.gameId = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
}
