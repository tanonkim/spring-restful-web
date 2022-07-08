package com.example.restfulwebservice1.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "사용자 상제 정보를 위한 도메인 객체")
//@JsonIgnoreProperties(value = {"password", "ssn"})
//@JsonFilter("UserInfo")
@Entity
public class Userr {
    @Id
    @GeneratedValue // id 자동 생성
    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상 입력해주세요")
    @ApiModelProperty(notes = "사용자 이름을 입력해주세요")
    private String name;
    @Past
    @ApiModelProperty(notes = "사용자 등록일을 입력해주세요")
    private Date joinDate;

    @ApiModelProperty(notes = "사용자 패스워드를 입력해주세요")
    private String password;
    @ApiModelProperty(notes = "사용자 주민번호를 입력해주세요")
    private String ssn;
}

