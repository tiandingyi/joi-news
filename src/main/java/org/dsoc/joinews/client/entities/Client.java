package org.dsoc.joinews.client.entities;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "clients", schema = "joinews")
public class Client {

  @Id
  private UUID id;

  private String name;
  private String email;
}
