package com.football.match.footballstandingsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.football.match.footballstandingsservice.data.Country;
import com.football.match.footballstandingsservice.data.League;
import com.football.match.footballstandingsservice.data.StandingVO;
import com.football.match.footballstandingsservice.data.Standings;
import com.football.match.footballstandingsservice.restClient.FootballApiClient;

@RestController
public class FootballApiController {

	@Autowired
	FootballApiClient footballApiClient;

	@GetMapping(path="/getStandingDetails",produces=MediaType.APPLICATION_JSON_VALUE)
	public StandingVO getCountryDetails(@RequestParam String countryName, @RequestParam String leagueName,
			@RequestParam String teamName) {
		
		StandingVO stVo = new StandingVO();

		String countryId = null, 
				leagueId = null,
				errorMsg = null;

		System.out.println("----Country Details----");
		Country[] countryList = footballApiClient.getCountryDetails();

		for (Country country : countryList) {

			// System.out.println(country.getCountry_id());
			// System.out.println(country.getCountry_name());
			if (countryName.equalsIgnoreCase(country.getCountry_name())) {
				countryId = country.getCountry_id();
			}
		}
		System.out.println("For Country: " + countryName + " countryId = " + countryId);
		if (countryId == null) {
			errorMsg="Please enter valid country name.";
			stVo.setErrorMessage(errorMsg);
			return stVo;
		} else {

			System.out.println("----League Details----");
			League[] league = footballApiClient.getLeagueDetails(countryId);

			for (League lg : league) {

				// System.out.println("league "+lg.getLeague_id());
				// System.out.println(lg.getLeague_name());
				if (leagueName.equalsIgnoreCase(lg.getLeague_name())) {
					leagueId = lg.getLeague_id();
				}
			}

			System.out.println("For League name: " + leagueName + " leagueId = " + leagueId);
		}
		
		if (leagueId == null) {
			errorMsg = "Please enter valid league name.";
			stVo.setErrorMessage(errorMsg);
			return stVo;
		}else {
			System.out.println("----Standings Details----");
			Standings[] stndings = footballApiClient.getStandingDetails(leagueId);

			for (Standings st : stndings) {
				if (teamName.equalsIgnoreCase(st.getTeam_name())) {

					System.out.println(countryId);
					System.out.println(st.getCountryName());
					System.out.println(st.getLeagueId());
					System.out.println(st.getLeagueName());
					System.out.println(st.getTeam_id());
					System.out.println(st.getTeam_name());
					System.out.println(st.getOvralLeaguePos());
					
					stVo.setCountryId(countryId);
					stVo.setCountryName(countryName);
					stVo.setLeagueId(leagueId);
					stVo.setLeagueName(leagueName);
					stVo.setTeam_id(st.getTeam_id());
					stVo.setTeam_name(teamName);
					stVo.setOvralLeaguePos(st.getOvralLeaguePos());
				}
			}
			if (stVo.getTeam_id()==null) {
				errorMsg = "Please enter valid Team name.";
				stVo.setErrorMessage(errorMsg);
				return stVo;
			}
		}
		
		return stVo;
	}
}
