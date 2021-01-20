package com.football.match.footballstandingsservice.restClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.football.match.footballstandingsservice.data.Country;
import com.football.match.footballstandingsservice.data.League;
import com.football.match.footballstandingsservice.data.Standings;

@Component
public class FootballApiClient {

	@Value("${football.api.url}")
	String footballApiUrl;
	@Value("${football.key.name}")
	String apiKeyName;
	@Value("${football.key.value}")
	String apiKeyValue;

	RestTemplate restTemplate;

	public FootballApiClient(RestTemplateBuilder restTemplateBuilder) {
		restTemplate = restTemplateBuilder.build();
	}

	public Country[] getCountryDetails() {
		Country[] countryDetails = null;
		try {
			URI uri;
			uri = new URI(footballApiUrl);
			countryDetails = restTemplate.getForObject(uri + "?action=get_countries&APIkey=" + apiKeyValue,
					Country[].class);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return countryDetails;
	}

	public League[] getLeagueDetails(String country_id) {
		League[] totalLeague = null;
		try {
			URI uri;
			uri = new URI(footballApiUrl);
			totalLeague = restTemplate.getForObject(
					uri + "?action=get_leagues&country_id=" + country_id + "&APIkey=" + apiKeyValue, League[].class);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return totalLeague;
	}

	public Standings[] getStandingDetails(String league_id) {
		Standings[] standingsDetails = null;
		try {
			URI uri;
			uri = new URI(footballApiUrl);
			standingsDetails = restTemplate.getForObject(
					uri + "?action=get_standings&league_id=" + league_id + "&APIkey=" + apiKeyValue, Standings[].class);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return standingsDetails;
	}

}
