package com.jvision.admin.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lom_bok() {
        String name = "tuan";
        int amount = 1000;
        String adress = "jvision";

        HelloResponseDto dto = new HelloResponseDto(name, amount, adress);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        assertThat(dto.getAddress()).isEqualTo(adress);
    }
}

