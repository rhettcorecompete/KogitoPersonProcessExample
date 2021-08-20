package org.acme.travels.P9B;

import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.acme.travels.Coffee;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence9B44565F48AD015F08E10EF831188692 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.travels.Coffee>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "8F35C9584757F153B08743605616EE24";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$coffee = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Coffee_Metadata_INSTANCE, "workStatus");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.travels.Coffee $coffee) throws java.lang.Exception {
        {
            {
                ($coffee).setWorkStatus("coffee-selected");
            }
            drools.update($coffee, mask_$coffee);
        }
    }
}
