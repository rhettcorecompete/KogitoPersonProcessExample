package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import org.acme.travels.Coffee;
import static org.acme.travels.Rules2E460E98FBDF296CF50748F35F942A65.*;

public class Rules2E460E98FBDF296CF50748F35F942A65RuleMethods0 {

    /**
     * Rule name: Check Options
     */
    public static org.drools.model.Rule rule_Check_32Options() {
        final org.drools.model.Variable<org.acme.travels.Coffee> var_$coffee = D.declarationOf(org.acme.travels.Coffee.class,
                                                                                               DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Coffee_Metadata_INSTANCE,
                                                                                               "$coffee");
        final org.drools.model.BitMask mask_$coffee = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Coffee_Metadata_INSTANCE,
                                                                                              "workStatus");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Check Options").attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                                       "coffee")
                                                            .build(D.pattern(var_$coffee).expr("GENERATED_D8A833645B489400C2460BC5D9F10554",
                                                                                               org.acme.travels.PF9.LambdaPredicateF952F6927B644CB4DE3319C97948E55D.INSTANCE,
                                                                                               D.reactOn("workStatus")),
                                                                   D.on(var_$coffee).execute(org.acme.travels.P9B.LambdaConsequence9B44565F48AD015F08E10EF831188692.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult").attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                                  "person")
                                                       .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                                          org.acme.travels.PB5.LambdaPredicateB55994BB901C8038544EDA3359777C3C.INSTANCE,
                                                                                          D.alphaIndexedBy(int.class,
                                                                                                           org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                           DomainClassesMetadata2E460E98FBDF296CF50748F35F942A65.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                                           org.acme.travels.P42.LambdaExtractor42193DFB6542439C5FA3EDE4CA058C2C.INSTANCE,
                                                                                                           18),
                                                                                          D.reactOn("age")),
                                                              D.on(var_$person).execute(org.acme.travels.P48.LambdaConsequence48462D87FC3249A062FD80483DC8BC94.INSTANCE));
        return rule;
    }
}
