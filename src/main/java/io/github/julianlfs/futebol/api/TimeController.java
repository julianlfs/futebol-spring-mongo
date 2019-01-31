package io.github.julianlfs.futebol.api;

import io.github.julianlfs.futebol.domain.Time;
import io.github.julianlfs.futebol.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class TimeController {

	@Autowired
	private TimeService timeService;

	@PostMapping
	@RequestMapping("/times")
	public ResponseEntity<Time> incluirTime(Time time) {

		Time timeCriado = timeService.incluirTime(time);

		return ResponseEntity.created(URI.create("/times")).body(timeCriado);

	}
}
