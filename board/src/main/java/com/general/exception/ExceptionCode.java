package com.general.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  ExceptionCode {

    NULL("Null 오류입니다."),
    NOTDIRECTORY("디렉토리가 존재하지 않습니다."),
    NOTFILE("파일이 존재하지 않습니다.");

    private String message;
}
