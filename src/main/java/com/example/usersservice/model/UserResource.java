package com.example.usersservice.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(builderClassName = "Builder", toBuilder = true)
public class UserResource {

  private long id;

  private String email;

  private String title;

  private String firstname;

  private String lastname;

  private String phone;

  private String passwordLastUpdate;

}
