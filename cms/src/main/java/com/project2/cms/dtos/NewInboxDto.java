package com.project2.cms.dtos;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class NewInboxDto {
  @NotNull
  private Integer ownerId;

  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public NewInboxDto() {
    super();
  }

  public NewInboxDto(@NotNull Integer ownerId) {
    super();
    this.ownerId = ownerId;
  }
  
  
}
