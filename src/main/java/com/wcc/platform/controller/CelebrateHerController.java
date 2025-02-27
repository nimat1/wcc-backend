package com.wcc.platform.controller;

import com.wcc.platform.domain.cms.pages.aboutus.CelebrateHerPage;
import com.wcc.platform.service.CelebrateHerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/** Rest controller for mentorship apis. */
@RestController
@RequestMapping("/api/cms/v1/celebrateHer")
@Tag(name = "Pages: CelebrateHer", description = "All APIs under session CelebrateHer")
public class CelebrateHerController {

  private final CelebrateHerService service;

  @Autowired
  public CelebrateHerController(final CelebrateHerService service) {
    this.service = service;
  }

  @GetMapping("/overview")
  @Operation(summary = "API to retrieve celebrateHer page")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<CelebrateHerPage> getCelebrateHerPage() {
    return ResponseEntity.ok(service.getCelebrateHer());
  }
}
