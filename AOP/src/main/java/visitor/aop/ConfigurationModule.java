package visitor.aop;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

import java.lang.reflect.Method;
import java.util.regex.Matcher;

public class ConfigurationModule extends AbstractModule {
    protected void configure() {
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(Annotation.class), new TracingInterceptor());
    }
}
