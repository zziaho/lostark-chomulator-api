package lostark_chomulator_api.chomulator.cleanse.service;

import lostark_chomulator_api.chomulator.object.common.ResponseObject;
import org.springframework.stereotype.Service;

@Service
public class CleanseService {

	/**
	 * 정화
	 */
	public ResponseObject cleanse() {
		ResponseObject resObj = new ResponseObject();

		int[] cleansedSlateCnt = {1, 2, 3, 4}; // 정화되는 석판의 개수 | TODO: param으로 받도록 처리

		double randomValue = Math.random();
		double cumulativeProbability = 0.0; // 누적 확률

		// TODO: 엘조윈 단계에 따른 확률 받아와서 처리하도록 수정
		double[] probabilities = new double[4];
		probabilities[0] = 0.4;
		probabilities[1] = 0.3;
		probabilities[2] = 0.2;
		probabilities[3] = 0.1;

		// 확률에 따라 아이템 선택
		for(int i = 0; i < probabilities.length; i++) {
			cumulativeProbability += probabilities[i];
			if (randomValue < cumulativeProbability) {
				resObj.setCleansedSlateCnt(cleansedSlateCnt[i]);
				break;
			}
		}

		return resObj;
	}
}
