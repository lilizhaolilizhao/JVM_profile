package com.github.jvm.agent.command.express;

import lombok.extern.slf4j.Slf4j;
import ognl.DefaultMemberAccess;
import ognl.Ognl;
import ognl.OgnlContext;

/**
 * @author ralf0131 2017-01-04 14:41.
 */
@Slf4j
public class OgnlExpress implements Express {
    private Object bindObject;
    private final OgnlContext context;

    public OgnlExpress() {
        context = new OgnlContext();
        context.setClassResolver(CustomClassResolver.customClassResolver);
    }

    @Override
    public Object get(String express) throws ExpressException {
        try {
            context.setMemberAccess(new DefaultMemberAccess(true));
            return Ognl.getValue(express, context, bindObject);
        } catch (Exception e) {
            log.error("Error during evaluating the expression:", e);
            throw new ExpressException(express, e);
        }
    }

    @Override
    public boolean is(String express) throws ExpressException {
        final Object ret = get(express);
        return null != ret && ret instanceof Boolean && (Boolean) ret;
    }

    @Override
    public Express bind(Object object) {
        this.bindObject = object;
        return this;
    }

    @Override
    public Express bind(String name, Object value) {
        context.put(name, value);
        return this;
    }

    @Override
    public Express reset() {
        context.clear();
        context.setClassResolver(CustomClassResolver.customClassResolver);
        return this;
    }
}
