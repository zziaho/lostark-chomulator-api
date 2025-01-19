package lostark_chomulator_api.chomulator.object.common;

import lombok.Getter;
import lombok.Setter;

/*
 * 응답 Object
 */
@Getter
@Setter
public class ResponseObject {

	private int cleansedSlateCnt;	// 정화되는 석판의 개수
	private int successLimitCnt;	// n회 이내에 초월 성공시 *** 달성

}
