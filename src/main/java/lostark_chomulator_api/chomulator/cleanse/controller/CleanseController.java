package lostark_chomulator_api.chomulator.cleanse.controller;

import lombok.AllArgsConstructor;
import lostark_chomulator_api.chomulator.cleanse.service.CleanseService;
import lostark_chomulator_api.chomulator.object.common.ResponseObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/cleanse")
public class CleanseController {

	private final CleanseService cleanseService;

	/**
	 * 정화
	 * @return ResponseObject
	 */
	@RequestMapping("/basic")
	public ResponseObject cleanse() {
		return cleanseService.cleanse();
	}
}
