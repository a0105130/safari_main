package com.safari.safari.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ChoiceVO {

    private String InfoDetails;

    public ChoiceVO(String InfoDetails) {
        this.InfoDetails = InfoDetails;
    }
}
