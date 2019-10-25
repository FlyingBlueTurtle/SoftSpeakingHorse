package com.revature.screenforce.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.screenforce.beans.Screening;
import com.revature.screenforce.beans.QuestionScore;

@FeignClient(name = "questionScore", url = "http://localhost:8183/questionScore/all")
public interface feignQuestionScore {
	@RequestMapping(method = RequestMethod.GET)
	List<QuestionScore> getSimpleQuestionScores();
}

