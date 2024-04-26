package com.eazybytes.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional getCurrentAuditor() {
        // As of now keeping a hardcoded name but will change it when we implement Spring Security.
        return Optional.of("ACCOUNTS_MS");
    }
}
