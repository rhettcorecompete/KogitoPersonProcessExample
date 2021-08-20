package org.acme.travels.PF9;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.Coffee;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateF952F6927B644CB4DE3319C97948E55D implements org.drools.model.functions.Predicate1<org.acme.travels.Coffee>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F7E0175FA08BA4BDD3DB5F4265A17A90";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.travels.Coffee _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getWorkStatus(), null);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("workStatus == null", "Check Options", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\active-vscode\\process-business-rules-springboot\\src\\main\\resources\\org\\acme\\travels\\coffee-rules.drl");
    }
}
