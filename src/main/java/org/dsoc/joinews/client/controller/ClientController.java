package org.dsoc.joinews.client.controller;

import lombok.RequiredArgsConstructor;
import org.dsoc.joinews.client.controller.vo.ClientSummary;
import org.dsoc.joinews.client.repository.ClientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

  private final ClientRepository clientRepository;
// test1
  @GetMapping("/summary")
  public ClientSummary getClientSummary() {
    return new ClientSummary(clientRepository.count());
  }
}