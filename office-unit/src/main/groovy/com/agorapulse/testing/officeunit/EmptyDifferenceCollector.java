package com.agorapulse.testing.officeunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public enum EmptyDifferenceCollector implements DifferenceCollector {

    INSTANCE;

    private static final Logger LOGGER = LoggerFactory.getLogger(DifferenceCollector.class);

    @Override
    public List<DocumentDifference> computeDifferences(String path, InputStream actualStream, InputStream expectedStream, Set<String> ignored) {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Skipping {}", path);
        }
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "No difference";
    }
}
