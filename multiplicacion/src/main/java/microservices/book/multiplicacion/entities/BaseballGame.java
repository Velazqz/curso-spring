package microservices.book.multiplicacion.entities;

import javax.sql.DataSource;

public class BaseBallGame implements Game{
	
	private Team homeTeam;
	private Team awayTeam;
	private DataSource datasource;
	
	//public BaseBallGame() {}

	public BaseBallGame(Team homeTeam, Team awayTeam) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;	
	}

	@Override
	public void setHomeTeam(Team team) {
		this.homeTeam = team;
		
	}

	@Override
	public Team getHomeTeam() {
		return homeTeam;
	}

	@Override
	public void setAwayTeam(Team team) {
		this.awayTeam = team;		
	}

	@Override
	public String playGame() throws Exception {
		Thread.sleep(3000);
		throw new Exception("Excepción de prueba");
		//return Math.random() < 0.5 ?getHomeTeam().getName():getAwayTeam().getName();
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public Team getAwayTeam() {
		return awayTeam;
	}

}
