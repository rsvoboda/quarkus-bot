package io.quarkus.bot.buildreporter;

import javax.inject.Singleton;

import io.quarkus.arc.DefaultBean;

@Singleton
@DefaultBean
public class DefaultWorkflowJobLabeller implements WorkflowJobLabeller {

    @Override
    public String label(String name) {
        return name;
    }
}
