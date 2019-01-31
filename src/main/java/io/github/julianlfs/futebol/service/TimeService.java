package io.github.julianlfs.futebol.service;

import io.github.julianlfs.futebol.domain.Time;
import io.github.julianlfs.futebol.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

	@Autowired
	private TimeRepository timeRepository;

	public Time incluirTime(Time time) {
		return timeRepository.save(time);
	}
}
