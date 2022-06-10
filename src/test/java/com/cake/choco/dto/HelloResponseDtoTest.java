package com.cake.choco.dto;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    // 롬복 기능 테스트
    @Test
    public void 롬복_기능테스트() {
        // given
        String name = "minsu";
        String nickname = "jamjam";

        // when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name, nickname);   // 필드 포함 생성자 생성

        // then
        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getNickname()).isEqualTo(nickname);
    }
}
