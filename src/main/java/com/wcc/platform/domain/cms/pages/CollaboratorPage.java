package com.wcc.platform.domain.cms.pages;

import com.wcc.platform.domain.cms.attributes.CommonSection;
import com.wcc.platform.domain.cms.attributes.Contact;
import com.wcc.platform.domain.cms.attributes.HeroSection;
import com.wcc.platform.domain.platform.Member;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

/** CMS Collaborators Page to highlight volunteers in the community. */
public record CollaboratorPage(
    @NotNull String id,
    @NotNull PageMetadata metadata,
    @NotNull HeroSection heroSection,
    @NotNull CommonSection section,
    @NotNull Contact contact,
    @NotEmpty List<Member> collaborators) {}
