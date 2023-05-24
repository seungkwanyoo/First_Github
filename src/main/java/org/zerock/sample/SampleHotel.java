package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor //필드에 있는 모든 생성자를 만들어 줌.
@RequiredArgsConstructor // 원하는 생성자만 선택해서 만듦. @NonNull과 함께 사용
public class SampleHotel {

	@NonNull
	private Chef chef;
	private int age;
	
	
	

//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}
	
}
